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
package com.ait.toolkit.titanium.mobile.client.core.events;

import com.ait.toolkit.titanium.mobile.client.android.Menu;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuEvent extends TiEvent {

    public MenuEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native Menu getMenu() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.menu;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
