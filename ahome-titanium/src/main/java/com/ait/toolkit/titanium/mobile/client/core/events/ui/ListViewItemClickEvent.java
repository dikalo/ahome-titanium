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
package com.ait.toolkit.titanium.mobile.client.core.events.ui;

import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ListViewItemClickHandler;
import com.ait.toolkit.titanium.mobile.client.ui.ListSection;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ListViewItemClickEvent extends InteractionEvent {

    public static String EVENT_NAME = "itemclick";

    /**
     * UiBinder implementations
     */
    private static Type<ListViewItemClickHandler> TYPE = new Type<ListViewItemClickHandler>(EVENT_NAME, null);

    public static Type<ListViewItemClickHandler> getType() {
        return TYPE;
    }

    public static Type<ListViewItemClickHandler> getAssociatedType() {
        return TYPE;
    }

    protected ListViewItemClickEvent() {

    }

    protected ListViewItemClickEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    public native boolean accessoryClicked() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.accessoryClicked;
    }-*/;

    public native String getBinId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.bindId;
    }-*/;

    public native String getItemId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.itemId;
    }-*/;

    public native int getItemIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.itemIndex;
    }-*/;

    public native ListSection getSection() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.section;
		return @com.ait.toolkit.titanium.mobile.client.ui.ListSection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getSectionIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.sectionIndex;
    }-*/;

    public native String getEventType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.type;
    }-*/;

}
