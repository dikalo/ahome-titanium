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
package com.ait.toolkit.titanium.mobile.client.network;

import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * Request Object to use as parameter when sending object over http
 * 
 */
public class RequestParameter {

    private BaseModel baseModel;

    public RequestParameter() {
        baseModel = BaseModel.create();
    }

    protected RequestParameter(JavaScriptObject obj) {
        baseModel = BaseModel.create(obj);
    }

    public void setParam(String name, JsObject value) {
        baseModel.set(name, value.getJsObj());
    }

    public void setParam(String name, JavaScriptObject value) {
        baseModel.set(name, value);
    }

    public void setParam(String name, Object value) {
        baseModel.set(name, value);
    }

    public void setParam(String name, String value) {
        baseModel.set(name, value);
    }

    public void setParam(String name, double value) {
        baseModel.set(name, value);
    }

    public BaseModel getModel() {
        return this.baseModel;
    }

    public static RequestParameter from(JavaScriptObject obj) {
        return new RequestParameter(obj);
    }

}
