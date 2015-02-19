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
package com.ait.toolkit.titanium.mobile.client.network;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.NetworkChangeHandler;
import com.ait.toolkit.titanium.mobile.client.network.socket.Socket;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * The top level network module. the network module is used accessing networking
 * related functionality.
 */

public class Network extends TiModule {

	public static final String INADDR_ANY = INADDR_ANY();
	public static final int NETWORK_LAN = NETWORK_LAN();
	public static final int NETWORK_MOBILE = NETWORK_MOBILE();
	public static final int NETWORK_NONE = NETWORK_NONE();
	public static final int NETWORK_UNKNOWN = NETWORK_UNKNOWN();
	public static final int NETWORK_WIFI = NETWORK_WIFI();
	public static final int NOTIFICATION_TYPE_ALERT = NOTIFICATION_TYPE_ALERT();
	public static final int NOTIFICATION_TYPE_BADGE = NOTIFICATION_TYPE_BADGE();
	public static final int NOTIFICATION_TYPE_NRWSSTAND = NOTIFICATION_TYPE_NEWSSTAND();
	public static final int NOTIFICATION_TYPE_SOUND = NOTIFICATION_TYPE_SOUND();
	public static final int TLS_VERSION_1_0 = TLS_VERSION_1_0();
	public static final int TLS_VERSION_1_1 = TLS_VERSION_1_1();
	public static final int TLS_VERSION_1_2 = TLS_VERSION_1_2();

	private static Network instance = null;

	public static Network get() {
		if (instance == null) {
			instance = new Network();
		}
		return instance;
	}

	private Network() {
		createPeer();
	}

