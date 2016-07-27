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

package com.ait.toolkit.titanium.mobile.client.core.events;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class Event extends JsObject {

	public static final String POST_LAYOUT = "postlayout";

	public Event() {
		jsObj = JsoHelper.createObject();
	}

	private Event(JavaScriptObject obj) {
		jsObj = obj;
	}

	public native JsObject getSource() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.source;
		var toReturn = @com.ait.toolkit.core.client.JsObject::create(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void preventDefault() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.preventDefault();
	}-*/;

	public native void stopPropagation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stopPropagation();
	}-*/;

	/**
	 * Changed from getType to getEventType, due to UIBinder clashes
	 * 
	 * @return
	 */
	public native String getEventType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.type;
	}-*/;

	/**
	 * True if the event will try to bubble up if possible.
	 */
	public native boolean bubbles() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.bubbles;
	}-*/;

	/**
	 * Set to true to stop the event from bubbling.
	 */
	public native void setCancelBubble(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.cancelBubble = value;
	}-*/;

	public native void setEventData(EventData data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var attribute = @com.ait.toolkit.titanium.mobile.client.core.events.EventData::DATA_ATTRIBUTE;
		jso[attribute] = data.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public native EventData getEventData() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var attribute = @com.ait.toolkit.titanium.mobile.client.core.events.EventData::DATA_ATTRIBUTE;
		var toReturn = jso[attribute];
		return @com.ait.toolkit.titanium.mobile.client.core.events.EventData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
	}-*/;

}
