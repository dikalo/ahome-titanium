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

/**
 * References :
 * http://docs.appcelerator.com/titanium/latest/#!/api/Dimension
 * 
 * @author mvniekerk
 *
 */
public class Dimension extends JsObject {
	
	public Dimension() {
		jsObj = create(0, 0, 0, 0);
	}
	
	public Dimension(JavaScriptObject jso) {
		jsObj = jso;
	}
	
	public Dimension(double height, double width, double x, double y) {
		jsObj = create(width, height, x, y);
	}
	
	private static native JavaScriptObject create(double width, double height, double x, double y) /*-{
		var r = {};
		r.width = width;
		r.height = height;
		r.x = x;
		r.y = y;
		return r;
	}-*/;
	

    public native double getX() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.x;
    }-*/;

    public native double getY() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.y;
    }-*/;

    public native double getHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.height;
    }-*/;

    public native double getWidth() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.width;
    }-*/;

    public native void setHeight(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.height = value;
    }-*/;

    public native void setWidth(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.width = value;
    }-*/;
    
    public native void setX(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.x = value;
    }-*/;

    public native void setY(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.y = value;
    }-*/;
    
    public static Dimension from(JsObject JsObject) {
    	return new Dimension(JsObject.getJsObj());
    }
}
