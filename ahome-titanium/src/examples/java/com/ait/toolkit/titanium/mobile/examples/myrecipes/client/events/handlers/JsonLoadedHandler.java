package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.JsonLoadedEvent;
import com.google.gwt.event.shared.EventHandler;

/**
 * Base interface for any class that listen to asset load events
 */
public interface JsonLoadedHandler extends EventHandler {
    public void onJsonLoaded(JsonLoadedEvent event);
}
