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
package com.ait.toolkit.titanium.mobile.client.core.events.cloudpush;

import com.ait.toolkit.titanium.mobile.client.core.handlers.cloudpush.CloudPushCallbackHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class CloudPushCallbackEvent extends CloudPushEvent {


	/**
	 * UiBinder implementations
	 */
	private static Type<CloudPushCallbackHandler> TYPE = new Type<CloudPushCallbackHandler>("cloudpushcallback", null);
	
	public static Type<CloudPushCallbackHandler> getAssociatedType() {
		return TYPE;
	}
	
    CloudPushCallbackEvent(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * A JSON string of your data payload. Use JSON.parse to turn this in to an
     * object you can use.
     * 
     * @return
     */
    public native String getPayLoad()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.payload;
    }-*/;

}
