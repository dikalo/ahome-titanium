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
package com.ait.toolkit.titanium.mobile.client.platform;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The display caps object returned by the
 * {@link com.ait.toolkit.titanium.mobile.client.platform.Platform.getDisplayCaps}
 * property.
 * <p>
 * On iPhone, the 'density' property will return 'high' for retina devices and
 * 'medium' otherwise, the 'dp' property will return '160'. For iPad, the
 * 'density' property will return 'medium' and the 'dpi' property will return
 * '130'. For AndroidMedia, these values are device specific.
 */
public class DisplayCaps extends EventDispatcher {

	private DisplayCaps() {
	}

	private DisplayCaps(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * @return Returns the density property of the display device.
	 */
	public native String getDensity() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.density;
	}-*/;

	public native void setDensity(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.density = value;
	}-*/;

	/**
	 * @return The dpi of the display device.
	 */
	public native int getDpi() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.dpi;
	}-*/;

	public native void setDpi(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.dpi = value;
	}-*/;

	/**
	 * @return The height of the device screen
	 */
	public native double getPlatformHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.platformHeight;
	}-*/;

	public native void setPlatformHeight(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.platformHeight = value;
	}-*/;

	/**
	 * @return The width of the device screen
	 */
	public native double getPlatformWidth() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.platformWidth;
	}-*/;

	public native void setPlatformWidth(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.platformWidth = value;
	}-*/;
	
	public native double getLogicalDensityFactor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (jso.logicalDensityFactor) {
			return jso.logicalDensityFactor;
		} else {
			return 1.0;
		}
	}-*/;

}
