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

/**
 * The Titanium binding of an AndroidMedia Pending Intent.
 * 
 * The type of Intent you choose will effect what kind of PendingIntent is
 * created. Each type corresponds directly with a get method on AndroidMedia's
 * PendingIntent:
 * <ul>
 * <li>Titanium.Android.createIntent uses PendingIntent.getActivity</li>
 * <li>Titanium.Android.createBroadcastIntent uses PendingIntent.getBroadcast</li>
 * <li>Titanium.Android.createServiceIntent uses PendingIntent.getService</li>
 * <ul>
 */
public class PendingIntent extends EventDispatcher {

    protected PendingIntent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public final native int getFlags() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.flags;
    }-*/;

    /**
     * Flags used for creating the Pending Intent. Possible values are
     * Titanium.Android.FLAG_CANCEL_CURRENT, Titanium.Android.FLAG_NO_CREATE,
     * Titanium.Android.FLAG_ONE_SHOT, and Titanium.Android.FLAG_UPDATE_CURRENT.
     * 
     * @param value
     */
    public final native void setFlags(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.flags = value;
    }-*/;

    public final native Intent getIntent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.intent;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The intent data to pass to the Activity launched by this PendingIntent
     * 
     * @param value
     */
    public final native void setIntent(Intent value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.intent = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

}
