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
package com.ait.toolkit.titanium.mobile.client.geolocation.android;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * Module for Android-specific geolocation functionality.
 * <p>
 * This module is used for manually configuring geolocation settings on Android.
 * 
 * Manual configuration is recommended for applications that have more demanding
 * geolocation needs (for example, driving directions). However, for basic
 * geolocation information, simple mode geolocation may be sufficient. For
 * information on simple mode, see
 * com.ait.toolkit.titanium.mobile.client.geolocation.Geolocation.
 */
public class AndroidGeoLocation extends TiModule {

    private static final AndroidGeoLocation INSTANCE = new AndroidGeoLocation();

    public static AndroidGeoLocation get() {
        return INSTANCE;
    }

    /**
     * Set to true to enable manual configuration of location updates through
     * this module.
     */
    public native void setManualMode(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setManualMode(value);
    }-*/;

    /**
     * Adds and enables the specified location rule.
     * <p>
     * Only location updates that pass all of the active rules are passed on to
     * the application.
     */
    public native void addLocationRule(LocationRule value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addLocationRule(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Creates and returns an instance of
     * Titanium.Geolocation.Android.LocationProvider.
     */
    public native LocationProvider createLocationProvider() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createLocationProvider();
		return @com.ait.toolkit.titanium.mobile.client.geolocation.android.LocationProvider::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Disables and removes the specified location provider.
     */
    public native void removeLocationProvider(LocationProvider locationProvider) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeLocationProvider(locationProvider.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Disables and removes the specified location rule.
     */
    public native void removeLocationRule(LocationRule locationRule) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeLocationRule(locationRule.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Creates and returns an instance of
     * Titanium.Geolocation.Android.LocationRule.
     */
    public native LocationRule createLocationRule() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createLocationProvider();
		return @com.ait.toolkit.titanium.mobile.client.geolocation.android.LocationRule::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Set to true to enable manual configuration of location updates through
     * this module.
     */
    public native boolean isManualMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.getManualMode();
    }-*/;

    private AndroidGeoLocation() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeAndroidGeolocation();
    }

}
