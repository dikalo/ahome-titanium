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
package com.ait.toolkit.titanium.mobile.client.app;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Config object for a user notification
 * 
 */
public class UserNotificationActionConfig extends JsObject {

	public UserNotificationActionConfig() {
		jsObj = JsoHelper.createObject();
	}

	/**
	 * Selects how to activate the application.
	 * <p>
	 * Set to Titanium.App.iOS.USER_NOTIFICATION_ACTIVATION_MODE_BACKGROUND to
	 * activate the application in the background to respond to the action
	 * unless the application is already in the foreground.
	 * <p>
	 * Set to Titanium.App.iOS.USER_NOTIFICATION_ACTIVATION_MODE_FOREGROUND to
	 * launch the application in the foreground to respond to the action.
	 * 
	 * This property can be assigned the following constants:
	 * <p>
	 * Titanium.App.iOS.USER_NOTIFICATION_ACTIVATION_MODE_BACKGROUND
	 * Titanium.App.iOS.USER_NOTIFICATION_ACTIVATION_MODE_FOREGROUND
	 */
	public native void setActivationMode(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.activationMode = value;
	}-*/;

	/**
	 * Set to true if the action requires the device to be unlocked.
	 */
	public native void setAuthenticationRequired(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.authenticationRequired = value;
	}-*/;

	/**
	 * Set to true if the action causes destructive behavior to the user's data
	 * or the application.
	 */
	public native void setDestructive(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.destructive = value;
	}-*/;

	/**
	 * Identifier for this action. Used to identify the action the user pressed.
	 */
	public native void setIdentifier(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.identifier = value;
	}-*/;

	/**
	 * Title of the button displayed in the notification.
	 */
	public native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
	}-*/;

}
