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
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewDragStartHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TableViewDragStartEvent extends InteractionEvent {

    public static String EVENT_NAME = "dragstart";

    /**
     * UiBinder implementations
     */
    private static Type<TableViewDragStartHandler> TYPE = new Type<TableViewDragStartHandler>(EVENT_NAME, null);

    public static Type<TableViewDragStartHandler> getType() {
        return TYPE;
    }

    public static Type<TableViewDragStartHandler> getAssociatedType() {
        return TYPE;
    }

    protected TableViewDragStartEvent() {

    }

    private TableViewDragStartEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    /**
     * Indicates whether scrolling will continue but decelerate, now that the
     * drag gesture has been released by the touch. If false, scrolling will
     * stop immediately.
     */
    public native boolean decelerate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.decelerate;
    }-*/;

}
