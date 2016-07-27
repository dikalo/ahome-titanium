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
package com.ait.toolkit.titanium.mobile.client.geolocation;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.events.CalibrationEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.EventListener;
import com.ait.toolkit.titanium.mobile.client.core.events.geolocation.HeadingEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.geolocation.LocationEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeoHeadingHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeolocationHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level geolocation module. the geolocation module is used for
 * accessing device location based information.
 * 
 */
public class Geolocation extends TiModule {

	public static final int GEOLOCATION_ACCURACY_BEST = ACCURACY_BEST();
	public static final int GEOLOCATION_ACCURACY_HUNDRED_METERS = ACCURACY_HUNDRED_METERS();
	public static final int GEOLOCATION_ACCURACY_KILOMETER = ACCURACY_KILOMETER();
	public static final int GEOLOCATION_ACCURACY_NEAREST_TEN_METERS = ACCURACY_NEAREST_TEN_METERS();
	public static final int GEOLOCATION_ACCURACY_THREE_KILOMETERS = ACCURACY_THREE_KILOMETERS();
	public static final int GEOLOCATION_AUTHORIZATION_AUTHORIZED = AUTHORIZATION_AUTHORIZED();
	public static final int GEOLOCATION_AUTHORIZATION_DENIED = AUTHORIZATION_DENIED();
	public static final int GEOLOCATION_AUTHORIZATION_RESTRICTED = AUTHORIZATION_RESTRICTED();
	public static final int GEOLOCATION_AUTHORIZATION_UNKNOWN = AUTHORIZATION_UNKNOWN();
	public static final int GEOLOCATION_ERROR_DENIED = ERROR_DENIED();
	public static final int GEOLOCATION_ERROR_HEADING_FAILURE = ERROR_HEADING_FAILURE();
	public static final int GEOLOCATION_ERROR_LOCATION_UNKNOWN = ERROR_LOCATION_UNKNOWN();
	public static final int GEOLOCATION_ERROR_NETWORK = ERROR_NETWORK();
	public static final int GEOLOCATION_ERROR_REGION_MONITORING_DELAYED = ERROR_REGION_MONITORING_DELAYED();
	public static final int GEOLOCATION_ERROR_REGION_MONITORING_DENIED = ERROR_REGION_MONITORING_DENIED();
	public static final int GEOLOCATION_ERROR_REGION_MONITORING_FAILURE = ERROR_REGION_MONITORING_FAILURE();
	public static final String GEOLOCATION_PROVIDER_GPS = PROVIDER_GPS();
	public static final String GEOLOCATION_PROVIDER_NETWORK = PROVIDER_NETWORK();

	private static Geolocation instance = null;

	public static Geolocation get() {
		if (instance == null) {
			instance = new Geolocation();
		}
		return instance;
	}

	private Geolocation() {
		createPeer();
	}

