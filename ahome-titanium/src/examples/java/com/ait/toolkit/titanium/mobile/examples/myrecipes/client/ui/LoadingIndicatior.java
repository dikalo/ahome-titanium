package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui;

import com.ait.toolkit.titanium.mobile.client.ui.ActivityIndicator;
import com.ait.toolkit.titanium.mobile.client.ui.iphone.ActivityIndicatorStyle;

public class LoadingIndicatior extends ActivityIndicator {

	private static final LoadingIndicatior INSTANCE = new LoadingIndicatior();

	private LoadingIndicatior() {
		setHeight("auto");
		setWidth("auto");
		this.setTop(10);
		this.setLeft(10);
		this.setColor("green");
		this.setStyle(ActivityIndicatorStyle.DARK());
		setMessage("Loading data ...");

	}

	public static LoadingIndicatior get() {
		return INSTANCE;
	}

}
