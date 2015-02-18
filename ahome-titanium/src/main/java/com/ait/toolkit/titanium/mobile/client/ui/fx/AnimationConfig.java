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
package com.ait.toolkit.titanium.mobile.client.ui.fx;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.ui.Matrix2D;
import com.ait.toolkit.titanium.mobile.client.ui.ios.Matrix3D;

/**
 * AnimationConfig class
 */
public class AnimationConfig extends JsObject {

    public AnimationConfig() {
        jsObj = JsoHelper.createObject();
    }

    public native void setDelay(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.delay = value;
    }-*/;

    public native void setDuration(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.duration = value;
    }-*/;

    public native void setOpacity(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.opacity = value;
    }-*/;

    public native void setTransform(Matrix2D value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.transform = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setTransform(Matrix3D value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.transform = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setTransition(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.transition = value;
    }-*/;

}
