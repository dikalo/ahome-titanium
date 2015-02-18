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
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.ColoredElement;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.Displayable;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasColor;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasExtremum;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasFont;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasStyle;
import com.ait.toolkit.titanium.mobile.client.ui.style.Font;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An activity indicator can be used to show the progress of an operation in the
 * ui to let the user know some action is taking place.
 * <p>
 * For iPhone, the style can be set from the constants
 * com.emitrom.gwt.appcelerator
 * .mobile.client.ui.iphone.IPhone.ActivityIndicatorStyle.
 */
public class ActivityIndicator extends View implements HasFont, HasColor,
		Displayable, ColoredElement, HasStyle, HasExtremum {

	public ActivityIndicator() {
		jsObj = UI.createActivityIndicator();
	}

	private ActivityIndicator(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * @return The color of the message label
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
	 * @return The font object for the activity message label
	 */
	public native Font getFont() /*-{
		return jso.font;
	}-*/;

	public native void setFont(Font value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.font = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * @return The activity message label text
	 */
	public native String getMessage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.message;
	}-*/;

	public native void setMessage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.message = value;
	}-*/;

	/**
	 * @return The activity type
	 */
	public native int getType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.type;
	}-*/;

	/**
	 * @return The activity value
	 */
	public native double getValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.value;
	}-*/;

	public native void setValue(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.value = value;
	}-*/;

	/**
	 * @return The activity minimum value
	 */
	public native double getMin() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.min;
	}-*/;

	public native void setMin(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.min = value;
	}-*/;

	/**
	 * @return The activity maximum value
	 */
	public native double getMax() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.min;
	}-*/;

	public native void setMax(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.max = value;
	}-*/;

	/**
	 * @return The activity location
	 */
	public native int getLocation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.location;
	}-*/;

	/**
	 * @return The key in the locale file to use for the message property
	 */
	public native String getMessageId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.messageid;
	}-*/;

	public native void setMessageId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.messageid = value;
	}-*/;

	/**
	 * @return The style constant of the activity indicator
	 */
	public native int getStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.style;
	}-*/;

	public native void setStyle(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.style = value;
	}-*/;

	/**
	 * Call hide to make the activity indicator hidden and stop spinning
	 */
	public native void hide() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hide();
	}-*/;

	/**
	 * Call show to make the activity indicator visible and start spinning
	 */
	public native void show() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.show();
	}-*/;

	@Override
	public String getSelectedColor() {
		return null;
	}

	@Override
	public void setSelectedColor(String value) {

	}

	/**
	 * @Android only Fired when the user has canceled the activity indicator
	 *          dialog.
	 * @param handler
	 */
	public void addCancelHandler(EventHandler handler) {
		addEventHandler("cancel", handler);
	}

	public static ActivityIndicator from(JsObject proxy) {
		return new ActivityIndicator(proxy.getJsObj());
	}

}
