package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.chart;

import com.ait.toolkit.sencha.touch.charts.client.data.BaseChartModel;

/**
 * Representation of a Value in the Pie Chart
 */
public class ChartValue extends BaseChartModel {

	public void setName(String value) {
		set("name", value);
	}

	public void setValue(double value) {
		set("value", value);
	}

}
