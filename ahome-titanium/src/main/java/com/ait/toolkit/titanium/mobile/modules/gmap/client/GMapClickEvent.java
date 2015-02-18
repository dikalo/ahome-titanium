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

import com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Fired when the user selects, deselects, or clicks on an annotation.
 * 
 * Note that the click event is not fired every time the user clicks on the map.
 * It is fired in two circumstances:
 * <ul>
 * <li>If the user clicks on an annotation to select it.</li>
 * <li>The user deselects an annotation.</li>
 * </ul>
 * 
 */
public class GMapClickEvent extends ClickEvent {

    protected GMapClickEvent() {

    }

    private GMapClickEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    /**
     * Annotation source object.
     */
    public native GMapAnnotation getAnnotation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.annotation;
		return @com.ait.toolkit.titanium.mobile.modules.gmap.client.GMapAnnotation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native GMapAnnotation getClickSource() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.clicksource;
		return @com.ait.toolkit.titanium.mobile.modules.gmap.client.GMapAnnotation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native String getClickSourceAsstring() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.clicksource;
    }-*/;

    public native double getLatitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.latitude;
    }-*/;

    public native double getLongitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.longitude;
    }-*/;

    public native GMapView getMap() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.map;
		return @com.ait.toolkit.titanium.mobile.modules.gmap.client.GMapView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native String getSubtitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.subtitle;
    }-*/;

    public native String getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.title;
    }-*/;

    public static GMapClickEvent cast(ClickEvent event) {
        return new GMapClickEvent(event.getJsObj());
    }

}
