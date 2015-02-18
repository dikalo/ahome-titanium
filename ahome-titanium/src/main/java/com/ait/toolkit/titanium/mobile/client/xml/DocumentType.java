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
 * Each {@link com.ait.toolkit.titanium.mobile.client.xml.Document} has a doctype
 * attribute whose value is either 'null' or a
 * {@link com.ait.toolkit.titanium.mobile.client.xml.DocumentType} object. this
 * provides an interface to the list of entities that are defined for the
 * document. this conforms to the [dom level
 * 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion of a dom
 * documenttype.
 */
public class DocumentType extends Node {

    protected DocumentType() {
    }

    protected DocumentType(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return A {@link com.ait.toolkit.titanium.mobile.client.xm.NamedNodeMap}
     *         containing the general entities, both external and internal,
     *         declared in the dtd. parameter entities are not contained.
     *         duplicates are discarded.
     */
    public native NamedNodeMap getEntities() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.entities;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.NamedNodeMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * @return The internal subset as a string.
     */
    public native String getInternalSubset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.internalSubset;
    }-*/;

    /**
     * @return The name of dtd; i.e., the name immediately following the
     *         `doctype` keyword.
     */
    public native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    /**
     * @return A {@link com.ait.toolkit.titanium.mobile.client.xm.NamedNodeMap}
     *         containing the notations declared in the dtd. duplicates are
     *         discarded. every node in this map also implements the
     *         {@link notation} interface.
     */
    public native NamedNodeMap getNotations() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.notations;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.NamedNodeMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * @return The public identifier of the external subset.
     */
    public native String getPublicId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.publicId;
    }-*/;

    /**
     * @return The system identifier of the external subset.
     */
    public native String getSystemId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.systemId;
    }-*/;

}
