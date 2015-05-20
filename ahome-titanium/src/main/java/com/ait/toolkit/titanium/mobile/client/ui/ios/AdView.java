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
package com.ait.toolkit.titanium.mobile.client.ui.ios;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.handlers.ErrorHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.loading.LoadHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ChangeHandler;
import com.ait.toolkit.titanium.mobile.client.ui.View;

/**
 * The adview is a view for display apple iads. the view is created by the
 * method {@link com.ait.toolkit.titanium.mobile.client.ui.ios.IOS.createAdView}.
 */
public class AdView extends View {

    public static String SIZE_320x50 = SIZE_320x50();
    public static String SIZE_480x32 = SIZE_480x32();

    public AdView() {
        createPeer();
    }

    public AdView( String id ) {
        this( id, new ArrayList<String>() );
    }

    public AdView( String id, List<String> classes ) {
        jsObj = IOS.get().createAdView( id, classes );
    }

    /**
     * A banner view action can cover your application's user interface.
     * however, your application continues to run, and receives events normally.
     * if your application receives an event that requires the user's attention,
     * it can programmatically cancel the action and uncover its interface by
     * calling cancelaction. canceling actions frequently can cause a loss of
     * revenue for your application.
     */
    public native void cancelAction() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.cancelAction();
    }-*/;

    public native void addChangeHandler( ChangeHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ChangeHandler::onChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/UIEvent;)(eventObject);
						});
    }-*/;

    public native void addErrorHandler( ErrorHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ErrorEvent::ERROR,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ErrorHandler::onError(Lcom/ait/toolkit/titanium/mobile/client/core/events/ErrorEvent;)(eventObject);
						});
    }-*/;

    public native void addLoadHandler( LoadHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.loading.LoadEvent::LOAD,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.loading.LoadEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.loading.LoadHandler::onLoad(Lcom/ait/toolkit/titanium/mobile/client/core/events/loading/LoadEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = IOS.get().createAdView( "", new ArrayList<String>() );
    }

    /**
     * @return Constant for 320x50 ad sizes
     */
    private static native String SIZE_320x50() /*-{
		return Titanium.UI.iOS.AdView.SIZE_320x50;
    }-*/;

    /**
     * @return Constant for 480x32 ad sizes
     */
    private static native String SIZE_480x32() /*-{
		return Titanium.UI.iOS.AdView.SIZE_480x32;
    }-*/;

}
