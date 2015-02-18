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
 * A way to keep processor-specific information in the text of the document.
 * see dom level 2
 * spec(http://www.w3.org/tr/2000/rec-dom-level-2-core-20001113/core
 * .html#id-1004215813)
 */
public class ProcessingInstruction extends EventDispatcher {

    protected ProcessingInstruction() {
    }

    protected ProcessingInstruction(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Retrieve the content of this processing instruction. this from
     *         the first non white space character after the target to the
     *         character immediatly preceding the ?>. when setting a processing
     *         instruction, a domexception may be thrown on an invalid
     *         instruction.
     */
    public native String getData() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.data;
    }-*/;

    public native void setData(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.data = value;
    }-*/;

    /**
     * @return Retrieve the target of this processing instruction. xml defines
     *         this as being the first token following the markup that begins
     *         the processing instruction.
     */
    public native String getTarget() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.target;
    }-*/;
}
