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
package com.ait.toolkit.titanium.mobile.client.platform;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.Unit;
import com.ait.toolkit.titanium.mobile.client.core.handlers.BatteryHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.google.gwt.core.client.GWT;

/**
 * The top level platform module. the platform module is used accessing the device's platform related functionality.
 */
public class Platform extends TiModule {

	public static final int PLATFORM_BATTERY_STATE_CHARGING = BATTERY_STATE_CHARGING();
	public static final int PLATFORM_BATTERY_STATE_FULL = BATTERY_STATE_FULL();
	public static final int PLATFORM_BATTERY_STATE_UNKNOWN = BATTERY_STATE_UNKNOWN();
	public static final int PLATFORM_BATTERY_STATE_UNPLUGGED = BATTERY_STATE_UNPLUGGED();
	public static final String PLATFORM_OS_IPAD = "ipad";
	public static final String PLATFORM_OS_IPHONE = "iphone";
	public static final String PLATFORM_OS_ANDROID = "android";
	public static final String PLATFORM_IPHONE_OS = "iPhone OS";
	public static final String PLATFORM_MOBILE_WEB = "mobileweb";
	private Unit unit;

	private static Platform instance = null;

	public static Platform get() {
		if (instance == null) {
			instance = new Platform();
		}
		return instance;
	}

	private Platform() {
		createPeer();
	}

