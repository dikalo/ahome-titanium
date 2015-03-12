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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * An action the user selects in response to an interactive notification.
 * 
 * To create a notification action, use the
 * Titanium.App.iOS.createUserNotificationAction method.
 * 
 * An notification action represents an option a user selects in response to an
 * interactive notification. The notification action is represented as a button
 * in the application UI.
 * 
 */
public class UserNotification extends JsObject {

	protected UserNotification(JavaScriptObject obj) {
		jsObj = obj;
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
	public native double getActionMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.actionMode;
	}-*/;

	/**
	 * Stops the service from running during the current background session to
	 * conserve resources.
	 */
	public native void setActionMode(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setActionMode(value);
	}-*/;

	/**
	 * Unregisters the background service.
	 */
	public native void unregister() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.unregister();
	}-*/;
}
