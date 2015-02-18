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
 * A key-value paired map that maps string objects to
 * {@link com.ait.toolkit.titanium.mobile.client.xml.Node} objects. this conforms to
 * the [dom level 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion
 * of a dom namednodemap.
 */
public class NamedNodeMap extends EventDispatcher {

    protected NamedNodeMap() {
    }

    protected NamedNodeMap(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The number of nodes in the map. the valid range of child node
     *         indices is 0-length-1, inclusive.
     */
    public native int getLength() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.length;
    }-*/;

    /**
     * Retrieves a node specified by name.
     * 
     * @param name The name of the node to retrieve.
     * @return The specified node, or `null` if no node with the name is in the
     *         map
     */
    public native Node getNamedItem(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getNamedItem(name);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Adds a node using its 'nodename' attribute. if a node with that name is
     * already present, it is replaced. throws an exception if the argument is
     * from a different document, the map is read-only, or the argument is an
     * attribute of another element.
     * 
     * @param node The node to insert into the map.
     * @return The node replaced, or null if no node was replaced.
     */
    public native Node setNamedItem(Node node) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.setNamedItem(node.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Removes a node from the map specified by name. when this map contains
     * attributes attached to an element, if the removed attribtue is known to
     * have a default, it is replaced with that value.
     * 
     * @param name The name of the node to remove.
     * @return The node removed from the map, or null if nothing removed.
     */
    public native Node removeNamedItem(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.removeNamedItem(name);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Retrieves the node at the specified index of the map. note that
     * namednodemaps are not ordered.
     * 
     * @param index The index of the node to retrieve.
     * @return The node at the specified index, or null if the index is invalid
     */
    public native Node getItem(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.item(index);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Retrieves a node specified by name and namespace. returns `null` if no
     * matching node is in the map.
     * 
     * @param namespaceURI The namespace URI of the node to retrieve.
     * @param localName The local name of the node within the namespace to
     *            retrieve.
     * @return The specified node, or null if there is no matching node.
     */
    public native Node getNamedItemNS(String namespaceURI, String localName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getNamedItemNS(namespaceURI, localName);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Adds a node using its 'namespaceuri' and 'localname' attributes. if a
     * node with that name is already present, it is replaced. throws an
     * exception if the argument is from a different document, the map is
     * read-only, or the argument is an attribute of another element.
     * 
     * @param node The node to insert into the map.
     * @return Returns the node replaced, or `null`.
     */
    public native Node setNamedItemNS(Node node) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.setNamedItemNS(node.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
		return this.setNamedItemNS(node);
    }-*/;

    /**
     * Removes a node from the map specified by local name and namespace uri.
     * when this map contains attributes attached to an element, if the removed
     * attribtue is known to have a default, it is replaced with that value.
     * returns the node removed from the map, or `null` if there is no
     * corresponding node.
     * 
     * @param namespaceURI The namespace URI of the node to remove.
     * @param localName The local name of the node within the namespace to
     *            remove.
     * @return The node removed from the map, or null if nothing removed.
     */
    public native Node removeNamedItemNS(String namespaceURI, String localName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.removeNamedItemNS(namespaceURI, localName);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
