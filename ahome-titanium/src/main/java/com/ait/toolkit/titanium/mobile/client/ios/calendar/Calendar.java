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

import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;

/**
 * 
 * The Android.Calendar module provides proxies and methods for accessing the
 * native calendar functionality.
 * <p>
 * This module supports retrieving information about existing events and
 * creating new events. Modifying or deleting existing events and creating
 * recurring events is also supported.
 * 
 */
public class Calendar extends TiModule {

    private static final Calendar INSTANCE = new Calendar();

    public static final int IOS_CALENDAR_AUTHORIZATION_AUTHORIZED = AUTHORIZATION_AUTHORIZED();
    public static final int IOS_CALENDAR_AUTHORIZATION_DENIED = AUTHORIZATION_DENIED();
    public static final int IOS_CALENDAR_AUTHORIZATION_RESTRICTED = AUTHORIZATION_RESTRICTED();
    public static final int IOS_CALENDAR_AUTHORIZATION_UNKNOWN = AUTHORIZATION_UNKNOWN();
    public static final int IOS_CALENDAR_AVAILIBILITY_BUSY = AVAILIBILITY_BUSY();
    public static final int IOS_CALENDAR_AVAILIBILITY_FREE = AVAILIBILITY_FREE();
    public static final int IOS_CALENDAR_AVAILIBILITY_NOTSUPPORTED = AVAILIBILITY_NOTSUPORTED();
    public static final int IOS_CALENDAR_AVAILIBILITY_TENTATIVE = AVAILIBILITY_TENTATIVE();
    public static final int IOS_CALENDAR_AVAILIBILITY_UNAVAILABLE = AVAILIBILITY_UNAVAILABLE();
    public static final int IOS_CALENDAR_RECURRENCEFREQUENCY_DAILY = RECURRENCEFREQUENCY_DAILY();
    public static final int IOS_CALENDAR_RECURRENCEFREQUENCY_MONTHLY = RECURRENCEFREQUENCY_MONTHLY();
    public static final int IOS_CALENDAR_RECURRENCEFREQUENCY_WEEKLY = RECURRENCEFREQUENCY_WEEKLY();
    public static final int IOS_CALENDAR_RECURRENCEFREQUENCY_YEARLY = RECURRENCEFREQUENCY_YEARLY();
    public static final int IOS_CALENDAR_SPAN_FUTUREEVENTS = SPAN_FUTUREEVENTS();
    public static final int IOS_CALENDAR_SPAN_THISEVENT = SPAN_THISEVENT();
    public static final int IOS_CALENDAR_STATUS_CANCELED = STATUS_CANCELED();
    public static final int IOS_CALENDAR_STATUS_CONFIRMED = STATUS_CONFIRMED();
    public static final int IOS_CALENDAR_STATUS_NONE = STATUS_NONE();
    public static final int IOS_CALENDAR_STATUS_TENTATIVE = STATUS_TENTATIVE();

    public static Calendar get() {
        return INSTANCE;
    }

    private Calendar() {
        createPeer();
    }

