/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Represents displayed item data.
 * 
 * In addition to the properties defined below, you can define custom key-value
 * pairs, which bind to the child templates of an ItemTemplate. The key for
 * these pairs match the bindId of the child view templates and the values are a
 * dictionary of view properties applied to the view components. Any other
 * properties that are not identified by a bindId are permitted but are ignored
 * by the item template.
 * 
 */
public class ListDataItem extends JsObject {

    public ListDataItem() {
        jsObj = JsoHelper.createObject();
    }

    public ListDataItem( ListItem items ) {
        this();
        this.setProperties( items );
    }

    protected ListDataItem( JavaScriptObject obj ) {
        jsObj = obj;
    }

    /**
     * 
     * Contains key-value pairs of view properties and their values that are
     * applied to the ListItem.
     * <p>
     * If there are properties set in the ItemTemplate (not the children view
     * templates), the values set in the list data item override the template's
     * properties.
     */
    public native void setProperties( ListItem value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.properties = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setProperties( String itemId, ListItem value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso[itemId] = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native ListItem getProperties() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.properties;
		return @com.ait.toolkit.titanium.mobile.client.ui.ListItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the LisItem in this DataSet
     */
    public ListItem getItem() {
        return this.getProperties();
    }

    /**
     * 
     * Template ID configured with the Titanium.UI.ListView.templates property
     * or Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT.
     * <p>
     * On iOS, you can specify one of the following pre-defined templates:
     * Titanium.UI.LIST_ITEM_TEMPLATE_CONTACTS,
     * Titanium.UI.LIST_ITEM_TEMPLATE_SETTINGS or
     * Titanium.UI.LIST_ITEM_TEMPLATE_SUBTITLE.
     * <p>
     * Default: If the ListView's defaultItemTemplate property is not set, then
     * Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT is used.
     */
    public native void setTemplate( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.template = value;
    }-*/;

    /**
     * 
     * Template ID configured with the Titanium.UI.ListView.templates property
     * or Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT.
     * <p>
     * On iOS, you can specify one of the following pre-defined templates:
     * Titanium.UI.LIST_ITEM_TEMPLATE_CONTACTS,
     * Titanium.UI.LIST_ITEM_TEMPLATE_SETTINGS or
     * Titanium.UI.LIST_ITEM_TEMPLATE_SUBTITLE.
     * <p>
     * Default: If the ListView's defaultItemTemplate property is not set, then
     * Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT is used.
     */
    public native void setTemplate( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.template = value;
    }-*/;

    static JavaScriptObject fromList( List<ListDataItem> values ) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for( ListDataItem item : values ) {
            peers.push( item.getJsObj() );
        }
        return peers;
    }

    static List<ListDataItem> fromJsArray( JavaScriptObject obj ) {
        List<ListDataItem> toReturn = new ArrayList<ListDataItem>();
        int size = JsoHelper.arrayLength( obj );
        for( int i = 0; i < size; i++ ) {
            toReturn.add( new ListDataItem( JsoHelper.getValueFromJavaScriptObjectArray( obj, i ) ) );
        }
        return toReturn;
    }
}