	/**
	 * @return The minimum change of position (in meters) before a 'location'
	 *         event is fired. default is 0, meaning that location events are
	 *         continuously generated.
	 */
	public native double getDistanceFilter() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.distanceFilter;
	}-*/;

	public native void setDistanceFilter(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.distanceFilter = value;
	}-*/;

	/**
	 * @return The minium change of heading (in degrees) before a 'heading'
	 *         event is fired. default is 0, meaning that heading events are
	 *         continuously generated.
	 */
	public native double getHeadingFilter() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.headingFilter;
	}-*/;

	public native void setHeadingFilter(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headingFilter = value;
	}-*/;

	/**
	 * @return (ios 4.2+ only). returns an authorization constant indicating if
	 *         the application has access to location services. always returns
	 *         authorization_unknown on pre-4.2 devices. attempting to
	 *         re-authorize when authorization_restricted will lead to issues
	 * @platforms iphone, ipad
	 */
	public native int getLocationServicesAuthorization() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.locationServicesAuthorization;
	}-*/;

	public native void setLocationServicesAuthorization(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.locationServicesAuthorization = value;
	}-*/;

	/**
	 * @return Returns true if the user has enabled or disable location services
	 *         for the device (not the application).
	 */
	public native boolean isLocationServicesEnabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.locationServicesEnabled;
	}-*/;

	public native void setLocationServicesEnabled(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.locationServicesEnabled = value;
	}-*/;

	/**
	 * @return Allows setting of the preferred location provider. returns
	 *         undefined when the preferred provider is auto-detected
	 */
	public native String getPreferredProvider() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.preferredProvider;
	}-*/;

	public native void setPreferredProvider(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.preferredProvider = value;
	}-*/;

	/**
	 * @return (ios only). this property informs the end-user why location
	 *         services are being requested by the application. this string will
	 *         be display in the permission dialog. this property is required
	 *         starting in 4.0.
	 * @platforms iphone, ipad
	 */
	public native String getPurpose() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.purpose;
	}-*/;

	public native void setPurpose(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.purpose = value;
	}-*/;

	/**
	 * @return Returns true if the calibration ui can show
	 */
	public native boolean getShowCalibration() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.showCalibration;
	}-*/;

	public native void setShowCalibration(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showCalibration = value;
	}-*/;

	/**
	 * Tries to resolve an address to a location.
	 * 
	 * @param address
	 *            address to resolve.
	 */
	public native void forwardGeocoder(String address, GeocoderCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.forwardGeocoder(
						address,
						function(e) {
							var place = @com.ait.toolkit.titanium.mobile.client.geolocation.Place::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.titanium.mobile.client.geolocation.GeocoderCallback::onEvent(Lcom/ait/toolkit/titanium/mobile/client/geolocation/Place;)(place);

						});
	}-*/;

	/**
	 * Retrieve the current compass heading.
	 * 
	 * @deprecated since 2.0,use getCurrentHeading(getCurrentPosition) instead
	 */
	public void getCurrentHeading(EventListener<HeadingEvent> callback) {
		getCurrentHeading(callback.getJsoPeer());
	}

	/**
	 * Retrieve the current compass heading.
	 */
	public native void getCurrentHeading(GeolocationHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.getCurrentHeading(function(e) {
					var locationEvent = @com.ait.toolkit.titanium.mobile.client.core.events.geolocation.LocationEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
					handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeolocationHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/geolocation/LocationEvent;)(locationEvent);

				});
	}-*/;

	/**
	 * 
	 * Retrieve the last known location from the device. on android, the radios
	 * are not turned on to update the location. on ios the radios may be used
	 * if the location is too "old".
	 */

	public native void getCurrentPosition(GeolocationHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.getCurrentPosition(function(e) {
					var locationEvent = @com.ait.toolkit.titanium.mobile.client.core.events.geolocation.LocationEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
					handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeolocationHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/geolocation/LocationEvent;)(locationEvent);

				});
	}-*/;

	private native void getCurrentHeading(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.getCurrentHeading(callback);
	}-*/;

	/**
	 * Retrieve the last known location from the device. on android, the radios
	 * are not turned on to update the location. on ios the radios may be used
	 * if the location is too "old".
	 * 
	 * @deprecated since 2.0, use getCurrentPosition(getCurrentPosition) instead
	 */
	public void getCurrentPosition(EventListener<LocationEvent> callback) {
		getCurrentHeading(callback.getJsoPeer());
	}

	private native void getCurrentPosition(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.getCurrentPosition(callback);
	}-*/;

	/**
	 * Tries to resolve a location to an address.
	 * 
	 * @param latitude
	 *            latitude to search
	 * @param longitude
	 *            longitude to search
	 */
	public static native void reverseGeocoder(double latitude,
			double longitude, ReverseGeocoderCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.reverseGeocoder(
						latitude,
						longitude,
						function(e) {
							var obj = @com.ait.toolkit.titanium.mobile.client.geolocation.ReverseGeocoderResult::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.titanium.mobile.client.geolocation.ReverseGeocoderCallback::onEvent(Lcom/ait/toolkit/titanium/mobile/client/geolocation/ReverseGeocoderResult;)(obj);
						});
	}-*/;

	public void addCalibrationHandler(EventHandler handler) {
		addEventHandler(CalibrationEvent.CALIBRATION, handler);
	}

	public native void addHeadingHandler(GeoHeadingHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.geolocation.HeadingEvent::HEADING,
						function(e) {
							var obj = @com.ait.toolkit.titanium.mobile.client.core.events.geolocation.HeadingEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeoHeadingHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/geolocation/HeadingEvent;)(obj);
						});
	}-*/;

	public native void addLocationHandler(GeolocationHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.geolocation.LocationEvent::LOCATION,
						function(e) {
							var obj = @com.ait.toolkit.titanium.mobile.client.core.events.geolocation.LocationEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.titanium.mobile.client.core.handlers.geolocation.GeolocationHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/geolocation/LocationEvent;)(obj);
						});
	}-*/;

	public void addLocationPaused(EventHandler handler) {
		addEventHandler("locationpaused", handler);
	}

	public void addLocationResumeded(EventHandler handler) {
		addEventHandler("locationresumed", handler);
	}

	public static native final int ACCURACY_BEST() /*-{
		return Titanium.Geolocation.ACCURACY_BEST;
	}-*/;

	public static native final int ACCURACY_HUNDRED_METERS() /*-{
		return Titanium.Geolocation.ACCURACY_HUNDRED_METERS;
	}-*/;

	public static native final int ACCURACY_KILOMETER() /*-{
		return Titanium.Geolocation.ACCURACY_KILOMETER;
	}-*/;

	public static native final int ACCURACY_NEAREST_TEN_METERS() /*-{
		return Titanium.Geolocation.ACCURACY_NEAREST_TEN_METERS;
	}-*/;

	public static native final int ACCURACY_THREE_KILOMETERS() /*-{
		return Titanium.Geolocation.ACCURACY_THREE_KILOMETERS;
	}-*/;

	public static native final int AUTHORIZATION_AUTHORIZED() /*-{
		return Titanium.Geolocation.AUTHORIZATION_AUTHORIZED;
	}-*/;

	public static native final int AUTHORIZATION_DENIED() /*-{
		return Titanium.Geolocation.AUTHORIZATION_DENIED;
	}-*/;

	public static native final int AUTHORIZATION_RESTRICTED() /*-{
		return Titanium.Geolocation.AUTHORIZATION_RESTRICTED;
	}-*/;

	public static native final int AUTHORIZATION_UNKNOWN() /*-{
		return Titanium.Geolocation.AUTHORIZATION_UNKNOWN;
	}-*/;

	public static native final int ERROR_DENIED() /*-{
		return Titanium.Geolocation.ERROR_DENIED;
	}-*/;

	public static native final int ERROR_HEADING_FAILURE() /*-{
		return Titanium.Geolocation.ERROR_HEADING_FAILURE;
	}-*/;

	public static native final int ERROR_LOCATION_UNKNOWN() /*-{
		return Titanium.Geolocation.ERROR_LOCATION_UNKNOWN;
	}-*/;

	public static native final int ERROR_NETWORK() /*-{
		return Titanium.Geolocation.ERROR_NETWORK;
	}-*/;

	public static native final int ERROR_REGION_MONITORING_DELAYED() /*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_DELAYED;
	}-*/;

	public static native final int ERROR_REGION_MONITORING_DENIED() /*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_DENIED;
	}-*/;

	public static native final int ERROR_REGION_MONITORING_FAILURE() /*-{
		return Titanium.Geolocation.ERROR_REGION_MONITORING_FAILURE;
	}-*/;

	private static native final String PROVIDER_GPS() /*-{
		return Titanium.Geolocation.PROVIDER_GPS;
	}-*/;

	private static native final String PROVIDER_NETWORK() /*-{
		return Titanium.Geolocation.PROVIDER_NETWORK;
	}-*/;

	@Override
	public void createPeer() {
		jsObj = TiFactory.createGeolocationModule();
	}

}
