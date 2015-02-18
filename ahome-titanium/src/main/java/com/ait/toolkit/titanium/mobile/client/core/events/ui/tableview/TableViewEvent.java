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
import com.ait.toolkit.titanium.mobile.client.data.TableViewBaseModel;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.ait.toolkit.titanium.mobile.client.ui.TableViewRow;
import com.ait.toolkit.titanium.mobile.client.ui.TableViewSection;
import com.google.gwt.core.client.JavaScriptObject;

public class TableViewEvent extends UIEvent {

    public static String DELETE = "delete";
    public static String MOVE = "move";
    public static String SCROLL = "scroll";
    public static String SCROLL_END = "scrollEnd";

    protected TableViewEvent() {

    }

    TableViewEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * table view row index
     */
    public native int getIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.index;
    }-*/;

    /**
     * table view section object
     */
    public native TableViewSection getSection() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.section;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.TableViewSection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * boolean to indicate if the right area was clicked
     */
    public native boolean isDetail() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.detail;
    }-*/;

    /**
     * boolean to indicate if the table is in search mode
     */
    public native boolean isSearchMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.searchMode;
    }-*/;

    /**
     * table view row data object
     */
    public native TableViewBaseModel getRowData() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.rowData;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.data.TableViewBaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * table view row object
     */
    public native TableViewRow getRow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.row;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.TableViewRow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * the row index of the topmost visible row in the view (AndroidMedia only)
     */
    public native int getFirstVisibleItem() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.firstVisibleItem;
    }-*/;

    /**
     * the number of rows currently visible in the view (AndroidMedia only)
     */
    public native int getVisibleItemCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.visibleItemCount;
    }-*/;

    /**
     * dictionary with x and y properties containing the content offset (iOS
     * only)
     */
    public native Point getContentOffset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.contentOffset;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * the total number of rows in the view (AndroidMedia only)
     */
    public native int getTotalItemCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.totalItemCount;
    }-*/;

    /**
     * dictionary with widt` and height properties containing the size of the
     * content (regardless of the display size in the case of scrolling) (iOS
     * only)
     */
    public native Size getContentSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.contentSize;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * dictionary with width and height properties containing the size of the
     * visible table view
     */
    public native Size getSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.size;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
