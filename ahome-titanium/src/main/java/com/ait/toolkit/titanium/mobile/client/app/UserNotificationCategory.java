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
public class UserNotificationCategory extends JsObject {

	protected UserNotificationCategory(JavaScriptObject obj) {
		jsObj = obj;
	}
}
