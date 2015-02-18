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
package com.ait.toolkit.titanium.mobile.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A tableview section object created by the method
 * {@link com.ait.toolkit.titanium.mobile.client.ui.UI.createTableViewSection}
 */
public class TableViewSection extends View {

    public TableViewSection() {
        createPeer();
    }

    TableViewSection(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The title of the section footer
     */
    public native String getFooterTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.footerTitle;
    }-*/;

    public native void setFooterTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.footerTitle = value;
    }-*/;

    /**
     * @return A view to use instead of the default label when rendering the
     *         section footer
     */
    public native View getFooterView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.footerView;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setFooterView(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.footerView = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The title of the section header
     */
    public native String getHeaderTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.headerTitle;
    }-*/;

    public native void setHeaderTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerTitle = value;
    }-*/;

    /**
     * @return A view to use instead of the default label when rendering the
     *         section header
     */
    public native View getHeaderView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.headerView;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setHeaderView(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerView = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The (readonly) number of rows in the section
     */
    public native int getRowCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rowCount;
    }-*/;

    static JavaScriptObject fromList(List<TableViewSection> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (TableViewSection rule : values) {
            peers.push(rule.getJsObj());
        }
        return peers;
    }

    static List<TableViewSection> fromJsArray(JavaScriptObject obj) {
        List<TableViewSection> toReturn = new ArrayList<TableViewSection>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new TableViewSection(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

    @Override
    public void createPeer() {
        jsObj = UI.createTableViewSection();
    }

}
