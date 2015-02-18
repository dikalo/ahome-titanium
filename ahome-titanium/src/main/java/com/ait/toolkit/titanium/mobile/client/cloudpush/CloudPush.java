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
package com.ait.toolkit.titanium.mobile.client.cloudpush;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.cloudpush.CloudPushAppHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.cloudpush.CloudPushCallbackHandler;

/**
 * Provides methods for accessing Android push notifications from ACS using the
 * MQTT protocol.
 * <p>
 * The MQTT protocol is a very lightweight, long lived connection to a server.
 * It is perfect for keeping mobile devices in connection with a server, while
 * not significantly degrading their battery life.
 * <p>
 * In addition to communicating with an MQTT server, this module can also
 * present tray notifications to the user. Please refer to the
 * showTrayNotification property to see more information about this.
 * <p>
 * Note that this module is not included in the Titanium namespace, but it is
 * bundled with the Titanium SDK as of version 2.0.0. To use it, you must
 * require, like this : <br/>
 * {@code
 *   CloudPush.get();
 * }
 * <p>
 * This module must also be added to the modules section in your tiapp.xml. This
 * can be done using the Modules list in the Titanium Studio TiApp Editor, or by
 * editing the XML directly and adding the following line to the modules
 * element: <br/>
 * {@code
 *   <module platform="android">ti.cloudpush</module>
 * }
 * <p>
 * 
 * Your app must prove that it is allowed to talk to ACS. This keeps your data
 * secure by preventing anyone from making requests to ACS that impersonate your
 * app.
 * <p>
 * Titanium Studio will create a pair of keys (Development and Production) for
 * each Titanium application depending on the user preference specified during
 * new project creation. This pair of keys will be stored in tiapp.xml and one
 * of the keys will be used during application build depending on the build type
 * (development or production).
 * <p>
 * The supported properties in tiapp.xml are:<br/>
 * {@code <property name="acs-api-key-development" type="string">YOUR DEVELOPMENT API KEY HERE</property>
 * <property name="acs-api-key-production" type="string">YOUR PRODUCTION API KEY HERE</property>
 * <property name="acs-api-key" type="string">YOUR API KEY HERE</property>
 * }
 */
public class CloudPush extends TiModule {

    private static final CloudPush INSTANCE = new CloudPush();
    private static final String CALLBACK = "callback";
    private static final String TRAY_CLICK_FOCUSED_APP = "trayClickFocusedApp";
    private static final String TRAY_CLICK_LAUNCHED_APP = "trayClickLauncheddApp";

    public static CloudPush get() {
        return INSTANCE;
    }

    /**
     * Whether or not this device will receive push notifications.<br/>
     * Defaults to: False
     * <p>
     * You must ask your users before enabling this. Note that once enabled, the
     * application will be able to receive notifications at any time, even after
     * the device reboots, regardless of if your application has been run
     * recently or not. But if the user intentionally kills your application and
     * its services in their task manager, push notifications will be disabled
     * and this property will automatically be set to false.
     * <p>
     * Also be aware that whenever your application is updated (through the
     * market or through ADB installing a new APK), the push service will be
     * stopped until the app is launched for the first time.
     * <p>
     * Listen for this module's callback event to receive push notifications
     * once this property is set to true.
     * 
     * @param value
     */
    public native void setEnabled(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.enabled = value;
    }-*/;

