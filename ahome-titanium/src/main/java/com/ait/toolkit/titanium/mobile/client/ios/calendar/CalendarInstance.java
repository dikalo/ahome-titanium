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
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

/**
 * An object that represents a single calendar.
 */
public class CalendarInstance extends EventDispatcher {

    protected CalendarInstance(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Whether the calendar is hidden.
     */
    public final native boolean isHidden() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hidden;
    }-*/;

    /**
     * @return The id of the calendar.
     */

    public final native String getId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.id;
    }-*/;

    /**
     * @return The display name of the calendar.
     */
    public final native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    /**
     * Add an event to the calendar. returns the created
     * {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Event}.
     * 
     * @param properties
     *            An object defining the properties of the event. These
     *            correspond to properties of
     *            {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Event}
     *            .
     */
    public final native Event createEvent(JavaScriptObject option) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createEvent(option);
		return @com.ait.toolkit.titanium.mobile.client.android.calendar.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns an array of *
     * {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Event} objects
     * with all events in the given date range.
     * 
     * @param date1
     *            The start date.
     * @param date2
     *            The end date.
     */
    public ArrayList<Event> getEventsBetweenDates(JsDate date1, JsDate date2) {
        ArrayList<Event> events = new ArrayList<Event>();
        JsArray<JavaScriptObject> array = _getEventsBetweenDates(date1, date2);
        for (int i = 0; i < array.length(); i++) {
            events.add(new Event(array.get(i)));
        }
        return events;
    }

    private final native JsArray<JavaScriptObject> _getEventsBetweenDates(JsDate date1, JsDate date2) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getEventsBetweenDates(date1, date2);
    }-*/;

    /**
     * Returns an array of
     * {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Event} objects
     * with all events on the given date.
     * 
     * @param year
     *            The year of the desired date.
     * @param month
     *            The month of the desired date. The month is zero-based,
     *            therefore January is 0 and December is 11.
     * @param day
     *            The day for which events should be returned.
     */
    public ArrayList<Event> getEventsInDate(int year, int month, int day) {
        ArrayList<Event> events = new ArrayList<Event>();
        JsArray<JavaScriptObject> array = _getEventsInDate(year, month, day);
        for (int i = 0; i < array.length(); i++) {
            events.add(new Event(array.get(i)));
        }
        return events;
    }

    private final native JsArray<JavaScriptObject> _getEventsInDate(int year, int month, int day) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getEventsInDate(year, month, day);
    }-*/;

    /**
     * Returns an array of
     * {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Event} objects
     * with all events in the given month.
     * 
     * @param year
     *            The year of the desired month.
     * @param month
     *            The month for which events should be returned. The month is
     *            zero-based, therefore January is 0 and December is 11.
     */
    public ArrayList<Event> getEventsInMonth(int year, int month) {
        ArrayList<Event> events = new ArrayList<Event>();
        JsArray<JavaScriptObject> array = _getEventsInMonth(year, month);
        for (int i = 0; i < array.length(); i++) {
            events.add(new Event(array.get(i)));
        }
        return events;
    }

    private final native JsArray<JavaScriptObject> _getEventsInMonth(int year, int month) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getEventsInMonth(year, month);
    }-*/;

    /**
     * Returns an array of
     * {@link com.ait.toolkit.titanium.mobile.client.android.calendar.Event} objects
     * with all events in the given year.
     * 
     * @param year
     *            The year for which all events should be returned.
     */

    public ArrayList<Event> getEventsInYear(int year) {
        ArrayList<Event> events = new ArrayList<Event>();
        JsArray<JavaScriptObject> array = _getEventsInYear(year);
        for (int i = 0; i < array.length(); i++) {
            events.add(new Event(array.get(i)));
        }
        return events;
    }

    private final native JsArray<JavaScriptObject> _getEventsInYear(int year) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getEventsInYear(year);
    }-*/;

    static List<CalendarInstance> fromJsArray(JavaScriptObject obj) {
        List<CalendarInstance> toReturn = new ArrayList<CalendarInstance>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new CalendarInstance(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

}
