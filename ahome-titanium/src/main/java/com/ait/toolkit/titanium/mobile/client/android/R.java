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

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * The Titanium binding of <code>android.R</code>. Note that this accesses
 * AndroidMedia system-wide resources, not your application's resources. To
 * access your application's resources, you want
 * com.emitrom.appcelerator.mobile.client.app.android.R
 * 
 * 
 * These properties and sub-properties are queried directly against the
 * android.R class, and should have the same syntax. For example, to retrieve
 * the "OK" string in AndroidMedia:<br/>
 * <code>AndroidMedia.getcurrentActivity().getString(R.getString("ok"))</code> ;
 */
public class R extends TiModule {

    private static R instance = null;

    private R() {
        createPeer();
    }

    public static R get() {
        if (instance == null) {
            instance = new R();
        }
        return instance;
    }

    /**
     * AnimationConfig resources, see
     * http://developer.android.com/reference/android/R.anim.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getAnim(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.anim[param];
    }-*/;

    /**
     * Array resources, see
     * http://developer.android.com/reference/android/R.array.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getArray(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.array[param];
    }-*/;

    /**
     * Attribute resources, see
     * http://developer.android.com/reference/android/R.attr.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getAttr(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.attr[param];
    }-*/;

    /**
     * Color resources, see
     * http://developer.android.com/reference/android/R.color.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getColor(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.color[param];
    }-*/;

    /**
     * Dimension resources, see
     * http://developer.android.com/reference/android/R.dimen.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getDimen(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.dimen[param];
    }-*/;

    /**
     * Drawable resources, see
     * http://developer.android.com/reference/android/R.drawable.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getDrawable(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.drawable[param];
    }-*/;

    /**
     * ID resources, see
     * http://developer.android.com/reference/android/R.id.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getId(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.id[param];
    }-*/;

    /**
     * Integer resources, see
     * http://developer.android.com/reference/android/R.integer.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getInteger(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.integer[param];
    }-*/;

    /**
     * String resources, see
     * http://developer.android.com/reference/android/R.string.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native String getString(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.string[param];
    }-*/;

    /**
     * Style resources, see
     * http://developer.android.com/reference/android/R.style.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getStyle(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.style[param];
    }-*/;

    /**
     * Styleable resources, see
     * http://developer.android.com/reference/android/R.styleable.html
     * 
     * @param <T>
     * @param param
     * @return
     */
    public native <T> T getStyleable(String param) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.styleable[param];
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createR();
    }

}
