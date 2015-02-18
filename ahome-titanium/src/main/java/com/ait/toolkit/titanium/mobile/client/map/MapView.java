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
package com.ait.toolkit.titanium.mobile.client.map;

import java.util.ArrayList;

import com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeoErrorHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.RegionChangeHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.loading.LoadCompleteHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.loading.LoadHandler;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The mapview is an object created by
 * {@link com.ait.toolkit.titanium.mobile.client.map.Map.createmapview} and is used
 * for embedding native mapping capabilities as a view in your application. with
 * native maps, you can control the mapping location, the type of map, the zoom
 * level and you can add custom annotations directly to the map.
 * <p>
 * For AndroidMedia, you will need to <a
 * href="http://code.google.com/android/maps-api-signup.html">obtain a map key
 * from Google</a> to use maps in your application. On iPhone, you cannot call
 * any methods on a map view until it has been added to a view.
 */
public class MapView extends View {

    public MapView() {
        jsObj = createNative();
    }

    private MapView(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Boolean is mapping actions should be animated
     */
    public native boolean isAnimate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.animate;
    }-*/;

    public native void setAnimate(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.animate = value;
    }-*/;

    /**
     * @return A List of annotations to add to the map
     */
    public ArrayList<Annotation> gtAnnotation() {
        ArrayList<Annotation> result = new ArrayList<Annotation>();
        JsArray<JavaScriptObject> nativeAnnotations = _getAnnotations();
        for (int i = 0; i < nativeAnnotations.length(); i++) {
            result.add(new Annotation(nativeAnnotations.get(i)));
        }
        return result;
    }

