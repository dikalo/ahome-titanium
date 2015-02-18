package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.eventbus;

import com.google.gwt.event.shared.EventHandler;

public interface ChartEventHandler extends EventHandler {
	public void onChartEvent(ChartEvent event);
}