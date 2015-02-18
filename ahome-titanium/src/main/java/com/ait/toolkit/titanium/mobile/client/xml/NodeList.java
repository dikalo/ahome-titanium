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
 * A list of {@link com.ait.toolkit.titanium.mobile.client.xml.Node} objects. this
 * conforms to the dom level 2(http://www.w3.org/tr/dom-level-2-core/core.html)
 * definition of a dom nodelist.
 */
public class NodeList extends EventDispatcher {

    protected NodeList() {
    }

    protected NodeList(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The length of the node list.
     */
    public native int getLength() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.length;
    }-*/;

    /**
     * Returns the {@link com.ait.toolkit.titanium.mobile.client.xml.Element} object
     * at the specified index.
     * 
     * @param index
     *            The index of the node to retrieve. Indexing starts at 0.
     * @return The node at the index, or `null` if the index is out of bounds.
     */
    public native Element getItem(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.item(index);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Element::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
