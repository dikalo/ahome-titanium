package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.calculate;

import com.ait.toolkit.titanium.mobile.client.ui.Tab;

public class CalculateTab extends Tab {

	private static final CalculateTab INSTANCE = new CalculateTab();

	public static CalculateTab get() {
		return INSTANCE;
	}

	private CalculateTab() {
		this.setTitle("Calculate");
		this.setIcon("assets/icon_calculator.png");
		this.setWindow(CalculateWindow.get());

	}
}
