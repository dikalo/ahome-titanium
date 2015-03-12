/*
 Copyright (c) 2015 Ahomé Innovation Technologies. All rights reserved.

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
package com.ait.toolkit.titanium.mobile.modules.touchid.client;

import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * Allows a Titanium application to use the iOS Touch ID authentication
 * mechanism.
 * <p>
 * Touch ID is a security mechanism that uses a fingerprint to authenticate the
 * user. The fingerprint sensor is located in the Home button of the device.
 * Users can use their fingerprint instead of entering their passcode for
 * authentication.
 * <p>
 * <b>Requirements</b> The Touch ID module is available with the Titanium SDK
 * starting with Release 3.4.0. This module only works with devices running iOS
 * 8. You can only test the Touch ID module on a device.
 * <p>
 * The device must have a Touch ID sensor in the Home button and Touch ID must
 * be setup in order to use the Touch ID authentication mechanism. You can set
 * up Touch ID in iOS Setup Assistant or by tapping Touch ID & Passcode from
 * Settings.
 *
 */
public class TouchId extends TiModule {

	public static final int ERROR_AUTHENTICATION_FAILED = ERROR_AUTHENTICATION_FAILED();
	public static final int ERROR_PASS_CODE_NOT_SET = ERROR_PASSCODE_NOT_SET();
	public static final int ERROR_SYSTEM_CANCEL = ERROR_SYSTEM_CANCEL();
	public static final int ERROR_TOUCH_ID_NOT_AVAILABLE = ERROR_TOUCH_ID_NOT_AVAILABLE();
	public static final int ERROR_TOUCH_ID_NOT_ENROLED = ERROR_TOUCH_ID_NOT_ENROLED();
	public static final int ERROR_USER_CANCEL = ERROR_USER_CANCEL();
	public static final int ERROR_USER_FALLBACK = ERROR_USER_FALLBACK();

	private static TouchId instance = null;

	public static TouchId get() {
		if (instance == null) {
			instance = new TouchId();
		}
		return instance;
	}

	public TouchId() {
		createPeer();
	}

	/**
	 * Initiates the Touch ID authentication process.
	 */
	public native void authenticate(String reason,
			TouchIdAuthenticationHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.authenticate(
						reason,
						function(s, e, c) {
							var event = @com.ait.toolkit.titanium.mobile.modules.touchid.client.DeviceCanAuthenticateResult::new(ZLjava/lang/String;I)(s,e,i);
							handler.@com.ait.toolkit.titanium.mobile.modules.touchid.client.TouchIdAuthenticationHandler::onAuthentication(Lcom/ait/toolkit/titanium/mobile/modules/touchid/client/DeviceCanAuthenticateResult;)(event);
						});
	}-*/;

	/**
	 * Checks to see if device is configured for Touch ID authentication.
	 */
	public native DeviceCanAuthenticateResult deviceCanAuthenticate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.deviceCanAuthenticate();
		return @com.ait.toolkit.titanium.mobile.modules.touchid.client.DeviceCanAuthenticateResult::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	@Override
	public void createPeer() {
		jsObj = create();
	}

	private static native JavaScriptObject create()/*-{
		return require('ti.touchid');
	}-*/;

	private static native final int ERROR_AUTHENTICATION_FAILED()/*-{
		return require('ti.touchid').ERROR_AUTHENTICATION_FAILED();
	}-*/;

	private static native final int ERROR_PASSCODE_NOT_SET()/*-{
		return require('ti.touchid').ERROR_PASSCODE_NOT_SET();
	}-*/;

	private static native final int ERROR_TOUCH_ID_NOT_AVAILABLE()/*-{
		return require('ti.touchid').ERROR_TOUCH_ID_NOT_AVAILABLE();
	}-*/;

	private static native final int ERROR_SYSTEM_CANCEL()/*-{
		return require('ti.touchid').ERROR_SYSTEM_CANCEL();
	}-*/;

	private static native final int ERROR_TOUCH_ID_NOT_ENROLED()/*-{
		return require('ti.touchid').ERROR_TOUCH_ID_NOT_ENROLED();
	}-*/;

	private static native final int ERROR_USER_CANCEL()/*-{
		return require('ti.touchid').ERROR_USER_CANCEL();
	}-*/;

	private static native final int ERROR_USER_FALLBACK()/*-{
		return require('ti.touchid').ERROR_USER_FALLBACK();
	}-*/;

}
