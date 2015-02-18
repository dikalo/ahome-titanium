package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.common;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.events.TiEvent;

public class ChartEvent extends TiEvent {

	public ChartEvent() {
		jsObj = JsoHelper.createObject();
	}

	public void setLoan(double value) {
		JsoHelper.setAttribute(jsObj, "load", value);
	}

	public double getLoad() {
		return JsoHelper.getAttributeAsDouble(jsObj, "loan");
	}
}
