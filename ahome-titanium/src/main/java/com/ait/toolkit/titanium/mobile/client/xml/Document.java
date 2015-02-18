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
 * * The dom document returned from
 * {@link com.ait.toolkit.titanium.mobile.client.xml.XML.parseString} or
 * {@link com.ait.toolkit.titanium.mobile.client.xml.XML.parse}. implements the [dom
 * level 2 api](http
 * ://www.w3.org/tr/2000/rec-dom-level-2-core-20001113/core.html#i-document).
 */
public class Document extends Node {

    protected Document() {
    }

    protected Document(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * @return An interface to the list of entities that are defined for the
     *         document, such as via a document type definition (dtd).
     */
    public native DocumentType getDoctype() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.docType;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.DocumentType::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * @return The root element in the document.
     */
    public native Element getDocumentElement() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.documentElement;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Element::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * @return The domimplementation
     *         (com.ait.toolkit.titanium.mobile.client.xml.DomImplementation) that
     *         handles this document
     */
    public native DOMImplementation getImplementation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.implementation;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.DOMImplementation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Creates an attribute with the given name.
     * 
     * @param name
     *            Name for the new attribute
     * @return An attribute object, ready for putting on an element.
     */
    public native Attr createAttribute(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createAttribute(name);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Attr::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Creates an attribute with the given name and namespace.
     * 
     * @param namespaceURI
     *            Namespace URI for the new attribute.
     * @param name
     *            Name for the new attribute.
     */
    public native void createAttributeNS(String namespaceURI, String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.createAttributeNS(namespaceURI, name);
    }-*/;

    /**
     * Creates and returns cdata section
     * 
     * @param data
     *            The String data to go into the CDATA section.
     * @return A CDATA section with the given data, ready to be applied to an
     *         element.
     */
    public native <T> T createCDATASection(String data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createCDATASection(data);
    }-*/;

    /**
     * Creates a comment with the supplied string data.
     * 
     * @param data
     *            The textual comment itself.
     * @return The comment, ready to be appended to the DOM tree.
     */
    public native <T> T createComment(String data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createComment(data);
    }-*/;

    /**
     * Creates document fragment.
     * 
     * @return The empty Document fragment.
     */
    public native <T> T createDocumentFragment() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createDocumentFragment();
    }-*/;

    /**
     * Creates an element with the given tag name.
     * 
     * @param tagName
     *            The name for the created element.
     * @return The newly created element.
     */
    public native Element createElement(String tagName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createElement(tagName);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Element::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create a new element with the given namespace and name.
     * 
     * @param namespaceURI
     *            URI for the namespace the new element belongs to.
     * @param name
     *            The name for the new element.
     * @return the new namespace-qualified element.
     */
    public native Element createElementNS(String namespaceURI, String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createElementNS(nameSpaceURI, name);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Element::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Creates an entityre ference with the given name.
     * 
     * @param name
     *            Name for the new entity reference.
     * @return The created entity reference.
     */
    public native <T> T createEntityReference(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createEntityReference(name);
		return toReturn;

    }-*/;

    /**
     * Creates a processing instruction for inserting into the dom tree.
     * 
     * @param target
     *            The target part for the processing instruction.
     * @param data
     *            The data for the processing instruction node.
     * @return The created processing instruction.
     */
    public native ProcessingInstruction createProcessingInstruction(String target, String data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createProcessingInstruction(target, data);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.ProcessingInstruction::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Creates a text node.
     * 
     * @param data
     *            The string value for the text node.
     * @return The created text node.
     */
    public native Text createTextNode(String data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createTextNode(data);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Text::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns an {@link element} that has an id attribute with the given value.
     * 
     * @param elementId
     *            A unique ID value for an element to search for.
     * @return The Element matching the given ID, if any.
     */
    public native Element getElementById(String elementId) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getElementById(elementId);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Element::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Return a node list of elements in the document which have the given tag.
     * 
     * @param tagname
     *            the tag name to search for.
     * @return The NodeList of elements in the document which have the given tag
     *         name.
     */
    public native NodeList getElementsByTagName(String tagname) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getElementsByTagName(tagName);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.NodeList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Return a node list of elements in the document which belong to the given
     * namespace and have the given tag name.
     * 
     * @param namespaceURI
     *            A namespace URI used for matching elements.
     * @param localname
     *            The tag name to search for.
     * @return The NodeList of elements in the document which belong to the
     *         given namespace and have the given tag name.
     */
    public native NodeList getElementsByTagNameNS(String namespaceURI, String localname) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getElementsByTagNameNS(namespaceURI, localname);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.NodeList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Imports a node from another document to this document, without altering
     * or removing the source node from the original document; this method
     * creates a new copy of the source node. the returned node has no parent.
     * 
     * @param importedNode
     *            The node to import.
     * @param deep
     *            If true, recursively import the subtree under the specified
     *            node; if false, import only the node itself.
     * @return the imported Node that belongs now to this document.
     */
    public native Node importNode(Node importedNode, boolean deep) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.importNode(
						importedNode.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						deep);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
