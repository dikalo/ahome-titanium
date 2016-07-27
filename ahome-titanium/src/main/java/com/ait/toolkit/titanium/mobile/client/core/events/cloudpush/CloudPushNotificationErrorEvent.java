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

import com.ait.toolkit.titanium.mobile.client.cloudpush.CloudPushNotificationErrorHandler;
import com.ait.toolkit.titanium.mobile.client.core.events.Event;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * An event object passed to the retrieveDeviceToken error callback.
 */
public class CloudPushNotificationErrorEvent extends Event {

	/**
	 * UiBinder implementations
	 */
	private static Type<CloudPushNotificationErrorHandler> TYPE = new Type<CloudPushNotificationErrorHandler>("cloudpushnotificationerror", null);
	public static Type<CloudPushNotificationErrorHandler> getType() {
		return TYPE;
	}
	
	public static Type<CloudPushNotificationErrorHandler> getAssociatedType() {
		return TYPE;
	}
	
    public CloudPushNotificationErrorEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The description of the error
     * 
     * @return
     */
    public native String getError()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.error;
    }-*/;

}
