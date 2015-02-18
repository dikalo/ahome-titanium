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
 * * The {@link org.urish.gwtit.titanium.xml.domimplementation} interface
 * provides a number of methods for performing operations that are independent
 * of any particular instance of the document object model. this conforms to the
 * [dom level 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion of a
 * dom domimplementation.
 */
public class DOMImplementation extends EventDispatcher {

    private static DOMImplementation instance;

    public static DOMImplementation get() {
        if (instance == null) {
            instance = new DOMImplementation(create());
        }
        return instance;
    }

    protected DOMImplementation() {

    }

    protected DOMImplementation(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates an {@link com.ait.toolkit.titanium.mobile.client.xml.Document} object of
     * the specified type with its document element. raises an exception if
     * qualifiedname is malformed, contains an illegal character, or is
     * inconsistent with namespaceuri. also raises an exception if doctype has
     * already been used with a different document.
     * 
     * @param namespaceURI
     *            The namespace URI of the document element to create.
     * @param qualifiedName
     *            The qualified name of the document element to be created.
     * @param doctype
     *            The type of document to be created or null. When doctype is
     *            not null, its Node.ownerDocument attribute is set to the
     *            document being created.
     * @return A new {@link com.ait.toolkit.titanium.mobile.client.xml.Document} object
     */
    public native Document createDocument(String namespaceURI, String qualifiedName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createDocument(namespaceURI, qualifiedName, null);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Document::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Creates an {@link com.ait.toolkit.titanium.mobile.client.xml.Document} object of
     * the specified type with its document element. raises an exception if
     * qualifiedname is malformed, contains an illegal character, or is
     * inconsistent with namespaceuri. also raises an exception if doctype has
     * already been used with a different document.
     * 
     * @param namespaceURI
     *            The namespace URI of the document element to create.
     * @param qualifiedName
     *            The qualified name of the document element to be created.
     * @param doctype
     *            The type of document to be created or null. When doctype is
     *            not null, its Node.ownerDocument attribute is set to the
     *            document being created.
     * @return A new {@link com.ait.toolkit.titanium.mobile.client.xml.Document} object
     */
    public native Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.createDocument(
						namespaceURI,
						qualifiedName,
						doctype.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Document::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Creates an empty {@link com.ait.toolkit.titanium.mobile.client.xml.DocumentType}
     * node. entity declarations and notations are not made available. entity
     * reference expansions and default attribute additions do not occur. raises
     * an exception if qualifiedname is malformed or contains an illegal
     * character.
     * 
     * @param qualifiedName
     *            The qualified name of the document type to be created.
     * @param publicId
     *            The external subset public identifier.
     * @param systemId
     *            The external subset system identifier.
     * @return A new {@link com.ait.toolkit.titanium.mobile.client.xml.DocumentType}
     *         node with Node.ownerDocument set to null.
     */
    public native DocumentType createDocumentType(String qualifiedName, String publicId, String systemId) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createDocumentType(qualifiedName, publicId, systemId);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.DocumentType::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Test if the {@link com.ait.toolkit.titanium.mobile.client.xml.DomImplementation}
     * implements a specific feature.
     * 
     * @param feature
     *            The name of the feature to test (case-insensitive). The values
     *            used by DOM features are defined throughout the DOM Level 2
     *            specifications and listed in the Conformance section. The name
     *            must be an XML name. To avoid possible conflicts, as a
     *            convention, names referring to features defined outside the
     *            DOM specification should be made unique by reversing the name
     *            of the Internet domain name of the person (or the organization
     *            that the person belongs to) who defines the feature, component
     *            by component, and using this as a prefix. For instance, the
     *            W3C SVG Working Group defines the feature "org.w3c.dom.svg".
     * @param version
     *            This is the version number of the feature to test. In Level 2,
     *            the string can be either "2.0" or "1.0". If the version is not
     *            specified, supporting any version of the feature causes the
     *            method to return true.
     * @return true if the feature is implemented in the specified version,
     *         false otherwise.
     */
    public native boolean hasFeature(String feature, String version) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasFeature(feature, version);
    }-*/;

    private static native JavaScriptObject create()/*-{
		return Titanium.XML.DOMImplementation;
    }-*/;

}
