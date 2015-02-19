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
package com.ait.toolkit.titanium.mobile.client.ui.ipad;

import java.util.ArrayList;

import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.HideHandler;
import com.ait.toolkit.titanium.mobile.client.ui.Button;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A popover is used to manage the presentation of content in a popover. You use
 * popovers to present information temporarily but in a way that does not take
 * over the entire screen like a modal view does. the popover content is layered
 * on top of your existing content in a special type of window. the popover
 * remains visible until the user taps outside of the popover window or you
 * explicitly dismiss it. The popover is created by the method
 * {@link com.ait.toolkit.titanium.mobile.client.ui.ipad.IPad.createPopover}.
 * (http://img.skitch.com/20100406-pmssjk1a3a65s6ui8qnbqi59c4.png)
 */
public class Popover extends View {

    public Popover() {
        createPeer();
    }

    /**
     * @return Return the arrow direction of the popover
     */
    public native int getArrowDirection() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.arrowDirection;
    }-*/;

    /**
     * @return The left button in the nav area of the popover
     */
    public native Button getLeftNavButton() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.leftNavButton;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setLeftNavButton(Button value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.leftNavButton = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The right button in the nav area of the popover
     */
    public native Button getRightNavButton() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.rightNavButton;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setRightNavButton(Button value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rightNavButton = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The title of the nav area of the popover
     */
    public native String getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * Change the height of the popover
     * 
     * @param height
     *            height of the popover
     */
    public native void setHeight(int height) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setHeight(height);
    }-*/;

    /**
     * Set the passthrough views for the popover
     * 
     * @param passthroughViews
     *            array of views which the user can interact with while the
     *            popover is open (i.e. clicking on these views will interact
     *            with these views, and not dismiss the popover).
     */
    public void setPassthroughViews(ArrayList<View> views) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (View v : views) {
            values.push(v.getJsObj());
        }
        _setPassthroughViews(values);
    }

    public void setPassthroughViews(View... views) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (View v : views) {
            values.push(v.getJsObj());
        }
        _setPassthroughViews(values);
    }

    private native void _setPassthroughViews(JavaScriptObject passthroughViews) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setPassthroughViews(passthroughViews);
    }-*/;

    /**
     * Change the width of the popover
     * 
     * @param width
     *            width of the popover
     */
    public native void setWidth(int width) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setWidth(width);
    }-*/;

    public native CallbackRegistration addHideHandler(HideHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.HideEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.HideHandler::onHide(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/HideEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.HideEvent::HIDE;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    public native void show(JavaScriptObject options) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.show(options);
    }-*/;

    public native void show(View anchor) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.show({
					view : anchor.@com.ait.toolkit.core.client.JsObject::getJsObj()()
				});
    }-*/;

    public native void show(View anchor, boolean animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.show({
					view : anchor.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
					animated : animation
				});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = IPad.createPopover();
    }

}
