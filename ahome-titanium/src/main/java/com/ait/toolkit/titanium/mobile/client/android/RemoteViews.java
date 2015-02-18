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
 * The Titanium binding of Android RemoteViews. RemoteViews are an API for
 * referencing and updating views that live in another process (i.e. in a
 * com.ait.toolkit.titanium.mobile.client.Notification)
 */
public class RemoteViews extends EventDispatcher {

    protected RemoteViews(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Call a method taking one boolean on a view in the layout for this
     * RemoteViews. See AndroidMedia's documentation for setBoolean
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param methodName
     *            , The name of the method to call
     * @param value
     *            , The boolean to pass to the method
     */
    public native void setBoolean(int viewId, String methodName, boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setBoolean(viewId, methodName, value);
    }-*/;

    /**
     * Sets a chronometer's base, format, and started flag. See AndroidMedia's
     * documentation for setChronometer
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param methodName
     *            , The name of the method to call
     * 
     * @param base
     *            , The time at which the timer would have read 0:00
     * @param format
     *            , The Chronometer format string, or null to simply display the
     *            timer value
     * @param started
     *            , True if you want the clock to be started, false if not
     */
    public native void setChronometer(int viewId, JsDate base, String format, boolean started) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setChronometer(viewId, base, format, started);
    }-*/;

    /**
     * Call a method taking one double on a view in the layout for this
     * RemoteViews. See AndroidMedia's documentation for setDouble
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param methodName
     *            , The name of the method to call
     * @param value
     *            , The double to pass to the method
     */
    public native void setDouble(int viewId, String methodName, double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setDouble(viewId, methodName, value);
    }-*/;

    /**
     * Sets an ImageView's source given a Resource ID. See AndroidMedia's
     * documentation for setImageViewResource
     * 
     * @param viewId
     *            , The resource id of the ImageView whose image should change
     *            (also see Titanium.App.Android.R)
     * @param srcId
     *            , The resource id of the image
     */
    public native void setViewResource(int viewId, int srcId) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setViewResource(viewId, srcId);
    }-*/;

    /**
     * Sets an ImageView's source given a URI (supports both AndroidMedia and
     * Titanium URLs). See AndroidMedia's documentation for setImageViewUri
     * 
     * @param viewId
     *            , The resource id of the ImageView whose image should change
     *            (also see Titanium.App.Android.R)
     * @param uri
     *            , The URI of the image (both AndroidMedia and Titanium URLs
     *            are supported)
     */
    public native void setImageViewUri(int viewId, String uri) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setImageViewUri(viewId, uri);
    }-*/;

    /**
     * Call a method taking one int on a view in the layout for this
     * RemoteViews. See AndroidMedia's documentation for setInt
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param methodName
     *            , The name of the method to call
     * @param value
     *            , The int to pass to the method
     */
    public native void setInt(int viewId, String methodName, int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setInt(viewId, methodName, value);
    }-*/;

    /**
     * Launches a Titanium.Android.PendingIntent when the specified view is
     * clicked. See AndroidMedia's documentation for setOnClickPendingIntent
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param intent
     *            , The PendingIntent to execute when this view is clicked
     */
    public native void setOnclickPendingIntent(int viewId, PendingIntent intent) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setOnclickPendingIntent(viewId,
				intent.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets the progress, max value, and indeterminate flag of a ProgressBar.
     * See AndroidMedia's documentation for setProgressBar
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param max
     *            , The new max value of the ProgressBar
     * @param progress
     *            , The new progress value of the ProgressBar (from 0..max)
     * @param indeterminate
     *            , Whether or not the progress in indeterminate
     */
    public native void setProgressBar(int viewId, int max, int progress, boolean indeterminate) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setProgressBar(viewId, max, progress, indeterminate);
    }-*/;

    /**
     * Call a method taking one string on a view in the layout for this
     * RemoteViews. See AndroidMedia's documentation for setString
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param methodName
     *            , The name of the method to call
     * @param value
     *            , The string to pass to the method
     */
    public native void setString(int viewId, String methodName, String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setString(viewId, methodName, value);
    }-*/;

    /**
     * Sets the text color of a view. See AndroidMedia's documentation for
     * setTextColor
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param color
     *            , A color as an integer
     */
    public native void setTextColor(int viewId, int color) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setTextColor(viewId, color);
    }-*/;

    /**
     * Sets the text of a TextView. See AndroidMedia's documentation for
     * setTextViewText
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param text
     *            ,The new text of the TextView
     */
    public native void setTextViewText(int viewId, String text) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setTextViewText(viewId, text);
    }-*/;

    /**
     * Call a method taking one Uri on a view in the layout for this
     * RemoteViews. See AndroidMedia's documentation for setUri
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param methodName
     *            , The name of the method to call
     * @param value
     *            , The URI(as string) to pass to the method
     */
    public native void setUri(int viewId, String methodName, String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setUri(viewId, methodName, value);
    }-*/;

    /**
     * Sets the visibility of a View. See AndroidMedia's documentation for
     * setViewVisibility
     * 
     * @param viewId
     *            , The resource id of the View (also see
     *            Titanium.App.Android.R)
     * @param visibility
     *            , The visibility, one of AndroidMedia.VISIBLE,
     *            AndroidMedia.INVISIBLE, or AndroidMedia.GONE
     */
    public native void setViewVisibility(int viewId, int visibility) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setViewVisibility(viewId, visibility);
    }-*/;

}
