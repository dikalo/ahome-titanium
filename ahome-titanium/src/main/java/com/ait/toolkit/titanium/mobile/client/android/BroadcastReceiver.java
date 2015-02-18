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
package com.ait.toolkit.titanium.mobile.client.android;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an Android Broadcast Receiver.
 * <p>
 * This object is used for broadcast receivers.
 * <p>
 * See the official Android documentation on Broadcast Receivers. for an
 * overview of how broadcast receivers are used.
 * <p>
 * Broadcast receivers can be created with an onReceived callback or a url
 * property that refers to a js file with code to handle broadcasts. If both url
 * and onReceived properties are defined, the url property takes precedence.
 */
public class BroadcastReceiver extends EventDispatcher {

    public BroadcastReceiver() {
        jsObj = createPeer();
    }

    public BroadcastReceiver(Function onreceivedHandler) {
        jsObj = createPeer(onreceivedHandler);
    }

    public BroadcastReceiver(String url, Function onreceivedHandler) {
        this(onreceivedHandler);
        setUrl(url);
    }

    public BroadcastReceiver(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Sets the value of the url property.
     */
    public native void setUrl(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.url = value;
    }-*/;

    /**
     * Gets the value of the url property.
     */
    public native String getUrl() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.url;
    }-*/;

    /**
     * The function called when a broadcast is received.
     */
    public native void setOnReceived(Function callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.onReceived = function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		};
    }-*/;

    private native JavaScriptObject createPeer()/*-{
		return Ti.Android.createBroadcastReceiver();
    }-*/;

    private native JavaScriptObject createPeer(Function onReceivedHandler)/*-{
		return Ti.Android
				.createBroadcastReceiver(function() {
					onReceivedHandler.@com.ait.toolkit.core.client.Function::execute()();
				});
    }-*/;

}