    /**
     * Whether or not this device will receive push notifications.
     */
    public native boolean isEnabled()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.enabled;
    }-*/;

    /**
     * Whether or not your application is brought to the foreground whenever a
     * new push is received.
     * 
     * Defaults to: False
     * 
     * Note that this behavior is rather disruptive to users, and is strongly
     * discouraged.
     * 
     * @param value
     */
    public native void setFocusAppOnPush(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.focusAppOnPush = value;
    }-*/;

    /**
     * Whether or not your application is brought to the foreground whenever a
     * new push is received.
     */
    public native boolean focusAppOnPush()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.focusAppOnPush;
    }-*/;

    /**
     * Whether or not clicking the tray notification will bring your application
     * to the foreground.
     * 
     * Defaults to: True
     * 
     * This is only applicable if you have set showTrayNotification to true.
     * 
     * @param value
     */
    public native void setShowAppOnTrayClick(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.showAppOnTrayClick = value;
    }-*/;

    /**
     * Whether or not clicking the tray notification will bring your application
     * to the foreground.
     */
    public native boolean showAppOnTrayClick()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.showAppOnTrayClick;
    }-*/;

    /**
     * Whether or not to show a tray notification when a new push is received.
     * 
     * Defaults to: True
     * 
     * If your payload is only a string, it will be used as the contentText and
     * tickerText, and your application's name will be used as the contentTitle
     * with a system icon.
     * 
     * Note that in your payload, you can customize this tray notification using
     * any of the properties of a Titanium.Android.Notification, except for
     * contentIntent and deleteIntent (those are automatically set).
     * 
     * @param value
     */
    public native void setShowTrayNotification(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.showTrayNotification = value;
    }-*/;

    /**
     * Whether or not to show a tray notification when a new push is received.
     */
    public native boolean showTrayNotification()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.showTrayNotification;
    }-*/;

    /**
     * Whether or not to show tray notifications when your application is in the
     * foreground.
     * 
     * Defaults to: False
     * 
     * @param value
     */
    public native void setShowTrayNotificationsWhenFocused(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.showTrayNotificationsWhenFocused = value;
    }-*/;

    /**
     * Whether or not to show tray notifications when your application is in the
     * foreground.
     */
    public native boolean showTrayNotificationsWhenFocused()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.showTrayNotificationsWhenFocused;
    }-*/;

    public native void retrieveDeviceToken(CloudPushNotificationConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.retrieveDeviceToken(config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Fired whenever a push notification is received.
     * <p>
     * If your application is not running when a push is received, the push will
     * be saved in a queue until the next time you add an event listener for
     * this. <p< This will only be fired once per push notification.
     * <p>
     * This event will be fired at different times depending on your settings
     * and the application's present state (foreground, background, or not
     * running at all). When focusAppOnPush is true, this will fire as soon as
     * you receive a push. When showTrayNotification is true, this will fire as
     * soon as the user touches the tray notification to focus your application.
     * Or, if showTrayNotificationsWhenFocused is false, and your application is
     * in the foreground, it will be called right away. If both focusAppOnPush
     * and showTrayNotification are false, this will fire the next time your
     * application is launched and you add an event listener for it.
     * <p>
     * You can use the trayClickLaunchedApp and trayClickFocusedApp events to
     * distinguish between the various ways a push notification can return a
     * user to your application.
     * 
     * @param handler
     */
    public native void addCallbackHandler(CloudPushCallbackHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.cloudpush.CloudPush::CALLBACK,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.cloudpush.CloudPushCallbackEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.cloudpush.CloudPushCallbackHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/cloudpush/CloudPushCallbackEvent;)(eventObject);
						});
    }-*/;

    /**
     * Fired when a tray notification is shown and the application is already
     * running.
     * <p>
     * Touching it focuses the app, and fires this event.
     * <p>
     * This is only applicable if you have set showTrayNotification to true.
     * 
     * @param handler
     */
    public void addTrayCLickFocusedAppHandler(CloudPushAppHandler handler) {
        addAppHandler(TRAY_CLICK_FOCUSED_APP, handler);
    }

    /**
     * Fired when a tray notification is shown and the application is not
     * running.
     * <p>
     * Touching it launches the app, and fires this event.
     * <p>
     * This is only applicable if you have set showTrayNotification to true.
     * 
     * @param handler
     */
    public void addTrayCLickLauchedAppHandler(CloudPushAppHandler handler) {
        addAppHandler(TRAY_CLICK_LAUNCHED_APP, handler);
    }

    private native void addAppHandler(String event, CloudPushAppHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						event,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.cloudpush.CloudPushEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.cloudpush.CloudPushAppHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/cloudpush/CloudPushEvent;)(eventObject);
						});
    }-*/;

    private CloudPush() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeCloudPush();
    }

}
