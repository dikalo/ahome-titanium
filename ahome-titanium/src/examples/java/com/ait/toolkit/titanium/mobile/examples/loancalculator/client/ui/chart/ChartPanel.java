package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.chart;

import com.ait.toolkit.sencha.touch.client.layout.FitLayout;
import com.ait.toolkit.sencha.touch.client.ui.Panel;

public class ChartPanel extends Panel {

	private static final ChartPanel INSTANCE = new ChartPanel();

	public static ChartPanel get() {
		return INSTANCE;
	}

	private ChartPanel() {
		this.setLayout(new FitLayout());
	}

}
