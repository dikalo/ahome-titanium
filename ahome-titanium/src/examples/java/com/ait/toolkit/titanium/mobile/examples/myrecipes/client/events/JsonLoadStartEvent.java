package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.JsonLoadStartHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Dispatched when an asset is loaded
 * 
 */
public class JsonLoadStartEvent extends GwtEvent<JsonLoadStartHandler> {

    public static Type<JsonLoadStartHandler> TYPE = new Type<JsonLoadStartHandler>();

    @Override
    public Type<JsonLoadStartHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(JsonLoadStartHandler handler) {
        handler.onJsonLoadStart(this);
    }

}
