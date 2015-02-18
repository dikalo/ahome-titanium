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

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * A module used for accessing clipboard data.
 */
public class Clipboard extends TiModule {

    private static Clipboard instance = null;

    public static Clipboard get() {
        if (instance == null) {
            return new Clipboard();
        }
        return instance;
    }

    private Clipboard() {
        createPeer();
    }

    /**
     * Clear data of the given mime-type from the clipboard. if no mime-type is
     * given, clear all data from the clipboard.
     * 
     * @param type
     *            (optional) The mime-type of the data to clear.
     */
    public static native void clearData(String type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.clearData(type);
    }-*/;

    /**
     * Clear the text portion of the clipboard.
     */
    public native void clearText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.clearText();
    }-*/;

    /**
     * Get the data on the clipboard from the portion which contains data of the
     * given mime-type.
     * 
     * @param type
     *            The mime-type of the data to get.
     */
    public static native void getData(String type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.getData(type);
    }-*/;

    /**
     * Get the current text on the clipboard.
     */
    public native String getText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getText();
    }-*/;

    /**
     * Return true if there is any content of the given mime-type on the
     * clipboard.
     * 
     * @param type
     *            (optional) The mime-type of the data to check.
     */
    public native boolean hasData(String type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasData(type);
    }-*/;

    /**
     * Return true if there is any content in the text portion of the clipboard.
     */
    public native boolean hasText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasText();
    }-*/;

    /**
     * Set the data on the clipboard given a mime-type and the new data. this
     * method will set data on the appropriate portion of the clipboard for the
     * given mime-type.
     * 
     * @param type
     *            The mime-type of the data to set.
     * @param data
     *            The new clipboard text.
     */
    public native void setData(String type, Object data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setData(type, data);
    }-*/;

    /**
     * Set the text on the clipboard. this will overwrite the current contents
     * of the clipboard.
     * 
     * @param text
     *            The new clipboard text. If the text is an empty string
     */
    public native void setText(String text) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setText(text);
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeClipboardModule();
    }

}
