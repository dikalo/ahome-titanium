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
 * A set of constants for the bar styles used on the 'style property of
 * {@link com.ait.toolkit.titanium.mobile.client.ui.ProgressBar}
 */
public class ProgressBarStyle {

    public static final int BAR = BAR();
    public static final int DEFAULT = DEFAULT();
    public static final int PLAIN = PLAIN();

    private ProgressBarStyle() {

    }

    private static native final int BAR() /*-{
		return Titanium.UI.iPhone.ProgressBarStyle.BAR;
    }-*/;

    private static native final int DEFAULT() /*-{
		return Titanium.UI.iPhone.ProgressBarStyle.DEFAULT;
    }-*/;

    private static native final int PLAIN() /*-{
		return Titanium.UI.iPhone.ProgressBarStyle.PLAIN;
    }-*/;

}