	/**
	 * @return The ip address that the device reports (only applicable on wifi network)
	 */
	public native String getAddress() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.address;
	}-*/;

	public native void setAddress(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.address = value;
	}-*/;

	/**
	 * @return The processor architecture that the device reports
	 */
	public native String getArchitecture() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.architecture;
	}-*/;

	public native void setArchitecture(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.architecture = value;
	}-*/;

	/**
	 * @return Return the amount of memory available on the device in bytes
	 */
	public native double getAvailableMemory() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.availableMemory;
	}-*/;

	public native void setAvailableMemory(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.availableMemory = value;
	}-*/;

	/**
	 * @return The current device battery level. this property is only accessible if 'batterymonitoring' is enabled. on iphone, this level only changes at 5% intervals.
	 */
	public native double getBatteryLevel() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.batteryLevel;
	}-*/;

	public native void setBatteryLevel(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.batteryLevel = value;
	}-*/;

	/**
	 * @return Boolean to indicate if battery monitoring is enabled
	 */
	public native boolean getBatteryMonitoring() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.batteryMonitoring;
	}-*/;

	public native void setBatteryMonitoring(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.batteryMonitoring = value;
	}-*/;

	/**
	 * @return Constant that represents the state of the battery. this property is only accessible if `batterymonitoring` is enabled
	 */
	public native int getBatteryState() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.batteryState;
	}-*/;

	public native void setBatteryState(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.batteryState = value;
	}-*/;

	/**
	 * @return Return the displaycaps object for platform
	 */
	public native DisplayCaps getDisplayCaps() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.displayCaps;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.platform.DisplayCaps::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setDisplayCaps(DisplayCaps value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.displayCaps = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * @return The unique id of the device
	 */
	public static native String getId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.id;
	}-*/;

	public native void setId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.id = value;
	}-*/;

	/**
	 * @return The primary language of the device that the user has enabled
	 */
	public native String getLocale() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.locale;
	}-*/;

	public native void setLocale(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.locale = value;
	}-*/;

	/**
	 * @return This property will return a unique identifier for the device
	 */
	public native String getMacaddress() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.macaddress;
	}-*/;

	public native void setMacaddress(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.macaddress = value;
	}-*/;

	/**
	 * @return The model of the phone that the device reports
	 */
	public native String getModel() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.model;
	}-*/;

	public native void setModel(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.model = value;
	}-*/;

	/**
	 * @return The name of the platform returned by the device
	 */
	public native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
	}-*/;

	public static native void setName(String value) /*-{
		Titanium.Platform.name = value;
	}-*/;

	/**
	 * @return The network mask that the device reports (only applicable on wifi network)
	 */
	public native String getNetmask() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.netmask;
	}-*/;

	public native void setNetmask(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.netmask = value;
	}-*/;

	/**
	 * @return The shortname of the operating system. for example, on an iphone, will return 'iphone', ipad will return 'ipad' and android will return 'android'.
	 */
	public native String getOsname() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.osname;
	}-*/;

	public native void setOsname(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.osname = value;
	}-*/;

	/**
	 * @return The os architecture, such as 32 bit
	 */
	public native String getOstype() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.ostype;
	}-*/;

	public native void setOstype(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ostype = value;
	}-*/;

	/**
	 * @return The number of processors the device reports
	 */
	public native int getProcessorCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.processorCount;
	}-*/;

	public native void setProcessorCount(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.processorCount = value;
	}-*/;

	/**
	 * @return The username of the device, if set
	 */
	public native String getUsername() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.username;
	}-*/;

	public native void setUsername(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.username = value;
	}-*/;

	/**
	 * @return The version of the platform returned by the device
	 */
	public native String getVersion() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.version;
	}-*/;

	public native void setVersion(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.version = value;
	}-*/;

	public native DisplayCaps createDisplayCaps() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createDisplayCaps();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.platform.DisplayCaps::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Returns whether or not a system url can be opened. ios only
	 * 
	 * @platforms iphone, ipad
	 * @param url
	 *            the url to check
	 */
	public native boolean canOpenURL(String url) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.canOpenURL(url);
	}-*/;

	/**
	 * Create a globally unique identifier
	 */
	public native String createUUID() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createUUID();
	}-*/;

	/**
	 * Open a url in the system default manner
	 * 
	 * @param url
	 *            the url to open
	 */
	public native void openURL(String url) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.openURL(url);
	}-*/;

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	/**
	 * Whether device settings are set to show times in 24-hour format.
	 */
	public native boolean is24HourTimeFormat() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.is24HourTimeFormat();
	}-*/;
	
	public boolean isIPad() {
		return Platform.get().getOsname().equalsIgnoreCase(PLATFORM_OS_IPAD);
	}

	public boolean isIPhone() {
		return Platform.get().getOsname().equalsIgnoreCase(PLATFORM_OS_IPHONE);
	}

	public boolean isAndroid() {
		return Platform.get().getOsname().equalsIgnoreCase(PLATFORM_OS_ANDROID);
	}

	public boolean isIOS {
		return Platform.get().getName().equalsIgnoreCase(Platform.PLATFORM_IPHONE_OS);	
	}

	/**
	 * Returns true if iphone/ipad and version is 3.2+ TODO : Numderformat exception ?
	 */
	public boolean isIOs3_2Plus() {
		if (Platform.get().getName().equalsIgnoreCase(PLATFORM_IPHONE_OS)) {
			String[] version = Platform.get().getVersion().split(".");
			int major = Integer.parseInt(version[0]);
			int minor = Integer.parseInt(version[1]);
			if ((major > 3) || ((major == 3) && (minor > 1))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns true if iphone/ipad and version is 4.0+
	 */
	public boolean isIOS4Plus() {
		if (Platform.get().getName().equalsIgnoreCase(PLATFORM_IPHONE_OS)) {
			String[] version = Platform.get().getVersion().split(".");
			int major = Integer.parseInt(version[0]);
			return (major >= 4);
		}
		return false;
	}

	/**
	 * Utility method to check if the current environment is Ti
	 * 
	 * @return
	 */
	public boolean isTitanium() {
		try {
			Platform.get().getVersion();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 ** 
	 * Checks if we are running in GWT development mode ("hosted mode")
	 * 
	 * @return true if we are running under GWT development mode
	 */
	public boolean isGwtDevMode() {
		return (!GWT.isScript() && GWT.isClient());
	}

	/**
	 ** 
	 * Checks if we are running in the mobile web mode
	 * 
	 * @return true if we are running under mobile web
	 */

	public boolean isMobileWeb() {
		return Platform.get().getOsname().equalsIgnoreCase(PLATFORM_MOBILE_WEB);
	}

	@Override
	public void createPeer() {
		jsObj = TiFactory.createNativePlatformModule();
	}

	public native CallbackRegistration addBatteryHandler(BatteryHandler hanbler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.battery.BatteryEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.BatteryHandler::onBattery(Lcom/ait/toolkit/titanium/mobile/client/core/events/battery/BatteryEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.battery.BatteryEvent::BATTERY;
		jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	public static native final int BATTERY_STATE_CHARGING() /*-{
		return Titanium.Platform.BATTERY_STATE_CHARGING;
	}-*/;

	public static native final int BATTERY_STATE_FULL() /*-{
		return Titanium.Platform.BATTERY_STATE_FULL;
	}-*/;

	public static native final int BATTERY_STATE_UNKNOWN() /*-{
		return Titanium.Platform.BATTERY_STATE_UNKNOWN;
	}-*/;

	public static native final int BATTERY_STATE_UNPLUGGED() /*-{
		return Titanium.Platform.BATTERY_STATE_UNPLUGGED;
	}-*/;

}
