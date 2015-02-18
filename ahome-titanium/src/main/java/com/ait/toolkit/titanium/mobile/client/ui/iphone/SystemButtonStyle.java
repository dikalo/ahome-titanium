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
 * A set of constants for the system button styles that can be used for the
 * button style property.
 */
public class SystemButtonStyle {

    public static final int SYSTEM_BUTTON_STYLE_BAR = BAR();
    public static final int SYSTEM_BUTTON_STYLE_BORDERED = BORDERED();
    public static final int SYSTEM_BUTTON_STYLE_DONE = DONE();
    public static final int SYSTEM_BUTTON_STYLE_PLAIN = PLAIN();

    public SystemButtonStyle() {
    }

    public static native final int BAR() /*-{
		return Titanium.UI.iPhone.SystemButtonStyle.BAR;
    }-*/;

    public static native final int BORDERED() /*-{
		return Titanium.UI.iPhone.SystemButtonStyle.BORDERED;
    }-*/;

    public static native final int DONE() /*-{
		return Titanium.UI.iPhone.SystemButtonStyle.DONE;
    }-*/;

    public static native final int PLAIN() /*-{
		return Titanium.UI.iPhone.SystemButtonStyle.PLAIN;
    }-*/;

}
