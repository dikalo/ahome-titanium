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
package com.ait.toolkit.titanium.mobile.modules.facebook.client;

import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;

/**
 * Add-on Facebook module. The Facebook module is used for connecting your
 * application with Facebook.
 * <p>
 * This module supports the following features: <br/>
 * <ul>
 * <li>Logging in to Facebook and authorizing your application.</li>
 * <li>Making requests through the Facebook Graph API using the
 * requestWithGraphPath method.</li>
 * <li>Making requests through the legacy Facebook REST API using the request
 * method.</li>
 * <li>Posting Facebook dialogs.</li>
 * </ul>
 * <p>
 * For releases prior to 3.1.0, use the built-in Titanium.Facebook module.</li>
 * 
 */
public class FB extends TiModule {

	public static final String FB_BUTTON_STYLE_NORMAL = BUTTON_STYLE_NORMAL();
	public static final String FB_BUTTON_STYLE_WIDE = BUTTON_STYLE_WIDE();

	private static final FB INSTANCE = new FB();

	public static FB get(String applicationID) {
		INSTANCE.setAppId(applicationID);
		return INSTANCE;
	}

	private FB() {
		createPeer();
	}

	@Override
	public void createPeer() {
		jsObj = create();
	}

	/**
	 * Your Facebook application id. You need to set this for anything to work.
	 */
	private native void setAppId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.appid = value;
	}-*/;

	/**
	 * Your Facebook application id. You need to set this for anything to work.
	 */
	public native String getAppId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.appId;
	}-*/;

	/**
	 * OAuth token set after a successful authorize.
	 */
	public native String getAccessToken() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.accessToken;
	}-*/;

	/**
	 * Time at which the accessToken expires.
	 */
	public native JsDate getExpirationDate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.expirationDate;
	}-*/;

	/**
	 * Indicates whether the login should use the traditional dialog-based
	 * authentication.
	 * <p>
	 * Set to false to enable Single-Sign-On (SSO) in cases where the official
	 * Facebook app is on the device. Default is true, meaning the traditional,
	 * dialog-based authentication is used rather than SSO. See the Facebook
	 * Mobile Guide for details of their Single-Sign-On scheme.
	 * <p>
	 * To use the built-in iOS 6 login, set this property to false. This
	 * property is read-only on Mobile Web.
	 * <p>
	 * Default: true
	 */
	public native boolean forceDialogAuth() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.forceDialogAuth;
	}-*/;

	/**
	 * Indicates whether the login should use the traditional dialog-based
	 * authentication.
	 * <p>
	 * Set to false to enable Single-Sign-On (SSO) in cases where the official
	 * Facebook app is on the device. Default is true, meaning the traditional,
	 * dialog-based authentication is used rather than SSO. See the Facebook
	 * Mobile Guide for details of their Single-Sign-On scheme.
	 * <p>
	 * To use the built-in iOS 6 login, set this property to false. This
	 * property is read-only on Mobile Web.
	 * <p>
	 * Default: true
	 */
	public native boolean setForceDialogAuth(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.forceDialogAuth = value
	}-*/;

	/**
	 * Indicates if the user is logged in.
	 */
	public native boolean isLoggedIn() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getLoggedIn();
	}-*/;

	/**
	 * Unique user ID returned from Facebook.
	 */
	public native String getUid() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.uid;
	}-*/;

	/**
	 * Array of permissions to request for your app.
	 * <p>
	 * Be sure the permissions you want are set before calling authorize.
	 * <p>
	 * To use the build-in iOS 6 login, this property cannot contain any of the
	 * following: offline_access, publish_actions, publish_stream,
	 * publish_checkins, ads_management, create_event, rsvp_event,
	 * manage_friendlists, manage_notifications, or manage_pages.
	 */
	public native JsArrayString getPermissions() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.permissions;
	}-*/;

	/**
	 * Array of permissions to request for your app.
	 * <p>
	 * Be sure the permissions you want are set before calling authorize.
	 * <p>
	 * To use the build-in iOS 6 login, this property cannot contain any of the
	 * following: offline_access, publish_actions, publish_stream,
	 * publish_checkins, ads_management, create_event, rsvp_event,
	 * manage_friendlists, manage_notifications, or manage_pages.
	 */
	public native void setPermissions(JsArrayString values) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.permissions = values;
	}-*/;

	public void setPermissions(String... values) {
		JsArrayString perms = JsArrayString.createArray().cast();
		for (String v : values) {
			perms.push(v);
		}
		setPermissions(perms);
	}

	/**
	 * Prompts the user to log in (if not already logged in) and authorize your
	 * application. Be sure to set your appid and your required permissions
	 * before calling authorize.
	 * <p>
	 * A login event is generated to indicate successful or unsuccessful login
	 * attempt.
	 */
	public native void authorize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.authorize();
	}-*/;

	/**
	 * Creates and returns an instance of Modules.Facebook.LoginButton.
	 */
	public native LoginButton createLoginButton() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createLoginButton();
		return @com.ait.toolkit.titanium.mobile.modules.facebook.client.LoginButton::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Creates and returns an instance of Modules.Facebook.LoginButton.
	 */
	public native LoginButton createLoginButton(String buttonStyle) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createLoginButton({
			style : buttonStyle
		});
		return @com.ait.toolkit.titanium.mobile.modules.facebook.client.LoginButton::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Opens a supported Facebook dialog.
	 * <p>
	 * For a list of dialogs, parameters, and response formats, see the official
	 * documentation for Facebook Dialogs. The callback is invoked when the
	 * dialog is closed, either because the user approved the action, or
	 * canceled the dialog.
	 * 
	 * @param action
	 * @param params
	 * @param callback
	 */
	public native void dialog(String action, FBData params,
			FBDialogResponseHandler callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(r) {
			var response = @com.ait.toolkit.titanium.mobile.modules.facebook.client.FBDialogResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
			callback.@com.ait.toolkit.titanium.mobile.modules.facebook.client.FBDialogResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/modules/facebook/client/FBDialogResponse;)(response);
		};
		jso.dialog(action,
				params.@com.ait.toolkit.core.client.JsObject::getJsObj()(), fn);
	}-*/;

	/**
	 * Makes a request to Facebook for additional permissions.
	 * 
	 * iOS 6's facebook login forbids minimum authorization to include write
	 * permissions. In order to make any write actions, the app must reauthorize
	 * asking for the additional permissions. If the application already has
	 * these permissions, there will be no user interaction.
	 * 
	 * @param permissions
	 * @param params
	 * @param callback
	 */
	public native void reauthorize(JsArrayString permissions, String audience,
			FBReauthResponseHandler callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(r) {
			var response = @com.ait.toolkit.titanium.mobile.modules.facebook.client.FBReauthResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
			callback.@com.ait.toolkit.titanium.mobile.modules.facebook.client.FBReauthResponseHandler::onReauth(Lcom/ait/toolkit/titanium/mobile/modules/facebook/client/FBReauthResponse;)(response);
		};
		jso.reauthorize(permissions, audience, fn);
	}-*/;

	/**
	 * 
	 * Makes a request to the legacy Facebook REST API.
	 * 
	 * For details on API calls and responses, see the offical Facebook REST API
	 * documentation.
	 */
	public native void request(String method, FBData params,
			FBRestResponseHandler callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(r) {
			var response = @com.ait.toolkit.titanium.mobile.modules.facebook.client.FBRestResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
			callback.@com.ait.toolkit.titanium.mobile.modules.facebook.client.FBRestResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/modules/facebook/client/FBRestResponse;)(response);
		};
		jso.request(method,
				params.@com.ait.toolkit.core.client.JsObject::getJsObj()(), fn);
	}-*/;

	/**
	 * 
	 * Makes a Facebook Graph API request.
	 * <p>
	 * If the request requires user authorization, the user must be logged in,
	 * and your app must be authorized to make the request. You can check the
	 * loggedIn property to determine if the user is logged in.
	 * <p>
	 * Every Facebook object has an associated path. For example, "me" requests
	 * information about the current user.
	 * <p>
	 * For a complete list of Graph API methods, parameters and return types,
	 * see the official Facebook Graph API documentation.
	 */
	public native void requestWithGraphPath(String path, FBData params,
			String httpMethod, FBGraphResponseHandler callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(r) {
			var response = @com.ait.toolkit.titanium.mobile.modules.facebook.client.FBGraphResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
			callback.@com.ait.toolkit.titanium.mobile.modules.facebook.client.FBGraphResponseHandler::onGraphResponse(Lcom/ait/toolkit/titanium/mobile/modules/facebook/client/FBGraphResponse;)(response);
		};
		jso.requestWithGraphPath(method,
				params.@com.ait.toolkit.core.client.JsObject::getJsObj()(), fn);
	}-*/;

	/**
	 * Fired at session logout.
	 */
	public void addLogoutHandler(EventHandler handler) {
		this.addEventHandler("logout", handler);
	}

	/**
	 * Fired at session login.
	 */
	public native void addLoginHandler(FBLoginHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(e) {
			var event = @com.ait.toolkit.titanium.mobile.modules.facebook.client.FBLoginEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.modules.facebook.client.FBLoginHandler::onLogin(Lcom/ait/toolkit/titanium/mobile/modules/facebook/client/FBLoginEvent;)(event);
		};
		jso.addEventListener('login', fn);
	}-*/;

	/**
	 * Clears the OAuth accessToken and logs out the user.
	 */
	public native void logout() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.logout();
	}-*/;

	private static native JavaScriptObject create()/*-{
		return require('facebook');
	}-*/;

	public static native String BUTTON_STYLE_NORMAL()/*-{
		var fb = require('facebook');
		return fb.BUTTON_STYLE_NORMAL;
	}-*/;

	public static native String BUTTON_STYLE_WIDE()/*-{
		var fb = require('facebook');
		return fb.BUTTON_STYLE_WIDE;
	}-*/;

}
