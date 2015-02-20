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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Dynamic behavior to support collisions between items and boundaries.
 */
public class ReferenceInsets extends JsObject {

	public ReferenceInsets() {
		jsObj = JsoHelper.createObject();
	}

	ReferenceInsets(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	public void setBottom(double value) {
		JsoHelper.setAttribute(jsObj, "bottom", value);
	}

	public double getBottom() {
		return JsoHelper.getAttributeAsDouble(jsObj, "bottom");
	}

	public void setLeft(double value) {
		JsoHelper.setAttribute(jsObj, "left", value);
	}

	public double getLeft() {
		return JsoHelper.getAttributeAsDouble(jsObj, "left");
	}

	public void setRight(double value) {
		JsoHelper.setAttribute(jsObj, "right", value);
	}

	public double getRight() {
		return JsoHelper.getAttributeAsDouble(jsObj, "right");
	}

	public void setTop(double value) {
		JsoHelper.setAttribute(jsObj, "top", value);
	}

	public double getTop() {
		return JsoHelper.getAttributeAsDouble(jsObj, "top");
	}
}
