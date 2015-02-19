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

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The Android.Calendar module provides proxies and methods for accessing the
 * native Android calendar functionality.
 * <p>
 * This module supports retrieving information about existing events and
 * creating new events. However, modifying or deleting existing events is not
 * yet supported. Additionally, recurring events are not yet supported.
 * <p>
 * Currently, calendar permissions must be explicitly configured in tiapp.xml in
 * order to access the calendar. See "Common Requirements" in tiapp.xml and
 * timodule.xml Reference.
 */
public class Calendar extends TiModule {

	public static final int CALENDAR_METHOD_ALERT = METHOD_ALERT();
	public static final int CALENDAR_METHOD_DEFAULT = METHOD_DEFAULT();
	public static final int CALENDAR_METHOD_EMAIL = METHOD_EMAIL();
	public static final int CALENDAR_METHOD_SMS = METHOD_SMS();
	public static final int CALENDAR_STATE_DISMISSED = STATE_DISMISSED();
	public static final int CALENDAR_STATE_FIRED = STATE_FIRED();
	public static final int CALENDAR_STATE_SCHEDULED = STATE_SCHEDULED();
	public static final int CALENDAR_STATUS_CANCELED = STATUS_CANCELED();
	public static final int CALENDAR_STATUS_CONFIRMED = STATUS_CONFIRMED();
	public static final int CALENDAR_STATUS_TENTATIVE = STATUS_TENTATIVE();
	public static final int CALENDAR_VISIBILITY_CONFIDENTIAL = VISIBILITY_CONFIDENTIAL();
	public static final int CALENDAR_VISIBILITY_DEFAULT = VISIBILITY_DEFAULT();
	public static final int CALENDAR_VISIBILITY_PRIVATE = VISIBILITY_PRIVATE();
	public static final int CALENDAR_VISIBILITY_PUBLIC = VISIBILITY_PUBLIC();

	private static Calendar instance = null;

	public static Calendar get() {
		if (instance == null) {
			instance = new Calendar();
		}
		return instance;
	}

	private Calendar() {
		createPeer();
	}

	/**
	 * Returns an array of
	 * <code>com.ait.toolkit.titanium.mobile.client.android.calendar.Alert</code>
	 * objects robjects representing all alerts.
	 * 
	 * @return
	 */
	public ArrayList<Alert> getAllAlerts() {
		ArrayList<Alert> alerts = new ArrayList<Alert>();
		JsArray<JavaScriptObject> array = _getAllAlerts();
		for (int i = 0; i < array.length(); i++) {
			Alert alert = new Alert(array.get(i));
			alerts.add(alert);
		}
		return alerts;
	}

