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

import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.FocusHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class FocusEvent extends InteractionEvent {
    public static String EVENT_NAME = "focus";

    /**
     * UiBinder implementations
     */
    private static Type<FocusHandler> TYPE = new Type<FocusHandler>(EVENT_NAME, null);

    public static Type<FocusHandler> getType() {
        return TYPE;
    }

    public static Type<FocusHandler> getAssociatedType() {
        return TYPE;
    }

    protected FocusEvent() {

    }

    private FocusEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

	public native boolean bubbles() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.bubbles;
	}-*/;
	
	public native boolean bubbleCanceled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.cancelBubble;
    }-*/;
}
