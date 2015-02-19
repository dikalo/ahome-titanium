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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * Class for specifying an attributed string attribute.
 * <p>
 * Attributes are added to the Titanium.UI.iOS.AttributedString object to create
 * styled text.
 */
public class Attribute extends EventDispatcher {

	public Attribute() {
		jsObj = JsoHelper.createObject();
	}

	Attribute(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	public void setRange(JsArrayNumber value) {
		JsoHelper.setAttribute(jsObj, "range", value);
	}

	public void setType(double value) {
		JsoHelper.setAttribute(jsObj, "type", value);
	}

	public void setValue(double value) {
		JsoHelper.setAttribute(jsObj, "value", value);
	}

	public void setRange(double... values) {
		JsArrayNumber peers = JsArray.createArray().cast();
		for (double value : values) {
			peers.push(value);
		}
		setRange(peers);
	}

}
