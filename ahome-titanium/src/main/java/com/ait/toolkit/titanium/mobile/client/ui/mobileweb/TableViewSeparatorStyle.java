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
package com.ait.toolkit.titanium.mobile.client.ui.mobileweb;

/**
 * A set of constants for the style that can be used for the separatorStyle
 * property of Titanium.UI.TableView.
 */
public class TableViewSeparatorStyle {

    /**
     * The separator cell has no distinct style.
     */
    public static final double NONE = _NONE();

    /**
     * The separator cell has a single line running across its width (default.)
     */
    public static final double SINGLE_LINE = _SINGLE_LINE();

    private TableViewSeparatorStyle() {

    }

    private native static final double _NONE()/*-{
		return Titanium.UI.MobileWeb.TableViewSeparatorStyle.NONE;
    }-*/;

    private native static final double _SINGLE_LINE()/*-{
		return Titanium.UI.MobileWeb.TableViewSeparatorStyle.SINGLE_LINE;
    }-*/;

}
