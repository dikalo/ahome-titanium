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
package com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview;

import com.ait.toolkit.titanium.mobile.client.core.events.ui.InteractionEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowDeleteHandler;
import com.ait.toolkit.titanium.mobile.client.data.TableViewBaseModel;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.ait.toolkit.titanium.mobile.client.ui.TableViewRow;
import com.ait.toolkit.titanium.mobile.client.ui.TableViewSection;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TableRowDeleteEvent extends InteractionEvent {

    public static String EVENT_NAME = "delete";

    /**
     * UiBinder implementations
     */
    private static Type<TableRowDeleteHandler> TYPE = new Type<TableRowDeleteHandler>(EVENT_NAME, null);

    public static Type<TableRowDeleteHandler> getType() {
        return TYPE;
    }

    public static Type<TableRowDeleteHandler> getAssociatedType() {
        return TYPE;
    }

    protected TableRowDeleteEvent() {

    }

    private TableRowDeleteEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    /**
     * Indicates whether the detail button was clicked. Only true if
     * row.hasDetail is true and the detail button was clicked.
     */
    public native boolean hasDetail() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.detail;
    }-*/;

    public native TableViewRow getRow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.row;
		return @com.ait.toolkit.titanium.mobile.client.ui.TableViewRow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private native double _getGlobalX() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.globalPoint.x;
    }-*/;

    private native double _getGlobalY() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.globalPoint.y;
    }-*/;

    public Point getGlobalPoint() {
        return new Point(_getGlobalX(), _getGlobalY());
    }

    public native TableViewBaseModel getRowData() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.rowData;
		return @com.ait.toolkit.titanium.mobile.client.data.TableViewBaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native boolean isSearchMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.searchMode;
    }-*/;

    public native TableViewSection getSection() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.row;
		return @com.ait.toolkit.titanium.mobile.client.ui.TableViewSection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native double getX() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.x;
    }-*/;

    public native double getY() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.y;
    }-*/;

}
