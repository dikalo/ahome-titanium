package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.settings;

import com.ait.toolkit.titanium.mobile.client.ui.Tab;

public class SettingsTab extends Tab {

	private static final SettingsTab INSTANCE = new SettingsTab();
	
	public static SettingsTab get(){
		return INSTANCE;
	}
	
	private SettingsTab(){
		this.setTitle("Calculate");
		this.setIcon("assets/icon_settings.png");
		this.setTitle("Settings");
		this.setWindow(SettingsWindow.get());
	}
}
