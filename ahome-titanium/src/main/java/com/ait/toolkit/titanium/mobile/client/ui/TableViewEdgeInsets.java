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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;

/**
 * On iOS, the parameter edgeInsets can be specified to set the distance(top,
 * bottom, right, left) that the content view is inset from the enclosing scroll
 * view of the table. For example
 */
public class TableViewEdgeInsets extends JsObject {

    public TableViewEdgeInsets() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Value specifying the bottom insets for the enclosing scroll view of the
     * table.
     * 
     * @param value
     */
    public void setBottom(double value) {
        JsoHelper.setAttribute(jsObj, "bottom", value);
    }

    /**
     * Value specifying the top insets for the enclosing scroll view of the
     * table.
     * 
     * @param value
     */
    public void setTop(double value) {
        JsoHelper.setAttribute(jsObj, "top", value);
    }

    /**
     * Value specifying the top insets for the enclosing scroll view of the
     * table.
     * 
     * @param value
     */
    public void setLeft(double value) {
        JsoHelper.setAttribute(jsObj, "left", value);
    }

    /**
     * Value specifying the top insets for the enclosing scroll view of the
     * table.
     * 
     * @param value
     */
    public void setRight(double value) {
        JsoHelper.setAttribute(jsObj, "right", value);
    }

}
