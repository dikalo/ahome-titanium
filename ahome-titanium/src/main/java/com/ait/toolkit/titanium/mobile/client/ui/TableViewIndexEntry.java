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
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class TableViewIndexEntry extends JsObject {

    public TableViewIndexEntry() {
        jsObj = JsoHelper.createObject();
    }

    protected TableViewIndexEntry(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Row index associated with this item.
     */
    public int getIndex() {
        return JsoHelper.getAttributeAsInt(jsObj, "index");
    }

    /**
     * Row index associated with this item.
     */
    public void setIndex(int value) {
        JsoHelper.setAttribute(jsObj, "index", value);
    }

    /**
     * Title to display in the index bar for this item.
     */
    public String getTitle() {
        return JsoHelper.getAttribute(jsObj, "title");
    }

    /**
     * Title to display in the index bar for this item.
     */
    public void setTitle(String value) {
        JsoHelper.setAttribute(jsObj, "title", value);
    }

    static JavaScriptObject fromList(List<TableViewIndexEntry> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (TableViewIndexEntry rule : values) {
            peers.push(rule.getJsObj());
        }
        return peers;
    }

    static List<TableViewIndexEntry> fromJsArray(JavaScriptObject obj) {
        List<TableViewIndexEntry> toReturn = new ArrayList<TableViewIndexEntry>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new TableViewIndexEntry(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
