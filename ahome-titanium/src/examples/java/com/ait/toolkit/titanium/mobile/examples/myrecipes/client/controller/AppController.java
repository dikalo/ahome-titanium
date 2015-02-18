package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.controller;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.Titanium;
import com.ait.toolkit.titanium.mobile.client.api.API;
import com.ait.toolkit.titanium.mobile.client.core.Debugger;
import com.ait.toolkit.titanium.mobile.client.ui.ImageView;
import com.ait.toolkit.titanium.mobile.client.ui.Label;
import com.ait.toolkit.titanium.mobile.client.ui.TableViewRow;
import com.ait.toolkit.titanium.mobile.client.ui.style.Font;
import com.ait.toolkit.titanium.mobile.client.ui.style.FontWeight;
import com.ait.toolkit.titanium.mobile.client.xml.Document;
import com.ait.toolkit.titanium.mobile.client.xml.Element;
import com.ait.toolkit.titanium.mobile.client.xml.NodeList;
import com.ait.toolkit.titanium.mobile.client.xml.XML;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.data.Recipe;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.database.RecipeDatabase;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.eventbus.EventBusUtil;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.FavoritesLoadEvent;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.JsonLoadStartEvent;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.JsonLoadedEvent;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.RecipesTableViewRowSelectEvent;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.XmlLoadStartEvent;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.XmlLoadedEvent;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.FavoritesLoadHandler;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.JsonLoadStartHandler;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.JsonLoadedHandler;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.RecipesTableViewRowSelectHandler;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.XmlLoadStartHandler;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.XmlLoadedHandler;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.DetailsView;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.LoadingIndicatior;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.MainTabGroup;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.StartScreen;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.favorites.FavoritesTable;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.recipes.RecipesTab;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.recipes.RecipesTable;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;

public class AppController implements XmlLoadStartHandler, XmlLoadedHandler, JsonLoadStartHandler, JsonLoadedHandler, RecipesTableViewRowSelectHandler, FavoritesLoadHandler {

	private final String XML_FEED_URL = "http://localhost:8888/recipes.xml";
	private final String JSONL_FEED_URL = "http://localhost:8888/recipes.json";
	private RequestBuilder requestBuilder;
	private ArrayList<TableViewRow> rows;
	private List<Recipe> recipes;

	private static final AppController INSTANCE = new AppController();

	private AppController() {
		EventBusUtil.get().addHandler(XmlLoadStartEvent.TYPE, this);
		EventBusUtil.get().addHandler(XmlLoadedEvent.TYPE, this);
		EventBusUtil.get().addHandler(JsonLoadStartEvent.TYPE, this);
		EventBusUtil.get().addHandler(JsonLoadedEvent.TYPE, this);
		EventBusUtil.get().addHandler(RecipesTableViewRowSelectEvent.TYPE, this);
		EventBusUtil.get().addHandler(FavoritesLoadEvent.TYPE, this);
	}

	public static AppController get() {
		return INSTANCE;
	}

	public void startApp() {
		recipes = new ArrayList<Recipe>();
		rows = new ArrayList<TableViewRow>();
		RecipeDatabase.get().createDataBase();
		StartScreen.get().display();
	}

	@Override
	public void onXmlLoaded(XmlLoadedEvent event) {
		MainTabGroup.get().display();
		parseXmlResponse(event.getXmlString());
	}

	@Override
	public void onXmlLoadStart(XmlLoadStartEvent event) {
		LoadingIndicatior.get().show();

		requestBuilder = new RequestBuilder(RequestBuilder.GET, XML_FEED_URL);
		try {
			API.get().info("Sending request");
			requestBuilder.sendRequest(null, new RequestCallback() {

				@Override
				public void onResponseReceived(Request request, Response response) {
					API.get().info("Xml Response received");
					LoadingIndicatior.get().hide();
					EventBusUtil.get().fireEvent(new XmlLoadedEvent(response.getText()));
				}

				@Override
				public void onError(Request request, Throwable exception) {
					API.get().error("Request error : " + exception.getMessage());
				}
			});
		} catch (RequestException e) {
			Titanium.alert("Request Exception", e.getMessage());
		}
	}

	@Override
	public void onJsonLoaded(JsonLoadedEvent event) {
		MainTabGroup.get().display();
		parseJsonResponse(event.getJsonString());
	}

