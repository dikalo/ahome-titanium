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

import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ChangeHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ChangeEvent extends UIEvent {

    public static String CHANGE = "change";
    

	/**
	 * UiBinder implementations
	 */
	private static Type<ChangeHandler> TYPE = new Type<ChangeHandler>(CHANGE, null);
	public static Type<ChangeHandler> getType() {
		return TYPE;
	}
	
	public static Type<ChangeHandler> getAssociatedType() {
		return TYPE;
	}

    protected ChangeEvent() {

    }

    private ChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the index of the image that is now visible
     */
    public native int getIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.index;
    }-*/;

    /**
     * the previous index of the image that was visible
     */
    public native int getPrevious() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.previous;
    }-*/;

}
