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

package com.ait.toolkit.titanium.mobile.client.core.events.ui.email;

import com.ait.toolkit.titanium.mobile.client.core.events.TiEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class EmailCompleteEvent extends TiEvent {

    public static final String COMPLETE = "complete";

    protected EmailCompleteEvent() {

    }
    
    
    private EmailCompleteEvent(JavaScriptObject obj){
    	jsObj = obj;
    }

    /**
     * result status either as SENT, SAVED, CANCELLED or FAILED. (Note:
     * AndroidMedia result will be SENT even if user discards or saves the
     * message. SAVED and CANCELLED are not supported on AndroidMedia.)
     */
    public final native int getResult() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.result;
    }-*/;

    /**
     * boolean to indicate if the email was successfully sent
     */
    public final native boolean isSuccess() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.success;
    }-*/;

    /**
     * string message of the error or null if successfully sent
     */
    public final native String getError() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.error;
    }-*/;

}
