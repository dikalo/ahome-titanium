/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui.iphone;

import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The iphone/ipad specific ui capabilities. all properties, methods and events
 * in this namespace will only work on the apple iphone or ipad related devices.
 */
public class IPhone extends TiModule {

    public static final int MODAL_PRESENTATION_CURRENT_CONTEXT = MODAL_PRESENTATION_CURRENT_CONTEXT();
    public static final int MODAL_PRESENTATION_FORMSHEET = MODAL_PRESENTATION_FORMSHEET();
    public static final int MODAL_PRESENTATION_FULLSCREEN = MODAL_PRESENTATION_FULLSCREEN();
    public static final int MODAL_PRESENTATION_PAGESHEET = MODAL_PRESENTATION_PAGESHEET();
    public static final int MODAL_TRANSITION_STYLE_COVER_VERTICAL = MODAL_TRANSITION_STYLE_COVER_VERTICAL();
    public static final int MODAL_TRANSITION_STYLE_CROSS_DISSOLVE = MODAL_TRANSITION_STYLE_CROSS_DISSOLVE();
    public static final int MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL = MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL();
    public static final int MODAL_TRANSITION_STYLE_PARTIAL_CURL = MODAL_TRANSITION_STYLE_PARTIAL_CURL();

    private static IPhone instance;

    public static IPhone get() {
        if( instance == null ) {
            instance = new IPhone();
        }
        return instance;
    }

    private IPhone() {
        createPeer();
    }

    /**
     * @return Set the application badge for the application's icon in the
     *         springboard
     */
    public native String getAppBadge() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.appBadge;
    }-*/;

    public static native void setAppBadge( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.appBadge = value;
    }-*/;

    /**
     * @return Control whether the shake to edit system wide capability is
     *         enabled
     */
    public native boolean appSupportsShakeToEdit() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.appSupportsShakeToEdit;
    }-*/;

    public native void setAppSupportsShakeToEdit( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.appSupportsShakeToEdit = value;
    }-*/;

    /**
     * @return Control the status bar visibility
     */
    public static native boolean isStatusBarHidden() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.statusBarHidden;
    }-*/;

    /**
     * @return Constant that controls the status bar color style
     */
    public native int getStatusBarStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.statusBarStyle;
    }-*/;

    native JavaScriptObject createNavigationGroup( String elId, List<String> classes, Window rootWindow ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var cls = @com.ait.toolkit.titanium.mobile.client.ui.UI::_createClassList(Ljava/util/List;)(classes);
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.UI::createIfPossible(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)('Titanium.UI.iphone.NavigationGroup', elId, classes)
		return obj
				|| jso
						.createNavigationGroup({
							window : rootWindow.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
							id : elId,
							'class' : cls
						});
    }-*/;

    /**
     * Convenience method to hide the status bar
     * 
     * @param animated
     *            boolean to indicate if the action should be animated
     * @param animationStyle
     *            the animation style
     */
    public native void hideStatusBar( boolean animated, int animationStyle ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hideStatusBar(animated, animationStyle);
    }-*/;

    /**
     * Convenience method to show the status bar
     * 
     * @param animated
     *            boolean to indicate if the action should be animated
     * @param animationStyle
     *            the animation style
     */
    public native void showStatusBar( boolean animated, int animationStyle ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showStatusBar(animated, animationStyle);
    }-*/;

    private static native final int MODAL_PRESENTATION_CURRENT_CONTEXT() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_CURRENT_CONTEXT;
    }-*/;

    private static native final int MODAL_PRESENTATION_FORMSHEET() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_FORMSHEET;
    }-*/;

    private static native final int MODAL_PRESENTATION_FULLSCREEN() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_FULLSCREEN;
    }-*/;

    private static native final int MODAL_PRESENTATION_PAGESHEET() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_PAGESHEET;
    }-*/;

    private static native final int MODAL_TRANSITION_STYLE_COVER_VERTICAL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_COVER_VERTICAL;
    }-*/;

    private static native final int MODAL_TRANSITION_STYLE_CROSS_DISSOLVE() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_CROSS_DISSOLVE;
    }-*/;

    private static native final int MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL;
    }-*/;

    private static native final int MODAL_TRANSITION_STYLE_PARTIAL_CURL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_PARTIAL_CURL;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeIPhoneUiModule();
    }

}
