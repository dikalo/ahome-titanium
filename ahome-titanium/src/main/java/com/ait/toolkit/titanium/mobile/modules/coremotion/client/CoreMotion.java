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
package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Allows Titanium client applications to access Apple's CoreMotion APIs.
 * <p>
 * The Core Motion module provides access to Apple's CoreMotion APIs. The Core
 * Motion module provides support for monitoring various hardware sensors on iOS
 * devices, such as the accelerometer, gyroscope, and magnetometer. The Core
 * Motion module allows you to access the metrics provided by these sensors.
 * 
 * <p>
 * <h1>Requirements</h1>
 * This module only works with devices running iOS 7. Not all devices have the
 * same hardware sensors, so all features may not be available for all devices.
 * Be sure to use the API to check the device for the existence of a feature.
 * <p>
 * You can only test the Core Motion module on a device. The Core Motion API
 * cannot be tested on the iOS simulator.
 * <p>
 * Some features may require permission to use "Motion Activity". iOS requires
 * the user's approval to use the "Motion Activity" permission. When the
 * application uses the Core Motion API for the first time, iOS prompts the user
 * to either approve or deny access to the Core Motion features of the device.
 * The user can change the permission settings with Settings > Privacy.
 *
 */
public class CoreMotion extends TiModule {

	public static final int ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_CORRECTED_Z_VERTICAL = ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_CORRECTED_Z_VERTICAL();
	public static final int ATTITUDE_REFERENCE_FRAME_X_ARBITRARY__Z_VERTICAL = ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_Z_VERTICAL();
	public static final int ATTITUDE_REFERENCE_X_MAGNETIC_NORTH_Z_VERTICAL = ATTITUDE_REFERENCE_FRAME_X_MAGNETIC_NORTH_Z_VERTICAL();
	public static final int ATTITUDE_REFERENCE_X_TRUE_NORTH_Z_VERTICAL = ATTITUDE_REFERENCE_FRAME_X_TRUE_NORTH_Z_VERTICAL();
	public static final int ERROR_DEVICE_REQUIRES_MOVEMENT = ERROR_DEVICE_REQUIRES_MOVEMENT();
	public static final int ERROR_INVALID_PARAMETER = ERROR_INVALID_PARAMETER();
	public static final int ERROR_MOTION_ACTIVITY_NOT_AUTHORIZED = ERROR_MOTION_ACTIVITY_NOT_AUTHORIZED();
	public static final int ERROR_MOTION_ACTIVITY_NOT_AVAILABLE = ERROR_MOTION_ACTIVITY_NOT_AVAILABLE();
	public static final int ERROR_MOTION_ACTIVITY_NOT_ENTITLED = ERROR_MOTION_ACTIVITY_NOT_ENTITLED();
	public static final int ERROR_NULL = ERROR_NULL();
	public static final int ERROR_TRUE_NORTH_NOT_AVAILABLE = ERROR_TRUE_NORTH_NOT_AVAILABLE();
	public static final int ERROR_UNKNOWN = ERROR_UNKNOWN();
	public static final int MAGNETIC_FIELD_CALIBRATION_ACCURACY_HIGH = MAGNETIC_FIELD_CALIBRATION_ACCURACY_HIGH();
	public static final int MAGNETIC_FIELD_CALIBRATION_ACCURACY_LOW = MAGNETIC_FIELD_CALIBRATION_ACCURACY_LOW();
	public static final int MAGNETIC_FIELD_CALIBRATION_ACCURACY_MEDIUM = MAGNETIC_FIELD_CALIBRATION_ACCURACY_MEDIUM();
	public static final int MAGNETIC_FIELD_CALIBRATION_ACCURACY_UNCALIBRATED = MAGNETIC_FIELD_CALIBRATION_ACCURACY_UNCALIBRATED();
	public static final int MOTION_ACTIVITY_CONFIDENCE_HIGH = MOTION_ACTIVITY_CONFIDENCE_HIGH();
	public static final int MOTION_ACTIVITY_CONFIDENCE_LOW = MOTION_ACTIVITY_CONFIDENCE_LOW();
	public static final int MOTION_ACTIVITY_CONFIDENCE_MEDIUM = MOTION_ACTIVITY_CONFIDENCE_MEDIUM();

