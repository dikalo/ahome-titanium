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

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * The top level database module. the database module is used for creating and
 * accessing the in-application database.
 */
public class Database extends TiModule {

    public static final int FIELD_TYPE_DOUBLE = FIELD_TYPE_DOUBLE();
    public static final int FIELD_TYPE_FLOAT = FIELD_TYPE_FLOAT();
    public static final int FIELD_TYPE_INT = FIELD_TYPE_INT();
    public static final int FIELD_TYPE_STRING = FIELD_TYPE_STRING();
    private static Database instance = null;

    public static Database get() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Database() {
        createPeer();
    }

    /**
     * Install a database from the application resources folder (at build time)
     * and return a reference to the opened database. it is safe to call this
     * method multiple times since this method will only install once if it
     * doesn't already exist on the device.
     * 
     * @param path
     *            the path (relative to the main application Resources folder at
     *            build time) to the db to install. this file must be in the
     *            SQLite 3 file format.
     * @param name
     *            the name of the database
     */
    public native DB install(String path, String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.install(path, name);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.database.DB::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Open a database. if it doesn't yet exist, create it.
     * 
     * @param name
     *            the name of the database
     */
    public native DB open(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.open(name);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.database.DB::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    private static native final int FIELD_TYPE_DOUBLE() /*-{
		return Titanium.Database.FIELD_TYPE_DOUBLE;
    }-*/;

    private static native final int FIELD_TYPE_FLOAT() /*-{
		return Titanium.Database.FIELD_TYPE_FLOAT;
    }-*/;

    private static native final int FIELD_TYPE_INT() /*-{
		return Titanium.Database.FIELD_TYPE_INT;
    }-*/;

    private static native final int FIELD_TYPE_STRING() /*-{
		return Titanium.Database.FIELD_TYPE_STRING;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeDatabaseModule();
    }

}
