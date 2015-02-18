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
package com.ait.toolkit.titanium.mobile.client.core;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Size extends JsObject {

    public Size() {
        create();
        setHeight(0);
        setWidth(0);
    }

    public Size(double width, double height) {
        this();
        setWidth(width);
        setHeight(height);
    }

    private Size(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void setWidth(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.width = value;
    }-*/;

    public native double getWidth()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.width;
    }-*/;

    public native void setHeight(double value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.height = value;
    }-*/;

    public native double getHeight()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.height;
    }-*/;

    private void create() {
        jsObj = JsoHelper.createObject();
    }

}
