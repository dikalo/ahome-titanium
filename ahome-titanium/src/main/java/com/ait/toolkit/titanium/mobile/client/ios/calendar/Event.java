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
package com.ait.toolkit.titanium.mobile.client.ios.calendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

/**
 * /** An object which represents a single event in an android calendar.
 * <p>
 * Notes: The API supports retrieving information about existing events and
 * creating new events. However, modifying or deleting existing events is not
 * yet supported. Additionally, recurring events are not yet supported.
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
     * @return Whether the event is all day.
     */
    public final native void setAllDay(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.allDay = value;
    }-*/;

    /**
     * Availability of this event.
     * <p>
     * One of AVAILABILITY_NOTSUPPORTED, AVAILABILITY_BUSY, AVAILABILITY_FREE,
     * AVAILABILITY_TENTATIVE, and AVAILABILITY_UNAVAILABLE.
     */
    public final native double getAvailability() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.availability;
    }-*/;

    /**
     * @return The date/time at which the event begins.
     */
    public final native JsDate getBegin() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.begin;
    }-*/;

    /**
     * @return The date/time at which the event begins.
     */
    public final native void setBegin(JsDate value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.begin = value;
    }-*/;

    /**
     * @return The date/time at which the event ends.
     */
    public final native JsDate getEnd() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.end;
    }-*/;

    public final native void setEnd(JsDate value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.end = value;
    }-*/;

    /**
     * @return Whether an alarm is scheduled for the event.
     */
    public final native boolean hasAlarm() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasAlarm;
    }-*/;

    /**
     * @return The id of the event.
     */
    public final native String getId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.id;
    }-*/;

    /**
     * Boolean value that indicates whether an event is a detached instance of a
     * repeating event.
     * <p>
     * This value is YES if and only if the event is part of a repeating event
     * and one or more of its attributes have been modified from the repeating
     * event's default attributes.
     */
    public final native boolean isDetached() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isDetached;
    }-*/;

    /**
     * @return The event location.
     */
    public final native String getLocation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.location;
    }-*/;

    public final native void setLocation(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.location = value;
    }-*/;

    /**
     * Notes for this event.
     */
    public final native String getNotes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.notes;
    }-*/;

    public final native void setNotes(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.notes = value;
    }-*/;

    /**
     * Recurrence rule associated with the event. (Available in iOS 4.0 through
     * iOS 5.1.)
     */
    public final native RecurrenceRule getReccurenceRule() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.recurrenceRule;
		return @com.ait.toolkit.titanium.mobile.client.ios.calendar.RecurrenceRule::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The recurrence rules for the calendar item. (Available in iOS 5.1 and
     * above.)
     */
    public ArrayList<RecurrenceRule> getReminders() {
        ArrayList<RecurrenceRule> reminders = new ArrayList<RecurrenceRule>();
        JsArray<JavaScriptObject> array = _getRecurrenceRules();
        for (int i = 0; i < array.length(); i++) {
            reminders.add(new RecurrenceRule(array.get(i)));
        }
        return reminders;
    }

    private final native JsArray<JavaScriptObject> _getRecurrenceRules() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.recurrenceRules;
    }-*/;

    /**
     * Status of this event.
     * <p>
     * One of STATUS_NONE, STATUS_CANCELED, STATUS_CONFIRMED, and
     * STATUS_TENTATIVE. .
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
    public final native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * Create an alert for this event. pass a dictionary object containing
     * attributes corresponding to properties of
     * {@link org.urish.gwtit.titanium.android.calendar.alert}. returns the
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
     * {@link org.urish.gwtit.titanium.android.calendar.reminder}. returns the
     * created reminder.
     * 
     * @param data
     *            Properties for the new reminder, corresponding to properties
     *            of
     *            {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Reminder}
     *            .
     */
    public final native RecurrenceRule addRecurrenceRule(JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.addRecurrenceRule(data);
		return @com.ait.toolkit.titanium.mobile.client.ios.calendar.RecurrenceRule::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Updates the event's data with the current information in the Calendar
     * database.
     * 
     * This method should be only used on events that your application is
     * editing, and only when your application receives the change notification.
     * If this method returns NO, the event has been deleted or otherwise
     * invalidated, and you should not continue to use it.
     */
    public final native void refresh() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.refresh();
    }-*/;

    /**
     * Removes an event from the event store.
     * 
     * This method raises an exception if it is passed an event from another
     * event store.
     */
    public final native boolean remove() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.remove();
    }-*/;

    /**
     * Removes an event from the event store.
     * 
     * This method raises an exception if it is passed an event from another
     * event store.
     */
    public final native boolean remove(int span) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.remove(span);
    }-*/;

    /**
     * Removes a recurrence rule to the recurrence rule array.
     */
    public final native void removeRecurrenceRule(RecurrenceRule value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeRecurrenceRule(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Saves changes to an event permanently.
     * <p>
     * This method raises an exception if it is passed an event from another
     * event store.
     * <p>
     * When an event is saved, it is updated in the Calendar database. Any
     * fields you did not modify are updated to reflect the most recent value in
     * the database. If the event has been deleted from the database, it is
     * re-created as a new event.
     */
    public final native boolean save() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.save();
    }-*/;

    /**
     * Saves changes to an event permanently.
     * <p>
     * This method raises an exception if it is passed an event from another
     * event store.
     * <p>
     * When an event is saved, it is updated in the Calendar database. Any
     * fields you did not modify are updated to reflect the most recent value in
     * the database. If the event has been deleted from the database, it is
     * re-created as a new event.
     */
    public final native boolean save(int span) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.save(span);
    }-*/;

    public final native void setRecurrenceRule(RecurrenceRule value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setRecurrenceRule(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final void setRecurrenceRules(RecurrenceRule... values) {
        setRecurrenceRules(Arrays.asList(values));
    }

    public final native void setRecurrenceRules(List<RecurrenceRule> values) /*-{
		var peers = @com.ait.toolkit.titanium.mobile.client.ios.calendar.RecurrenceRule::fromList(Ljava/util/List;)(values);
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setRecurrenceRules(peers);
    }-*/;

}