    /**
     * All calendars known to the native calendar app.
     */
    public native List<CalendarInstance> getAllCalendars() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.allCallendars;
		return @com.ait.toolkit.titanium.mobile.client.ios.calendar.CalendarInstance::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * All calendars known to the native calendar app that can add, edit, and
     * delete items in the calendar.
     */
    public native List<CalendarInstance> getAllEditableCalendars() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.allEditableCallendars;
		return @com.ait.toolkit.titanium.mobile.client.ios.calendar.CalendarInstance::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Calendar that events are added to by default, as specified by user
     * settings.
     */
    public native CalendarInstance getDefaultCalendar() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.defaultCalendar;
		return @com.ait.toolkit.titanium.mobile.client.ios.calendar.CalendarInstance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns an authorization constant indicating if the application has
     * access to the events in the EventKit.
     * <p>
     * Always returns AUTHORIZATION_AUTHORIZED on iOS pre-6.0.
     */
    public native int getEventsAutorization() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.eventsAuthorization;
    }-*/;

    /**
     * 
     * Fired when the database backing the EventKit module is modified.
     * <p>
     * This event is fired when changes are made to the Calendar database,
     * including adding, removing, and changing events or reminders. Individual
     * changes are not described. When you receive this notification, you should
     * refetch all Event objects you have accessed, as they are considered
     * stale. If you are actively editing an event and do not wish to refetch it
     * unless it is absolutely necessary to do so, you can call the refresh
     * method on it. If the method returns YES, you do not need to refetch the
     * event.
     */
    public void addChangeHandler(EventHandler handler) {
        addEventHandler("change", handler);
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createAndroidCalender();

    }

    public static native int AUTHORIZATION_AUTHORIZED()/*-{
		return Titanium.Calendar.AUTHORIZATION_AUTHORIZED ? Titanium.Calendar.AUTHORIZATION_AUTHORIZED
				: 0;
    }-*/;

    public static native int AUTHORIZATION_DENIED()/*-{
		return Titanium.Calendar.AUTHORIZATION_DENIED ? Titanium.Calendar.AUTHORIZATION_DENIED
				: 0;
    }-*/;

    public static native int AUTHORIZATION_RESTRICTED()/*-{
		return Titanium.Calendar.AUTHORIZATION_RESTRICTED ? Titanium.Calendar.AUTHORIZATION_RESTRICTED
				: 0;
    }-*/;

    public static native int AUTHORIZATION_UNKNOWN()/*-{
		return Titanium.Calendar.AUTHORIZATION_UNKNOWN ? Titanium.Calendar.AUTHORIZATION_UNKNOWN
				: 0;
    }-*/;

    public static native int AVAILIBILITY_BUSY()/*-{
		return Titanium.Calendar.AVAILIBILITY_BUSY ? Titanium.Calendar.AVAILIBILITY_BUSY
				: 0;
    }-*/;

    public static native int AVAILIBILITY_FREE()/*-{
		return Titanium.Calendar.AVAILIBILITY_FREE ? Titanium.Calendar.AVAILIBILITY_FREE
				: 0;
    }-*/;

    public static native int AVAILIBILITY_NOTSUPORTED()/*-{
		return Titanium.Calendar.AVAILIBILITY_NOTSUPORTED ? Titanium.Calendar.AVAILIBILITY_NOTSUPORTED
				: 0;
    }-*/;

    public static native int AVAILIBILITY_TENTATIVE()/*-{
		return Titanium.Calendar.AVAILIBILITY_TENTATIVE ? Titanium.Calendar.AVAILIBILITY_TENTATIVE
				: 0;
    }-*/;

    public static native int AVAILIBILITY_UNAVAILABLE()/*-{
		return Titanium.Calendar.AVAILIBILITY_UNAVAILABLE ? Titanium.Calendar.AVAILIBILITY_UNAVAILABLE
				: 0;
    }-*/;

    public static native int RECURRENCEFREQUENCY_DAILY()/*-{
		return Titanium.Calendar.RECURRENCEFREQUENCY_DAILY ? Titanium.Calendar.RECURRENCEFREQUENCY_DAILY
				: 0;
    }-*/;

    public static native int RECURRENCEFREQUENCY_MONTHLY()/*-{
		return Titanium.Calendar.RECURRENCEFREQUENCY_MONTHLY ? Titanium.Calendar.RECURRENCEFREQUENCY_MONTHLY
				: 0;
    }-*/;

    public static native int RECURRENCEFREQUENCY_YEARLY()/*-{
		return Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY ? Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY
				: 0;
    }-*/;

    public static native int RECURRENCEFREQUENCY_WEEKLY()/*-{
		return Titanium.Calendar.RECURRENCEFREQUENCY_WEEKLY ? Titanium.Calendar.RECURRENCEFREQUENCY_WEEKLY
				: 0;
    }-*/;

    public static native int SPAN_FUTUREEVENTS()/*-{
		return Titanium.Calendar.SPAN_FUTUREEVENTS ? Titanium.Calendar.SPAN_FUTUREEVENTS
				: 0;
    }-*/;

    public static native int SPAN_THISEVENT()/*-{
		return Titanium.Calendar.SPAN_THISEVENT ? Titanium.Calendar.SPAN_THISEVENT
				: 0;
    }-*/;

    public static native int STATUS_CANCELED()/*-{
		return Titanium.Calendar.STATUS_CANCELED ? Titanium.Calendar.STATUS_CANCELED
				: 0;
    }-*/;

    public static native int STATUS_CONFIRMED()/*-{
		return Titanium.Calendar.STATUS_CONFIRMED ? Titanium.Calendar.STATUS_CONFIRMED
				: 0;
    }-*/;

    public static native int STATUS_NONE()/*-{
		return Titanium.Calendar.STATUS_NONE ? Titanium.Calendar.STATUS_NONE
				: 0;
    }-*/;

    public static native int STATUS_TENTATIVE()/*-{
		return Titanium.Calendar.STATUS_TENTATIVE ? Titanium.Calendar.STATUS_TENTATIVE
				: 0;
    }-*/;

}
