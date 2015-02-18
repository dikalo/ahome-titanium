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

package com.ait.toolkit.titanium.mobile.client.core.events.ui.text;

import com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent;
import com.ait.toolkit.titanium.mobile.client.ui.TextRange;

public class TextSelectedEvent extends UIEvent {

    public static final String SELECTED = "selected";

    protected TextSelectedEvent() {

    }

    /**
     * the range of text. range is an object with the properties location and
     * length.
     */
    public final native TextRange getRange() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.contentSize;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.TextRange::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
