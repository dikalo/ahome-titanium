package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.chart;

import com.ait.toolkit.titanium.mobile.client.ui.WebView;

/**
 * WebView that will hold the Touch4j Chart
 */
public class ChartWebView extends WebView {

	private static final ChartWebView INSTANCE = new ChartWebView();

	public static ChartWebView get() {
		return INSTANCE;
	}

	private ChartWebView() {
		this.setUrl("index.html");
	}
}
