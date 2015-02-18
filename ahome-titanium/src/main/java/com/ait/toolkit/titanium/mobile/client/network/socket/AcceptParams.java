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
package com.ait.toolkit.titanium.mobile.client.network.socket;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;

public class AcceptParams extends JsObject {

    /**
     * Creates a new, empty instance of AcceptParams
     */
    public AcceptParams() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * @return The timeout for connect() and all i/o write() operations. cannot
     *         be modified when not in the initialized state
     */
    public native double getTimeout() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return this.timeout;
    }-*/;

    public native void setTimeout(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.timeout = value;
    }-*/;

    /**
     * @return The callback to be fired after the socket enters the error state
     */
    public native void setError(ErrorCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.error = function(e) {
			var obj = @com.ait.toolkit.titanium.mobile.client.network.socket.ErrorCallbackArgs::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			callback.@com.ait.toolkit.titanium.mobile.client.network.socket.ErrorCallback::onError(Lcom/ait/toolkit/titanium/mobile/client/network/socket/ErrorCallbackArgs;)(obj);
		};
    }-*/;

}
