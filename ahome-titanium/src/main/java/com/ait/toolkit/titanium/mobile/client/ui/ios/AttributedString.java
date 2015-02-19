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
package com.ait.toolkit.titanium.mobile.client.ui.ios;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * An attributed string proxy manages character strings and associated sets of
 * attributes (for example, font and kerning) that apply to individual
 * characters or ranges of characters in the string.
 */
public class AttributedString extends EventDispatcher {

	public AttributedString(String text) {
		createPeer(text);
	}

	AttributedString(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	/**
	 * @return Returns true if the animator is running else false.
	 */
	public native String getText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getText();
	}-*/;

	public native void setText(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setText(value);
	}-*/;

	public native void addAttribute(Attribute value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addAttribute(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public List<Attribute> getAttributes() {
		List<Attribute> attributes = new ArrayList<Attribute>();
		JsArray<JavaScriptObject> values = _getAttributes();
		for (int i = 0; i < values.length(); i++) {
			attributes.add(new Attribute(values.get(i)));
		}
		return attributes;
	}

	private native JsArray<JavaScriptObject> _getAttributes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getAttributes();
	}-*/;

	public void setAttributes(List<Attribute> attributes) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (Attribute element : attributes) {
			values.push(element.getJsObj());
		}
		_setAttributes(values);
	}

	public void setAttributes(Attribute... attributes) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (Attribute element : attributes) {
			values.push(element.getJsObj());
		}
		_setAttributes(values);
	}

	private native void _setAttributes(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setAttributes(value);
	}-*/;

	public void createPeer(String text) {
		jsObj = create(text);
	}

	public static AttributedString from(JsObject proxy) {
		return new AttributedString(proxy.getJsObj());
	}

	private static native JavaScriptObject create(String t) /*-{
		return Titanium.UI.iOS.createAttributedString({
			text : t
		});
	}-*/;

}
