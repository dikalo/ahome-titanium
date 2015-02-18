package com.ait.toolkit.titanium.mobile.examples.loancalculator.client;

import com.ait.toolkit.titanium.mobile.client.Titanium;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.DoubleTapEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.SwipeEvent;
import com.ait.toolkit.titanium.mobile.client.ui.Button;
import com.ait.toolkit.titanium.mobile.client.ui.Label;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;

public class HelloUiBinder extends View {

	private static HelloUiBinderUiBinder uiBinder = GWT.create(HelloUiBinderUiBinder.class);

	interface HelloUiBinderUiBinder extends UiBinder<View, HelloUiBinder> {
	}

	@UiField
	Label helloWorld;

	@UiField
	Button clickMe;

	public HelloUiBinder() {
		setView(uiBinder.createAndBindUi(this));
		helloWorld.addDoubleTapHandler(null);
	}

	@UiHandler("clickMe")
	void handleClickMeClick(ClickEvent e) {
		Titanium.alert("Click me clicked");
	}

	@UiHandler("helloWorld")
	void handleSwipe(SwipeEvent e) {
		Titanium.alert("Swipe " + e.getDirection());
	}

	@UiHandler("helloWorld")
	void dTapper(DoubleTapEvent e) {
		Titanium.alert("Double tap ");
	}

	public Label getHelloWorld() {
		return helloWorld;
	}

}
