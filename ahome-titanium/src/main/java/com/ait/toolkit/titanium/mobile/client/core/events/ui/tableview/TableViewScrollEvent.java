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

package com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview;

import com.ait.toolkit.titanium.mobile.client.core.Size;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;

public class TableViewScrollEvent extends UIEvent {

    public static final String SCROLL = "scroll";
    public static final String SCROLL_END = "scrollEnd";

    protected TableViewScrollEvent() {

    }

    protected TableViewScrollEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the row index of the topmost visible row in the view (AndroidMedia only)
     */
    public final native int getFirstVisibleItem() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.firstVisibleItem;
    }-*/;

    /**
     * the number of rows currently visible in the view (AndroidMedia only)
     */
    public final native int getVisibleItemCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.visibleItemCount;
    }-*/;

    /**
     * dictionary with x and y properties containing the content offset (iOS
     * only)
     */
    public final native Point getContentOffset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.contentOffset;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * the total number of rows in the view (AndroidMedia only)
     */
    public final native int getTotalItemCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.totalItemCount;
    }-*/;

    /**
     * dictionary with widt` and height properties containing the size of the
     * content (regardless of the display size in the case of scrolling) (iOS
     * only)
     */
    public final native Size getContentSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.contentSize;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * dictionary with width and height properties containing the size of the
     * visible table view
     */
    public final native Size getSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.size;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
