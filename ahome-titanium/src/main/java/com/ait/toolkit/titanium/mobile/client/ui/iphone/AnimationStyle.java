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
package com.ait.toolkit.titanium.mobile.client.ui.iphone;

/**
 * A set of constants for the animation styles used for transitions.
 */
public class AnimationStyle {

    public static final int ANIMATON_STYLE_CURL_DOWN = CURL_DOWN();
    public static final int ANIMATON_STYLE_CURL_UP = CURL_UP();
    public static final int ANIMATON_STYLE_FLIP_FROM_LEFT = FLIP_FROM_LEFT();
    public static final int ANIMATON_STYLE_FLIP_FROM_RIGHT = FLIP_FROM_RIGHT();
    public static final int ANIMATON_STYLE_NONE = NONE();

    private AnimationStyle() {
    }

    public static native final int CURL_DOWN() /*-{
		return Titanium.UI.iPhone.AnimationStyle.CURL_DOWN;
    }-*/;

    public static native final int CURL_UP() /*-{
		return Titanium.UI.iPhone.AnimationStyle.CURL_UP;
    }-*/;

    public static native final int FLIP_FROM_LEFT() /*-{
		return Titanium.UI.iPhone.AnimationStyle.FLIP_FROM_LEFT;
    }-*/;

    public static native final int FLIP_FROM_RIGHT() /*-{
		return Titanium.UI.iPhone.AnimationStyle.FLIP_FROM_RIGHT;
    }-*/;

    public static native final int NONE() /*-{
		return Titanium.UI.iPhone.AnimationStyle.NONE;
    }-*/;

}
