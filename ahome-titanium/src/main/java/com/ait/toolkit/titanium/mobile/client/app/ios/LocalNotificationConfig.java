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
import com.google.gwt.core.client.JsDate;

/**
 * Config object for a local notification
 * 
 */
public class LocalNotificationConfig extends JsObject {

	public LocalNotificationConfig() {
		jsObj = JsoHelper.createObject();
	}

	/**
	 * Alert button text ('View', by default) or slider text ('slide to
	 * unlock...', by default).
	 */
	public native void setAlertAction(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.alertAction = value;
	}-*/;

	/**
	 * Alert message.
	 */
	public native void setAlertBody(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.alertBody = value;
	}-*/;

	/**
	 * Image displayed instead of Default.png when launching the application.
	 */
	public native void setAlertLaunchImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.alertLaunchImage = value;
	}-*/;

	/**
	 * Date and time when the notification was configured to fire.
	 */
	public native void setDate(JsDate value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.date = value;
	}-*/;

	/**
	 * Timezone of the date when the notification was configured to fire.
	 */
	public native void setTimeZone(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.timezone = value;
	}-*/;

	/**
	 * Custom data object.
	 */
	public native void setUserInfo(JavaScriptObject value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.userInfo = value;
	}-*/;
}
