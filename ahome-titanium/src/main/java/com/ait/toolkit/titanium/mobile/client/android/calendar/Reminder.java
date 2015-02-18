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

package com.ait.toolkit.titanium.mobile.client.android.calendar;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * An object that represents a single reminder for an event in an Android
 * calendar.
 * <p>
 * Reminders should be created using the
 * Titanium.Android.Calendar.Event.createReminder method rather than directly.
 * <p>
 * See Titanium.Android.Calendar for examples of retrieving reminder information
 * and creating reminders for events.
 * 
 */
public class Reminder extends EventDispatcher {

    protected Reminder(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The id of the reminder.
     */
    public native String getId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.id;
    }-*/;

    /**
     * @return The reminder method. possible values are the method constants in
     * 
     */
    public native int getMethod() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.method;
    }-*/;

    /**
     * @return The minutes before the event when the reminder should occur.
     */
    public native int getMinutes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.minutes;
    }-*/;

}
