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
 * * Represents an element in a dom document, a
 * {@link com.ait.toolkit.titanium.mobile.client.xml.Node} defined by a start-tag and
 * end-tag (or an empty tag). elements may have
 * attributes(com.ait.toolkit.titanium.mobile.client.xml.Attr) associated with them.
 * jso conforms to the dom level
 * 2(http://www.w3.org/tr/dom-level-2-core/core.html) definition of a dom
 * element
 */
public class Element extends Node {

    protected Element() {
    }

    protected Element(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The name of the element, as defined by its tag.
     */
    public native String getTagName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.tagName;
    }-*/;

    /**
     * @return Retrieves all child text nodes as one string
     */
    public native String getText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.text;
    }-*/;

    /**
     * Retrieves an attribute value by name, returning it as a string.
     * 
     * @param name The name of the attribute
     * @return The {@link com.ait.toolkit.titanium.mobile.client.xml.Attr} value as a
     *         string, or empty string if the attribute has no specified or
     *         default value.
     */
    public native String getAttribute(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getAttribute(name);
    }-*/;

    /**
     * Adds a new attribute. any attribute with the same name is replaced.
     * throws an exception if the element is read-only, or if the name contains
     * an illegal character.
     * 
     * @param name The name of the attribute.
     * @param value The value of the attribute. this is value is not parsed as
     *            part of the assignment. Any markup is treated as literal text,
     *            and needs to be escaped.
     */
    public native void setAttribute(String name, String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setAttribute(name, value);
    }-*/;

    /**
     * Removes an attribute by name. if the attribute has a default value, it is
     * immediately replaced with jso default, including namespace uri and local
     * name. throws an exception if the element is read-only.
     * 
     * @param name The name of the attribute to remove.
     */
    public native void removeAttribute(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeAttribute(name);
    }-*/;

    /**
     * Retrieves an attribute value by name, returning it as a {@link attr}
     * object.
     * 
     * @param name The name of the attribute
     * @return The {@link com.ait.toolkit.titanium.mobile.client.xml.Attr} value, or
     *         null if there is no such attribute.
     */
    public native Attr getAttributeNode(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getAttributeNode(name);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Attr::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Adds a new attribute. any attribute with the same node name as the
     * argument is replaced. throws an exception if the element is read-only, if
     * new attr is from a different document, or if new attr is already an
     * attribute of another element.
     * 
     * @param newAttr The attribute node to add to the element.
     * @return The attribute that was replaced, or `null` otherwise.
     */
    public native Attr setAttributeNode(Attr newAttr) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.setAttributeNode(newAttr.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Attr::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Removes the specified attribute node. if the removed attribute has a
     * default value, it is replaced immediately, with the same namespace and
     * local name as the removed attribute, if applicable. throws an exception
     * if the element is read-only, or the attribute is not an attribute of the
     * element.
     * 
     * @param oldAttr The attribute to remove.
     */
    public native void removeAttributeNode(Attr oldAttr) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeAttributeNode(oldAttr.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Retrieves a {@link com.ait.toolkit.titanium.mobile.client.xml.NodeList} of all
     * descendant elements with a given tag name, in preorder traversal.
     * 
     * @param name The name of the element. The value `*` matches all tags.
     */
    public native NodeList getElementsByTagName(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getElementsByTagName(name);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.NodeList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Retrieves an attribute value by local name and namespace uri, returning
     * it as a string.
     * 
     * @param namespaceURI The namespace URI of the attribute to retrieve.
     * @param localName The local name of the attribute to retrieve.
     * @return The {@link com.ait.toolkit.titanium.mobile.client.xml.Attr} value as a
     *         string, or empty string if the attribute has no specified or
     *         default value.
     */
    public native String getAttributeNS(String namespaceURI, String localName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getAttributeNS(namespaceURI, localName);
    }-*/;

    /**
     * Adds a new attribute. any attribute with the same local name and
     * namespace uri is present on the element is replaced, with its prefix
     * changed to that of the qualifiedname parameter. throws an exception if
     * the element is read-only, if the name contains an illegal character, or
     * if the qualified name contains an error.
     * 
     * @param namespaceURI The namespace URI of the attribute.
     * @param qualifiedName The qualified name of the attribute. If it is
     *            malformed, has a prefix and namespaceURI is `null`, or if the
     *            prefix is `xml` or `xmlns` but does not correspond to a
     *            property defined in the
     *            [XML](http://www.w3.org/XML/1998/namespace) or
     *            [XMLNS](http://www.w3.org/2000/xmlns/) specifications, then it
     *            contains an error.
     * 
     * @param value The value of the attribute. jso is value is __not__ parsed
     *            as part of the assignment. Any markup is treated as literal
     *            text, and needs to be escaped.
     */
    public native void setAttributeNS(String namespaceURI, String qualifiedName, String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setAttributeNS(namespaceURI, qualifiedName, value);
    }-*/;

    /**
     * Removes an attribute by local name and namespace uri. if the attribute
     * has a default value, it is immediately replaced with jso default,
     * including namespace uri and local name. throws an exception if the
     * element is read-only.
     * 
     * @param namespaceURI The namespace URI of the attribute to remove.
     * @param localName The local name of the attribute to remove.
     */
    public native void removeAttributeNS(String namespaceURI, String localName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeAttributeNS(namespaceURI, localName);
    }-*/;

    /**
     * Retrieves an attribute value by local name and namespace uri, returning
     * it as a {@link com.ait.toolkit.titanium.mobile.client.xml.Attr} object.
     * 
     * @param namespaceURI The namespace URI of the attribute to retrieve.
     * @param localName The local name of the attribute to retrieve.
     * @return The {@link Attr} value, or null if there is no such attribute.
     */
    public native Attr getAttributeNodeNS(String namespaceURI, String localName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getAttributeNodeNS(namespaceURI, localName);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Attr::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Adds a new attribute. any attribute with the same local name and
     * namespace uri is replaced. throws an exception if the element is
     * read-only, if newattr is from a different document, or if newattr is
     * already an attribute of another element.
     * 
     * @param newAttr The attribute node to add to the element.
     * @return The attribute that was replaced, or `null` otherwise.
     */
    public native Attr setAttributeNodeNS(Attr newAttr) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.setAttributeNodeNS(newAttr.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Attr::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Retrieves a {@link com.ait.toolkit.titanium.mobile.client.xml.Nodelist} of all
     * descendant elements with a given local name and namespace uri, in
     * preorder traversal.
     * 
     * @param namespaceURI The namespace URI of the element. The value * matches
     *            all namespaces.
     * @param localName The local name of the element. The value * matches all
     *            local names.
     */
    public native NodeList getElementsByTagNameNS(String namespaceURI, String localName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getElementsByTagNameNS(namespaceURI, localName);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.NodeList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Determines whether or not an attribute with the given name is available
     * in the element, or has a default value.
     * 
     * @param name The name of the attribute to search for.
     */
    public native boolean hasAttribute(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasAttribute(name);
    }-*/;

    /**
     * Determines whether or not an attribute with the given name is available
     * in the element, or has a default value.
     * 
     * @param namespaceURI The namespace URI of the attribute to search for.
     * @param localName The local name of the attribute to search for.
     */
    public native boolean hasAttributeNS(String namespaceURI, String localName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasAttributeNS(namespaceURI, localName);
    }-*/;

}
