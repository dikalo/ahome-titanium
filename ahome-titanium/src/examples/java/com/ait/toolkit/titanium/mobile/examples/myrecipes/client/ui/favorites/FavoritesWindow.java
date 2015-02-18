package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.favorites;

import com.ait.toolkit.titanium.mobile.client.core.events.ui.FocusEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.FocusHandler;
import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.eventbus.EventBusUtil;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.FavoritesLoadEvent;

/**
 * Implements the MainWindow of the application
 * 
 */
public class FavoritesWindow extends Window {

	private static final FavoritesWindow INSTANCE = new FavoritesWindow();

	public static FavoritesWindow get() {
		return INSTANCE;
	}

	private FavoritesWindow() {
		this.setTitle("Favorites");
		this.setBackgroundColor("#fff");
		this.add(FavoritesView.get());
		this.addFocusHandler(new FocusHandler() {
			@Override
			public void onFocus(FocusEvent event) {
				EventBusUtil.get().fireEvent(new FavoritesLoadEvent());
			}
		});
	}
}
