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
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.behavior.BoundaryCollisionHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.behavior.ItemCollisionHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Dynamic behavior to support collisions between items and boundaries.
 */
public class CollisionBehavior extends Behavior {

	public CollisionBehavior() {
		createPeer();
	}

	CollisionBehavior(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	/**
	 * @return Returns true if the animator is running else false.
	 */
	public native double getCollisionMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getCollisionMode();
	}-*/;

	public native void addBoundary(BoundaryIdentifier value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addBoundary(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public List<BoundaryIdentifier> getBoundaryIdentifiers() {
		List<BoundaryIdentifier> attributes = new ArrayList<BoundaryIdentifier>();
		JsArray<JavaScriptObject> values = _getBoundaryIdentifiers();
		for (int i = 0; i < values.length(); i++) {
			attributes.add(new BoundaryIdentifier(values.get(i)));
		}
		return attributes;
	}

	public native boolean isTreatReferenceAsBoundary() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getTreatReferenceAsBoundary();
	}-*/;

	public native boolean setTreatReferenceAsBoundary(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.setTreatReferenceAsBoundary(value);
	}-*/;

	public native void removeAllBoundaries() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeAllBoundaries();
	}-*/;

	public native void removeBoundary(BoundaryIdentifier value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeBoundary(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void setReferenceInsets(ReferenceInsets value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setReferenceInsets(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void setCollisionMode(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setCollisionMode(value);
	}-*/;

	public native ReferenceInsets getReferenceInsets() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.getReferenceInsets();
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.ios.ReferenceInsets::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native CallbackRegistration addBoundaryCollisionHandler(
			BoundaryCollisionHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.BoundaryCollisionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.behavior.BoundaryCollisionHandler::onBoundaryCollision(Lcom/ait/toolkit/titanium/mobile/client/core/events/BoundaryCollisionEvent;)(eventObject);
			var name = @com.ait.toolkit.titanium.mobile.client.core.events.BoundaryCollisionEvent::EVENT_NAME;
		}
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	public native CallbackRegistration addItemCollisionHandler(
			ItemCollisionHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ItemCollisionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.behavior.ItemCollisionHandler::onItemCollision(Lcom/ait/toolkit/titanium/mobile/client/core/events/ItemCollisionEvent;)(eventObject);
			var name = @com.ait.toolkit.titanium.mobile.client.core.events.ItemCollisionEvent::EVENT_NAME;
		}
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	private native JsArray<JavaScriptObject> _getBoundaryIdentifiers() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.boundaryIdentifiers;
	}-*/;

	public void createPeer() {
		jsObj = create();
	}

	public static CollisionBehavior from(JsObject proxy) {
		return new CollisionBehavior(proxy.getJsObj());
	}

	private static native JavaScriptObject create() /*-{
		return Titanium.UI.iOS.createCollisionBehavior();
	}-*/;

}
