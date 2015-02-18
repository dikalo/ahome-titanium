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
package com.ait.toolkit.titanium.mobile.client.ui.android;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * The android specific UI capabilities. all properties, methods and events in
 * this namespace will only work on android related devices.
 */
public class Android extends TiModule {

    public static final int ANDROID_UI_OVER_SCROLL_ALWAYS = OVER_SCROLL_ALWAYS();
    public static final int ANDROID_UI_OVER_SCROLL_IF_CONTENT_SCROLLS = OVER_SCROLL_IF_CONTENT_SCROLLS();
    public static final int ANDROID_UI_OVER_SCROLL_NEVER = OVER_SCROLL_NEVER();
    public static final int ANDROID_UI_PIXEL_FORMAT_A_8 = PIXEL_FORMAT_A_8();
    public static final int ANDROID_UI_PIXEL_FORMAT_LA_88 = PIXEL_FORMAT_LA_88();
    public static final int ANDROID_UI_PIXEL_FORMAT_L_8 = PIXEL_FORMAT_L_8();
    public static final int ANDROID_UI_PIXEL_FORMAT_OPAQUE = PIXEL_FORMAT_OPAQUE();
    public static final int ANDROID_UI_PIXEL_FORMAT_RGBA_4444 = PIXEL_FORMAT_RGBA_4444();
    public static final int ANDROID_UI_PIXEL_FORMAT_RGBA_5551 = PIXEL_FORMAT_RGBA_5551();
    public static final int ANDROID_UI_PIXEL_FORMAT_RGBX_8888 = PIXEL_FORMAT_RGBX_8888();
    public static final int ANDROID_UI_PIXEL_FORMAT_RGBA_8888 = PIXEL_FORMAT_RGBA_8888();
    public static final int ANDROID_UI_PIXEL_FORMAT_RGB_332 = PIXEL_FORMAT_RGB_332();
    public static final int ANDROID_UI_PIXEL_FORMAT_RGB_565 = PIXEL_FORMAT_RGB_565();
    public static final int ANDROID_UI_PIXEL_FORMAT_RGB_888 = PIXEL_FORMAT_RGB_888();
    public static final int ANDROID_UI_PIXEL_FORMAT_TRANSLUCENT = PIXEL_FORMAT_TRANSLUCENT();
    public static final int ANDROID_UI_PIXEL_FORMAT_TRANSPARENT = PIXEL_FORMAT_TRANSPARENT();
    public static final int ANDROID_UI_PIXEL_FORMAT_UNKNOWN = PIXEL_FORMAT_UNKNOWN();
    public static final int ANDROID_UI_PROGRESS_INDICATOR_INDETEERMINANT = PROGRESS_INDICATOR_INDETEERMINANT();
    public static final int ANDROID_UI_PROGRESS_INDICATOR_STATUS_BAR = PROGRESS_INDICATOR_STATUS_BAR();
    public static final int ANDROID_UI_ANDROID_UI_SOFT_INPUT_ADJUST_PAN = SOFT_INPUT_ADJUST_PAN();
    public static final int ANDROID_UI_SOFT_INPUT_ADJUST_RESIZE = SOFT_INPUT_ADJUST_RESIZE();
    public static final int ANDROID_UI_SOFT_INPUT_ADJUST_UNSPECIFIED = SOFT_INPUT_ADJUST_UNSPECIFIED();
    public static final int ANDROID_UI_SOFT_INPUT_STATE_HIDDEN = SOFT_INPUT_STATE_HIDDEN();
    public static final int ANDROID_UI_SOFT_INPUT_STATE_UNSPECIFIED = SOFT_INPUT_STATE_UNSPECIFIED();
    public static final int ANDROID_UI_SOFT_INPUT_STATE_VISIBLE = SOFT_INPUT_STATE_VISIBLE();
    public static final int ANDROID_UI_SOFT_KEYBOARD_DEFAULT_ON_FOCUS = SOFT_KEYBOARD_DEFAULT_ON_FOCUS();
    public static final int ANDROID_UI_SOFT_KEYBOARD_HIDE_ON_FOCUS = SOFT_KEYBOARD_HIDE_ON_FOCUS();
    public static final int ANDROID_UI_SOFT_KEYBOARD_SHOW_ON_FOCUS = SOFT_KEYBOARD_SHOW_ON_FOCUS();
    public static final int ANDROID_UI_SWITCH_STYLE_CHECKBOX = SWITCH_STYLE_CHECKBOX();
    public static final int ANDROID_UI_SWITCH_STYLE_TOGGLEBUTTON = SWITCH_STYLE_TOGGLEBUTTON();
    public static final int ANDROID_UI_WEBVIEW_PLUGINS_OFF = WEBVIEW_PLUGINS_OFF();
    public static final int ANDROID_UI_WEBVIEW_PLUGINS_ON = WEBVIEW_PLUGINS_ON();
    public static final int ANDROID_UI_WEBVIEW_PLUGINS_ON_DEMAND = WEBVIEW_PLUGINS_ON_DEMAND();
    
