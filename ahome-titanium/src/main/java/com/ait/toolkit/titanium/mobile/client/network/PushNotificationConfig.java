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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * Config Object for pushnotification
 * 
 */
public class PushNotificationConfig extends JsObject {

    private JsArrayNumber types;

    public PushNotificationConfig() {
        jsObj = JsoHelper.createObject();
        this.types = JsArrayNumber.createArray().cast();
    }

    public JsArrayNumber getTypes() {
        return this.types;
    }

    public void setTypes(JsArrayNumber types) {
        this.types = types;
        _setTypes(types);
    }

    private native void _setTypes(JsArrayNumber values)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.types = values;
    }-*/;

    /**
     * Callback function invoked upon receiving a new push notification.
     * 
     * @param callback
     */
    public native void setCallback(PushNotificationCallback callback)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.callback = function(d) {
			var data = @com.ait.toolkit.titanium.mobile.client.network.PushNotificationData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
			callback.@com.ait.toolkit.titanium.mobile.client.network.PushNotificationCallback::onReceived(Lcom/ait/toolkit/titanium/mobile/client/network/PushNotificationData;)(data);
		};

		obj.error = function(e) {
			var error = @com.ait.toolkit.titanium.mobile.client.network.PushNotificationError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			callback.@com.ait.toolkit.titanium.mobile.client.network.PushNotificationCallback::onError(Lcom/ait/toolkit/titanium/mobile/client/network/PushNotificationError;)(error);
		};

		obj.success = function(s) {
			var success = @com.ait.toolkit.titanium.mobile.client.network.PushNotificationSuccess::new(Lcom/google/gwt/core/client/JavaScriptObject;)(s);
			callback.@com.ait.toolkit.titanium.mobile.client.network.PushNotificationCallback::onSuccess(Lcom/ait/toolkit/titanium/mobile/client/network/PushNotificationSuccess;)(success);
		};
    }-*/;

}
