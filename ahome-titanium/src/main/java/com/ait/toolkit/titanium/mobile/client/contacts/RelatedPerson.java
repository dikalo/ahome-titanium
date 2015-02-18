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

public class RelatedPerson extends JsObject {

    public RelatedPerson() {
        jsObj = JsoHelper.createObject();
    }

    protected RelatedPerson(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void setMother(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.mother = value
    }-*/;

    public native void setFather(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.father = value
    }-*/;

    public native void setParent(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.parent = value
    }-*/;

    public native void setBrother(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.brother = value
    }-*/;

    public native void setSister(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.sister = value
    }-*/;

    public native void setChild(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.child = value
    }-*/;

    public native void setFriend(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.friend = value
    }-*/;

    public native void setSpouse(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.spouse = value
    }-*/;

    public native void setPartner(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.partner = value
    }-*/;

    public native void setAssistant(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.assistant = value
    }-*/;

    public native void setManager(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.manager = value
    }-*/;

    public native void setOther(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.other = value
    }-*/;

}
