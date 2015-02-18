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
import com.google.gwt.core.client.JsDate;

/**
 * An object which represents a single alert for an event in an Android
 * calendar.
 */
public class Alert extends EventDispatcher {

    public Alert() {

    }

    public Alert(JavaScriptObject obj) {
        this.jsObj = obj;
    }

    /**
     * Date/time at which this alert alarm is set to trigger.
     */
    public native JsDate getAlarmTime() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.alarmTime;
    }-*/;

    /**
     * The date/time at which the corresponding event begins.
     */
    public native JsDate getBegin() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.begin;
    }-*/;

    /**
     * The date/time at which the corresponding event ends.
     */
    public native JsDate getEnd() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.end;
    }-*/;

    /**
     * Identifier of the event for which this alert is set.
     */
    public native int getEventId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.eventId;
    }-*/;

    /**
     * Identifier of this alert.
     */
    public native int getId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.id;
    }-*/;

    /**
     * RecurrenceRule notice period in minutes, that determines how long prior
     * to the event this alert should trigger.
     */
    public native int getMinutes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.minutes;
    }-*/;

    /**
     * The current state of the alert.
     * <p>
     * One of STATE_DISMISSED, STATE_FIRED, or STATE_SCHEDULED.
     */

    public native int getStates() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.states;
    }-*/;

}
