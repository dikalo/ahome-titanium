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
package com.ait.toolkit.titanium.mobile.client.ui.ios;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Dynamic behavior defining an item's movement to a specific point.
 */
public class SnapBehavior extends Behavior {

	public SnapBehavior() {
		createPeer();
	}

	SnapBehavior(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	public native double getDamping() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.damping;
	}-*/;

	public native void setDamping(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.damping = value;
	}-*/;

	public native View getItem() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.item;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native void setItem(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.item = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public native Point getSnapPoint() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.snapPoint;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native void setSnapPoint(Point value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.snapPoint = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public void createPeer() {
		jsObj = create();
	}

	public static SnapBehavior from(JsObject proxy) {
		return new SnapBehavior(proxy.getJsObj());
	}

	private static native JavaScriptObject create() /*-{
		return Titanium.UI.iOS.createSnapBehavior();
	}-*/;

}
