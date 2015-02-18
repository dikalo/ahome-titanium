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

package com.ait.toolkit.titanium.mobile.client.core.events.ui;

import com.ait.toolkit.titanium.mobile.client.core.events.TiEvent;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;

public class UIEvent extends TiEvent {

    public static String ACTION = "action";
    public static String START = "start";
    public static String HIDE = "hide";
    public static String BLUR = "blur";
    public static String CANCEL = "cancel";
    public static String CHANGE = "change";
    public static String FOCUS = "focus";
    public static String ENTER = "enter";
    public static String RETURN = "return";
    public static String CLOSE = "close";
    public static String OPEN = "open";
    public static String ANDROID_BACK = "android:back";
    public static String ANDROID_CAMERA = "android:camera";
    public static String ANDROID_FOCUS = "android:focus";
    public static String ANDROID_SEARCH = "android:search";
    public static String ANDROID_VOL_DOWN = "android:voldown";
    public static String ANDROID_VOL_UP = "android:volup";

    protected UIEvent() {

    }

    private UIEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the y point of the event, in receiving view coordinates
     */
    public native double getY() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.y;
    }-*/;

    /**
     * a dictionary with properties x and y describing the point of the event in
     * screen coordinates
     */
    public native Point getGlobalPoint() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.globalPoint;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * the x point of the event in receiving view coordiantes
     */
    public native double getX() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.x;
    }-*/;
    
    public native void cancelBubble(boolean shouldCancel) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.cancelBubble = shouldCancel;
    }-*/;

}
