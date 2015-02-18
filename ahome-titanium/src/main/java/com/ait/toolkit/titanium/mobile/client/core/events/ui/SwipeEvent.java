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

import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SwipeHandler;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class SwipeEvent extends InteractionEvent {
	public static String EVENT_NAME = "swipe";

	/**
	 * UiBinder implementations
	 */
	private static Type<SwipeHandler> TYPE = new Type<SwipeHandler>(EVENT_NAME, null);
	public static Type<SwipeHandler> getType() {
		return TYPE;
	}
	
	public static Type<SwipeHandler> getAssociatedType() {
		return TYPE;
	}
	
	public enum SWIPE_DIRECTION {
		RIGHT_TO_LEFT,
		LEFT_TO_RIGHT
	}
	
	protected SwipeEvent() {
	}
	
	private SwipeEvent(JavaScriptObject jso) {
		this.jsObj = jso;
	}
	
	public final native double getX() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.x;
	}-*/;
	
	public final native double getY() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.y;
	}-*/;
	
	public Point getPoint() {
		return new Point(getX(), getY());
	}
	
	public final native String _getDirection() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.direction;
	}-*/;
	
	public SWIPE_DIRECTION getDirection() {
		String dir = _getDirection();
		return (dir == null || dir.equals("left") ? SWIPE_DIRECTION.RIGHT_TO_LEFT : SWIPE_DIRECTION.LEFT_TO_RIGHT);
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
