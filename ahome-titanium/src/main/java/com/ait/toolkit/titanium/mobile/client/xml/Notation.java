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

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents a notation declared in the dtd. see dom level 2
 * spec(http://www.w3
 * .org/tr/2000/rec-dom-level-2-core-20001113/core.html#id-5431d1b9)
 */
public class Notation extends EventDispatcher {

    protected Notation() {
    }

    protected Notation(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The public identifier of this notation. if the public identifier
     *         was not specified, this is `null`.
     */
    public native String getPublicId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.publicId;
    }-*/;

    public native void setPublicId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.publicId = value;
    }-*/;

    /**
     * @return The system identifier of this notation. if the system identifier
     *         was not specified, this is `null`.
     */
    public native String getSystemId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.systemId;
    }-*/;

    public native void setSystemId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.systemId = value;
    }-*/;

}
