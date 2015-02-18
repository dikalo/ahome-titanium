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
 * A set of constants for the styles available for
 * {@link com.ait.toolkit.titanium.mobile.client.ui.ActivityIndicator} objects.
 */
public class ScrollIndicatorStyle {

    public static final int BLACK = BLACK();
    public static final int DEFAULT = DEFAULT();
    public static final int WHITE = WHITE();

    private ScrollIndicatorStyle() {
    }

    private static native final int BLACK() /*-{
		return Titanium.UI.iPhone.ScrollIndicatorStyle.BLACK;
    }-*/;

    private static native final int DEFAULT() /*-{
		return Titanium.UI.iPhone.ScrollIndicatorStyle.DEFAULT;
    }-*/;

    private static native final int WHITE() /*-{
		return Titanium.UI.iPhone.ScrollIndicatorStyle.WHITE;
    }-*/;

}
