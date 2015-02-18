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
package com.ait.toolkit.titanium.mobile.client.cloud;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.cloud.CloudStreamHandler;

/**
 * The top level Cloud module.
 * <p>
 * 
 * The Cloud module is used for connecting your application with Appcelerator
 * Cloud Services (ACS).
 * <p>
 * Note that this module is not included in the Titanium namespace, but it is
 * bundled with the Titanium SDK as of version 2.0.0.
 * <p>
 * To use it, you must require it, like this: <br>
 * {@code
 *   Cloud.get();
 * }
 * 
 */
public class Cloud extends TiModule {

    private static final Cloud INSTANCE = new Cloud();

    public static Cloud get() {
        return INSTANCE;
    }

    private Cloud() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeCloud();
    }

    /**
     * Indicates if internal debug logging should be output to the console.
     * <p>
     * Defaults to: False
     * 
     * @return
     */
    public native boolean isDebug()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.debug;
    }-*/;

    /**
     * set if debug logging should be output to the console.
     */
    public native void setDebug(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.debug = value;
    }-*/;

    /**
     * Indicates whether to use SSL when sending requests to ACS.
     * 
     * Defaults to: True
     */
    public native boolean useSecure()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.useSecure;
    }-*/;

    /**
     * set if debug logging should be output to the console.
     */
    public native void setUseSecure(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.useSecure = value;
    }-*/;

    /**
     * Function to be called at regular intervals as the request data is being
     * received.
     * <p>
     * Set this property before calling any ACS method for which you want to
     * track the transmission.
     * <p>
     * When you are done tracking the transmission, set this to null.
     */
    public native void setOnDataStream(CloudStreamHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.ondatastream = function(e) {
			var obj = @com.ait.toolkit.titanium.mobile.client.core.events.cloud.CloudStreamProgressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.cloud.CloudStreamHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/cloud/CloudStreamProgressEvent;)(obj);
		};
    }-*/;

    /**
     * 
     Function to be called at regular intervals as the request data is being
     * transmitted.
     * <p>
     * Set this property before calling any ACS method for which you want to
     * track the transmission.
     * <p>
     * When you are done tracking the transmission, set this to null.
     */
    public native void setOnSendStream(CloudStreamHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.onsendstream = function(e) {
			var obj = @com.ait.toolkit.titanium.mobile.client.core.events.cloud.CloudStreamProgressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.cloud.CloudStreamHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/cloud/CloudStreamProgressEvent;)(obj);
		};
    }-*/;

}
