package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui;

import com.ait.toolkit.titanium.mobile.client.ui.TabGroup;
import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.calculate.CalculateTab;
import com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.chart.ChartWebView;
import com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.settings.SettingsTab;

public class MainTabGroup extends TabGroup {

	private static final MainTabGroup INSTANCE = new MainTabGroup();

	public static MainTabGroup get() {
		return INSTANCE;
	}

	private Window window;

	private MainTabGroup() {
		this.addTab(CalculateTab.get());
		this.addTab(SettingsTab.get());
		window = new Window("Loan Chart");
		window.setBarImage("assets/navbar.png");
		window.setBarColor("#000");
		window.add(ChartWebView.get());
	}

	public void openChartWindow() {
		CalculateTab.get().open(window);
	}
}
