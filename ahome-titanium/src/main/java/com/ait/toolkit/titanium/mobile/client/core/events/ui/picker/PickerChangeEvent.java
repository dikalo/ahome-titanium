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

package com.ait.toolkit.titanium.mobile.client.core.events.ui.picker;

import com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent;
import com.ait.toolkit.titanium.mobile.client.ui.PickerColumn;
import com.ait.toolkit.titanium.mobile.client.ui.PickerRow;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

public class PickerChangeEvent extends UIEvent {

    public static final String CHANGE = "change";

    protected PickerChangeEvent() {

    }

    private PickerChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the selected column index
     */
    public final native int getColumnIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.columnIndex;
    }-*/;

    /**
     * the selected row index
     */
    public final native int getRowIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rowIndex;
    }-*/;

    /**
     * the column object
     */
    public final native PickerColumn getColumn() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.pickerColumn;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.PickerColumn::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * (date/time pickers only) the selected date/time value.
     */
    public final native JsDate getValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.value;
    }-*/;

    /**
     * the row object
     */
    public final native PickerRow getRow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.row;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.PickerRow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * (plain picker only) the array of selected values, one element per column
     * in the picker.
     */
    public final native <T> T getSelectedValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.selectedValue;
    }-*/;

}
