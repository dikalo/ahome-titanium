/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.android;

import java.util.ArrayList;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The Titanium binding of an AndroidMedia Menu
 */
public class Menu extends EventDispatcher {

    protected Menu(JavaScriptObject obj) {
        jsObj = obj;

    }

    /**
     * creates a Titanium.Android.MenuItem from the passed creation options.
     * 
     * @param config
     *            , creation option
     * @return
     */
    public native MenuItem add(MenuItemConfig config) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.add(config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.titanium.mobile.client.android.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * creates a Titanium.Android.MenuItem from the passed creation options.
     * 
     * @param itemTitle
     *            , title of the menuItem,
     * @param id
     *            , the id of the menuItem
     * 
     * @return Titanium.Android.MenuItem
     */
    public native MenuItem add(String itemTitle, int id) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var menuItem = jso.add({
			title : itemTitle,
			itemId : id
		});
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(menuItem);
		return toReturn;
    }-*/;

    /**
     * clear all items from the menu. You should release all references you have
     * retained to Titanium.Android.MenuItem previously created.
     */
    public native void clear() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.clear();
    }-*/;

    /**
     * close the menu if visible
     */
    public native void close() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.close();
    }-*/;

    /**
     * Locate a Titanium.Android.MenuItem
     * 
     * @param item
     * @return
     */
    public native MenuItem findItem(int item) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.findItem(item);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Locate a Titanium.Android.MenuItem
     * 
     * @param item
     * @return
     */
    public MenuItem findItem(MenuItem item) {
        return findItem(item.getJsObj());
    }

    private native MenuItem findItem(JavaScriptObject item) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.findItem(item);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Return the Titanium.Android.MenuItem at a specific index
     * 
     * @param index
     *            , item at index where index < size()
     * @return
     */
    public native MenuItem getItem(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getItem(index);
    }-*/;

    /**
     * Query for any visible menu items
     * 
     * @return
     */
    public native boolean hasVisibleItems() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasVisibleItems();
    }-*/;

    /**
     * Remove all Titanium.Android.MenuItem with the specified groupId
     * 
     * @param groupId
     *            , groupId of items to remove.
     */
    public native void removeGroup(int groupId) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeGroup(groupId);
    }-*/;

    /**
     * Remove a specific Titanium.Android.MenuItem by the specified itemId
     * 
     * @param itemId
     *            , itemId of item to remove.
     */
    public native void removeItem(int itemId) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeItem(itemId);
    }-*/;

    /**
     * enable or disable a group of Titanium.Android.MenuItem by groupId
     * 
     * @param groupId
     *            , groupId to enable or disable
     * @param enabled
     *            , true to enable, false to disable.
     */
    public native void setGroupEnabled(int groupId, boolean enabled) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setGroupEnabled(groupId, enabled);
    }-*/;

    /**
     * show or hide a group of Titanium.Android.MenuItem by groupId
     * 
     * @param groupId
     *            , groupId to enable or disable
     * @param enabled
     *            , true to enable, false to disable.
     */
    public native void setGroupVisible(int groupId, boolean enabled) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setGroupVisible(groupId, enabled);
    }-*/;

    /**
     * number of Titanium.Android.MenuItem in this menu
     * 
     * @return
     */
    public native int size() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.size();
    }-*/;

    public ArrayList<MenuItem> getItems() {
        ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        JsArray<JavaScriptObject> array = _getItems();
        for (int i = 0; i < array.length(); i++) {
            items.add(new MenuItem(array.get(i)));
        }
        return items;
    }

    private native JsArray<JavaScriptObject> _getItems() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.items;
    }-*/;

    public void setItems(ArrayList<MenuItem> items) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (MenuItem item : items) {
            array.push(item.getJsObj());
        }
        _setItems(array);
    }

    private native void _setItems(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.items = value;
    }-*/;

}
