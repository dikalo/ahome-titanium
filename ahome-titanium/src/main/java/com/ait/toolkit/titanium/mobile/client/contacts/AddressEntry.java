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
import com.google.gwt.core.client.JsArray;

public class AddressEntry extends JsObject {

    protected AddressEntry(JavaScriptObject obj) {
        jsObj = obj;
    }

    public AddressEntry() {
        jsObj = JsoHelper.createObject();
    }

    public String getCountrycode() {
        return JsoHelper.getAttribute(jsObj, "CountryCode");
    }

    public void setCountrycode(String value) {
        JsoHelper.setAttribute(jsObj, "CountryCode", value);
    }

    public String getStreet() {
        return JsoHelper.getAttribute(jsObj, "Street");
    }

    public void setStreet(String value) {
        JsoHelper.setAttribute(jsObj, "Street", value);
    }

    public String getCity() {
        return JsoHelper.getAttribute(jsObj, "City");
    }

    public void setCity(String value) {
        JsoHelper.setAttribute(jsObj, "City", value);
    }

    public String getCounty() {
        return JsoHelper.getAttribute(jsObj, "County");
    }

    public void setCounty(String value) {
        JsoHelper.setAttribute(jsObj, "County", value);
    }

    public String getZip() {
        return JsoHelper.getAttribute(jsObj, "Zip");
    }

    public void setZip(String value) {
        JsoHelper.setAttribute(jsObj, "Zip", value);
    }

    public String getState() {
        return JsoHelper.getAttribute(jsObj, "State");
    }

    public void setState(String value) {
        JsoHelper.setAttribute(jsObj, "State", value);
    }

    public String getCountry() {
        return JsoHelper.getAttribute(jsObj, "Country");
    }

    public void setCountry(String value) {
        JsoHelper.setAttribute(jsObj, "Country", value);
    }

    static List<AddressEntry> fromJsArray(JavaScriptObject obj) {
        List<AddressEntry> toReturn = new ArrayList<AddressEntry>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new AddressEntry(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

    static JavaScriptObject fromList(ArrayList<AddressEntry> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (AddressEntry entry : values) {
            peers.push(entry.getJsObj());
        }
        return peers;
    }
}
