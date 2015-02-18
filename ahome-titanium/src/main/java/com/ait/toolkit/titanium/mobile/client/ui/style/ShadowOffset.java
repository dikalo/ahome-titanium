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

package com.ait.toolkit.titanium.mobile.client.ui.style;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.Unit;
import com.ait.toolkit.titanium.mobile.client.ui.UI;
import com.google.gwt.core.client.JavaScriptObject;

public class ShadowOffset extends JsObject {

    public ShadowOffset() {
        jsObj = JsoHelper.createObject();
    }

    public ShadowOffset(int x, int y) {
        this();
        setX(x);
        setY(x);
    }

    public ShadowOffset(String x, String y) {
        this();
        setX(x);
        setY(x);
    }

    public ShadowOffset(String x, String y, Unit unit) {
        this();
        setX(x, unit);
        setY(x, unit);
    }

    private ShadowOffset(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setX(int value) {
        UI.get().setSizePropertyAsDouble(jsObj, "x", value);
    }

    public void setX(String value) {
        UI.get().setSizePropertyAsString(jsObj, "x", value);
    }

    public void setX(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "x", value, unit);
    }

    public void setY(int value) {
        UI.get().setSizePropertyAsDouble(jsObj, "y", value);
    }

    public void setY(String value) {
        UI.get().setSizePropertyAsString(jsObj, "y", value);
    }

    public void setY(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "y", value, unit);
    }

    public native <T> T getX() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.x;
    }-*/;

    public native <T> T getY() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.y;
    }-*/;

}
