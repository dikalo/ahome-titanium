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
package com.ait.toolkit.titanium.mobile.client.contacts;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class Url extends JsObject {

    public Url() {
        jsObj = JsoHelper.createObject();
    }

    protected Url(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native JsArrayString getHome()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.home;
    }-*/;

    public native void setHome(JsArrayString value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.home = value;
    }-*/;

    public native JsArrayString getHomePage()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.homepage;
    }-*/;

    public native void setHomePage(JsArrayString value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.homepage = value;
    }-*/;

    public native JsArrayString getOther()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.other;
    }-*/;

    public native void setOther(JsArrayString value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.other = value;
    }-*/;

    public native JsArrayString getWork()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.work;
    }-*/;

    public native void setWork(JsArrayString value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.work = value;
    }-*/;

}