    private native JsArray<JavaScriptObject> _getAnnotations() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.annotations;
    }-*/;

    public void setAnnotations(ArrayList<Annotation> annotations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Annotation annot : annotations) {
            values.push(annot.getJsObj());
        }
        _setAnnotations(values);
    }

    public void setAnnotations(Annotation... annotations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Annotation annot : annotations) {
            values.push(annot.getJsObj());
        }
        _setAnnotations(values);
    }

    private native void _setAnnotations(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.annotations = value;
    }-*/;

    /**
     * @return The map type constant.
     */
    public native int getMapType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.mapType;
    }-*/;

    public native void setMapType(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.mapType = value;
    }-*/;

    /**
     * @return A dictionary that specifies the following properties specifying
     *         the region location to set the map: `latitudedelta`,
     *         `longitudedelta`, `latitude`, `longitude`.
     */
    public native Region getRegion() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.region;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.map.Region::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setRegion(Region value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.region = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return Boolean to indicate if the map should attempt to fit the map view
     *         into the region in the visible view
     */
    public native boolean isRegionFit() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.regionFit;
    }-*/;

    public native void setRegionFit(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.regionFit = value;
    }-*/;

    /**
     * @return Boolean to indicate if the map should show the user's current
     *         device location as a pin on the map
     */
    public native boolean showUserLocation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.userLocation;
    }-*/;

    public native void setUserLocation(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.userLocation = value;
    }-*/;

    /**
     * Add a new annotation to the map
     * 
     * @param annotation either a dictionary of properties for the annotation or
     *            a {@link org.urish.gwtit.titanium.map.Annotation} instance.
     */
    public native void addAnnotation(Annotation annotation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addAnnotation(annotation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Add one or more new annotation to the map
     * 
     * @param annotations an array of either a dictionary of properties for the
     *            annotation or a
     *            [Titanium.Map.Annotation](Titanium.Map.Annotation) instance.
     */

    public void addAnnotations(ArrayList<Annotation> annotations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Annotation annot : annotations) {
            values.push(annot.getJsObj());
        }
        _addAnnotations(values);
    }

    public void addAnnotations(Annotation... annotations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Annotation annot : annotations) {
            values.push(annot.getJsObj());
        }
        _addAnnotations(values);
    }

    private native void _addAnnotations(JsArray<JavaScriptObject> annotations) /*-{
		jso.addAnnotations(annotations);
    }-*/;

    /**
     * Add a route. currently only supported on iphone
     * 
     * @param route dictionary with the properties: `name` route name, `points`
     *            dictionary of values with longitude and latitude keys, `color`
     *            for the line color and `width` for the line width.
     */
    public native void addRoute(Object route) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addRoute(route);
    }-*/;

    /**
     * Cause the annotation to be deselected (hidden).
     * 
     * @param annotation either a string of the annotation title or a
     *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
     */
    public native void deselectAnnotation(Annotation annotation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.deselectAnnotation(annotation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Removes all annotations added to the map
     */
    public native void removeAllAnnotations() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeAllAnnotations();
    }-*/;

    /**
     * Remove an existing annotation from the map
     * 
     * @param annotation either a string of the annotation title or a
     *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
     */
    public native void removeAnnotation(Annotation annotation) /*-{
		jso
				.removeAnnotation(annotation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Remove one or more existing annotations from the map
     * 
     * @param annotation an array of either a string of the annotation title or
     *            a {@link org.urish.gwtit.titanium.map.Annotation} reference.
     */

    public void removeAnnotations(ArrayList<Annotation> annotations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Annotation annot : annotations) {
            values.push(annot.getJsObj());
        }
        _removeAnnotations(values);
    }

    public void removeAnnotations(Annotation... annotations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Annotation annot : annotations) {
            values.push(annot.getJsObj());
        }
        _removeAnnotations(values);
    }

    private native void _removeAnnotations(JsArray<JavaScriptObject> annotation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeAnnotations(annotation);
    }-*/;

    /**
     * Remove a previously added route. currently only supported on iphone
     * 
     * @param route same route object used during addRoute
     */
    public native void removeRoute(Object route) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.removeRoute(route);
    }-*/;

    /**
     * Cause the annotation to be selected (shown).
     * 
     * @param annotation either a string of the annotation title or a
     *            {@link org.urish.gwtit.titanium.map.Annotation} reference.
     */
    public native void selectAnnotation(Annotation annotation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.selectAnnotation(annotation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Set and center the map location.
     * 
     * @param location a dictionary that specifies the following properties
     *            specifying the location to set the map: `latitudeDelta`,
     *            `longitudeDelta`, `latitude`, `longitude`.
     */
    public native void setLocation(Object location) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setLocation(location);
    }-*/;

    /**
     * Zoom in or out of the map
     * 
     * @param level zoom level (can be positive or negative)
     */
    public native void zoom(double level) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.zoom(level);
    }-*/;

    public native void addLoadCompleteHandler(LoadCompleteHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.loading.LoadEvent::COMPLETE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.loading.LoadEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.loading.LoadCompleteHandler::onLoadComplete(Lcom/ait/toolkit/titanium/mobile/client/core/events/loading/LoadEvent;)(eventObject);
						});
    }-*/;

    public native void addErrorHandler(GeoErrorHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ErrorEvent::ERROR,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.geolocation.GeoErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeoErrorHandler::onError(Lcom/ait/toolkit/titanium/mobile/client/core/events/geolocation/GeoErrorEvent;)(eventObject);
						});
    }-*/;

    public native void addLoadingHandler(LoadHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.loading.LoadEvent::LOADING,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.loading.LoadEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.loading.LoadHandler::onLoad(Lcom/ait/toolkit/titanium/mobile/client/core/events/loading/LoadEvent;)(eventObject);
						});
    }-*/;

    public native void addRegionChangedHandler(RegionChangeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.RegionEvent::REGION_CHANGED,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.RegionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.RegionChangeHandler::onRegionChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/RegionEvent;)(eventObject);
						});
    }-*/;

    private static native JavaScriptObject createNative() /*-{
		return Titanium.Map.createView();
    }-*/;

}