	@Override
	public void onJsonLoadStart(JsonLoadStartEvent event) {
		LoadingIndicatior.get().show();
		requestBuilder = new RequestBuilder(RequestBuilder.GET, JSONL_FEED_URL);
		try {
			API.get().info("Sending request");
			requestBuilder.sendRequest(null, new RequestCallback() {

				@Override
				public void onResponseReceived(Request request, Response response) {
					API.get().info("Json Response received");
					LoadingIndicatior.get().hide();
					EventBusUtil.get().fireEvent(new JsonLoadedEvent(response.getText()));
				}

				@Override
				public void onError(Request request, Throwable exception) {
					API.get().error("Request error : " + exception.getMessage());
				}
			});
		} catch (RequestException e) {
			Titanium.alert("Request Exception", e.getMessage());
		}

	}

	@Override
	public void onRowSelect(RecipesTableViewRowSelectEvent event) {
		API.get().info("Selected row with index " + event.getRowIndex());
		Recipe recipe = recipes.get(event.getRowIndex());
		API.get().info("Selected recipe");
		API.get().info("Title : " + recipe.getTitle());
		API.get().info("Link : " + recipe.getLink());
		API.get().info("Description : " + recipe.getDescription());
		DetailsView detailsView = new DetailsView(recipe.getTitle(), recipe.getDescription(), recipe.getLink());
		RecipesTab.get().open(detailsView);
	}

	@Override
	public void onEvent(FavoritesLoadEvent event) {
		List<Recipe> recipes = RecipeDatabase.get().getFavorites();
		List<TableViewRow> rows = new ArrayList<TableViewRow>();
		for (Recipe recipe : recipes) {
			TableViewRow row = new TableViewRow();
			row.setTitle(recipe.getTitle());
			rows.add(row);
		}
		FavoritesTable.get().setData(rows);
		Debugger.get().info("Favorites successfully loaded !");
	}

	private void parseJsonResponse(String jsonString) {
		API.get().info("Response : ");
		API.get().info(jsonString);

		JSONValue value = JSONParser.parseStrict(jsonString);
		JSONObject object = value.isObject();
		JSONObject results = object.get("results").isObject();
		JSONArray items = results.get("item").isArray();

		for (int i = 0; i < items.size(); i++) {
			JSONObject item = items.get(i).isObject();
			String title = item.get("title").isString().stringValue();
			String description = item.get("description").isString().stringValue();
			String link = item.get("link").isString().stringValue();
			fillTableViewRows(title, description, link);
		}
		RecipesTable.get().setData(rows);

	}

	private void fillTableViewRows(String title, String description, String link) {
		API.get().info("title : " + title);
		API.get().info("description : " + description);
		API.get().info("Link : " + link);
		recipes.add(new Recipe(title, link, description));

		TableViewRow row = new TableViewRow();
		row.setHasChild(true);
		row.setClassName("recipe-row");
		// row.setFilter(title);
		// row.addProperty("_title", title);
		// row.addProperty("_link", link);
		// row.addProperty("_description", description);

		// row.setTitle(items.getItem(i).getElementsByTagName("title").getItem(0).getText());
		Label titleLabel = new Label(title);
		titleLabel.setFont(new Font(12, FontWeight.BOLD));
		titleLabel.setLeft(70);
		titleLabel.setTop(5);
		titleLabel.setHeight(20);
		titleLabel.setWidth(210);
		row.add(titleLabel);

		Label descriptionLabel = new Label(description);
		descriptionLabel.setFont(new Font(10, FontWeight.NORMAL));
		descriptionLabel.setLeft(70);
		descriptionLabel.setTop(25);
		descriptionLabel.setHeight(40);
		descriptionLabel.setWidth(200);
		if (descriptionLabel.getText() == null || descriptionLabel.getText().isEmpty() || descriptionLabel.getText().equalsIgnoreCase("")) {
			descriptionLabel.setText("No description available");
		}
		row.add(descriptionLabel);

		ImageView icon = new ImageView();
		icon.setImage("/recipes/foodicon.jpg");
		icon.setWidth(50);
		icon.setHeight(50);
		icon.setTop(10);
		icon.setLeft(10);
		row.add(icon);

		rows.add(row);

	}

	private void parseXmlResponse(String response) {
		API.get().info(response);

		Document xml = XML.get().parseString(response);
		Element documentElement = xml.getDocumentElement();
		NodeList items = documentElement.getElementsByTagName("item");
		int itemCount = items.getLength();

		for (int i = 0; i < itemCount; i++) {
			String title = items.getItem(i).getElementsByTagName("title").getItem(0).getText();
			String description = items.getItem(i).getElementsByTagName("description").getItem(0).getText();
			String link = items.getItem(i).getElementsByTagName("link").getItem(0).getText();
			fillTableViewRows(title, description, link);
		}
		RecipesTable.get().setData(rows);
	}

}
