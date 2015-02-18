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
package com.ait.toolkit.titanium.mobile.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class TiFactory {

    private TiFactory() {

    }

    public static native JavaScriptObject createAccelerometer()/*-{
		return Titanium.Accelerometer;
    }-*/;

    public static native JavaScriptObject createAnalytics()/*-{
		return Titanium.Analytics;
    }-*/;

    public static native JavaScriptObject createAndroidCalender()/*-{
		return Titanium.Android.Calendar;
    }-*/;

    public static native JavaScriptObject createAndroidNoficationManager()/*-{
		return Titanium.Android.NotificationManager;
    }-*/;

    public static native JavaScriptObject createAndroid()/*-{
		return Titanium.Android;
    }-*/;

    public static native JavaScriptObject createR()/*-{
		return Titanium.Android.R;
    }-*/;

    public static native JavaScriptObject createAPI()/*-{
		return Titanium.API;
    }-*/;

    public static native JavaScriptObject createCodec()/*-{
		Titanium.API.info('Creating CODEC');
		var obj = Titanium.Codec;
		Titanium.API.info('Creating CODEC done');
		return obj;
    }-*/;

    public static native JavaScriptObject createNativeContactModule()/*-{
		return Titanium.Contacts;
    }-*/;

    public static native JavaScriptObject createNativeDatabaseModule()/*-{
		return Titanium.Database;
    }-*/;

    public static native JavaScriptObject createFacebookModule()/*-{
		return Titanium.Facebook;
    }-*/;

    public static native JavaScriptObject createNativeFileSystemModule()/*-{
		return Titanium.Filesystem;
    }-*/;

    public static native JavaScriptObject createGeolocationModule()/*-{
		return Titanium.Geolocation;
    }-*/;

    public static native JavaScriptObject createNativeGestureModule()/*-{
		return Titanium.Gesture;
    }-*/;

    public static native JavaScriptObject createNativeLocaleModule()/*-{
		return Titanium.Locale;
    }-*/;

    public static native JavaScriptObject createNativeMapModule()/*-{
		return Titanium.Map;
    }-*/;

    public static native JavaScriptObject createNativeAndroidMediaModule()/*-{
		return Titanium.Media.Android;
    }-*/;

    public static native JavaScriptObject createNativeMediaModule()/*-{
		return Titanium.Media;
    }-*/;

    public static native JavaScriptObject createNativeSocketModule()/*-{
		return Titanium.Network.Socket;
    }-*/;

    public static native JavaScriptObject createNativeNetworkModule()/*-{
		return Titanium.Network;
    }-*/;

    public static native JavaScriptObject createNativePlatformModule()/*-{
		return Titanium.Platform;
    }-*/;

    public static native JavaScriptObject createNativeStreamModule()/*-{
		return Titanium.Stream;
    }-*/;

    public static native JavaScriptObject createNativeYahooModule()/*-{
		return Titanium.Yahoo;
    }-*/;

    public static native JavaScriptObject createNativeXMLModule()/*-{
		return Titanium.XML;
    }-*/;

    public static native JavaScriptObject createNativeAndroidUIModule()/*-{
		return Titanium.UI.Android;
    }-*/;

    public static native JavaScriptObject createNativeClipboardModule()/*-{
		return Titanium.UI.Clipboard;
    }-*/;

    public static native JavaScriptObject createNativeUiModule()/*-{
		return Titanium.UI;
    }-*/;

    public static native JavaScriptObject createNativeIosUiModule()/*-{
		return Titanium.UI.iOS;
    }-*/;

    public static native JavaScriptObject createNativeIPadUiModule()/*-{
		return Titanium.UI.iPad;
    }-*/;

    public static native JavaScriptObject createNativeIPhoneUiModule()/*-{
		return Titanium.UI.iPhone;
    }-*/;

    public static native JavaScriptObject createNativeCloudPush()/*-{
		return require('ti.cloudpush');
    }-*/;

    public static native JavaScriptObject createNativeCloud()/*-{
		return require('ti.cloud');
    }-*/;

    public static native JavaScriptObject createNativeChats()/*-{
		return Titanium.Cloud.Chats;
    }-*/;

    public static native JavaScriptObject createNativeCheckins()/*-{
		return Titanium.Cloud.Checkins;
    }-*/;

    public static native JavaScriptObject createNativeClients()/*-{
		return Titanium.Cloud.Clients;
    }-*/;

    public static native JavaScriptObject createNativeEmails()/*-{
		return Titanium.Cloud.Emails;
    }-*/;

    public static native JavaScriptObject createNativeKeyValues()/*-{
		return Titanium.Cloud.KeyValues;
    }-*/;

    public static native JavaScriptObject createNativeAndroidGeolocation()/*-{
		return Titanium.Geolocation.Android;
    }-*/;

    public static native JavaScriptObject createNativeMobileWebGeolocation()/*-{
		return Titanium.Geolocation.MobileWeb;
    }-*/;

    public static native JavaScriptObject createACLS()/*-{
		return Titanium.Cloud.ACLs;
    }-*/;

    public static native JavaScriptObject createMessages()/*-{
		return Titanium.Cloud.Messages;
    }-*/;

    public static native JavaScriptObject createApp()/*-{
		return Titanium.App;
    }-*/;

    public static native JavaScriptObject createIosApp()/*-{
		return Titanium.App.iOS;
    }-*/;

    public static native JavaScriptObject createAppProperties()/*-{
		return Titanium.App.Properties;
    }-*/;

    public static native JavaScriptObject createCalender()/*-{
		return Titanium.Calendar;
    }-*/;

}
