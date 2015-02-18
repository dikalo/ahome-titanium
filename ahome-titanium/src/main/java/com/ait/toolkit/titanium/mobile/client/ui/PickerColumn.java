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
package com.ait.toolkit.titanium.mobile.client.ui;

import java.util.ArrayList;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Picker Column object.Represents a column in a picker element
 */
public class PickerColumn extends View {

    public PickerColumn() {
        createPeer();
    }

    PickerColumn(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Number of rows in the column (readonly)
     */
    public native int getRowCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rowCount;
    }-*/;

    /**
     * @return An array of rows
     */
    public ArrayList<PickerRow> getRows() {
        ArrayList<PickerRow> rows = new ArrayList<PickerRow>();
        JsArray<JavaScriptObject> values = _getRows();
        for (int i = 0; i < values.length(); i++) {
            rows.add(new PickerRow(values.get(i)));
        }
        return rows;
    }

    private native JsArray<JavaScriptObject> _getRows() /*-{
		return jso.rows;
    }-*/;

    /**
     * Add a row to the column.
     * 
     * @param row The row to add.
     */
    public native void addRow(PickerRow row) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.addRow(row.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Remove a row from the column.
     * 
     * @param row The row to remove.
     */
    public native void removeRow(PickerRow row) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.removeRow(row.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createPickerColumn();
    }

    public static PickerColumn from(JsObject proxy) {
        return new PickerColumn(proxy.getJsObj());
    }
}
