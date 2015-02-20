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
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base dynamic configuration for an item.
 */
public class PushBehavior extends Behavior {

	public PushBehavior() {
		createPeer();
	}

	PushBehavior(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	public native boolean allowsRotation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allowsRotation;
	}-*/;

	public native void setAllowsRotation(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.allowsRotation = value;
	}-*/;

	public native double getAngularResistance() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.angularResistance;
	}-*/;

	public native void setAngularResistance(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.angularResistance = value;
	}-*/;

	public native double getDensity() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.density;
	}-*/;

	public native void setDensity(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.density = value;
	}-*/;

	public native double getElasticity() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.angularResistance;
	}-*/;

	public native void setElasticity(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.elasticity = value;
	}-*/;

	public native double getFriction() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.friction;
	}-*/;

	public native void setFriction(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.friction = value;
	}-*/;

	public native double getResistance() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.resistance;
	}-*/;

	public native void setResistance(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.resistance = value;
	}-*/;

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

	public native void addAngularVelocityForItem(View item, double velocity) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addAngularVelocityForItem(
				item.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				velocity);
	}-*/;

	public native void addLinearVelocityForItem(View item, double velocity) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addLinearVelocityForItem(
				item.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				velocity);
	}-*/;

	public void createPeer() {
		jsObj = create();
	}

	public static PushBehavior from(JsObject proxy) {
		return new PushBehavior(proxy.getJsObj());
	}

	private static native JavaScriptObject create() /*-{
		return Titanium.UI.iOS.createDynamicItemBehavior();
	}-*/;

}
