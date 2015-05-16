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
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SwitchChangeHandler;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasTitle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A switch component
 */
public class Switch extends View implements HasTitle {

    public Switch() {
        createPeer();
    }

    Switch( JavaScriptObject obj ) {
        jsObj = obj;
    }

    public Switch( String id ) {
        this( id, new ArrayList<String>() );
    }

    public Switch( String id, List<String> classes ) {
        jsObj = UI.createSwitch( id, classes );
    }

    /**
     * @return Boolean for the state of the switch
     */
    public native boolean isEnabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.enabled;
    }-*/;

    public native void setEnabled( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.enabled = value;
    }-*/;

    /**
     * @return One of com.ait.toolkit.titanium.mobile.client.ui.android.Androif.
     *         SWITCH_STYLE_CHECKBOX or com.ait.toolkit.titanium.mobile.client.ui
     *         .android.Androif.SWITCH_STYLE_TOGGLE_BUTTON (default). (android
     *         only)
     * 
     */
    public native int getStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.style;
    }-*/;

    public native void setStyle( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.style = value;
    }-*/;

    /**
     * @return Text to display with checkbox. used if style is
     *         com.emitrom.gwt.appcelerator
     *         .mobile.client.ui.android.Androif.SWITCH_STYLE_CHECKBOX (android
     *         only)
     * 
     */
    public native String getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @return Text to display when value is 'false'. used if style is
     *         com.ait.toolkit.titanium.mobile.client.ui.android.Androif.
     *         SWITCH_STYLE_TOGGLE_BUTTON (android only)
     * 
     */
    public native String getTitleOff() /*-{
		return jso.titleOff;
    }-*/;

    public native void setTitleOff( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.titleOff = value;
    }-*/;

    /**
     * @return Text to display when value is 'true'. Used if style is
     *         com.ait.toolkit.titanium.mobile.client.ui.android.Androif.
     *         SWITCH_STYLE_TOGGLE_BUTTON (android only)
     * 
     */
    public native String getTitleOn() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.titleOn;
    }-*/;

    public native void setTitleOn( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.titleOn = value;
    }-*/;

    /**
     * @return Boolean value of the switch where true is the switch is on and
     *         false the switch if off
     */
    public native boolean getValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.value;
    }-*/;

    public native void setValue( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.value = value;
    }-*/;

    public native void addChangeHandler( SwitchChangeHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.SwitchEvent::CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.SwitchEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SwitchChangeHandler::onChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/SwitchEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createSwitch( "", new ArrayList<String>() );
    }

    public static Switch from( JsObject proxy ) {
        return new Switch( proxy.getJsObj() );
    }

}
