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

import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Add-on map module using the Google Maps Android API v2.
 * <p>
 * This module is a replacement for the built-in Titanium.Map module on Android,
 * which uses the Google Maps API v1. The Google Maps API v1 is deprecated and
 * Google will no longer issue new Maps API v1 keys after March 3rd, 2013. New
 * applications should use this module on Android.
 * <p>
 * Applications with existing Maps API v1 keys can continue to use the
 * Titanium.Map module on Android, or transition to the new ti.map add-on
 * module.
 * <p>
 * For more instructions and examples of using the module, refer to the Google
 * Maps v2 for Android guide.
 * <p>
 * 
 * <h2>Requirements</h2>
 * <ul>
 * <li>Google Maps API key (required for both development and production)</li>
 * <li>Google Play installed on device. This module is not supported on the
 * Android emulator.</li>
 * </ul>
 * 
 * 
 */
public class GMap extends TiModule {

	private static final GMap INSTANCE = new GMap();

	static GMap get() {
		return INSTANCE;
	}

	private GMap() {
		createPeer();
	}

	@Override
	public void createPeer() {
		jsObj = create();
	}

	public static native int ANNOTATION_AZURE()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_AZURE;
	}-*/;

	public static native int ANNOTATION_BLUE()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_BLUE;
	}-*/;

	public static native int ANNOTATION_CYAN()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_CYAN;
	}-*/;

	public static native int ANNOTATION_DRAG_STATE_END()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_DRAG_STATE_END;
	}-*/;

	public static native int ANNOTATION_DRAG_STATE_START()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_DRAG_STATE_START;
	}-*/;

	public static native int ANNOTATION_GREEN()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_GREEN;
	}-*/;

	public static native int ANNOTATION_MAGENTA()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_MAGENTA;
	}-*/;

	public static native int ANNOTATION_ORANGE()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_ORANGE;
	}-*/;

	public static native int ANNOTATION_RED()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_RED;
	}-*/;

	public static native int ANNOTATION_ROSE()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_ROSE;
	}-*/;

	public static native int ANNOTATION_VIOLET()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_VIOLET;
	}-*/;

	public static native int ANNOTATION_YELLOW()/*-{
		var map = require('ti.map');
		return map.ANNOTATION_YELLOW;
	}-*/;

	public static native int HYBRID_TYPE()/*-{
		var map = require('ti.map');
		return map.HYBRID_TYPE;
	}-*/;

	public static native int NORMAL_TYPE()/*-{
		var map = require('ti.map');
		return map.NORMAL_TYPE;
	}-*/;

	public static native int SATELLITE_TYPE()/*-{
		var map = require('ti.map');
		return map.SATELLITE_TYPE;
	}-*/;

	public static native int TERRAIN_TYPE()/*-{
		var map = require('ti.map');
		return map.TERRAIN_TYPE;
	}-*/;

	native JavaScriptObject createAnnotation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createAnnotation();
	}-*/;

	native JavaScriptObject createAnnotation(View view)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.createAnnotation({
					customView : view.@com.ait.toolkit.core.client.JsObject::getJsObj()()
				});
	}-*/;

	native JavaScriptObject createRoute()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createRoute();
	}-*/;

	native JavaScriptObject createView()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.creatView();
	}-*/;

	private static native JavaScriptObject create()/*-{
		return require('ti.map');
	}-*/;

}
