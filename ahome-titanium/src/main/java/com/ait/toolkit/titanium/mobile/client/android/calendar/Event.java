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

import java.util.ArrayList;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

/**
 * /** An object which represents a single event in an android calendar.
 * <p>
 * Notes: The API supports retrieving information about existing events and
 * creating new events. However, modifying or deleting existing events is not
 * yet supported. Additionally, recurring events are not yet supported. See
 * <Titanium.Android.Calendar> for examples of retrieving event information and
 * creating events.
 */
public class Event extends EventDispatcher {

    protected Event(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return An array of
     *         {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Alert}
     *         objects which are the alerts - if any - for this event.
     */
    public ArrayList<Alert> getAlerts() {
        ArrayList<Alert> alerts = new ArrayList<Alert>();
        JsArray<JavaScriptObject> array = _getAlerts();
        for (int i = 0; i < array.length(); i++) {
            Alert alert = new Alert(array.get(i));
            alerts.add(alert);
        }
        return alerts;
    }

    private final native JsArray<JavaScriptObject> _getAlerts() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.alerts;
    }-*/;

    public void setAlerts(ArrayList<Alert> alerts) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (Alert alert : alerts) {
            array.push(alert.getJsObj());
        }
        _setAlerts(array);
    }

    private final native void _setAlerts(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.alerts = value;
    }-*/;

    /**
     * @return Whether the event is all day.
     */
    public final native boolean isAllDay() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allDay;
    }-*/;

    /**
     * @return The date/time at which the event begins.
     */
    public final native JsDate getBegin() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.begin;
    }-*/;

    /**
     * @return The event description.
     */
    public final native String getDescription() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.description;
    }-*/;

    /**
     * @return The date/time at which the event ends.
     */
    public final native JsDate getEnd() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.end;
    }-*/;

    /**
     * @return An object containing extended properties of the event.
     */
    public final native <T extends JavaScriptObject> T getExtendedProperties() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.extendedProperties;
    }-*/;

    /**
     * @return Whether an alarm is scheduled for the event.
     */
    public final native boolean hasAlarm() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasAlarm;
    }-*/;

    /**
     * @return wether or not this event has extended properties
     */
    public final native boolean hasExtendedProperties() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasExtendedProperties;
    }-*/;

    /**
     * @return The id of the event.
     */
    public final native String getId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.id;
    }-*/;

    /**
     * @return The event location.
     */
    public final native String getLocation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.location;
    }-*/;

    /**
     * @return An array of link
     *         com.ait.toolkit.titanium.mobile.client.android.calendar.Reminder} objects
     *         which are the reminders - if any - for this event.
     */
    public ArrayList<Reminder> getReminders() {
        ArrayList<Reminder> reminders = new ArrayList<Reminder>();
        JsArray<JavaScriptObject> array = _getReminders();
        for (int i = 0; i < array.length(); i++) {
            reminders.add(new Reminder(array.get(i)));
        }
        return reminders;
    }

    private final native JsArray<JavaScriptObject> _getReminders() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.reminders;
    }-*/;

    /**
     * @return The status of the event. possible values are the status constants
     *         in
     *         {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Calendar}
     *         .
     */
    public final native int getStatus() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.status;
    }-*/;

    /**
     * @return The title string for the event.
     */
    public final native String getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.title;
    }-*/;

    /**
     * @return The event's visibility. possible values are the visibility
     *         constants in
     *         {@link com.ait.toolkit.titanium.mobile.client.android.calendar}.
     */
    public final native int getVisibility() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.visibility;
    }-*/;

    /**
     * Create an alert for this event. pass a dictionary object containing
     * attributes corresponding to properties of link
     * com.ait.toolkit.titanium.mobile.client.android.calendar.Alert}. returns the
     * created alert.
     * 
     * @param data
     *            Properties for the new alert, corresponding to properties of
     *            {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Alert}
     * 
     */
    public Alert createAlert(JavaScriptObject data) {
        return new Alert(_createAlert(data));
    }

    private native JavaScriptObject _createAlert(JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createAlert(data);
    }-*/;

    /**
     * Create a reminder for this event. pass a dictionary object containing
     * attributes corresponding to properties of
     * {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Reminder}. returns
     * the created reminder.
     * 
     * @param data
     *            Properties for the new reminder, corresponding to properties
     *            of
     *            {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Reminder}
     *            .
     */
    public final native Reminder createReminder(JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createReminder(data);
		return @com.ait.toolkit.titanium.mobile.client.android.calendar.Reminder::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);

    }-*/;

    /**
     * Returns the value of the given extended property key string.
     * 
     * @param name
     *            The name of the extended property whose value should be
     *            returned.
     */
    public final native String getExtendedProperty(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getExtendedProperty(name);
    }-*/;

    /**
     * Set the value of the named extended property.
     * 
     * @param name
     *            The name of the extended property whose value should be set.
     * @param value
     *            The value to which to set the named extended property.
     */
    public final native void setExtendedProperty(String name, String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.setExtendedProperty(name, value);
    }-*/;

}
