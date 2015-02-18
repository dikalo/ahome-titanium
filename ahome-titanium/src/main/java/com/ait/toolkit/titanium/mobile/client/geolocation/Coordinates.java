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
package com.ait.toolkit.titanium.mobile.client.geolocation;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Coordinates extends JsObject {

    public Coordinates() {
        jsObj = JsoHelper.createObject();
    }

    public Coordinates(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native double getLatitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.latitude;
    }-*/;

    public native double getLongitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.longitude;
    }-*/;

    public native double getAltitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.altitude;
    }-*/;

    public native double getAccuracy() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.accuracy;
    }-*/;

    public native double getAltitudeAccuracy() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.altitudeAccuracy;
    }-*/;

    public native double getHeading() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.heading;
    }-*/;

    public native double getSpeed() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.speed;
    }-*/;

    public native double getTimestamp() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.timestamp;
    }-*/;

}
