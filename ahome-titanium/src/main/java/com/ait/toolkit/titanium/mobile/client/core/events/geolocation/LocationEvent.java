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
package com.ait.toolkit.titanium.mobile.client.core.events.geolocation;

import com.ait.toolkit.titanium.mobile.client.core.events.TiEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeolocationHandler;
import com.ait.toolkit.titanium.mobile.client.geolocation.Coordinates;
import com.ait.toolkit.titanium.mobile.client.geolocation.android.LocationProvider;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class LocationEvent extends TiEvent {

    public static final String LOCATION = "location";

    /**
     * UiBinder implementations
     */
    private static Type<GeolocationHandler> TYPE = new Type<GeolocationHandler>(LOCATION, null);

    public static Type<GeolocationHandler> getType() {
        return TYPE;
    }

    public static Type<GeolocationHandler> getAssociatedType() {
        return TYPE;
    }

    protected LocationEvent() {

    }

    protected LocationEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * if success is false, the error code if available (iOS only)
     */
    public final native double getCode() /*-{
		var jso = jso.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.code;
    }-*/;

    /**
     * boolean to indicate if the location event was successfully received or an
     * error occurred
     */
    public final native boolean isSuccess() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.success;
    }-*/;

    /**
     * (AndroidMedia only) location provider dictionary with the following
     * sub-properties: `name`, `accuracy`, `power`, and `provider`.
     */
    public final native LocationProvider getProvider() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		var obj = jso.provider;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.geolocation.android.LocationProvider::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * location coordinates dictionary with the following sub-properties:
     * `latitude`, `longitude`, `altitude`, `accuracy`, `altitudeAccuracy`,
     * `heading`, `speed`, `timestamp`.
     */
    public final native Coordinates getCoords() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		var obj = jso.coords;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.geolocation.Coordinates::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * if success is false, returns a string of the error description
     */
    public final native String getError() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.error;
    }-*/;

}
