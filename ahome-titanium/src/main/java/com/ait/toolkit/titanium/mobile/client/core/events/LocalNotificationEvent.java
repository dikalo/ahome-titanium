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
package com.ait.toolkit.titanium.mobile.client.core.events;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

public class LocalNotificationEvent extends TiEvent {

    public static final String NOTIFICATION = "notification";

    protected LocalNotificationEvent(JavaScriptObject obj) {
        jsObj = obj;

    }

    /**
     * Alert button text ('View', by default) or slider text ('slide to
     * unlock...', by default).
     */
    public native String getAlertAction() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.alertAction;
    }-*/;

    /**
     * Alert message.
     */
    public native String getAlertBody() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.alertBody;
    }-*/;

    /**
     * Image displayed instead of Default.png when launching the application.
     */
    public native String getAlertLaunchImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.alertLaunchImage;
    }-*/;

    /**
     * Date and time when the notification was configured to fire.
     */
    public native JsDate getDate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.date;
    }-*/;

    /**
     * Timezone of the date when the notification was configured to fire.
     */
    public native String getTimeZone() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.timezone;
    }-*/;

    /**
     * Custom data object.
     */
    public native JavaScriptObject getUserInfo() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.userInfo;
    }-*/;

}
