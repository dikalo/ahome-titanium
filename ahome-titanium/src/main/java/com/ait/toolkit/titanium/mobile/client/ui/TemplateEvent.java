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
package com.ait.toolkit.titanium.mobile.client.ui;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;

public class TemplateEvent extends JsObject {

    public TemplateEvent() {
        jsObj = JsoHelper.createObject();
    }

    public TemplateEvent( JavaScriptObject obj ) {
        super( obj );
    }

    public static TemplateEvent from( JsObject proxy ) {
        return new TemplateEvent( proxy.getJsObj() );
    }

    public native void addHandler(String event, EventHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso[event] = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/TiEvent;)(eventObject);
		}
    }-*/;

}
