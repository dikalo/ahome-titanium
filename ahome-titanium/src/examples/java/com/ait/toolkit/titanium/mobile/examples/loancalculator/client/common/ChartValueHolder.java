package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.common;

import com.ait.toolkit.titanium.mobile.client.core.events.EventData;
import com.google.gwt.core.client.JavaScriptObject;

public class ChartValueHolder extends EventData {

	public ChartValueHolder() {
		super();
	}

	public ChartValueHolder(JavaScriptObject obj) {
		jsObj = obj;
	}

	public ChartValueHolder(double loan, double interest) {
		this();
		setLoan(loan);
		setInterest(interest);
	}

	public double getLoan() {
		return getDouble("loan");
	}

	public void setLoan(double loan) {
		set("loan", loan);
	}

	public double getInterest() {
		return getDouble("interest");
	}

	public void setInterest(double interest) {
		set("interest", interest);
	}

	public static ChartValueHolder from(EventData peer) {
		return new ChartValueHolder(peer.getJsObj());
	}

}
