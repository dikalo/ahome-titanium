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
package com.ait.toolkit.titanium.mobile.client.app;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.ait.toolkit.titanium.mobile.client.platform.Platform;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level App module. The App module is mainly used for accessing
 * information about the application at runtime and for sending or listening for
 * system events.
 * <p>
 * The App module exposes a number of properties set in the tiapp.xml file.
 * <p>
 * Three of these properties, the application name, ID, and URL, must be
 * specified when the application is created.
 * <p>
 * While most values may be changed by editing the tiapp.xml file after creating
 * the project, the GUID is automatically generated and should not be changed.
 * 
 */
public class App extends TiModule {

	public static final String APP_EVENT_ACCESSIBILITY_ANNOUNCEMENT = EVENT_ACCESSIBILITY_ANNOUNCEMENT();
	public static final String APP_EVENT_ACCESSIBILITY_CHANGED = EVENT_ACCESSIBILITY_CHANGED();

	private static final App INSTANCE = new App();

	public static App get() {
		return INSTANCE;
	}

	private App() {
		createPeer();
	}

	@Override
	public void createPeer() {
		jsObj = TiFactory.createApp();
	}

	/**
	 * Indicates whether Accessibility is enabled by the system.
	 */
	public native boolean isAccessibilityEnabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.accessibilityEnabled;
	}-*/;

	/**
	 * Indicates whether Analytics is enabled, determined by tiapp.xml.
	 */
	public native boolean isAnalyticsEnabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.analytics;
	}-*/;

	/**
	 * Application copyright statement, determined by tiapp.xml.
	 */
	public native String getCopyright() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.copyright;
	}-*/;

	public native BackgroundService getCurrentService() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.currentService;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.app.BackgroundService::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	/**
	 * Build type that reflects how the application was packaged; either test,
	 * development or production.
	 */
	public native String getDeployType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.deployType;
	}-*/;

	/**
	 * Application description, determined by tiapp.xml.
	 */
	public native String getDescription() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.description;
	}-*/;

	/**
	 * 
	 * Prevents network activity indicator from being displayed.
	 * <p>
	 * Setting this property to true disables display of the network activity
	 * indicator when network activity is in progress. If the network activity
	 * indicator is currently visible, it is hidden immediately.
	 * <p>
	 * <b>NOTE: In general, the user should always be made aware of network
	 * activity. The network activity indicator should only be disabled for very
	 * brief network activity (a few seconds).</b>
	 * <p>
	 * Default: false
	 */
	public native void setDisableNetWorkActivitiyIndicator(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.disableNetWorkActivitiyIndicator = value;
	}-*/;

	public native boolean isNetworkActivityIndicatorDisabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.disableNetWorkActivitiyIndicator;
	}-*/;

	/**
	 * Application globally-unique ID, determined by tiapp.xml.
	 */
	public native String getGuId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.guid;
	}-*/;

	/**
	 * Application ID, from tiapp.xml.
	 */
	public native String getId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.id;
	}-*/;

	/**
	 * @iosOnly Determines whether the screen is locked when the device is idle.
	 */
	public native boolean isIdelTimerDisabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.idleTimerDisabled;
	}-*/;

	/**
	 * @iosOnly Determines whether the screen is locked when the device is idle.
	 */
	public native void setIdelTimerDisabled(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.idleTimerDisabled = value;
	}-*/;

	/**
	 * @iosOnly The install ID for this application.
	 */
	public native String getInstallId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.installId;
	}-*/;

	/**
	 * Application name, determined by tiapp.xml.
	 */
	public native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
	}-*/;

	/**
	 * Indicates whether or not the soft keyboard is visible.
	 */
	public native boolean keyboardVisible() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.keyboardVisible;
	}-*/;

	/**
	 * @iosOnly Determines whether proximity detection is enabled.
	 */
	public native boolean isProxymityDectionEnabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.proximityDetection;
	}-*/;

	/**
	 * @iosOnly Determines whether the screen is locked when the device is idle.
	 *          Set to true to receive proximity events.
	 */
	public native void setProximityDetection(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.proximityDetection = true;
	}-*/;

	/**
	 * @iosOnly Indicates the state of the device's proximity sensor, according
	 *          to the proximity event.
	 * 
	 *          This property is true when the proximity sensor is close to the
	 *          user. When proximityDetection is disabled, the value of this
	 *          property is undefined.
	 */
	public native boolean hasProximityState() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.proximityState;
	}-*/;

	/**
	 * Application publisher, from tiapp.xml.
	 */
	public native String getPublisher() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.publisher;
	}-*/;

	/**
	 * Unique session identifier for the current continuous run of the
	 * application.
	 */
	public native String getSessionId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.sessionId;
	}-*/;

	/**
	 * Application URL, from tiapp.xml.
	 */
	public native String getUrl() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.url;
	}-*/;

	/**
	 * Application version, from tiapp.xml.
	 */
	public native String getVersion() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.version;
	}-*/;

	/**
	 * 
	 Fire a system-level event such as APP_EVENT_ACCESSIBILITY_ANNOUNCEMENT.
	 */
	public native void fireSystemEvent(String eventName, JavaScriptObject param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fireSystemEvent(eventName, param);
	}-*/;

	/**
	 * Get the IOs App module. Return null on other platforms
	 */
	public IOs getIOs() {
		if (Platform.get().isIOs3_2Plus()) {
			return IOs.get();
		}
		return null;
	}

	public Properties getAppProperties() {
		return Properties.get();
	}

	public static native final String EVENT_ACCESSIBILITY_ANNOUNCEMENT() /*-{
		return Titanium.App.EVENT_ACCESSIBILITY_ANNOUNCEMENT;
	}-*/;

	public static native final String EVENT_ACCESSIBILITY_CHANGED() /*-{
		return Titanium.App.EVENT_ACCESSIBILITY_CHANGED;
	}-*/;

	public void addAcceccibilityChangedHandler(EventHandler handler) {
		addEventHandler("accessibilitychanged", handler);
	}

	public void addKeyBoardFrameChangedHandler(EventHandler handler) {
		addEventHandler("keyboardFrameChanged", handler);
	}

	public void addPauseHandler(EventHandler handler) {
		addEventHandler("pause", handler);
	}

	public void addPausedHandler(EventHandler handler) {
		addEventHandler("paused", handler);
	}

	public void addProximityHandler(EventHandler handler) {
		addEventHandler("proximity", handler);
	}

	public void addResumeHandler(EventHandler handler) {
		addEventHandler("resume", handler);
	}

	public void addResumedHandler(EventHandler handler) {
		addEventHandler("resumer", handler);
	}

	public void addSignificantTimeChangeHandler(EventHandler handler) {
		addEventHandler("significanttimechange", handler);
	}

}
