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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A location rule to filter the results returned by location providers.
 */
public class LocationRule extends JsObject {

    public LocationRule() {
        jsObj = JsoHelper.createObject();
    }

    public LocationRule(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * 
     * Minimum accuracy required for a location update.
     */
    public native double getAccurary() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.accuuracy;
    }-*/;

    /**
     * Controls the freshness of location updates. Do not forward an update
     * unless it is newer than maxAge milliseconds.
     * 
     */
    public native double getMaxAge() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.maxAge;
    }-*/;

    /**
     * Controls the frequency of location updates.
     * <p>
     * Do not forward an update unless at least minAge milliseconds have passed
     * since the last good location update (that is, the last update from any
     * provider that generated a location event).
     */
    public native String getMinAge() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.minAge;
    }-*/;

    /**
     * Sets the value of the minUpdateDistance property.
     */
    public native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    public native void setAccuracy(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.accuracy = value;
    }-*/;

    public native void setMaxAge(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.maxAge = value;
    }-*/;

    public native void setMinAge(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.minAge = value;
    }-*/;

    public native void setName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.name = value;
    }-*/;
}
