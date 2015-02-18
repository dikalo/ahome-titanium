package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.XmlLoadedHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Dispatched when an asset is loaded
 * 
 */
public class XmlLoadedEvent extends GwtEvent<XmlLoadedHandler> {

    private String xmlString;

    public XmlLoadedEvent(String name) {
        this.xmlString = name;
    }

    public static Type<XmlLoadedHandler> TYPE = new Type<XmlLoadedHandler>();

    @Override
    public Type<XmlLoadedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(XmlLoadedHandler handler) {
        handler.onXmlLoaded(this);
    }

    public String getXmlString() {
        return xmlString;
    }
}
