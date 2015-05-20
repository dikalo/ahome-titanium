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
package com.ait.toolkit.titanium.mobile.client.ui.iphone;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.ait.toolkit.titanium.mobile.client.ui.Window;

/**
 * A navigation group implements a specialized view that manages the navigation
 * of hierarchical content. the navigation group is created by the method
 * {@link com.ait.toolkit.titanium.mobile.client.ui.iphon.IPhone.createNavigationGroup}
 * . (http://img.skitch.com/20100406-rwe44533tkd94fdnbqqudxynpe.png) a
 * navigation group is very similar to tab bars with the exception that they do
 * not maintain a group of windows with a interface bar at the bottom.
 * <p>
 * The window property must be set initially in the constructor when creating a
 * navigation group to the root level window. All Navigation Groups must have at
 * least one root window that cannot be removed.
 */
public class NavigationGroup extends View {

    public NavigationGroup( Window rootWindow ) {
        create( rootWindow );
    }

    public NavigationGroup( String id, Window rootWindow ) {
        this( id, new ArrayList<String>(), rootWindow );
    }

    public NavigationGroup( String id, List<String> classes, Window rootWindow ) {
        jsObj = IPhone.get().createNavigationGroup( id, classes, rootWindow );
    }

    /**
     * Close a window and remove it from the navigation group
     * 
     * @param window
     *            window to close
     */
    public native void close( Window window ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.close(window.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Close a window and remove it from the navigation group
     * 
     * @param window
     *            window to close
     * @param animate
     *            , indicates if the window should be closed animated (default)
     *            or not.
     * */

    public native void close( Window window, boolean animate ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.close(window.@com.ait.toolkit.core.client.JsObject::getJsObj()(), {
			animated : animate
		});
    }-*/;

    /**
     * Open a window within the navigation group
     * 
     * @param window
     *            window to open within the tab group
     * @param properties
     *            optional dictionary. the only current property supported is
     *            `animated` which is a boolean to indicate if the window should
     *            be opened animated (default) or not.
     */
    public native void open( Window window ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.open(window.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Open a window within the navigation group
     * 
     * @param window
     *            window to open within the tab group
     * @param animate
     *            indicates if the window should be opened animated (default) or
     *            not.
     */
    public native void open( Window window, boolean animate ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.open(window.@com.ait.toolkit.core.client.JsObject::getJsObj()(), {
			animated : animate
		});
    }-*/;

    /**
     * Window to add to this navigation group.
     */
    public native Window getWindow()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.window;
		return @com.ait.toolkit.titanium.mobile.client.ui.Window::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    @Override
    public void createPeer() {
        // jsObj = IPhone.get().createNavigationGroup();
    }

    public void create( Window rootwindow ) {
        jsObj = IPhone.get().createNavigationGroup( "", new ArrayList<String>(), rootwindow );
    }
}
