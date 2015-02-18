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
package com.ait.toolkit.titanium.mobile.client.core.events.ui.dashboard;

import java.util.ArrayList;

import com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent;
import com.ait.toolkit.titanium.mobile.client.ui.DashboardItem;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class DashboardEvent extends UIEvent {

    public static final String MOVE = "move";
    public static String CLICK = "click";
    public static final String DELETE = "delete";

    protected DashboardEvent() {

    }

    private DashboardEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The pending data array in the new order
     */
    public final ArrayList<DashboardItem> getItems() {
        ArrayList<DashboardItem> items = new ArrayList<DashboardItem>();
        JsArray<JavaScriptObject> values = _getItems();
        for (int i = 0; i < values.length(); i++) {
            items.add(new DashboardItem(values.get(i)));
        }
        return items;
    }

    private final native JsArray<JavaScriptObject> _getItems() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.items;
    }-*/;

    /**
     * The com.ait.toolkit.titanium.mobile.client.ui.DashboardItem that was moved
     */
    public final native DashboardItem getItem() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.item;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.DashboardItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The location object with the properties x and y of where in the parent
     * view the click was
     */
    public final native Point getLocation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
