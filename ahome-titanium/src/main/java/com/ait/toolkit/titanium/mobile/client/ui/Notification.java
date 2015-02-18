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
package com.ait.toolkit.titanium.mobile.client.ui;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An Android Toast-style notification.
 * 
 * @Android only
 * 
 */
public class Notification extends View {

    public Notification() {
        createPeer();
    }

    Notification(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return the value of the duration property.
     */
    public native double getDurartion() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.duration;
    }-*/;

    /**
     * Sets the value of the duration property
     * 
     * @param value
     */
    public native void setDuration(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.duration = value;
    }-*/;

    /**
     * @return the value of the horizontalMargin property.
     */
    public native double getHorizontalMargin() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.horizontalMargin;
    }-*/;

    /**
     * Sets the value of the horizontalMargin property
     * 
     * @param value
     */
    public void setHorizontalMargin(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "horizontalMargin", value);
    }

    /**
     * @return the value of the message property.
     */
    public native String getMessage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.message;
    }-*/;

    /**
     * Sets the value of the message property
     * 
     * @param value
     */
    public native void setMessage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.message = value;
    }-*/;

    /**
     * @return the value of the verticalMargin property.
     */
    public native double getVerticalMargin() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.verticalMargin;
    }-*/;

    /**
     * Sets the value of the verticalMargin property
     * 
     * @param value
     */
    public void setVerticalMargin(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "verticalMargin", value);
    }

    /**
     * @return the value of the xOffset property.
     */
    public native double getXOffset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.xOffest;
    }-*/;

    /**
     * Sets the value of the xOffset property
     * 
     * @param value
     */
    public void setXOffset(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "xOffset", value);
    }

    /**
     * @return the value of the yOffset property.
     */
    public native double getYOffset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.yOffest;
    }-*/;

    /**
     * Sets the value of the yOffset property
     * 
     * @param value
     */
    public void setYOffset(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "yOffset", value);
    }

    /**
     * show the notification
     */
    public native void show() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.show();
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createNotification();
    }

    public static Notification from(JsObject proxy) {
        return new Notification(proxy.getJsObj());
    }
}
