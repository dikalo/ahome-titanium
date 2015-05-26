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
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.ui.fx.TableViewAnimation;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ListSection extends JsObject {

    public ListSection() {
        jsObj = createPeer();
    }

    public ListSection(String headerTitle) {
        this();
        this.setHeaderTitle(headerTitle);
    }

    public ListSection(String headerTitle, ListDataItem... items) {
        this();
        this.setHeaderTitle(headerTitle);
        this.setItems(items);
    }

    public ListSection(String headerTitle, ListItem... items) {
        this();
        this.setHeaderTitle(headerTitle);
        List<ListDataItem> data = new ArrayList<ListDataItem>();
        for (ListItem item : items) {
            ListDataItem dataSet = new ListDataItem(item);
            data.add(dataSet);
        }
        this.setItems(data);
    }

    public ListSection(String headerTitle, String footerTitle) {
        this();
        this.setHeaderTitle(headerTitle);
        this.setFooterTitle(footerTitle);
    }

    public ListSection(String headerTitle, String footerTitle, ListDataItem... items) {
        this();
        this.setHeaderTitle(headerTitle);
        this.setFooterTitle(footerTitle);
        this.setItems(items);
    }

    public ListSection(String headerTitle, String footerTitle, ListItem... items) {
        this();
        this.setHeaderTitle(headerTitle);
        this.setFooterTitle(footerTitle);
        List<ListDataItem> data = new ArrayList<ListDataItem>();
        for (ListItem item : items) {
            ListDataItem dataSet = new ListDataItem(item);
            data.add(dataSet);
        }
        this.setItems(data);
    }

    protected ListSection(JavaScriptObject obj) {
        this.jsObj = obj;
    }

    public native String getFooterTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.footerTitle;
    }-*/;

    public native void setFooterTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.footerTitle = value;
    }-*/;

    /**
     * View to use for this section footer.
     */
    public native View getFooterView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return @com.ait.toolkit.titanium.mobile.client.ui.View::from(Lcom/ait/toolkit/core/client/JsObject;)(jso.footerView);
    }-*/;

    /**
     * View to use for this section footer.
     */
    public native void setFooterView(View view) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.footerView = view.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native String getHeaderTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.headerTitle;
    }-*/;

    public native void setHeaderTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerTitle = value;
    }-*/;

    /**
     * View to use for this section header.
     */
    public native View getHeaderView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return @com.ait.toolkit.titanium.mobile.client.ui.View::from(Lcom/ait/toolkit/core/client/JsObject;)(jso.headerView);
    }-*/;

    /**
     * View to use for this section header.
     */
    public native void setHeaderView(View view) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerView = view.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Items of this list section.
     */
    public void setItems(ListDataItem... dataItems) {
        setItems(Arrays.asList(dataItems));
    }

    /**
     * Items of this list section.
     */
    public native void setItems(List<ListDataItem> values) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.items = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromList(Ljava/util/List;)(values);
    }-*/;

    /**
     * Items of this list section.
     */
    public native List<ListDataItem> getItems() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.items;
		return @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void appendItems(List<ListDataItem> items) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromList(Ljava/util/List;)(items);
		jso.appendItems(obj);
    }-*/;

    public native void appendItems(List<ListDataItem> items, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromList(Ljava/util/List;)(items);
		jso
				.appendItems(
						obj,
						animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void appendItems(ListDataItem... dataItems) {
        appendItems(Arrays.asList(dataItems));
    }

    public native void deleteItemsAt(int index, int count) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteItemsAt(index, count);
    }-*/;

    public native ListDataItem getItemAt(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getItemAt(index);
		return @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void deleteItemsAt(int index, int count, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.deleteItemsAt(
						index,
						count,
						animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void insertItemsAt(int index, List<ListDataItem> items) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso.insertItemsAt(index, obj);
    }-*/;

    public native void insertItemsAt(int index, List<ListDataItem> items, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso
				.insertItemsAt(
						index,
						obj,
						animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void insertItemsAt(int index, ListDataItem... dataItems) {
        insertItemsAt(index, Arrays.asList(dataItems));
    }

    public native void replaceItemsAt(int index, int count, List<ListDataItem> items) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso.replaceItemsAt(index, count, obj);
    }-*/;

    public native void replaceItemsAt(int index, int count, List<ListDataItem> items, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso
				.replaceItemsAt(
						index,
						count,
						obj,
						animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void replaceItemsAt(int index, int count, ListDataItem... dataItems) {
        replaceItemsAt(index, count, Arrays.asList(dataItems));
    }

    public native void updateItemAt(int index, ListDataItem item) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso.updateItemAt(index,
				item.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void updateItemAt(int index, ListDataItem item, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListDataItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(items);
		jso
				.updateItemAt(
						index,
						item.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    static JavaScriptObject fromList(List<ListSection> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (ListSection item : values) {
            peers.push(item.getJsObj());
        }
        return peers;
    }

    static List<ListSection> fromJsArray(JavaScriptObject obj) {
        List<ListSection> toReturn = new ArrayList<ListSection>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new ListSection(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

    private native JavaScriptObject createPeer() /*-{
		return Ti.UI.createListSection();
    }-*/;
}
