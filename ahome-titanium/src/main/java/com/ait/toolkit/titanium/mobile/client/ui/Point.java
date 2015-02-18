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
package com.ait.toolkit.titanium.mobile.client.ui;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Point extends JsObject {

    public Point() {
        jsObj = create(0, 0);
    }

    public Point(double x, double y) {
        jsObj = create(x, y);
    }

    private Point(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native double getX() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.x;
    }-*/;

    public native double getY() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.y;
    }-*/;

    private static native JavaScriptObject create(double xCoordinate, double yCoordinate) /*-{
    	var r = {};
    	r.x = xCoordinate;
    	r.y = yCoordinate;
    	return r;
    }-*/;

    public native void setX(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.x = value;
    }-*/;

    public native void setY(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.y = value;
    }-*/;

    public static Point from(JsObject proxy) {
        return new Point(proxy.getJsObj());
    }
}