	public native JsArray<JavaScriptObject> _getAllAlerts() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allAlerts;
	}-*/;

	/**
	 * Returns an array of
	 * <code>com.ait.toolkit.titanium.mobile.client.android.calendar.AndroidCalendar</code>
	 * objects representing all the calendars known to the native calendar app.
	 * 
	 * @return
	 */
	public ArrayList<AndroidCalendar> getAllCalendars() {
		ArrayList<AndroidCalendar> calendars = new ArrayList<AndroidCalendar>();
		JsArray<JavaScriptObject> array = _getAllCalendars();
		for (int i = 0; i < array.length(); i++) {
			AndroidCalendar instance = new AndroidCalendar(array.get(i));
			calendars.add(instance);
		}
		return calendars;
	}

	/**
	 * Gets the calendar with the specified identifier.
	 */
	public native AndroidCalendar getCalendarById(int id) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getCalendarById(id);
		return @com.ait.toolkit.titanium.mobile.client.android.calendar.AndroidCalendar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	private native JsArray<JavaScriptObject> _getAllCalendars() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allCalendars;
	}-*/;

	/**
	 * Returns an array of
	 * <code>com.ait.toolkit.titanium.mobile.client.android.calendar.AndroidCalendar</code>
	 * objects representing calendars selected within the native calendar app.
	 * This may be a subset of allCalendars; for example, the native calendar
	 * application may know -- via your Gooogle account -- about calendars that
	 * you have access to but have not selected to be displayed in the native
	 * calendar app.
	 * 
	 * @return
	 */
	public ArrayList<AndroidCalendar> getSelectableCalendars() {
		ArrayList<AndroidCalendar> calendars = new ArrayList<AndroidCalendar>();
		JsArray<JavaScriptObject> array = _getSelectableCalendars();
		for (int i = 0; i < array.length(); i++) {
			AndroidCalendar instance = new AndroidCalendar(array.get(i));
			calendars.add(instance);
		}
		return calendars;
	}

	private native JsArray<JavaScriptObject> _getSelectableCalendars() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.selectableCalendars;
	}-*/;

	private static native int METHOD_ALERT() /*-{
		return Titanium.Android.Calendar.METHOD_ALERT
				? Titanium.Android.Calendar.METHOD_ALERT
				: 0;
	}-*/;

	private static native int METHOD_DEFAULT() /*-{
		return Titanium.Android.Calendar.METHOD_DEFAULT
				? Titanium.Android.Calendar.METHOD_DEFAULT
				: 0;
	}-*/;

	private static native int METHOD_EMAIL() /*-{
		return Titanium.Android.Calendar.METHOD_EMAIL
				? Titanium.Android.Calendar.METHOD_EMAIL
				: 0;
	}-*/;

	private static native int METHOD_SMS() /*-{
		return Titanium.Android.Calendar.METHOD_SMS
				? Titanium.Android.Calendar.METHOD_SMS
				: 0;
	}-*/;

	private static native int STATE_DISMISSED() /*-{
		return Titanium.Android.Calendar.STATE_DISMISSED
				? Titanium.Android.Calendar.STATE_DISMISSED
				: 0;
	}-*/;

	private static native int STATE_FIRED() /*-{
		return Titanium.Android.Calendar.STATE_FIRED
				? Titanium.Android.Calendar.STATE_FIRED
				: 0;
	}-*/;

	private static native int STATE_SCHEDULED() /*-{
		return Titanium.Android.Calendar.STATE_SCHEDULED
				? Titanium.Android.Calendar.STATE_SCHEDULED
				: 0;
	}-*/;

	private static native int STATUS_CANCELED() /*-{
		return Titanium.Android.Calendar.STATUS_CANCELED
				? Titanium.Android.Calendar.STATUS_CANCELED
				: 0;
	}-*/;

	private static native int STATUS_CONFIRMED() /*-{
		return Titanium.Android.Calendar.STATUS_CONFIRMED
				? Titanium.Android.Calendar.STATUS_CONFIRMED
				: 0;
	}-*/;

	private static native int STATUS_TENTATIVE() /*-{
		return Titanium.Android.Calendar.STATUS_TENTATIVE
				? Titanium.Android.Calendar.STATUS_TENTATIVE
				: 0;
	}-*/;

	private static native int VISIBILITY_CONFIDENTIAL() /*-{
		return Titanium.Android.Calendar.VISIBILITY_CONFIDENTIAL
				? Titanium.Android.Calendar.VISIBILITY_CONFIDENTIAL
				: 0;
	}-*/;

	private static native int VISIBILITY_DEFAULT() /*-{
		return Titanium.Android.Calendar.VISIBILITY_DEFAULT
				? Titanium.Android.Calendar.VISIBILITY_DEFAULT
				: 0;
	}-*/;

	private static native int VISIBILITY_PRIVATE() /*-{
		return Titanium.Android.Calendar.VISIBILITY_PRIVATE
				? Titanium.Android.Calendar.VISIBILITY_PRIVATE
				: 0;
	}-*/;

	private static native int VISIBILITY_PUBLIC() /*-{
		return Titanium.Android.Calendar.VISIBILITY_PUBLIC
				? Titanium.Android.Calendar.VISIBILITY_PUBLIC
				: 0;
	}-*/;

	@Override
	public void createPeer() {
		jsObj = TiFactory.createAndroidCalender();
	}

}
