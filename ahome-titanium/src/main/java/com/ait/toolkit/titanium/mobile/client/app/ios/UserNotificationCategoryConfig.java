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
package com.ait.toolkit.titanium.mobile.client.app.ios;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Config object for a user notification category
 * 
 */
public class UserNotificationCategoryConfig extends JsObject {

	public UserNotificationCategoryConfig() {
		jsObj = JsoHelper.createObject();
	}

	/**
	 * Array of notification actions to associate with the group.
	 */
	public void setActionForDefaultContext(
			UserNotificationAction... userNotificationActions) {
		JavaScriptObject array = JsoHelper.createJavaScriptArray();
		for (int i = 0; i < userNotificationActions.length; i++) {
			JsoHelper.setArrayValue(array, i,
					userNotificationActions[i].getJsObj());
		}
		JsoHelper.setAttribute(jsObj, "actionsForDefaultContext", array);

	}

	/**
	 * Array of notification actions to associate with the group.
	 */
	public void setActionForMinimalContext(
			UserNotificationAction... userNotificationActions) {
		JavaScriptObject array = JsoHelper.createJavaScriptArray();
		for (int i = 0; i < userNotificationActions.length; i++) {
			JsoHelper.setArrayValue(array, i,
					userNotificationActions[i].getJsObj());
		}
		JsoHelper.setAttribute(jsObj, "actionsForMinimalContext", array);

	}

	/**
	 * Identifier for this category
	 */
	public native void setIdentifier(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.identifier = value;
	}-*/;

}
