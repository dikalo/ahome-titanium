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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Provides support for the built-in iOS dynamic animations
 * <p>
 * The following APIs are supported on iOS 7 and later.
 * <p>
 * The animator provides physics-related capabilities and animations using the
 * iOS physics engine. Each animator is independent of other animators you
 * create. An animator is comprised of behaviors and items. Behaviors define the
 * rules of the animation, while items are the view objects to be animated. An
 * item in the animator can be given multiple behaviors as long as those
 * behaviors belong to the same animator.
 */
public class Behavior extends EventDispatcher {

	Behavior() {

	}

	Behavior(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	public native void addItem(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addItem(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void removeItem(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeItem(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public List<View> getItems() {
		List<View> views = new ArrayList<View>();
		JsArray<JavaScriptObject> values = _getItems();
		for (int i = 0; i < values.length(); i++) {
			views.add(new View(values.get(i)));
		}
		return views;
	}

	private native JsArray<JavaScriptObject> _getItems() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getItems();
	}-*/;

}