	private static CoreMotion instance;

	public static CoreMotion get() {
		if (instance == null) {
			instance = new CoreMotion();
		}
		return instance;
	}

	private CoreMotion() {
		createPeer();
	}

	@Override
	public void createPeer() {
		jsObj = create();
	}

	/**
	 * Returns a bitmask specifying the available attitude reference frames on
	 * the device.
	 * 
	 * @return
	 */
	public native int availableAttitudeReferenceFrames() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.availableAttitudeReferenceFrames();
	}-*/;

	/**
	 * Returns the latest sample of accelerometer data.
	 * <p>
	 * An app that is receiving accelerometer data after calling
	 * startAccelerometerUpdates with no callback, needs to periodically check
	 * the value returned by this method and process the acceleration data.
	 */
	public native CoreMotionAccelerometerData getAccelerometerData() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.getAccelerometerData();
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.modules.coremotion.client.CoreMotionAccelerometerData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	/**
	 * Returns either the reference frame currently being used or the default
	 * attitude reference frame.
	 * <p>
	 * If device motion is active, this property returns the reference frame
	 * currently in use. If device motion is not active but has been active
	 * since the app was last launched, this property returns the last frame
	 * used. If device motion has not been active since the app was last
	 * launched, this property returns the default attitude reference frame for
	 * the device. Possible reference frames include
	 * ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_Z_VERTICAL,
	 * ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_CORRECTED_Z_VERTICAL,
	 * ATTITUDE_REFERENCE_FRAME_X_MAGNETIC_NORTH_Z_VERTICAL, and
	 * ATTITUDE_REFERENCE_FRAME_X_TRUE_NORTH_Z_VERTICAL.
	 */
	public native int getAttitudeReferenceFrame() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getAttitudeReferenceFrame();
	}-*/;

	/**
	 * Returns the latest sample of accelerometer data.
	 * <p>
	 * An app that is receiving accelerometer data after calling
	 * startAccelerometerUpdates with no callback, needs to periodically check
	 * the value returned by this method and process the acceleration data.
	 */
	public native CoreMotionDeviceMotionData getDeviceMotion() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.getDeviceMotion();
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.modules.coremotion.client.CoreMotionDeviceMotionData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native CoreMotionGyroData getGyroData() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.getGyroData();
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.modules.coremotion.client.CoreMotionGyroData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native CoreMotionMagnometerData getMagnometerData() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.getMagnometerData();
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.modules.coremotion.client.CoreMotionMagnometerData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native boolean isAccelerometerActive() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isAccelerometerActive();
	}-*/;

	public native boolean isAccelerometerAvailable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isAccelerometerAvailable();
	}-*/;

	public native boolean isActivityAvailable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isActivityAvailable();
	}-*/;

	public native boolean isDeviceMotionActive() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isDeviceMotionActive();
	}-*/;

	public native boolean isDeviceMotionAvailable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isDeviceMotionAvailable();
	}-*/;

	public native boolean isGyroActive() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isGyroActive();
	}-*/;

	public native boolean isGyroAvailable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isGyroAvailable();
	}-*/;

	public native boolean isMagnometerActive() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isMagnometerActive();
	}-*/;

	public native boolean isMagnometerAvailable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isMagnometerAvailable();
	}-*/;

	public native boolean isStepCountingAvailable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isStepCountingAvailable();
	}-*/;

	public native void queryActivity() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isStepCountingAvailable();
	}-*/;

	private static native JavaScriptObject create()/*-{
		return require('coremotion');
	}-*/;

	private static final native int ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_CORRECTED_Z_VERTICAL()/*-{
		return require('coremotion').ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_CORRECTED_Z_VERTICAL;
	}-*/;

	private static final native int ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_Z_VERTICAL()/*-{
		return require('coremotion').ATTITUDE_REFERENCE_FRAME_X_ARBITRARY_Z_VERTICAL;
	}-*/;

	private static final native int ATTITUDE_REFERENCE_FRAME_X_MAGNETIC_NORTH_Z_VERTICAL()/*-{
		return require('coremotion').ATTITUDE_REFERENCE_FRAME_X_MAGNETIC_NORTH_Z_VERTICAL;
	}-*/;

	private static final native int ATTITUDE_REFERENCE_FRAME_X_TRUE_NORTH_Z_VERTICAL()/*-{
		return require('coremotion').ATTITUDE_REFERENCE_FRAME_X_TRUE_NORTH_Z_VERTICAL;
	}-*/;

	private static final native int ERROR_DEVICE_REQUIRES_MOVEMENT()/*-{
		return require('coremotion').ERROR_DEVICE_REQUIRES_MOVEMENT;
	}-*/;

	private static final native int ERROR_INVALID_PARAMETER()/*-{
		return require('coremotion').ERROR_INVALID_PARAMETER;
	}-*/;

	private static final native int ERROR_MOTION_ACTIVITY_NOT_AUTHORIZED()/*-{
		return require('coremotion').ERROR_MOTION_ACTIVITY_NOT_AUTHORIZED;
	}-*/;

	private static final native int ERROR_MOTION_ACTIVITY_NOT_AVAILABLE()/*-{
		return require('coremotion').ERROR_MOTION_ACTIVITY_NOT_AVAILABLE;
	}-*/;

	private static final native int ERROR_MOTION_ACTIVITY_NOT_ENTITLED()/*-{
		return require('coremotion').ERROR_MOTION_ACTIVITY_NOT_ENTITLED;
	}-*/;

	private static final native int ERROR_NULL()/*-{
		return require('coremotion').ERROR_NULL;
	}-*/;

	private static final native int ERROR_TRUE_NORTH_NOT_AVAILABLE()/*-{
		return require('coremotion').ERROR_TRUE_NORTH_NOT_AVAILABLE;
	}-*/;

	private static final native int ERROR_UNKNOWN()/*-{
		return require('coremotion').ERROR_UNKNOWN;
	}-*/;

	private static final native int MAGNETIC_FIELD_CALIBRATION_ACCURACY_HIGH()/*-{
		return require('coremotion').MAGNETIC_FIELD_CALIBRATION_ACCURACY_HIGH;
	}-*/;

	private static final native int MAGNETIC_FIELD_CALIBRATION_ACCURACY_LOW()/*-{
		return require('coremotion').MAGNETIC_FIELD_CALIBRATION_ACCURACY_LOW;
	}-*/;

	private static final native int MAGNETIC_FIELD_CALIBRATION_ACCURACY_MEDIUM()/*-{
		return require('coremotion').MAGNETIC_FIELD_CALIBRATION_ACCURACY_MEDIUM;
	}-*/;

	private static final native int MAGNETIC_FIELD_CALIBRATION_ACCURACY_UNCALIBRATED()/*-{
		return require('coremotion').MAGNETIC_FIELD_CALIBRATION_ACCURACY_UNCALIBRATED;
	}-*/;

	private static final native int MOTION_ACTIVITY_CONFIDENCE_HIGH()/*-{
		return require('coremotion').MOTION_ACTIVITY_CONFIDENCE_HIGH;
	}-*/;

	private static final native int MOTION_ACTIVITY_CONFIDENCE_LOW()/*-{
		return require('coremotion').MOTION_ACTIVITY_CONFIDENCE_LOW;
	}-*/;

	private static final native int MOTION_ACTIVITY_CONFIDENCE_MEDIUM()/*-{
		return require('coremotion').MOTION_ACTIVITY_CONFIDENCE_MEDIUM;
	}-*/;

}
