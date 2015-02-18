package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.XmlLoadedEvent;
import com.google.gwt.event.shared.EventHandler;

/**
 * Base interface for any class that listen to asset load events
 */
public interface XmlLoadedHandler extends EventHandler {
    public void onXmlLoaded(XmlLoadedEvent event);
}
