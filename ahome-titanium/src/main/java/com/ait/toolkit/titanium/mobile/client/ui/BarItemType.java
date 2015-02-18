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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A button bar or tabbed bar item can have an image or a title, but not both.
 * Buttons with images and buttons with text can be mixed in the same bar,
 * however.
 * 
 * If both image and title properties are specified for a given item, the image
 * property takes precedence and the title property is ignored.
 * 
 */
public class BarItemType extends JsObject {

    public BarItemType() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * A succint label associated with the bar item for the device's
     * accessibility service.
     */
    public void setAccessibilityLabel(String value) {
        JsoHelper.setAttribute(jsObj, "accessibilityLabel", value);
    }

    /**
     * Whether the button is enabled initially.
     * <p>
     * Default: true
     */
    public void setEnabled(boolean value) {
        JsoHelper.setAttribute(jsObj, "enabled", value);
    }

    /**
     * Button icon. If specified, takes precedence over title.
     */
    public void setImage(File value) {
        JsoHelper.setAttribute(jsObj, "image", value.getJsObj());
    }

    /**
     * Button icon. If specified, takes precedence over title.
     */
    public void setImage(Blob value) {
        JsoHelper.setAttribute(jsObj, "image", value.getJsObj());
    }

    /**
     * BButton title, used if no image is specified.
     */
    public void setTitle(String value) {
        JsoHelper.setAttribute(jsObj, "title", value);
    }

    /**
     * BButton title, used if no image is specified.
     */
    public void setWidth(double value) {
        JsoHelper.setAttribute(jsObj, "width", value);
    }

    static JavaScriptObject fromList(ArrayList<BarItemType> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (BarItemType entry : values) {
            peers.push(entry.getJsObj());
        }
        return peers;
    }
}
