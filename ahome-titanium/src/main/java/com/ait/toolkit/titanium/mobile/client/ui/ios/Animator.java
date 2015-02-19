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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
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
public class Animator extends EventDispatcher {

	Animator() {
		createPeer();
	}

	Animator(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	/**
	 * @return Returns true if the animator is running else false.
	 */
	public native boolean isRunning() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.running;
	}-*/;

	public native void setRunning(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.running = value;
	}-*/;

	/**
	 * The Window whose Activity lifecycle should be triggered on the proxy.
	 * 
	 * @param value
	 */
	public native void setReferenceView(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setReferenceView(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native View getReferenceView()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.getReferenceView();
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native void addBehavior(Behavior value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addBehavior(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void removeBehavior(Behavior value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeBehavior(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void removeAllBehaviors() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeAllBehaviors();
	}-*/;

	public List<Behavior> getBehaviors() {
		List<Behavior> behaviors = new ArrayList<Behavior>();
		JsArray<JavaScriptObject> values = _getBehaviors();
		for (int i = 0; i < values.length(); i++) {
			behaviors.add(new Behavior(values.get(i)));
		}
		return behaviors;
	}

	private native JsArray<JavaScriptObject> _getBehaviors() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getBehaviors();
	}-*/;

	public void setBehaviors(List<Behavior> behaviors) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (Behavior element : behaviors) {
			values.push(element.getJsObj());
		}
		_setBehaviors(values);
	}

	public void setBehaviors(Behavior... behaviors) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (Behavior element : behaviors) {
			values.push(element.getJsObj());
		}
		_setBehaviors(values);
	}

	private native void _setBehaviors(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setBehaviors(value);
	}-*/;

	/**
	 * @return The style of the button bar
	 */
	public native void startAnimation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.startAnimation();
	}-*/;

	public native void stopAnimation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stopAnimation();
	}-*/;

	public native void updateItemUsingCurrentState(View view) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.updateItemUsingCurrentState(view.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public void createPeer() {
		jsObj = createAnimator();
	}

	public static Animator from(JsObject proxy) {
		return new Animator(proxy.getJsObj());
	}

	private static native JavaScriptObject createAnimator() /*-{
		return Titanium.UI.iOS.createAnimator();
	}-*/;

	public void addPauseHandler(EventHandler handler) {
		addEventHandler("pause", handler);
	}

	public void addResumeHandler(EventHandler handler) {
		addEventHandler("resume", handler);
	}

}