    /*
     * Animations specified in Android.R.anim
     */

    public static final String ANDROID_ANIM_ACCELERATE_DECELERATE_INTERPOLATOR = "anim.accelerate_decelerate_interpolator";
    public static final String ANDROID_ANIM_ACCELERATE_INTERPOLATOR = "anim.accelerate_interpolator";
    public static final String ANDROID_ANIM_ANTICIPATE_INTERPOLATOR = "anim.anticipate_interpolator";
    public static final String ANDROID_ANIM_ANTICIPATE_OVERSHOOT_INTERPOLATOR = "anim.anticipate_overshoot_interpolator";
    public static final String ANDROID_ANIM_BOUNCE_INTERPOLATOR = "anim.bounce_interpolator";
    public static final String ANDROID_ANIM_CYCLE_INTERPOLATOR = "anim.cycle_interpolator";
    public static final String ANDROID_ANIM_DECELERATE_INTERPOLATOR = "anim.decelerate_interpolator";
    public static final String ANDROID_ANIM_FADE_IN = "anim.fade_in";
    public static final String ANDROID_ANIM_FADE_OUT = "anim.fade_out";
    public static final String ANDROID_ANIM_LINEAR_INTERPOLATOR = "anim.linear_interpolator";
    public static final String ANDROID_ANIM_OVERSHOOT_INTERPOLATOR = "anim.overshoot_interpolator";
    public static final String ANDROID_ANIM_SLIDE_IN_LEFT = "anim.slide_in_left";
    public static final String ANDROID_ANIM_SLIDE_OUT_RIGHT = "anim.slide_out_right";
    
    private static Android instance = null;

    public static Android get() {
        if (instance == null) {
            return new Android();
        }
        return instance;
    }

    private Android() {
        createPeer();
    }

