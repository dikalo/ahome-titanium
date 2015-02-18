package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.JsonLoadedHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Dispatched when an asset is loaded
 * 
 */
public class JsonLoadedEvent extends GwtEvent<JsonLoadedHandler> {

    private String JsonString;

    public JsonLoadedEvent(String name) {
        this.JsonString = name;
    }

    public static Type<JsonLoadedHandler> TYPE = new Type<JsonLoadedHandler>();

    @Override
    public Type<JsonLoadedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(JsonLoadedHandler handler) {
        handler.onJsonLoaded(this);
    }

    public String getJsonString() {
        return JsonString;
    }
}
