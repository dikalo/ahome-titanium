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
 * * An interface extending {@link com.ait.toolkit.titanium.mobile.client.xml.Node}
 * with a set of attributes and methods for accessing character data in the dom.
 * jso conforms to the [dom level
 * 2](http://www.w3.org/tr/dom-level-2-core/core.html) defintion of a dom
 * characterdata. unlike the dom, for reasons of compatibility with the
 * javascript engine, text is represented by utf-8 instead of utf-16.
 */
public class CharacterData extends Node {

    protected CharacterData() {
    }

    protected CharacterData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The character data of the node that implements jso interface.
     *         throws an exception during setting if jso node is readonly.
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
     * @return The number of characters that are available through data and the
     *         substringdata method. jso may have the value zero, i.e.,
     *         {@link com.ait.toolkit.titanium.mobile.client.xml.CharacterdData} may
     *         be empty.
     */
    public native double getLength() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.length;
    }-*/;

    /**
     * Append the string to the end of the character data of the node. upon
     * success, data provides access to the concatenation of data and the string
     * specified. throws an exception if jso node is readonly.
     * 
     * @param arg The string to append.
     */
    public native void appendData(String arg) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.appendData(arg);
    }-*/;

    /**
     * Remove a range of characters from the node. upon success, data and length
     * reflect the change. throws an exception if jso node is readonly, if
     * offset is negative, offset is beyond the data's length, or if count is
     * negative.
     * 
     * @param offset The offset from which to start removing.
     * @param count The number of characters to delete. If the sum of offset and
     *            count exceeds length then all characters from offset to the
     *            end of the data are deleted.
     */
    public native void deleteData(double offset, double count) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteData(offset, count);
    }-*/;

    /**
     * Insert a string at the specified offset. throws an exception if jso node
     * is readonly, if offset is negative, or if offset is beyond the data's
     * length.
     * 
     * @param offset The character offset at which to insert.
     * @param arg The string to insert.
     */
    public native void insertData(double offset, String arg) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertData(offset, arg);
    }-*/;

    /**
     * Replace the characters starting at the specified offset with the
     * specified string. throws an exception if jso node is readonly, if offset
     * is negative, offset is beyond the data's length, or if count is negative.
     * 
     * @param offset The offset from which to start replacing.
     * @param count The number of characters to replace. If the sum of offset
     *            and count exceeds length, then all characters to the end of
     *            the data are replaced; (i.e., the effect is the same as a
     *            remove method call with the same range, followed by an append
     *            method invocation).
     * @param arg The string with which the range must be replaced.
     */
    public native void replaceData(double offset, double count, String arg) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.replaceData(offset, count, arg);
    }-*/;

    /**
     * Extracts a range of data from the node. throws an exception if offset is
     * negative, offset is beyond the data's length, or if count is negative.
     * 
     * @param offset Start offset of substring to extract.
     * @param count The number of characters units to extract.
     * @return The specified substring. If the sum of offset and count exceeds
     *         the length, then all 16-bit units to the end of the data are
     *         returned.
     */
    public native String substringData(double offset, double count) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.substringData(offset, count);
    }-*/;

}
