package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events;

import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.handlers.RecipesTableViewRowSelectHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Dispatched when an asset is loaded
 * 
 */
public class RecipesTableViewRowSelectEvent extends GwtEvent<RecipesTableViewRowSelectHandler> {

    private int rowIndex;

    public RecipesTableViewRowSelectEvent(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public static Type<RecipesTableViewRowSelectHandler> TYPE = new Type<RecipesTableViewRowSelectHandler>();

    @Override
    public Type<RecipesTableViewRowSelectHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RecipesTableViewRowSelectHandler handler) {
        handler.onRowSelect(this);
    }

    public int getRowIndex() {
        return rowIndex;
    }
}
