package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.eventbus;

import com.google.gwt.event.shared.GwtEvent;

public class ChartEvent extends GwtEvent<ChartEventHandler> {

	private String assetName;

	public ChartEvent(String name) {
		this.assetName = name;
	}

	public static Type<ChartEventHandler> TYPE = new Type<ChartEventHandler>();

	@Override
	public Type<ChartEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ChartEventHandler handler) {
		handler.onChartEvent(this);
	}

	public String getName() {
		return assetName;
	}
}