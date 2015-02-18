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
 * A local notification to alert the user of new or pending application
 * information.
 * <p>
 * A LocalNotification is created by Titanium.App.iOS.scheduleLocalNotification.
 * Local notifications are a way for an application that is not running in the
 * foreground to let users know that it has information for them. When invoked,
 * an alert dialog is displayed containing a "Close" button to dismiss or a
 * customizable "View" button to bring the application into the foreground.
 * Also, an application icon badge showing the number of pending notifications
 * may be set and a sound may be generated.
 * 
 */
public class LocalNotification extends JsObject {

	protected LocalNotification(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * Cancels the pending notification.
	 */
	public native void cancel() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.cancel();
	}-*/;
}
