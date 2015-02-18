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
package com.ait.toolkit.titanium.mobile.modules.gmap.client;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Represents a labeled point of interest on the map that the user can click on.
 * <p>
 * The Annotation object gives you low-level control over annotations that can
 * be added to map view. An annotation must have its latitude and longitude
 * properties set to appear on a map.
 * <p>
 * An annotation has two states: selected and deselected. A deselected
 * annotation is marked by a pin image. When the user selects the pin, the full
 * annotation is displayed.
 * <p>
 * You can specify a custom image for the map pin by setting the image property.
 * <p>
 * When the user clicks on an annotation, a click event is generated. The
 * annotation itself does not generate these events. You must add event
 * listeners to the map view instead.
 */
public class GMapAnnotation extends EventDispatcher {

	private View customView;

	public GMapAnnotation() {
		jsObj = GMap.get().createAnnotation();
	}

	public GMapAnnotation(View customView) {
		this.customView = customView;
		jsObj = GMap.get().createAnnotation(customView);
	}

	protected GMapAnnotation(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * Defines a custom view to be used by the annotation.
	 * <p>
	 * Must be set during creation. User interaction is disabled on the view. No
	 * view interaction events (click, touchstart etc) will be fired.
	 */
	public View getCustomView() {
		this.customView = View.from(JsObject.create(_getCustomView()));
		return this.customView;
	}

	private native JavaScriptObject _getCustomView()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.customView;
	}-*/;

	/**
	 * Determines whether the pin can be dragged by the user.
	 * <p>
	 * When an annotation is draggable, it can be moved by the user by long
	 * pressing on the pin.
	 * <p>
	 * Default: false
	 */
	public native boolean isDraggable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.draggable;
	}-*/;

	/**
	 * Determines whether the pin can be dragged by the user.
	 * <p>
	 * When an annotation is draggable, it can be moved by the user by long
	 * pressing on the pin.
	 * <p>
	 * Default: false
	 */
	public native void setDraggable(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.draggable = value;
	}-*/;

	/**
	 * Image to use for the the pin. <p< Must be set during creation. This is
	 * ignored if the customView property is set.
	 * <p>
	 * Default: If not specified, a standard map pin image is used.
	 */
	public native String getImage()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.image;
	}-*/;

	/**
	 * Image to use for the the pin.
	 * <p>
	 * Must be set during creation. This is ignored if the customView property
	 * is set.
	 * <p>
	 * Default: If not specified, a standard map pin image is used.
	 */
	public native void setImage(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.image = value;
	}-*/;

	public native double getLatitude()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.latitude;
	}-*/;

	public native void setLatitude(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.latitude = value;
	}-*/;

	public native double getPinColor()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.pincolor;
	}-*/;

	public native void setPinColor(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pincolor = value;
	}-*/;

	public native String getSubTitle()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.subtitle;
	}-*/;

	public native void setSubTitle(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.subtitle = value;
	}-*/;

	public native String getTitle()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.title;
	}-*/;

	public native void setTitle(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
	}-*/;

	static JsArray<JavaScriptObject> fromList(List<GMapAnnotation> values) {
		JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
		for (GMapAnnotation type : values) {
			peers.push(type.getJsObj());
		}
		return peers;
	}

	static List<GMapAnnotation> fromArray(JavaScriptObject obj) {
		int size = JsoHelper.arrayLength(obj);
		List<GMapAnnotation> toReturn = new ArrayList<GMapAnnotation>();
		for (int i = 0; i < size; i++) {
			toReturn.add(new GMapAnnotation(JsoHelper
					.getValueFromJavaScriptObjectArray(obj, i)));
		}
		return toReturn;
	}

}
