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
package com.ait.toolkit.titanium.mobile.client.core.events;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class for objects that should be passed ad arguments when firing
 * application wide events in Ti
 * 
 */
public class EventData extends JsObject {

    protected static String DATA_ATTRIBUTE = "data";

    public EventData() {
        jsObj = JsoHelper.createObject();
    }

    protected EventData(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setData(EventData value) {
        JsoHelper.setAttribute(jsObj, EventData.DATA_ATTRIBUTE, value.getJsObj());
    }

    public void set(String property, String value) {
        JsoHelper.setAttribute(jsObj, property, value);
    }

    public void set(String property, double value) {
        JsoHelper.setAttribute(jsObj, property, value);
    }

    public String getString(String property) {
        return JsoHelper.getAttribute(jsObj, property);
    }

    public double getDouble(String property) {
        return JsoHelper.getAttributeAsDouble(jsObj, property);
    }

    public EventData getData() {
        JavaScriptObject obj = JsoHelper.getAttributeAsJavaScriptObject(jsObj, EventData.DATA_ATTRIBUTE);
        return new EventData(obj);
    }

}
