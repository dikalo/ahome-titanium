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
package com.ait.toolkit.titanium.mobile.client.android;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

/**
 * The Titanium binding of an Androida Notification.
 * 
 * If you pass contentTitle and/or contentText into
 * Titanium.Android.createNotification, then setLatestEventInfo will
 * automatically be called with those properties (there's no need to call it
 * separately unless you want to). You can also use a custom layout.xml wrapped
 * in a Titanium.Android.RemoteViews object in the contentView property, which
 * gives more fine grained control and customization to how the notification
 * actually behaves. Also see Androida's developer guide for Notifications
 */
public class Notification extends EventDispatcher {

    protected Notification(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Sets the latest event info using the builtin Notification View for jso
     * notification. See Androida's documentation for setLatestEventInfo
     */
    public final native void setLatestEventInfo() /*-{
		var jso = jso.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setLatestEventInfo();
    }-*/;

    public final native int getAudioStreamType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.audioStreamType;
    }-*/;

    /**
     * Sets the audio stream type to use when playing the sound.
     * 
     * @param value
     */
    public final native void setAudioStreamType(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.audioStreamType = value;
    }-*/;

    public final native PendingIntent getContentIntent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.contentIntent;
		return @com.ait.toolkit.titanium.mobile.client.android.PendingIntent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the Titanium.Android.PendingIntent to execute when the expanded
     * status entry is clicked.
     * 
     * @param value
     */
    public final native void setContentIntent(PendingIntent value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.contentIntent = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    public final native String getContentText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.contentText;
    }-*/;

    /**
     * Sets the description text of the notification.
     * 
     * @param value
     */
    public final native void setContentText(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.contentText = value;
    }-*/;

    /**
     * Sets the title of the notification.
     * 
     * @param value
     */
    public final native void setContentTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.contentTitle = value;
    }-*/;

    public final native int getDefaults() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.defaults;
    }-*/;

    /**
     * Specifies which values should be taken from the defaults.
     * 
     * @param value
     */
    public final native void setDefaults(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.defaults = value;
    }-*/;

    public final native PendingIntent getDeleteIntent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.deleteIntent;
    }-*/;

    /**
     * Sets the Titanium.Android.PendingIntent to execute when the status entry
     * is deleted by the user with the "Clear All Notifications" button.
     * 
     * @param value
     */
    public final native void setDeleteIntent(PendingIntent value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteIntent = value;
    }-*/;

    public final native int getFlags() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.flags;
    }-*/;

    /**
     * Set of flags for the notification, defaults to Androida.FLAG_AUTO_CANCEL.
     * Possible values: Androida.FLAG_AUTO_CANCEL,Androida.FLAG_INSISTENT,
     * Androida.FLAG_NO_CLEAR,FLAG_ONGOING_EVENT,
     * Androida.FLAG_ONLY_ALERT_ONCE,Androida.FLAG_SHOW_LIGHTS
     * 
     * @param value
     */
    public final native void setFlags(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.flags = value;
    }-*/;

    public final native <T> T getIcon() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.icon;
    }-*/;

    /**
     * A resource id to an icon (the URL must be an image located in
     * Resources/android/images/ or an Androida content URI)
     * 
     * @param value
     */
    public final native void setIcon(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.icon = value;
    }-*/;

    /**
     * A URL to an icon (the URL must be an image located in
     * Resources/android/images/ or an Androida content URI)
     * 
     * @param value
     */
    public final native void setIcon(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.icon = value;
    }-*/;

    public final native int getLedARGB() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.ledARGB;
    }-*/;

    /**
     * Sets the color for the LED to blink
     * 
     * @param value
     */
    public final native void setLedARGB(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ledARGB = value;
    }-*/;

    public final native int getLedOffMS() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.ledOffMS;
    }-*/;

    /**
     * Sets the number of milliseconds for the LED to be off while it's
     * flashing.
     * 
     * @param value
     */
    public final native void setLedOffMS(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ledOffMS = value;
    }-*/;

    public final native int getLedOnMS() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.ledOnMS;
    }-*/;

    /**
     * Sets the number of milliseconds for the LED to be on while it's flashing.
     * 
     * @param value
     */
    public final native void setLedOnMS(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ledOnMS = value;
    }-*/;

    public final native int getNumber() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.number;
    }-*/;

    /**
     * Set the number of events that jso notification represents.
     * 
     * @param value
     */
    public final native void setNumber(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.number = value;
    }-*/;

    public final native String getSound() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.sound;
    }-*/;

    /**
     * Set a URL to the sound to play (supports Android + Titanium URLs)
     * 
     * @param value
     */
    public final native void setSound(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.sound = value;
    }-*/;

    public final native String getTickerText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.tickerText;
    }-*/;

    /**
     * Text to scroll across the screen when jso item is added to the status
     * bar.
     * 
     * @param value
     */
    public final native void setTickerText(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.tickerText = value;
    }-*/;

    public final native JsDate getWhen() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.when;
    }-*/;

    /**
     * The timestamp for the notification (defaults to the current time)
     * 
     * @param value
     */
    public final native void setWhen(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.when = value;
    }-*/;

    /**
     * The timestamp for the notification (defaults to the current time)
     * 
     * @param value
     */
    public final native void setWhen(JsDate value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.when = value;
    }-*/;

}
