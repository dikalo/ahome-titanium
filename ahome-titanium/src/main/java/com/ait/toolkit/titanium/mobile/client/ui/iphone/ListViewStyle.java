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
 * A set of constants for the style that can be used for the style property of
 * Titanium.UI.ListView.
 */
public class ListViewStyle {

    public static final int LISTVIEW_STYLE_GROUPED = GROUPED();
    public static final int LISTVIEW_STYLE_PLAIN = PLAIN();

    private ListViewStyle() {
    }

    public static native final int GROUPED() /*-{
		return Titanium.UI.iPhone.ListViewStyle.GROUPED;
    }-*/;

    public static native final int PLAIN() /*-{
		return Titanium.UI.iPhone.ListViewStyle.PLAIN;
    }-*/;

}
