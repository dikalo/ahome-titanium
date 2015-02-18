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

import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.ui.View;

/**
 * Map view is used for embedding native mapping capabilities as a view in your
 * application.
 * <p>
 * With native maps, you can control the mapping location, the type of map, the
 * zoom level and you can add custom annotations and routes directly to the map.
 * Once the map view is displayed, the user can pan, zoom and tilt the map using
 * the native control gestures.
 * <p>
 * All latitude and longitude values are specified in decimal degrees. Values in
 * degrees, minutes and seconds (DMS) must be converted to decimal degrees
 * before being passed to the map view.
 * <p>
 * You can add Annotation objects to the map to mark points of interest. An
 * annotation has two states: selected and deselected. A deselected annotation
 * is marked by a pin image. When selected, the full annotation is displayed,
 * typically including a title and an optional subtitle.
 * <p>
 * You can add Route objects to the map to create paths between two or more
 * points of interest.
 */
public class GMapView extends View {

    public GMapView() {
        jsObj = GMap.get().createView();
    }

    public native boolean isAnimate()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.animate;
    }-*/;

    public native void setAnimate(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.animate = value;
    }-*/;

    public native boolean enableZoomControls()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.enableZoomControls;
    }-*/;

    public native void setEnableZoomControls(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.enableZoomControls = value;
    }-*/;

    public native List<GMapAnnotation> getAnnotations()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.annotations;
		return @com.ait.toolkit.titanium.mobile.modules.gmap.client.GMapAnnotation::fromArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setAnnotations(List<GMapAnnotation> values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.annotations = @com.ait.toolkit.titanium.mobile.modules.gmap.client.GMapAnnotation::fromList(Ljava/util/List;)(values);
    }-*/;

    public void setAnnotations(GMapAnnotation... values) {
        setAnnotations(Arrays.asList(values));
    }

    public native int getMapType()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.mapType;
    }-*/;

    public native void setMapType(int value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.mapType = value;
    }-*/;

    public native boolean isTrafic()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.trafic;
    }-*/;

    public native void setTrafic(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.trafic = value;
    }-*/;

    public native boolean isUserlocation()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.userLocation;
    }-*/;

    public native void setUserlocation(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.userLocation = value;
    }-*/;

    public native GMapRegionType getRegion()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.region;
		return @com.ait.toolkit.titanium.mobile.modules.gmap.client.GMapRegionType::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setRegion(GMapRegionType value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.region = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void addAnnotation(GMapAnnotation value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addAnnotation(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void addAnnotations(List<GMapAnnotation> values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addAnnotation(@com.ait.toolkit.titanium.mobile.modules.gmap.client.GMapAnnotation::fromList(Ljava/util/List;)(values));
    }-*/;

    public void addAnnotations(GMapAnnotation... annotations) {
        this.addAnnotations(Arrays.asList(annotations));
    }

    public native void addRoute(GMapRoute value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addRoute(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void deselectAnnotation(GMapAnnotation value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.deselectAnnotation(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void deselectAnnotation(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deselectAnnotation(value);
    }-*/;

    public native void removeAnnotation(GMapAnnotation value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeAnnotation(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void removeAnnotations(List<GMapAnnotation> values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeAnnotations(@com.ait.toolkit.titanium.mobile.modules.gmap.client.GMapAnnotation::fromList(Ljava/util/List;)(values));
    }-*/;

    public void removeAnnotations(GMapAnnotation... annotations) {
        this.removeAnnotations(Arrays.asList(annotations));
    }

    public native void removeRoute(GMapRoute value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeRoute(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void selectAnnotation(GMapAnnotation value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.delectAnnotation(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void selectAnnotation(String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selectAnnotation(value);
    }-*/;

    /**
     * Fired when the map completes loading.
     */
    public void addCompleteHandler(EventHandler handler) {
        this.addEventHandler("complete", handler);
    }

    /**
     * Fired when the user interacts with a draggable annotation.
     */
    public native CallbackRegistration addPinchChangedDragStateHandler(PinchChangedDragStateHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.modules.gmap.client.PinchChangedDragStateEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.modules.gmap.client.PinchChangedDragStateHandler::onPinchChangedDragState(Lcom/ait/toolkit/titanium/mobile/modules/gmap/client/PinchChangedDragStateEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.modules.gmap.client.PinchChangedDragStateEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /**
     * Fired when the mapping region changes.
     */
    public native CallbackRegistration addRegionChangedHandler(RegionChangedHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.modules.gmap.client.RegionChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.modules.gmap.client.RegionChangedHandler::onRegionChanged(Lcom/ait/toolkit/titanium/mobile/modules/gmap/client/RegionChangedEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.modules.gmap.client.RegionChangedEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

}