    /**
     * Request that the soft keyboard hide. note: it is not currently possible
     * in the native android api to detect that the keyboard is already visible.
     * note: it is not possible to globally show the keyboard at this point.
     */
    public native void hideSoftKeyboard() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hideSoftKeyboard();
    }-*/;

    /**
     * Open android native preferences ui activity. you need to place your
     * preferences.xml file in the platform/android/res/xml/ folder of your
     * project. documentation on the file format may be found in the [android
     * documentation
     * ](http://developer.android.com/resources/samples/apidemos/res
     * /xml/preferences.html)
     */
    public native void openPreferences() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.openPreferences();
    }-*/;

    public static native final int OVER_SCROLL_ALWAYS() /*-{
		return Titanium.UI.Android.OVER_SCROLL_ALWAYS ? Titanium.UI.Android.OVER_SCROLL_ALWAYS
				: 0;
    }-*/;

    public static native final int OVER_SCROLL_IF_CONTENT_SCROLLS() /*-{
		return Titanium.UI.Android.OVER_SCROLL_IF_CONTENT_SCROLLS ? Titanium.UI.Android.OVER_SCROLL_IF_CONTENT_SCROLLS
				: 0;
    }-*/;

    public static native final int OVER_SCROLL_NEVER() /*-{
		return Titanium.UI.Android.OVER_SCROLL_NEVER ? Titanium.UI.Android.OVER_SCROLL_NEVER
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_A_8() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_A_8 ? Titanium.UI.PIXEL_FORMAT_A_8.LINKIFY_MAP_LINKS
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_LA_88() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_LA_88 ? Titanium.UI.Android.PIXEL_FORMAT_LA_88
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_L_8() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_L_8 ? Titanium.UI.Android.PIXEL_FORMAT_L_8
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_OPAQUE() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_OPAQUE ? Titanium.UI.Android.PIXEL_FORMAT_OPAQUE
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_RGBA_4444() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGBA_4444 ? Titanium.UI.Android.PIXEL_FORMAT_RGBA_4444
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_RGBA_5551() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGBA_5551 ? Titanium.UI.Android.PIXEL_FORMAT_RGBA_5551
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_RGBA_8888() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGBA_8888 ? Titanium.UI.Android.PIXEL_FORMAT_RGBA_8888
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_RGBX_8888() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGBX_8888 ? Titanium.UI.Android.PIXEL_FORMAT_RGBX_8888
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_RGB_332() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGB_332 ? Titanium.UI.Android.PIXEL_FORMAT_RGB_332
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_RGB_565() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGB_565 ? Titanium.UI.Android.PIXEL_FORMAT_RGB_565
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_RGB_888() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_RGB_888 ? Titanium.UI.Android.PIXEL_FORMAT_RGB_888
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_TRANSLUCENT() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_TRANSLUCENT ? Titanium.UI.Android.PIXEL_FORMAT_TRANSLUCENT
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_TRANSPARENT() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_TRANSPARENT ? Titanium.UI.Android.PIXEL_FORMAT_TRANSPARENT
				: 0;
    }-*/;

    public static native final int PIXEL_FORMAT_UNKNOWN() /*-{
		return Titanium.UI.Android.PIXEL_FORMAT_UNKNOWN ? Titanium.UI.Android.PIXEL_FORMAT_UNKNOWN
				: 0;
    }-*/;

    public static native final int PROGRESS_INDICATOR_INDETEERMINANT() /*-{
		return Titanium.UI.Android.PROGRESS_INDICATOR_INDETEERMINANT ? Titanium.UI.Android.PROGRESS_INDICATOR_INDETEERMINANT
				: 0;
    }-*/;

    public static native final int PROGRESS_INDICATOR_STATUS_BAR() /*-{
		return Titanium.UI.Android.PROGRESS_INDICATOR_STATUS_BAR ? Titanium.UI.Android.PROGRESS_INDICATOR_STATUS_BAR
				: 0;
    }-*/;

    public static native final int SOFT_INPUT_ADJUST_PAN() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_PAN ? Titanium.UI.Android.SOFT_INPUT_ADJUST_PAN
				: 0;
    }-*/;

    public static native final int SOFT_INPUT_ADJUST_RESIZE() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_RESIZE ? Titanium.UI.Android.SOFT_INPUT_ADJUST_RESIZE
				: 0;
    }-*/;

    public static native final int SOFT_INPUT_ADJUST_UNSPECIFIED() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED ? Titanium.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED
				: 0;
    }-*/;

    public static native final int SOFT_INPUT_STATE_HIDDEN() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_HIDDEN ? Titanium.UI.Android.SOFT_INPUT_STATE_HIDDEN
				: 0;
    }-*/;

    public static native final int SOFT_INPUT_STATE_UNSPECIFIED() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_UNSPECIFIED ? Titanium.UI.Android.SOFT_INPUT_STATE_UNSPECIFIED
				: 0;
    }-*/;

    public static native final int SOFT_INPUT_STATE_VISIBLE() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_VISIBLE ? Titanium.UI.Android.SOFT_INPUT_STATE_VISIBLE
				: 0;
    }-*/;

    public static native final int SOFT_KEYBOARD_DEFAULT_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS ? Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS
				: 0;
    }-*/;

    public static native final int SOFT_KEYBOARD_HIDE_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS ? Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS
				: 0;
    }-*/;

    public static native final int SOFT_KEYBOARD_SHOW_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS ? Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS
				: 0;
    }-*/;

    public static native final int SWITCH_STYLE_CHECKBOX() /*-{
		return Titanium.UI.Android.SWITCH_STYLE_CHECKBOX ? Titanium.UI.Android.SWITCH_STYLE_CHECKBOX
				: 0;
    }-*/;

    public static native final int SWITCH_STYLE_TOGGLEBUTTON() /*-{
		return Titanium.UI.Android.SWITCH_STYLE_TOGGLEBUTTON ? Titanium.UI.Android.SWITCH_STYLE_TOGGLEBUTTON
				: 0;
    }-*/;

    public static native final int WEBVIEW_PLUGINS_OFF() /*-{
		return Titanium.UI.Android.WEBVIEW_PLUGINS_OFF ? Titanium.UI.Android.WEBVIEW_PLUGINS_OFF
				: 0;
    }-*/;

    public static native final int WEBVIEW_PLUGINS_ON() /*-{
		return Titanium.UI.Android.WEBVIEW_PLUGINS_ON ? Titanium.UI.Android.WEBVIEW_PLUGINS_ON
				: 0;
    }-*/;

    public static native final int WEBVIEW_PLUGINS_ON_DEMAND() /*-{
		return Titanium.UI.Android.WEBVIEW_PLUGINS_ON_DEMAND ? Titanium.UI.Android.WEBVIEW_PLUGINS_ON_DEMAND
				: 0;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeAndroidUIModule();
    }

}
