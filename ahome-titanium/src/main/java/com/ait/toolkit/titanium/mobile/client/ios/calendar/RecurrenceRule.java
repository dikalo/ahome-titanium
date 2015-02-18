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

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * 
 An object that is used to describe the recurrence pattern for a recurring
 * event.
 * 
 */
public class RecurrenceRule extends EventDispatcher {

    protected RecurrenceRule(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Identifier for the recurrence rule's calendar.
     */
    public native String getCalendarID() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.caendarID;
    }-*/;

    /**
     * The days of the month that the event occurs, as an array of number
     * objects. Values can be from 1 to 31 and from -1 to -31. This parameter is
     * only valid for recurrence rules of type RECURRENCEFREQUENCY_MONTHLY.
     * 
     */
    public native JsArrayNumber getDaysOfTheMonth() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.daysOfTheMonth;
    }-*/;

    /**
     * The days of the week that the event occurs, as an Dictionay of daysOfWeek
     * and Week.
     */
    public native DaysOfTheWeek getDaysOfTheWeek() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.daysOfTheWeek;
		return @com.ait.toolkit.titanium.mobile.client.ios.calendar.DaysOfTheWeek::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * The days of the year that the event occurs, as an array of number
     * objects. Values can be from 1 to 366 and from -1 to -366. This parameter
     * is only valid for recurrence rules of type RECURRENCEFREQUENCY_YEARLY.
     * 
     */
    public native JsArrayNumber getDaysOfTheYear() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.daysOfTheYear;
    }-*/;

    /**
     * End of a recurrence rule.
     * <p>
     * The recurrence end can be specified by a date (date-based) or by a
     * maximum count of occurrences (count-based). An event which is set to
     * never end should not have its recurrenceEnd set.
     * EitherendDateoroccurrenceCount` property will be present.
     */
    public native RecurrenceEnd getEnd() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.end;
		return @com.ait.toolkit.titanium.mobile.client.ios.calendar.RecurrenceEnd::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Frequency of the recurrence rule.
     * <p>
     * Can be RECURRENCEFREQUENCY_DAILY, RECURRENCEFREQUENCY_WEEKLY,
     * RECURRENCEFREQUENCY_MONTHLY, or RECURRENCEFREQUENCY_YEARLY.
     * 
     */
    public native int getFrequency() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.frequency;
    }-*/;

    /**
     * The interval between instances of this recurrence. For example, a weekly
     * recurrence rule with an interval of 2 occurs every other week. Must be
     * greater than 0.
     * <p>
     * Default: 1
     * 
     */
    public native int getInterval() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.interval;
    }-*/;

    /**
     * The months of the year that the event occurs, as an array of Number
     * objects. Values can be from 1 to 12. This parameter is only valid for
     * recurrence rules of type RECURRENCEFREQUENCY_YEARLY.
     * 
     */
    public native JsArrayNumber getMonthsOfTheYear() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.monthsOfTheYear;
    }-*/;

    /**
     * An array of ordinal numbers that filters which recurrences to include in
     * the recurrence rule's frequency. For example, a yearly recurrence rule
     * that has a daysOfTheWeek value that specifies Monday through Friday, and
     * a setPositions array containing 2 and -1, occurs only on the second
     * weekday and last weekday of every year.
     * 
     */
    public native JsArrayNumber getSetPositions() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.setPositions;
    }-*/;

    /**
     * The weeks of the year that the event occurs, as an array of number
     * objects. Values can be from 1 to 53 and from -1 to -53. This parameter is
     * only valid for recurrence rules of type RECURRENCEFREQUENCY_YEARLY.
     * 
     */
    public native JsArrayNumber getWeeksOfTheYear() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.weekssOfTheYear;
    }-*/;

    static JavaScriptObject fromList(List<RecurrenceRule> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (RecurrenceRule rule : values) {
            peers.push(rule.getJsObj());
        }
        return peers;
    }

}
