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
package com.ait.toolkit.titanium.mobile.client.ui;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A gradient js object, used in backgrounds for views
 *
 * mvniekerk
 *
 */
public class Gradient extends JavaScriptObject {
	
	protected Gradient() {}

	/**
	 * Set the gradient type as linear
	 */
	public native final void setAsLinear() /*-{
		this.type = 'linear';
	}-*/;
	
	/**
	 * Set the gradient type as radial
	 */
	public native final void setAsRadial() /*-{
		this.type = 'radial';
	}-*/;
	
	/**
	 * Set the start point of the gradient
	 * @param x
	 * @param y
	 */
	public native final void setStartPoint(String x, String y) /*-{
		var sp = {};
		sp.x = x;
		sp.y = y;
		this.startPoint = sp;
	}-*/;
	
	/**
	 * Set the end point of the gradient
	 * @param x
	 * @param y
	 */
	public native final void setEndPoint(String x, String y) /*-{
		var sp = {};
		sp.x = x;
		sp.y = y;
		this.endPoint = sp;
	}-*/;
	
	/**
	 * Set the colors of gradient. See createColorOffset code
	 * for reference JSO
	 * @param colors
	 */
	public native final void setColors(JsArray<JavaScriptObject> colors) /*-{
		this.colors = colors;
	}-*/;
	
	/**
	 * Helper function creating a color and its offset.
	 * Used when setting
	 * @param color		The color
	 * @param offset	And its offset
	 * @return			The jso of this color + offset
	 */
	public native final JavaScriptObject createColorOffset(String color, double offset) /*-{
		var ret = {};
		ret.color = color;
		ret.offset = offset;
		return ret;
	}-*/;
	
	/**
	 * Set the colors of this gradient using an array of colors with equal amount
	 * offsets and colors.
	 * @param colors		The array of color strings
	 * @param offsets		The offsets
	 */
	public final void setColors(String[] colors, double[] offsets) {
		if (colors.length != offsets.length) {
			return; //Misfit between colors and offsets array length
		}
		@SuppressWarnings("unchecked")
		JsArray<JavaScriptObject> c = (JsArray<JavaScriptObject>) JavaScriptObject.createArray();
		c.setLength(colors.length);
		for (int i = 0; i < colors.length; ++i) {
			JavaScriptObject newColor = createColorOffset(colors[i], offsets[i]);
			c.set(i, newColor);
		}
		setColors(c);
	}
	
	/**
	 * For a radial gradient, the start point of the gradient
	 * @param x
	 * @param y
	 */
	public final native void setStartRadius(String x, String y) /*-{
		var a = {};
		a.x = x;
		a.y = y;
		this.startRadius = a;
	}-*/;
	
	/**
	 * For a radial gradient, the end point of the gradient
	 * @param x
	 * @param y
	 */
	public final native void setEndRadius(String x, String y) /*-{
		var a = {};
		a.x = x;
		a.y = y;
		this.endRadius = a;
	}-*/;
	
	/**
	 * If set to true to continue filling with the final color beyond the endPoint.
	 * @return
	 */
	public final native boolean isBackfillEnd() /*-{
		return this.backfillEnd;
	}-*/;
	
	/**
	 * Set to true to continue filling with the final color beyond the endPoint.
	 * @param value
	 */
	public final native void setBackfillEnd(boolean value) /*-{
		this.backfillEnd = value;
	}-*/;
	

	/**
	 * If set to true to continue filling with the final color beyond the startpoint.
	 * @return
	 */
	public final native boolean isBackfillStart() /*-{
		return this.backfillStart;
	}-*/;

	/**
	 * If set to true to continue filling with the final color beyond the startpoint.
	 * @return
	 */
	public final native void setBackfillStart(boolean value) /*-{
		this.backfillStart = value;
	}-*/;
}
