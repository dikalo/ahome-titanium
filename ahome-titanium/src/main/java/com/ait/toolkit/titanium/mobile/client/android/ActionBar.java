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
package com.ait.toolkit.titanium.mobile.client.android;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an Android Action Bar.
 * <p>
 * According to the Android API Reference, an action bar is a window feature
 * that identifies the application and user location, and provides user actions
 * and navigation modes. This feature is only available in Android 3.0 (API
 * level 11) and above.
 * <p>
 * To access the action bar, you must first open a heavyweight window or tab
 * group that uses one of the action bar themes (such as the Android Holo
 * theme). You can then access the action bar from the window or tab group's
 * activity.
 * <p>
 * You can add action items to the action bar by defining an Android menu and
 * setting the menu items to display as action items. See Menu and MenuItem for
 * details.
 * <p>
 * See: Action Bar in the Android API Reference.
 */
public class ActionBar extends EventDispatcher {

	protected ActionBar(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * The background image for the action bar, specified as a local file path
	 * or URL.
	 */
	public native void setBackgroundImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundImage = value;
	}-*/;

	public native String getBackgroundImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.backgroundImage;
	}-*/;

	/**
	 * Displays an "up" affordance on the "home" area of the action bar.
	 * <p>
	 * See also: setDisplayHomeAsUpEnabled in the Android Developer Reference.
	 */
	public native void setDisplayHomeAsUp(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.displayHomeAsUp = value;
	}-*/;

	public native boolean displayHomeAsUp() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.displayHomeAsUp;
	}-*/;

	/**
	 * Sets the application icon displayed in the "home" area of the action bar,
	 * specified as a local file path or URL.
	 * <p>
	 * This method is only available on Android 4.0 (API 14) and above. See
	 * also: setIcon in the Android Developer Reference.
	 */
	public native void setIcon(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.icon = value;
	}-*/;

	public native String getIcon() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.icon;
	}-*/;

	/**
	 * Sets the application logo displayed in the "home" area of the action bar,
	 * specified as a local file path or URL.
	 * <p>
	 * This method is only available on Android 4.0 (API 14) and above. See
	 * also: setLogo in the Android Developer Reference.
	 */
	public native void setLogo(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.logo = value;
	}-*/;

	public native String getLogo() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.logo;
	}-*/;

	/**
	 * Sets the title of the action bar.
	 */
	public native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
	}-*/;

	public native String getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.title;
	}-*/;

	/**
	 * Callback function called when the home icon is clicked.
	 */
	public native void setOnHomeIconItemSelected(Function callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.onHomeIconItemSelected = function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

	/**
	 * Shows the action bar if it is currently hidden.
	 * <p>
	 * See also: show in the Android API Reference.
	 */
	public native void show() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.show();
	}-*/;

}
