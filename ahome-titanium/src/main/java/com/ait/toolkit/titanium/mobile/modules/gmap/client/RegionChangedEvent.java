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
package com.ait.toolkit.titanium.mobile.modules.gmap.client;

import com.ait.toolkit.titanium.mobile.client.core.events.Event;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * Fired when the mapping region changes.
 */
public class RegionChangedEvent extends Event {

    public static String EVENT_NAME = "regionchanged";

    /**
     * UiBinder implementations
     */
    private static Type<RegionChangedHandler> TYPE = new Type<RegionChangedHandler>(EVENT_NAME, null);

    public static Type<RegionChangedHandler> getType() {
        return TYPE;
    }

    public static Type<RegionChangedHandler> getAssociatedType() {
        return TYPE;
    }

    protected RegionChangedEvent() {

    }

    private RegionChangedEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    public native double getLatitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.latitude;
    }-*/;

    public native double getLongitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.longitude;
    }-*/;

    public static RegionChangedEvent cast(ClickEvent event) {
        return new RegionChangedEvent(event.getJsObj());
    }

}
