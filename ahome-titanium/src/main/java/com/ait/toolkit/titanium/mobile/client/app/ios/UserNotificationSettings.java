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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * Config object for a user notification
 * 
 */
public class UserNotificationSettings extends JsObject {

	protected UserNotificationSettings(JavaScriptObject peer) {
		jsObj = peer;
	}

	/**
	 * Notification types to us
	 */
	public native JsArrayNumber getTypes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.types;
	}-*/;

	public List<UserNotificationCategory> getCategories() {
		List<UserNotificationCategory> toReturn = new ArrayList<UserNotificationCategory>();
		JavaScriptObject peers = JsoHelper.getAttributeAsJavaScriptObject(
				jsObj, "categories");
		int size = JsoHelper.arrayLength(peers);
		for (int i = 0; i < size; i++) {
			toReturn.add(new UserNotificationCategory(JsoHelper
					.getValueFromJavaScriptObjectArray(peers, i)));
		}
		return toReturn;
	}

}
