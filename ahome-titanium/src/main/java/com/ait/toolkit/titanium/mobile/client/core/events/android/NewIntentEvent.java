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
package com.ait.toolkit.titanium.mobile.client.core.events.android;

import com.ait.toolkit.titanium.mobile.client.android.Intent;
import com.ait.toolkit.titanium.mobile.client.core.events.TiEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class NewIntentEvent extends TiEvent {

    public static final String NEW_INTENT = "newIntent";

    protected NewIntentEvent() {

    }

    private NewIntentEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native Intent getIntent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.intent;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
