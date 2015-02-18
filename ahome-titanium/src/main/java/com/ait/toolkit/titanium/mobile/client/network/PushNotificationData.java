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
package com.ait.toolkit.titanium.mobile.client.network;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A simple object representing a push notification.
 * 
 */
public class PushNotificationData extends JsObject {

    protected PushNotificationData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The userinfo dictionary passed to the Apple Push Notification Service.
     * <p>
     * For more information, see the following item in the iOS Developer
     * Library:
     * <p>
     * application:didReceiveRemoteNotification in the UIApplicationDelegate
     * Protocol Reference
     * 
     * @return
     */
    public native JavaScriptObject getData()/*-{
		var obj = thi.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return obj.data;
    }-*/;

    public native boolean inBackground()/*-{
		var obj = thi.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return obj.inBackground;
    }-*/;

}
