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
package com.ait.toolkit.titanium.mobile.client.contacts;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Phone extends JsObject {

    public Phone() {
        jsObj = JsoHelper.createObject();
    }

    protected Phone(JavaScriptObject obj) {
        jsObj = obj;
    }

    public String getHome() {
        return JsoHelper.getAttribute(jsObj, "home");
    }

    public String getWork() {
        return JsoHelper.getAttribute(jsObj, "work");
    }

    public String getOther() {
        return JsoHelper.getAttribute(jsObj, "other");
    }

    public String getWorkFax() {
        return JsoHelper.getAttribute(jsObj, "workFax");
    }

    public String getHomeFax() {
        return JsoHelper.getAttribute(jsObj, "homeFax");
    }

    public String geMain() {
        return JsoHelper.getAttribute(jsObj, "main");
    }

    public String getIPhone() {
        return JsoHelper.getAttribute(jsObj, "iPhone");
    }

    static List<Phone> fromJsArray(JavaScriptObject obj) {
        List<Phone> toReturn = new ArrayList<Phone>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new Phone(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