	/**
	 * @return The network type value as a constant.
	 */
	public native int getNetworkType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.networkType;
	}-*/;

	/**
	 * @return The network type name constant. returns one of `none`, `wifi`,
	 *         `lan` or `mobile`.
	 */
	public native String getNetworkTypeName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.networkTypeName;
	}-*/;

	/**
	 * @return Readonly boolean value that indicates if the network is reachable
	 *         to the internet either via wifi or carrier network
	 */
	public native boolean isOnline() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.online;
	}-*/;

	/**
	 * @return The remote device uuid if the device was registered with the
	 *         apple push notification service or null if not set. only
	 *         available on iphone.
	 * 
	 */
	public native String getRemoteDeviceUUID() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.remoteDeviceUUID;
	}-*/;

	/**
	 * @return Returns an array of network type constants enabled for the
	 *         application. only available on iphone.
	 */
	public native JsArrayNumber getRemoteNotificationTypes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.remoteNotificationTypes;
	}-*/;

	/**
	 * @return Returns true if remote notifications have been enabled. only
	 *         available on iphone. Available on iOs only
	 */
	public native boolean isRemoteNotificationsEnabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.remoteNotificationsEnabled;
	}-*/;

	public native HTTPClient createHTTPClient() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createHTTPClient({
			// function called when an error occurs, including a timeout
			onerror : function(e) {
				Ti.API.debug(e.error);
			}
		});
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.HTTPClient::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native Socket createSocket() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createSocket();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.socket.Socket::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link org.urish.gwtit.titanium.network.bonjourbrowser}
	 * 
	 * Available on iOs only
	 * 
	 * 
	 * @param serviceType
	 *            service to search for, must include the protocol type suffix
	 *            (._tcp)
	 */
	public native BonjourBrowser createBonjourBrowser(String serviceType) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createBonjourBrowser(serviceType);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.BonjourBrowser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link com.ait.toolkit.titanium.mobile.client.network.BonjourBrowser}
	 * 
	 * Available on iOs only
	 * 
	 * @param serviceType
	 *            service to search for, must include the protocol type suffix
	 *            (._tcp)
	 * @param domain
	 *            the Bonjour service domain to conduct the search in. Default
	 *            value is 'local.'
	 */
	public native BonjourBrowser createBonjourBrowser(String serviceType,
			String domain) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createBonjourBrowser(serviceType, domain);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.BonjourBrowser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link com.ait.toolkit.titanium.mobile.client.network.BonjourBrowser}
	 * 
	 * Available on iOs only
	 * 
	 * @param serviceType
	 *            service to search for, must include the protocol type suffix
	 *            (._tcp)
	 * @param domain
	 *            the Bonjour service domain to conduct the search in. Default
	 *            value is 'local.'
	 * @param parameters
	 *            A dictionary object of properties defined in
	 *            {@link com.ait.toolkit.titanium.mobile.client.network.BonjourBrowser}
	 */
	public native BonjourBrowser createBonjourBrowser(String serviceType,
			String domain, JavaScriptObject parameters) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createBonjourBrowser(serviceType, domain, parameters);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.BonjourBrowser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link com.ait.toolkit.titanium.mobile.client.network.BonjourService}
	 * 
	 * Available on iOs only
	 * 
	 * @param name
	 *            the name of the service. Must be a unique identifier for this
	 *            service type and domain.
	 * @param type
	 *            the type of service. Must include the protocol identifier
	 *            (._tcp)
	 */
	public native BonjourService createBonjourService(String name, String type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createBonjourService(name, type);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.BonjourService::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link com.ait.toolkit.titanium.mobile.client.network.BonjourService}
	 * 
	 * Available on iOs only
	 * 
	 * @param name
	 *            the name of the service. Must be a unique identifier for this
	 *            service type and domain.
	 * @param type
	 *            the type of service. Must include the protocol identifier
	 *            (._tcp)
	 * @param domain
	 *            the domain to publish the service in. Default value is
	 *            'local.'
	 */
	public native BonjourService createBonjourService(String name, String type,
			String domain) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createBonjourService(name, type, domain);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.BonjourService::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Create and return an instance of
	 * {@link com.ait.toolkit.titanium.mobile.client.network.BonjourService}
	 * 
	 * Available on iOs only
	 * 
	 * @param name
	 *            the name of the service. Must be a unique identifier for this
	 *            service type and domain.
	 * @param type
	 *            the type of service. Must include the protocol identifier
	 *            (._tcp)
	 * @param domain
	 *            the domain to publish the service in. Default value is
	 *            'local.'
	 * @param parameters
	 *            A dictionary object with properties defined in
	 *            {@link com.ait.toolkit.titanium.mobile.client.network.BonjourService}
	 */
	public native BonjourService createBonjourService(String name, String type,
			String domain, Object parameters) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createBonjourService(name, type, domain, parameters);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.BonjourService::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Decode a uri component part using uri encoding
	 * 
	 * @param value
	 *            input value to be decoded
	 */
	public native String decodeURIComponent(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.decodeURIComponent(value);
	}-*/;

	/**
	 * Encode a uri component part using uri encoding
	 * 
	 * @param value
	 *            input value to be encoded
	 */
	public native String encodeURIComponent(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.encodeURIComponent(value);
	}-*/;

	/**
	 * Registers for push notifications with the Apple Push Notification
	 * Service.
	 * <p>
	 * This method should be called at application startup.
	 * 
	 * @param config
	 * 
	 */
	public native void registerForPushNotifications(
			PushNotificationConfig config) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.registerForPushNotifications(config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Unregisters the application for push notifications.
	 * <p>
	 * Per Apple's documentation, it is rarely necessary to call this method.
	 * See: unregisterForRemoteNotifications in the UIApplication Class
	 * Reference
	 * <p>
	 * For example, calling this method would be required if a new version of
	 * your application no longer supports push notifications.
	 */
	public native void unregisterForPushNotifications() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.unregisterForPushNotifications();
	}-*/;

	public native void addChangeHandler(String event,
			NetworkChangeHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.NetworkChangeEvent::CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.NetworkChangeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.NetworkChangeHandler::onNetworkChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/NetworkChangeEvent;)(eventObject);

						});
	}-*/;

	/**
	 * sets the Entrypoint of the given RPC service
	 * 
	 * @param service
	 * @param moduleUrl
	 * @param relativeServiceUrl
	 */
	public void setServiceEntryPoint(ServiceDefTarget service,
			final String moduleUrl, String relativeServiceUrl) {
		service.setServiceEntryPoint(moduleUrl + relativeServiceUrl);
	}

	private static native final String INADDR_ANY() /*-{
		return Titanium.Network.INADDR_ANY;
	}-*/;

	private static native final int NETWORK_LAN() /*-{
		return Titanium.Network.NETWORK_LAN;
	}-*/;

	private static native final int NETWORK_MOBILE() /*-{
		return Titanium.Network.NETWORK_MOBILE;
	}-*/;

	private static native final int NETWORK_NONE() /*-{
		return Titanium.Network.NETWORK_NONE;
	}-*/;

	private static native final int NETWORK_UNKNOWN() /*-{
		return Titanium.Network.NETWORK_UNKNOWN;
	}-*/;

	private static native final int NETWORK_WIFI() /*-{
		return Titanium.Network.NETWORK_WIFI;
	}-*/;

	private static native final int NOTIFICATION_TYPE_ALERT() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_ALERT;
	}-*/;

	private static native final int NOTIFICATION_TYPE_BADGE() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_BADGE;
	}-*/;

	private static native final int NOTIFICATION_TYPE_NEWSSTAND() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_NEWSSTAND;
	}-*/;

	private static native final int NOTIFICATION_TYPE_SOUND() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_SOUND;
	}-*/;

	private static native final int TLS_VERSION_1_0() /*-{
		return Titanium.Network.TLS_VERSION_1_0;
	}-*/;

	private static native final int TLS_VERSION_1_1() /*-{
		return Titanium.Network.TLS_VERSION_1_1;
	}-*/;

	private static native final int TLS_VERSION_1_2() /*-{
		return Titanium.Network.TLS_VERSION_1_2;
	}-*/;

	@Override
	public void createPeer() {
		jsObj = TiFactory.createNativeNetworkModule();
	}

}
