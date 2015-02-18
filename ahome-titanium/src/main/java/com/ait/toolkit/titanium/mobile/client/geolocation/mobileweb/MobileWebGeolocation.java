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
package com.ait.toolkit.titanium.mobile.client.geolocation.mobileweb;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * The Mobile Web specific geolocation capabilities.
 */
public class MobileWebGeolocation extends TiModule {

    private static final MobileWebGeolocation INSTANCE = new MobileWebGeolocation();

    public static MobileWebGeolocation get() {
        return INSTANCE;
    }

    private MobileWebGeolocation() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeMobileWebGeolocation();
    }

    /**
     * 
     * The time within which forward geocoder requests must succeed, in
     * milliseconds.
     */
    public native double getForwardGeocoderTimeout() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getForwardGeocoderTimeout();
    }-*/;

    /**
     * 
     * The time within which forward geocoder requests must succeed, in
     * milliseconds.
     */
    public native void setForwardGeocoderTimeout(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setForwardGeocoderTimeout(value);
    }-*/;

    /**
     * The time within which location requests must succeed, in milliseconds.
     * 
     */
    public native double getLocationTimeout() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getLocationTimeout();
    }-*/;

    /**
     * 
     * The time within which location requests must succeed, in milliseconds.
     */
    public native void setLocationTimeout(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setLocationTimeout(value);
    }-*/;

    /**
     * The maximum age of cached locations acceptible for heading requests, in
     * milliseconds.
     * 
     */
    public native double setMaximumHeadingAge() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getMaximumHeadingAge();
    }-*/;

    /**
     * 
     * The maximum age of cached locations acceptible for heading requests, in
     * milliseconds.
     */
    public native void getMaximumHeadingAge(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.getMaximumHeadingAge(value);
    }-*/;

    /**
     * The maximum age of cached locations acceptible for location requests, in
     * milliseconds.
     * 
     */
    public native double getMaximumLocationAge() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getMaximumLocationAge();
    }-*/;

    /**
     * 
     * The maximum age of cached locations acceptible for location requests, in
     * milliseconds.
     */
    public native void setMaximumLocationAge(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setMaximumLocationAge(value);
    }-*/;

    /**
     * The time within which reverse geocoder requests must succeed, in
     * milliseconds.
     * 
     */
    public native double getReverseGeocoderTimeout() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getReverseGeocoderTimeout();
    }-*/;

    /**
     * 
     * The time within which reverse geocoder requests must succeed, in
     * milliseconds.
     */
    public native void setReverseGeocoderTimeout(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setReverseGeocoderTimeout(value);
    }-*/;

}
