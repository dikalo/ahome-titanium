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
package com.ait.toolkit.titanium.mobile.client.ui.android;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

public class SearchView extends View {

    public SearchView() {
        this( "", new ArrayList<String>() );
    }

    public SearchView( String id ) {
        this( id, new ArrayList<String>() );
    }

    public SearchView( String id, List<String> classes ) {
        jsObj = createPeer( id, classes );
    }

    protected SearchView( JavaScriptObject obj ) {
        jsObj = obj;
    }

    /**
     * Text to show when the search view field is not focused.
     * <p>
     * Default: no hint text
     */
    public native void setHintText( String value )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hinText = value;
    }-*/;

    /**
     * Text to show when the search view field is not focused.
     * <p>
     * Default: no hint text
     */
    public native int getHinText()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hintText;
    }-*/;

    /**
     * Iconifies or expands the search view
     * 
     * see Android Documentation for more details.
     */
    public native void setIconified( boolean value )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.iconified = value;
    }-*/;

    /**
     * Iconifies or expands the search view
     * 
     * see Android Documentation for more details.
     */
    public native boolean isIconified()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.iconified;
    }-*/;

    /**
     * Sets the default or resting state of the search view
     * <p>
     * see Android Documentation for more details.
     * <p>
     * Default: true
     */
    public native void setIconifiedByDefault( boolean value )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.iconifiedByDefault = value;
    }-*/;

    /**
     * Sets the default or resting state of the search view
     * <p>
     * see Android Documentation for more details.
     * <p>
     * Default: true
     */
    public native boolean isIconifiedByDefault()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.iconifiedByDefault;
    }-*/;

    /**
     * Whether to display the submit button when necessary or never display.
     */
    public native void setSubmitEnabled( boolean value )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.submitEnabled = value;
    }-*/;

    /**
     * Whether to display the submit button when necessary or never display.
     */
    public native boolean isSubmitEnabled()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.submitEnabled;
    }-*/;

    /**
     * Value of the search view.
     * <p>
     * This value cannot be set until after the search view is created.
     */
    public native void setValue( String value )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.value = value;
    }-*/;

    /**
     * Causes the search view to lose focus.
     */
    public native void blur()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.blur();
    }-*/;

    /**
     * Causes the search view to lose focus.
     */
    public native void focus()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.focus();
    }-*/;

    /**
     * Value of the search view.
     * <p>
     * This value cannot be set until after the search view is created.
     */
    public native String getValue()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.value;
    }-*/;

    public void addBlurHandler( EventHandler handler ) {
        this.addEventHandler( "blur", handler );
    }

    public void addCancelHandler( EventHandler handler ) {
        this.addEventHandler( "cancel", handler );
    }

    public void addChangeHandler( EventHandler handler ) {
        this.addEventHandler( "change", handler );
    }

    public void addFocusHandler( EventHandler handler ) {
        this.addEventHandler( "focus", handler );
    }

    public void addSubmitHandler( EventHandler handler ) {
        this.addEventHandler( "submit", handler );
    }

    public static SearchView cast( JsObject peer ) {
        return new SearchView( peer.getJsObj() );
    }

    private native JavaScriptObject createPeer( String elId, List<String> classes )/*-{
		var cls = @com.ait.toolkit.titanium.mobile.client.ui.UI::_createClassList(Ljava/util/List;)(classes);
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.UI::createIfPossible(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)('Titanium.UI.Android.SearchView', elId, classes)
		return obj || Ti.UI.Android.createSearchView({
			id : elId,
			"class" : cls
		});
    }-*/;

}
