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
package com.ait.toolkit.titanium.mobile.client.ui.ipad;

import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The ipad specific ui capabilities. all properties, methods and events in this
 * namespace will only work on the apple ipad related devices. to develop for
 * ipad, you will need the apple iphone sdk 3.2 or later and titanium mobile sdk
 * 1.2 or later. for ipad ui programming guidelines, please review the ipad
 * human interface
 * guidelines(http://developer.apple.com/iphone/library/documentation
 * /general/conceptual/ipadhig/introduction/introduction.html).
 * <p>
 * Custom Fonts
 * 
 * The iPad supports the ability to embed your own fonts in your iPad
 * application. To add your own fonts, you should add the
 */
public class IPad extends TiModule {

    public static final int POPOVER_ARROW_DIRECTION_ANY = POPOVER_ARROW_DIRECTION_ANY();
    public static final int POPOVER_ARROW_DIRECTION_DOWN = POPOVER_ARROW_DIRECTION_DOWN();
    public static final int POPOVER_ARROW_DIRECTION_LEFT = POPOVER_ARROW_DIRECTION_LEFT();
    public static final int POPOVER_ARROW_DIRECTION_RIGHT = POPOVER_ARROW_DIRECTION_RIGHT();
    public static final int POPOVER_ARROW_DIRECTION_UNKNOWN = POPOVER_ARROW_DIRECTION_UNKNOWN();
    public static final int POPOVER_ARROW_DIRECTION_UP = POPOVER_ARROW_DIRECTION_UP();

    private IPad() {
        createPeer();
    }

    native static JavaScriptObject createPopover( String elId, List<String> classes )/*-{
		var cls = @com.ait.toolkit.titanium.mobile.client.ui.UI::_createClassList(Ljava/util/List;)(classes);
		return Ti.iPad.Android.createPopover({
			id : elId,
			'class' : cls
		});
    }-*/;

    native static JavaScriptObject createDocumentViewer( String elId, List<String> classes )/*-{
		var cls = @com.ait.toolkit.titanium.mobile.client.ui.UI::_createClassList(Ljava/util/List;)(classes);
		return Ti.iPad.createDocumentViewer({
			id : elId,
			"class" : cls
		});
    }-*/;

    static native JavaScriptObject createSplitWindow( String elId, List<String> classes, View detail, View master ) /*-{
		var d = detail.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var m = master.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var cls = @com.ait.toolkit.titanium.mobile.client.ui.UI::_createClassList(Ljava/util/List;)(classes);
		return Titanium.UI.iPad.createSplitWindow({
			detailView : d,
			id : elId,
			masterView : m,
			"class" : cls
		});
    }-*/;

    private static native final int POPOVER_ARROW_DIRECTION_ANY() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_ANY;
    }-*/;

    private static native final int POPOVER_ARROW_DIRECTION_DOWN() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_DOWN;
    }-*/;

    private static native final int POPOVER_ARROW_DIRECTION_LEFT() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_LEFT;
    }-*/;

    private static native final int POPOVER_ARROW_DIRECTION_RIGHT() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_RIGHT;
    }-*/;

    private static native final int POPOVER_ARROW_DIRECTION_UNKNOWN() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UNKNOWN;
    }-*/;

    private static native final int POPOVER_ARROW_DIRECTION_UP() /*-{
		return Titanium.UI.iPad.POPOVER_ARROW_DIRECTION_UP;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeIPadUiModule();
    }

}
