package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.calculate;

import com.ait.toolkit.titanium.mobile.client.ui.Window;

/**
 * Implements the MainWindow of the application
 * 
 */
public class CalculateWindow extends Window {

	private static final CalculateWindow INSTANCE = new CalculateWindow();

	public static CalculateWindow get() {
		return INSTANCE;
	}

	private CalculateWindow() {
		this.setWidth(320);
		this.setHeight(480);
		this.setTop(0);
		this.setLeft(0);
		this.setTitle("Loan Calculator");
		this.setBarImage("assets/navbar.png");
		this.setBackgroundImage("assets/background.png");
		this.add(CalculateView.get());
	}
}
