package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.JsonLoadStartEvent;
import com.google.gwt.event.shared.EventHandler;

/**
 * Base interface for any class that listen to the game start event
 */
public interface JsonLoadStartHandler extends EventHandler {
    public void onJsonLoadStart(JsonLoadStartEvent event);
}
