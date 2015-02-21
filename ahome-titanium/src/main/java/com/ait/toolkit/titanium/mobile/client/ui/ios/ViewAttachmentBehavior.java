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
 * Gravitational force to apply to an item.Continuous or instantaneous force to
 * apply to an item.
 */
public class ViewAttachmentBehavior extends Behavior {

	public ViewAttachmentBehavior() {
		createPeer();
	}

	ViewAttachmentBehavior(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	public native View getAnchorItem() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.anchorItem;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native void setAnchorItem(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.anchorItem = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public native Point getAnchorOffset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.anchorOffset;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native void setAnchorOffset(Point value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.anchorOffset = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public native double getDamping() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.damping;
	}-*/;

	public native void setDamping(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.damping = value;
	}-*/;

	public native void setDistance(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.distance = value;
	}-*/;

	public native double getFrequency() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.frequency;
	}-*/;

	public native void setFrequency(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.frequency = value;
	}-*/;

	public native double getDistance() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.distance;
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

	public native Point getItemOffset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.itemOffset;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native void setItemOffset(Point value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.itemOffset = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public void createPeer() {
		jsObj = create();
	}

	public static ViewAttachmentBehavior from(JsObject proxy) {
		return new ViewAttachmentBehavior(proxy.getJsObj());
	}

	private static native JavaScriptObject create() /*-{
		return Titanium.UI.iOS.createViewAttachmentBehavior();
	}-*/;

}
