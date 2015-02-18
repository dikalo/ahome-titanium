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
 * A set of constants for the position value that can be used for the position
 * property of ListViewAnimationProperties when invoking the ListView's
 * scrollToItem, appendSection, deleteSectionAt, insertSectionAt and
 * replaceSectionAt methods.
 */
public class ListViewScrollPosition {

    public static final int LISTVIEW_SCROLL_SELECTION_STYLE_BOTTOM = BOTTOM();
    public static final int LISTVIEW_SCROLL_SELECTION_STYLE_MIDDLE = MIDDLE();
    public static final int LISTVIEW_SCROLL_SELECTION_STYLE_NONE = NONE();
    public static final int LISTVIEW_SCROLL_SELECTION_STYLE_TOP = TOP();

    private ListViewScrollPosition() {
    }

    public static native final int BOTTOM() /*-{
		return Titanium.UI.iPhone.ListViewScrollPosition.BOTTOM;
    }-*/;

    public static native final int MIDDLE() /*-{
		return Titanium.UI.iPhone.ListViewScrollPosition.MIDDLE;
    }-*/;

    public static native final int NONE() /*-{
		return Titanium.UI.iPhone.ListViewScrollPosition.NONE;
    }-*/;

    public static native final int TOP() /*-{
		return Titanium.UI.iPhone.ListViewScrollPosition.TOP;
    }-*/;

}
