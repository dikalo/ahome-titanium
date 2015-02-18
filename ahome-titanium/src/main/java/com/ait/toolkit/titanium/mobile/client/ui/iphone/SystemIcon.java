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
 * A set of constants for the system icon styles that can be used on a tab
 * group tab.
 */
public class SystemIcon {

    public static final int BOOKMARKS = BOOKMARKS();
    public static final int CONTACTS = CONTACTS();
    public static final int DOWNLOADS = DOWNLOADS();
    public static final int FAVORITES = FAVORITES();
    public static final int FEATURED = FEATURED();
    public static final int HISTORY = HISTORY();
    public static final int MORE = MORE();
    public static final int MOST_RECENT = MOST_RECENT();
    public static final int MOST_VIEWED = MOST_VIEWED();
    public static final int RECENTS = RECENTS();
    public static final int SEARCH = SEARCH();
    public static final int TOP_RATED = TOP_RATED();

    private SystemIcon() {
    }

    private static native final int BOOKMARKS() /*-{
		return Titanium.UI.iPhone.SystemIcon.BOOKMARKS;
    }-*/;

    private static native final int CONTACTS() /*-{
		return Titanium.UI.iPhone.SystemIcon.CONTACTS;
    }-*/;

    private static native final int DOWNLOADS() /*-{
		return Titanium.UI.iPhone.SystemIcon.DOWNLOADS;
    }-*/;

    private static native final int FAVORITES() /*-{
		return Titanium.UI.iPhone.SystemIcon.FAVORITES;
    }-*/;

    private static native final int FEATURED() /*-{
		return Titanium.UI.iPhone.SystemIcon.FEATURED;
    }-*/;

    private static native final int HISTORY() /*-{
		return Titanium.UI.iPhone.SystemIcon.HISTORY;
    }-*/;

    private static native final int MORE() /*-{
		return Titanium.UI.iPhone.SystemIcon.MORE;

    }-*/;

    private static native final int MOST_RECENT() /*-{
		return Titanium.UI.iPhone.SystemIcon.MOST_RECENT;
    }-*/;

    private static native final int MOST_VIEWED() /*-{
		return Titanium.UI.iPhone.SystemIcon.MOST_VIEWED;
    }-*/;

    private static native final int RECENTS() /*-{
		return Titanium.UI.iPhone.SystemIcon.RECENTS;
    }-*/;

    private static native final int SEARCH() /*-{
		return Titanium.UI.iPhone.SystemIcon.SEARCH;
    }-*/;

    private static native final int TOP_RATED() /*-{
		return Titanium.UI.iPhone.SystemIcon.TOP_RATED;
    }-*/;

}
