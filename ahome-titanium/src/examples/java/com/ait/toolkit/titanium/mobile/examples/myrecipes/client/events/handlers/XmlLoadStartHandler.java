package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.XmlLoadStartEvent;
import com.google.gwt.event.shared.EventHandler;

/**
 * Base interface for any class that listen to the game start event
 */
public interface XmlLoadStartHandler extends EventHandler {
    public void onXmlLoadStart(XmlLoadStartEvent event);
}
