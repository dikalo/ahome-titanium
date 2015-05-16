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
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TabGroupHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The tab group allows you to manage a tabbed ui of one or more windows.
 * <p>
 * Note that when opening a tab group, if one or more of its tabs have been set
 * 'active' prior to opening, or if setActiveTab() has been called while a tab
 * is 'active', the result of which tab is initially selected is undefined.
 * 
 */
public class TabGroup extends View {

    public TabGroup() {
        createPeer();
    }

    public TabGroup( String id ) {
        this( id, new ArrayList<String>() );
    }

    public TabGroup( String id, List<String> classes ) {
        jsObj = UI.createTabGroup( id, classes );
    }

    TabGroup( JavaScriptObject obj ) {
        jsObj = obj;
    }

    /**
     * @return The active tab
     */
    public native Tab getActiveTab() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.activeTab;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Tab::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setActiveTab( Tab value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setActiveTab(value);
    }-*/;

    public native void setActiveTab( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setActiveTab(value);
    }-*/;

    /**
     * @return Whether or not the user can configure the tab group via the
     *         'more' tab's edit functionality. iphone/ipad only
     * 
     */
    public native boolean allowUserCustomization() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allowUserCustomization;
    }-*/;

    public native void setAllowUserCustomization( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.allowUserCustomization = value;
    }-*/;

    /**
     * @return The default navigation bar color (typically for the "more" tab)
     */
    public native String getBarColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.barColor;
    }-*/;

    public native void setBarColor( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.barColor = value;
    }-*/;

    /**
     * @return The title for the 'more' tab edit button. iphone/ipad only
     * @platforms iphone, ipad
     */
    public native String getEditButtonTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.editButtonTitle;
    }-*/;

    public native void setEditButtonTitle( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.editButtonTitle = value;
    }-*/;

    /**
     * @return Array of tab objects that are managed by the tab group
     */
    public ArrayList<Tab> getTabs() {
        ArrayList<Tab> labels = new ArrayList<Tab>();
        JsArray<JavaScriptObject> values = _getTabs();
        for( int i = 0; i < values.length(); i++ ) {
            labels.add( new Tab( values.get( i ) ) );
        }
        return labels;
    }

    public void setTabs( ArrayList<Tab> tabs ) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for( Tab element : tabs ) {
            values.push( element.getJsObj() );
        }
        _setTabs( values );
    }

    public void setTabs( Tab... tabs ) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for( Tab element : tabs ) {
            values.push( element.getJsObj() );
        }
        _setTabs( values );
    }

    private native JsArray<JavaScriptObject> _getTabs() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.tabs;
    }-*/;

    private native void _setTabs( JsArray<JavaScriptObject> value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.tabs = value;
    }-*/;

    /**
     * @return Android only
     */
    public native int getWindowSoftInputMode() /*-{
		return jso.windowSoftInputMode;
    }-*/;

    public native void setWindowSoftInputMode( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.windowSoftInputMode = value;
    }-*/;

    /**
     * Add a tab to the tab group
     * 
     * @param tab The tab to add
     */
    public native void addTab( Tab tab ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addTab(tab.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Close the tab group and remove it from the ui
     */
    public native void close() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.close();
    }-*/;

    /**
     * Open the tab group and make it visible
     */
    public native void open() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.open();
    }-*/;

    /**
     * Open the tab group and make it visible
     */
    public native void open( Animation animation ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.open(animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Remove a tab from the tab group
     */
    public native void removeTab() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeTab();
    }-*/;

    public native void addBlurHandler( TabGroupHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::BLUR,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tab.TabEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TabGroupHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tab/TabEvent;)(eventObject);
						});
    }-*/;

    public native void addCloseHandler( TabGroupHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::CLOSE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tab.TabEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TabGroupHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tab/TabEvent;)(eventObject);
						});
    }-*/;

    public native void addFocusHandler( TabGroupHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.tab.TabEvent::FOCUS,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tab.TabEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TabGroupHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tab/TabEvent;)(eventObject);
						});
    }-*/;

    public native void addOpenHandler( TabGroupHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::OPEN,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tab.TabEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TabGroupHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tab/TabEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createTabGroup( "", new ArrayList<String>() );
    }

    public static TabGroup from( JsObject proxy ) {
        return new TabGroup( proxy.getJsObj() );
    }

}
