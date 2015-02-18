package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.FavoritesLoadEvent;
import com.google.gwt.event.shared.EventHandler;

/**
 * Base interface for any class that listen to the game start event
 */
public interface FavoritesLoadHandler extends EventHandler {
    public void onEvent(FavoritesLoadEvent event);
}
