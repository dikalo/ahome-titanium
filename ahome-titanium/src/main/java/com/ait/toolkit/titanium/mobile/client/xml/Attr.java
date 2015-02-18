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
package com.ait.toolkit.titanium.mobile.client.xml;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Class representing an attribute of an
 * com.ait.toolkit.titanium.mobile.client.xml.Element as defined in the [dom level 2
 * specification](http://www.w3.org/tr/2000/rec-dom-level
 * -2-core-20001113/core.html#id-637646024).
 */
public class Attr extends Node {

    protected Attr() {
    }

    protected Attr(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Attribute name
     */
    public native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    /**
     * @return The {@link com.ait.toolkit.titanium.mobile.client.xml.Element} to
     *         which the attribute belongs.
     */
    public native Element getOwnerElement() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.ownerElement;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Element::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * @return True if jso attribute was explicitly given a value in the
     *         instance document, false otherwise.
     */
    public native boolean isSpecified() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.specified;
    }-*/;

    /**
     * @return The attribute value as a string.
     */
    public native String getValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.value;
    }-*/;

    public native void setValue(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.value = value;
    }-*/;

}
