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
package com.ait.toolkit.titanium.mobile.client.map;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Region extends JsObject {

    public Region() {
        jsObj = JsoHelper.createObject();
    }

    public Region(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Region(double latitude, double longitude, double latitudeAlpha, double longitudeAlpha) {
        this();
        setLatitude(latitude);
        setLongitude(longitude);
        setLatitudeDelta(latitudeAlpha);
        setLongitudeDelta(longitudeAlpha);
    }

    public native void setLatitude(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.latitude = value;
    }-*/;

    public native double getLatitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.latitude;
    }-*/;

    public native void setLongitude(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.longitude = value;
    }-*/;

    public native double getLongitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.longitude;
    }-*/;

    public native void setLatitudeDelta(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.latitudeDelta = value;
    }-*/;

    public native double getLatitudeDelta() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.latitudeDelta;
    }-*/;

    public native void setLongitudeDelta(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.longitudeDelta = value;
    }-*/;

    public native double getLongitudeDelta() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.longitudeDelta;
    }-*/;

}
