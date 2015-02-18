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
package com.ait.toolkit.titanium.mobile.client.app;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.google.gwt.core.client.JsArrayString;

/**
 * The App Properties module is used for storing application-related data in
 * property/value pairs that persist beyond application sessions and device
 * power cycles.
 * 
 */
public class Properties extends TiModule {

    private static final Properties INSTANCE = new Properties();

    public static Properties get() {
        return INSTANCE;
    }

    private Properties() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createAppProperties();
    }

    public native boolean getBool(String property) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getBool(property);
    }-*/;

    public native boolean getBool(String property, boolean defaultValue) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getBool(property, defaultValue);
    }-*/;

    public native double getDouble(String property) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getDouble(property);
    }-*/;

    public native double getDouble(String property, double defaultValue) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getDouble(property, defaultValue);
    }-*/;

    public native int getInt(String property) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getInt(property);
    }-*/;

    public native int getInt(String property, int defaultValue) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getInt(property, defaultValue);
    }-*/;

    public native Object getPropertyAsObject(String property) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getObject(property);
    }-*/;

    public native String getString(String property) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getString(property);
    }-*/;

    public native String getString(String property, String defaultValue) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getString(property, defaultValue);
    }-*/;

    public native boolean hasProperty(String property) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasProperty(property);
    }-*/;

    public native JsArrayString listProperties() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.listProperties();
    }-*/;

    public native void removeProperty(String property) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeProperty(property);
    }-*/;

    public native void setBool(String property, boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setBool(property, value);
    }-*/;

    public native void setString(String property, String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setString(property, value);
    }-*/;

    public native void setInt(String property, int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setInt(property, value);
    }-*/;

    public native void setObject(String property, Object value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setObject(property, value);
    }-*/;

    public native void setDouble(String property, double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setDouble(property, value);
    }-*/;

    /**
     * Fired when a property is changed.
     * <p>
     * On iOS, the event is fired when the user re-enters the application after
     * making a change using the Settings application.
     * <p>
     * The event is also fired when the application changes a property directly
     * using one of the Ti.App.Properties methods.
     */
    public void addChangeHandler(EventHandler handler) {
        addEventHandler("change", handler);
    }

}
