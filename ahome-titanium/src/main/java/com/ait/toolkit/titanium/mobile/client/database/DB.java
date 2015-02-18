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

import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * * The database instance returned by
 * {@link com.ait.toolkit.titanium.mobile.client.database.Databe.open} or
 * {@link com.ait.toolkit.titanium.mobile.client.database.Database.install}.
 */
public class DB extends EventDispatcher {

    private DB() {

    }

    private DB(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * A File object representing the file where this database is stored. Must
     * only be used for setting file properties.
     */
    public native File getFile() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.file;
		return @com.ait.toolkit.titanium.mobile.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * @return The last row identifier by the last insert query
     */
    public native int getLastInsertRowId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.lastInsertRowId;
    }-*/;

    public native void setLastInsertRowId(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.lastInsertRowId = value;
    }-*/;

    /**
     * @return The name of the database
     */
    public native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    public native void setName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.name = value;
    }-*/;

    /**
     * @return The number of rows affected by the last query
     */
    public native int getRowsAffected() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rowsAffected;
    }-*/;

    public native void setRowsAffected(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rowsAffected = value;
    }-*/;

    /**
     * Close the database and release resources from memory. once closed, this
     * instance is no longer valid and must no longer be used.
     */
    public native void close() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.close();
    }-*/;

    /**
     * Execute a sql statement against the database and returns a resultset
     * 
     * @param sql
     *            the SQL to execute
     */
    public native ResultSet execute(String sql) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.execute(sql);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.database.ResultSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Execute a sql statement against the database and returns a resultset
     * 
     * @param sql
     *            the SQL to execute
     * @param vararg
     *            one or more optional variable arguments passed to this
     *            function or an array of objects to be replaced in the query
     *            using `?` substitution.
     */
    public ResultSet execute(String sql, List<String> args) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : args) {
            values.push(s);
        }
        return _execute(sql, values);
    }

    /**
     * Execute a sql statement against the database and returns a resultset
     * 
     * @param sql
     *            the SQL to execute
     * @param vararg
     *            one or more optional variable arguments passed to this
     *            function or an array of objects to be replaced in the query
     *            using `?` substitution.
     */
    public ResultSet execute(String sql, String... args) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : args) {
            values.push(s);
        }
        return _execute(sql, values);
    }

    private native ResultSet _execute(String sql, JsArrayString vararg) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.execute(sql, vararg);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.database.ResultSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Remove the database files for this instance from disk. warning: this is a
     * destructive operation and cannot be reversed. all data in the database
     * will be lost upon calling this function. use with caution.
     */
    public native void remove() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.remove();
    }-*/;

}
