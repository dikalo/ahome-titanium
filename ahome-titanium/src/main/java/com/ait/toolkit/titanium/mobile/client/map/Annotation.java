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
package com.ait.toolkit.titanium.mobile.client.map;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class Annotation extends EventDispatcher {

    public Annotation() {
        jsObj = JsoHelper.createObject();
    }

    public Annotation(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Boolean to indicate whether the pin should animate when dropped
     */
    public native boolean isAnimate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.animate;
    }-*/;

    public native void setAnimate(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.animate = value;
    }-*/;

    /**
     * @return Image for the pin instead of default image.
     */
    public native String getImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.image;
    }-*/;

    public native void setImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.image = value;
    }-*/;

    public native void setLeftButton(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.leftButton = value;
    }-*/;

    public native void setLeftButton(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.leftButton = value;
    }-*/;

    /**
     * @return The left button image on the annotation. must either be a button
     *         type constant or url
     */
    public native Object getLeftButton() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.leftButton;
    }-*/;

    /**
     * @return A left view that is displayed on the annotation
     */
    public native Object getLeftView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.leftView;
    }-*/;

    public native void setLeftView(Object value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.leftView = value;
    }-*/;

    /**
     * @return AndroidMedia only. *deprecated* use
     *         {@link org.urish.gwtit.titanium.map.annotation.image} property
     *         instead.
     * @platforms android
     */
    public native String getPinImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.pinImage;
    }-*/;

    public native void setPinImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pinImage = value;
    }-*/;

    /**
     * @return The pin color.
     */
    public native int getPincolor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.pincolor;
    }-*/;

    public native void setPincolor(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pincolor = value;
    }-*/;

    public native void setRightButton(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rightButton = value;
    }-*/;

    public native void setRightButton(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rightButton = value;
    }-*/;

    /**
     * @return The right button image on the annotation. must either be a button
     *         type constant or url
     */
    public native Object getRightButton() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rightButton;
    }-*/;

    /**
     * @return A right view that is displayed on the annotation
     */
    public native Object getRightView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rightView;
    }-*/;

    public native void setRightView(Object value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rightView = value;
    }-*/;

    /**
     * @return The secondary title of the annotation view
     */
    public native String getSubtitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.subtitle;
    }-*/;

    public native void setSubtitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.subtitle = value;
    }-*/;

    /**
     * @return The key in the locale file to use for the subtitle property
     */
    public native String getSubtitleId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.subtitleid;
    }-*/;

    public native void setSubtitleId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.subtitleid = value;
    }-*/;

    /**
     * @return The primary title of the annotation view
     */
    public native String getTitle() /*-{
		return this.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @return The key in the locale file to use for the title property
     */
    public native String getTitleId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.titleid;
    }-*/;

    public native void setTitleId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.titleid = value;
    }-*/;
}
