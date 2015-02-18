package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.data;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.data.TableViewBaseModel;

/**
 * Representation of a Recipe
 * 
 */
public class Recipe extends TableViewBaseModel {

	public static final String TITLE = "title";
	public static final String LINK = "link";
	public static final String DESCRIPTION = "description";

	public Recipe() {
		jsObj = JsoHelper.createObject();
	}

	public Recipe(String title, String link, String description) {
		this();
		set(TITLE, title);
		set(LINK, link);
		set(DESCRIPTION, description);
	}

	public String getTitle() {
		return get(TITLE);
	}

	public String getLink() {
		return get(LINK);
	}

	public String getDescription() {
		return get(DESCRIPTION);
	}

}
