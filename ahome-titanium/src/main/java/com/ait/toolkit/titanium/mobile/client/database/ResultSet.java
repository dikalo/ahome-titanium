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
package com.ait.toolkit.titanium.mobile.client.database;

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The resultset instance returned by invoking a database sql execute.
 */
public class ResultSet extends EventDispatcher {

    private ResultSet() {

    }

    private ResultSet(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The number of rows in the result set
     */
    public native int getRowCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rowCount;
    }-*/;

    /**
     * @return The number of columns in this result set.
     */
    public native int getFieldCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldCount;
    }-*/;

    /**
     * @return Returns true if the current row is still valid
     */
    public native boolean getValidRow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.validRow;
    }-*/;

    /**
     * Close the result set and release resources. once closed, this result set
     * must no longer be used
     */
    public native void close() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.close();
    }-*/;

    /**
     * Retrieve a row value by field index
     * 
     * @param index
     *            column index (which is zero based)
     */
    public native <T> T field(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.field(index);
    }-*/;

    /**
     * Retrieve a row value by field index
     * 
     * @param index
     *            column index (which is zero based)
     * @param type
     *            One of (
     *            {@link com.ait.toolkit.titanium.mobile.client.database.Database.FIELD_TYPE_STRING}
     *            {@link com.ait.toolkit.titanium.mobile.client.database.Database.FIELD_TYPE_INT}
     *            {@link com.ait.toolkit.titanium.mobile.client.database.Database.FIELD_TYPE_FLOAT}
     *            {@link com.ait.toolkit.titanium.mobile.client.database.Database.FIELD_TYPE_DOUBLE}
     *            )
     */
    public native <T> T field(int index, int type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.field(index, type);
    }-*/;

    /**
     * Retrieve a row value by field name
     * 
     * @param name
     *            column name from SQL query
     */
    public native <T> T fieldByName(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldByName(name);
    }-*/;

    /**
     * Retrieve a row value by field name
     * 
     * @param name
     *            column name from SQL query
     * @param type
     *            One of (
     *            {@link com.ait.toolkit.titanium.mobile.client.database.Database.FIELD_TYPE_STRING}
     *            {@link com.ait.toolkit.titanium.mobile.client.database.Database.FIELD_TYPE_INT}
     *            {@link com.ait.toolkit.titanium.mobile.client.database.Database.FIELD_TYPE_FLOAT}
     *            {@link com.ait.toolkit.titanium.mobile.client.database.Database.FIELD_TYPE_DOUBLE}
     *            )
     */
    public native <T> T fieldByName(String name, int type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldByName(name, type);
    }-*/;
    
    /**
     * Retrieve a row string value by field name
     * @param name		The field
     * @return			The string value
     */
    public native String fieldAsString(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldByName(name, @com.ait.toolkit.titanium.mobile.client.database.Database::FIELD_TYPE_STRING);
    }-*/;
    
    /**
     * Retrieve a blob value by field name from result set
     * @param name		The field
     * @return			The blob value
     */
    public native Blob fieldAsBlob(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jso.fieldByName(name));
    }-*/;
    
    /**
     * Retrieve a boolean value by field name from result set
     * This asserts old SQLite behavior in that SQLite doesn't support BOOL values,
     * but saves them as integers. This is not true with newer DBs, but true for Titanium.
     * Anything larger than 0 is true
     * @param name		The field
     * @return			The boolean value
     */
    public native boolean fieldAsBoolean(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return (jso.fieldByName(name, @com.ait.toolkit.titanium.mobile.client.database.Database::FIELD_TYPE_INT) || 0) > 0;
    }-*/;

    /**
     * Retrieve an integer value by field name from this result set
     * @param name		The field name
     * @return			The integer value
     */
    public native int fieldAsInt(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldByName(name, @com.ait.toolkit.titanium.mobile.client.database.Database::FIELD_TYPE_INT);
    }-*/;
    
    /**
     * Retrieve a double value by field name from this result set
     * @param name		The field name
     * @return			The double value
     */
    public native double fieldAsDouble(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldByName(name, @com.ait.toolkit.titanium.mobile.client.database.Database::FIELD_TYPE_DOUBLE);
	}-*/;

    /**
     * Retrieve a float value by field name from this result set
     * @param name		The field name
     * @return			The float value
     */
    public native double fieldAsFloat(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldByName(name, @com.ait.toolkit.titanium.mobile.client.database.Database::FIELD_TYPE_FLOAT);
	}-*/;

    /**
     * Return the number of columns in the result set
     */
    public native int fieldCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldCount();
    }-*/;

    /**
     * Return the field name for field index
     * 
     * @param index
     *            field name column index (which is zero based)
     */
    public native String fieldName(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fieldName(index);
    }-*/;

    /**
     * Return true if the row is a valid row
     */
    public native boolean isValidRow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isValidRow();
    }-*/;

    /**
     * Iterate to the next row in the result set.
     * 
     * @return If the next operation goes past the row, this returns false. Else
     *         true.
     */
    public native boolean next() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.next();
    }-*/;
    
}
