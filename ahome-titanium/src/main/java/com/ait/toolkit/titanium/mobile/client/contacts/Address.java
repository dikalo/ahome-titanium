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

import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Address extends JsObject {

    protected Address(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native List<AddressEntry> getHome()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.home;
		return @com.ait.toolkit.titanium.mobile.client.contacts.AddressEntry::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setHome(List<AddressEntry> values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.home = @com.ait.toolkit.titanium.mobile.client.contacts.AddressEntry::fromList(Ljava/util/ArrayList;)(values);
    }-*/;

    public native List<AddressEntry> getWork()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.work;
		return @com.ait.toolkit.titanium.mobile.client.contacts.AddressEntry::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setWork(List<AddressEntry> values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.work = @com.ait.toolkit.titanium.mobile.client.contacts.AddressEntry::fromList(Ljava/util/ArrayList;)(values);
    }-*/;

    public native List<AddressEntry> getOther()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.other;
		return @com.ait.toolkit.titanium.mobile.client.contacts.AddressEntry::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setOther(List<AddressEntry> values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.other = @com.ait.toolkit.titanium.mobile.client.contacts.AddressEntry::fromList(Ljava/util/ArrayList;)(values);
    }-*/;

}
