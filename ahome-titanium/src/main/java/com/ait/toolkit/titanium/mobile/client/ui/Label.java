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

import com.ait.toolkit.core.client.Color;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.ui.style.Font;
import com.ait.toolkit.titanium.mobile.client.ui.style.Position;
import com.ait.toolkit.titanium.mobile.client.ui.style.ShadowOffset;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.HasText;

/**
 * A label is created by the method
 * {@link com.ait.toolkit.titanium.mobile.client.ui.UI.createLabel}.
 */
public class Label extends View implements HasText {

	public Label() {
		createPeer();
		setColor(Color.BLACK);
	}

	public Label(String text) {
		this();
		setText(text);
	}

	Label(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	/**
	 * @return One of ti.ui.android.linkify constants. automatically create
	 *         clickable links for the specified type. (android only) Available
	 *         on Android only
	 */
	public native int getAutoLink() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.autoLink;
	}-*/;

	public native void setAutoLink(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.autoLink = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the bottom
	 */
	public native int getBackgroundPaddingBottom() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.backgroundPaddingBottom;
	}-*/;

	public native void setBackgroundPaddingBottom(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundPaddingBottom = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the left
	 */
	public native int getBackgroundPaddingLeft() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.backgroundPaddingLeft;
	}-*/;

	public native void setBackgroundPaddingLeft(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundPaddingLeft = value;
	}-*/;

	/**
	 * sets the backgroundPadding
	 * 
	 * @param value
	 */
	public void setBackgroundPadding(int value) {
		setBackgroundPaddingLeft(value);
		setBackgroundPaddingRight(value);
		setBackgroundPaddingTop(value);
		setBackgroundPaddingBottom(value);
	}

	/**
	 * sets the backgroundPadding
	 * 
	 * @param topBottom
	 *            , value for top and bottom padding
	 * @param leftRight
	 *            , value for left and right padding
	 */
	public void setBackgroundPadding(int topBottom, int leftRight) {
		setBackgroundPaddingLeft(leftRight);
		setBackgroundPaddingRight(leftRight);
		setBackgroundPaddingTop(topBottom);
		setBackgroundPaddingBottom(topBottom);
	}

	/**
	 * sets the backgroundPadding
	 * 
	 * @param top
	 *            , value for top padding
	 * @param left
	 *            , value for the right padding
	 * @param bottom
	 *            , value for the bottom padding
	 * @param right
	 *            , value for the right padding
	 */
	public void setBackgroundPadding(int top, int right, int bottom, int left) {
		setBackgroundPaddingLeft(left);
		setBackgroundPaddingRight(right);
		setBackgroundPaddingTop(top);
		setBackgroundPaddingBottom(bottom);
	}

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the right
	 */
	public native int getBackgroundPaddingRight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.backgroundPaddingRight;
	}-*/;

	public native void setBackgroundPaddingRight(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundPaddingRight = value;
	}-*/;

	/**
	 * @return The number of pixels to extend the background image past the
	 *         label on the top
	 */
	public native int getBackgroundPaddingTop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.backgroundPaddingTop;
	}-*/;

	public native void setBackgroundPaddingTop(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundPaddingTop = value;
	}-*/;

	/**
	 * @return The color of the label
	 */
	public native String getColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.color;
	}-*/;

	public void setColor(Color color) {
		setColor(color.getValue());
	}

	public native void setColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.color = value;
	}-*/;

	/**
	 * @return Turn on/off the addition of ellipses at the end of the label if
	 *         the text is too large to fit. (android only, default false)
	 *         Available on Android only
	 */
	public native boolean ellipsize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.ellipsize;
	}-*/;

	public native void setEllipsize(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ellipsize = value;
	}-*/;

	/**
	 * @return The label font object properties
	 */
	public native Font getFont() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.font;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.style.Font::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setFont(Font value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.font = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * @return The color of the label when in the highlighted state
	 */
	public native String getHighlightedColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.highlightedColor;
	}-*/;

	public native void setHighlightedColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.highlightedColor = value;
	}-*/;

	/**
	 * @return Simple html formatting. (android only) Available on Android only
	 */
	public native String getHtml() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.html;
	}-*/;

	public native void setHtml(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.html = value;
	}-*/;

	/**
	 * @return The minimum size of the font when the font is sized based on the
	 *         contents. enables font scaling to fit and forces the label
	 *         content to be limited to a single line
	 */
	public native int getMinimumFontSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.minimumFontSize;
	}-*/;

	public native void setMinimumFontSize(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.minimumFontSize = value;
	}-*/;

	/**
	 * @return The text shadow color
	 */
	public native String getShadowColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.shadowColor;
	}-*/;

	public native void setShadowColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.shadowColor = value;
	}-*/;

	public void setShadowColor(Color color) {
		setShadowColor(color.getValue());
	}

	/**
	 * @return The shadow offset as a dictionary with the properties `x` and `y`
	 */
	public native ShadowOffset getShadowOffset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.shadowOffset;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.style.ShadowOffset::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setShadowOffset(ShadowOffset value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.shadowOffset = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * @return The text of the label
	 */
	public native String getText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.text;
	}-*/;

	public native void setText(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.text = value;
	}-*/;

	public void setTextAlign(Position align) {
		_setTextAlign(align.getValue());
	}

	private native void _setTextAlign(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.textAlign = value;
	}-*/;

	public native void setTextAlign(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.textAlign = value;
	}-*/;

	/**
	 * @return The alignment constant or string value such as `left`, `center`
	 *         or `right`
	 */
	public native String getTextAlign() /*-{
		return jso.textAlign;
	}-*/;

	/**
	 * @return The key in the locale file to use for the text property
	 */
	public native String getTextId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.textid;
	}-*/;

	public native void setTextId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.textid = value;
	}-*/;

	/**
	 * @return Turn on/off word wrapping in the label. (android only - default
	 *         true) Available on Android only
	 */
	public native boolean wordWrap() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.wordWrap;
	}-*/;

	public native void setWordWrap(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.wordWrap = value;
	}-*/;

	@Override
	public void createPeer() {
		jsObj = UI.createLabel();
	}

	public static Label from(JsObject proxy) {
		return new Label(proxy.getJsObj());
	}

}
