/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.PickerChangeHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

/**
 * A picker is created by the method
 * com.ait.toolkit.titanium.mobile.client.ui.UI.createPicker. A picker can be used to
 * select one or more fixed values.
 * <p>
 * For Android, note the 'useSpinner' property above. By default, when you
 * create a picker you will get Android's native picker control, which looks
 * more like the classic "dropdown" widget. If you'd prefer to use something
 * that looks more like iOS's picker -- which looks like one or more spinning
 * wheels --, you can set `useSpinner: true`.
 * 
 * Titanium's Android picker control (both the native and the 'useSpinner'
 * variety) does not support/display views that are added to picker rows. Only
 * the `title` of the row will be displayed within the control. Titanium for
 * Android does not support the DateTime or Count Down Timer picker type.
 */
public class Picker extends View {

    public Picker() {
        createPeer();
    }

    Picker( JavaScriptObject proxy ) {
        jsObj = proxy;
    }

    public Picker( boolean spinner ) {
        createPeerSpinner( spinner );
    }

    public Picker( String id ) {
        jsObj = UI.createPicker( id, new ArrayList<String>() );
    }

    public Picker( String id, List<String> classes ) {
        jsObj = UI.createPicker( id, classes );
    }

    public Picker( String id, List<String> classes, boolean spinner ) {
        jsObj = UI.createPicker( id, classes, spinner );
    }

    /**
     * @return Array of column values
     */

    public ArrayList<PickerColumn> getColumns() {
        ArrayList<PickerColumn> columns = new ArrayList<PickerColumn>();
        JsArray<JavaScriptObject> values = _getColumns();
        for( int i = 0; i < values.length(); i++ ) {
            columns.add( new PickerColumn( values.get( i ) ) );
        }
        return columns;
    }

    private native JsArray<JavaScriptObject> _getColumns() /*-{
		return jso.columns;
    }-*/;

    public void setColumns( ArrayList<PickerColumn> columns ) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for( PickerColumn column : columns ) {
            values.push( column.getJsObj() );
        }
        _setColumns( values );
    }

    private native void _setColumns( JsArray<JavaScriptObject> value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.columns = value;
    }-*/;

    /**
     * @return The duration value in milliseconds for count down timer pickers.
     *         (note that titanium's android implementation does not support the
     *         countdown timer.)
     */
    public native double getCountDownDuration() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.countDownDuration;
    }-*/;

    public native void setCountDownDuration( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.countDownDuration = value;
    }-*/;

    /**
     * @return (android only, applicable only to the
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.PICKER_TYPE_TIME}
     *         picker.) if true, a 24-hour cloc will be used, with hours 0
     *         through 23. if false, a 12-hour clock will be used, with hours 1
     *         through 12 and am/pm controls. for reasons of backward
     *         compatibility, the default value depends on the type of time
     *         picker being used. for the native time picker (when "usespinner"
     *         is either un-set or false), the default is false. for the
     *         spinner-style time picker, the default is true.
     */
    public native boolean isFormat24() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.format24;
    }-*/;

    public native void setFormat24( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.format24 = value;
    }-*/;

    /**
     * @return The locale used for displaying date/time pickers values
     */
    public native String getLocale() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.locale;
    }-*/;

    public native void setLocale( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.locale = value;
    }-*/;

    /**
     * @return The minimum date/time for value for date pickers
     */
    public native JsDate getMinDate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.minDate;
    }-*/;

    public native void setMinDate( JsDate value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.minDate = value;
    }-*/;

    /**
     * @return The maximum date/time for value for date pickers
     */
    public native JsDate getMaxDate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.maxDate;
    }-*/;

    public native void setMaxDate( JsDate value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.maxDate = value;
    }-*/;

    /**
     * @return Property to set the interval displayed by the minutes wheel (for
     *         example, 15 minutes). the interval value must be evenly divided
     *         into 60; if it is not, the default value is used. the default and
     *         minimum values are 1; the maximum value is 30. (not currently
     *         supported on android.)
     */
    public native int getMinuteInterval() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.minuteInterval;
    }-*/;

    public native void setMinuteInterval( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.minuteInterval = value;
    }-*/;

    /**
     * @return For basic picker, boolean value to indicate whether the visual
     *         selection style is shown. on the iphone, jso is a blue selected
     *         bar.
     */
    public native boolean hasSelectionIndicator() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.selectionIndicator;
    }-*/;

    public native void setSelectionIndicator( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.selectionIndicator = value;
    }-*/;

    /**
     * @return The type constant for the picker.
     */
    public native int getType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.type;
    }-*/;

    public native void setType( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.type = value;
    }-*/;

    /**
     * @return (android only, default false.) an indicator that you wish to use
     *         a non-native android control that looks and behaves more like the
     *         ios picker in the sense that the user selects values by spinning
     *         a wheel. (the native android spinner is more like a conventional
     *         "dropdown".) note that this option works both plain pickers, date
     *         pickers and time pickers. set it preferably immediately when
     *         creating the picker, i.e., Picker picker = new Picker(true); but
     *         definitely before 'add()' ing the picker to its parent.
     * @platforms android
     */
    public native boolean useSpinner() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.useSpinner;
    }-*/;

    public native void useSpinner( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.useSpinner = value;
    }-*/;

    /**
     * @return The date/time value for date pickers
     */
    public native JsDate getValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.value;
    }-*/;

    public native void setValue( JsDate dateValue ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.value = dateValue;
    }-*/;

    /**
     * @return (android only.) jso is relevant only if you set 'usespinner' to
     *         'true', and it is relevant only for the plain picker (not
     *         date/time). by default, the spinner-style android picker will
     *         show 5 rows: the one in the middle which is selected, and then 2
     *         above and below. you can set jso to allow more (use an odd number
     *         to be sure the selected row is in the middle.)
     */
    public native int getVisibleItems() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.visibleItems;
    }-*/;

    public native void setVisibleItems( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.visibleItems = value;
    }-*/;

    /**
     * Add an array of rows, a single row or a column to the picker
     * 
     * @param data
     *            add an array of rows, a single row or a column to the picker
     */
    public native void add( PickerRow row ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		jso.add(row.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Add an array of rows, a single row or a column to the picker
     * 
     * @param data
     *            add an array of rows, a single row or a column to the picker
     */
    public native void add( PickerColumn column ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.add(column.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Get the selected row object for column
     * 
     * @param index
     *            for the column index, return the row object or nil if not
     *            found
     */
    public native PickerRow getSelectedRow( int index ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getSelectecRow(index);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.PickerRow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Causes the picker to reload the values from the new column.
     * 
     * @param column
     *            new column to load
     */
    public native void reloadColumn( PickerColumn column ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.reloadColumn(column.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Set the column's row to the selected state
     * 
     * @param column
     *            the column index
     * @param row
     *            the row index
     * @param animated
     *            boolean to indicate if the selection should be animated
     *            (default) (optional)
     */
    public native void setSelectedRow( int column, int row, boolean animated ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.setSelectedRow(column, row, animated);
    }-*/;

    public native void addChangeHandler( PickerChangeHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.picker.PickerChangeEvent::CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.picker.PickerChangeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.PickerChangeHandler::onChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/picker/PickerChangeEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createPicker( "", new ArrayList<String>() );
    }

    private void createPeerSpinner( boolean spinner ) {
        jsObj = UI.createPicker( "", new ArrayList<String>(), spinner );
    }

    public static Picker from( JsObject proxy ) {
        return new Picker( proxy.getJsObj() );
    }

}
