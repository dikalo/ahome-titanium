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
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.RefreshStartHandler;
import com.ait.toolkit.titanium.mobile.client.ui.ios.AttributedString;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The RefreshControl is a representation of the native UIRefreshControl.
 * <p>
 * You use a RefreshControl with a {@link TableView} or {@Link ListView}
 * object. It provides an alternate method to implement pull to refresh
 * functionality provided by Titanium.UI.TableView.headerPullView and
 * Titanium.UI.ListView.pullView properties.
 */
public class RefreshControl extends EventDispatcher {

    public RefreshControl() {
        createPeer();
    }

    public RefreshControl( String id ) {
        this( id, new ArrayList<String>() );
    }

    public RefreshControl( String id, List<String> classes ) {
        jsObj = UI.createRefreshControl( id, classes );
    }

    RefreshControl( JavaScriptObject proxy ) {
        jsObj = proxy;
    }

    /**
     * @return A titanium.ui.view. allows for arbitrary contents inside a native
     *         dialog. works for any dialog. (android)
     * @platforms android
     */
    public native String getTintColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.tintColor;
    }-*/;

    public native void setTintColor( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.tintColor = value;
    }-*/;

    public native AttributedString getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.attributedString;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.ios.AttributedString::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    /**
     * Tells the control that a refresh operation was started programmatically.
     * <p
     * Call this method when an external event source triggers a programmatic
     * refresh of your table. This method updates the state of the refresh
     * control to reflect the in-progress refresh operation. When the refresh
     * operation ends, be sure to call the endRefreshing method to return the
     * control to its default state.
     */
    public native void beginRefreshing() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.beginRefreshing();
    }-*/;

    /**
     * Tells the control that a refresh operation has ended.
     * <p>
     * Call this method at the end of any refresh operation (whether it was
     * initiated programmatically or by the user) to return the refresh control
     * to its default state.
     */
    public native void endRefreshing() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.endRefreshing();
    }-*/;

    public native CallbackRegistration addRefreshStartHandler(
            RefreshStartHandler handler ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.RefreshStartEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.RefreshStartHandler::onRefreshStart(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/RefreshStartEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.RefreshStartEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    private void createPeer() {
        jsObj = UI.createRefreshControl( "", new ArrayList<String>() );
    }

    public static RefreshControl from( JsObject proxy ) {
        return new RefreshControl( proxy.getJsObj() );
    }

}
