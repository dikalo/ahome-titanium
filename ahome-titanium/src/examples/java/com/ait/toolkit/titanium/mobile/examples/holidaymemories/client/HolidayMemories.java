package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client;

import com.ait.toolkit.titanium.mobile.client.core.TiEntryPoint;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.controller.AppController;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HolidayMemories extends TiEntryPoint {
	public void onStart() {
		AppController.get().startApp();
	}
}