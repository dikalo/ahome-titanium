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

import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * An iOS button bar component.
 * <p>
 * The button bar is a set of buttons joined into a single control. Each button
 * in a button bar can have a text label or an icon, but not both.
 * <p>
 * The TabbedBar control is a button bar where the last selected button mantains
 * a pressed or selected state. The following discussion applies to both button
 * bar and tabbed bar.
 * <p>
 * The buttons share a common style, defined by the style property. This can be
 * set to one of the constants defined in Titanium.UI.iPhone.SystemButtonStyle:
 * <ul>
 * <li>PLAIN. Default style for ButtonBar and TabbedBar. BORDERED. Creates a bar
 * like the</li>
 * <li>PLAIN bar, but with a heavier border.</li>
 * <li>BAR. Creates a more compact bar with translucent buttons that allow the
 * bar's background color to show through.</li>
 * </ul>
 * if you want the background color or background gradient of the button bar
 * itself to show through, the style must be set to
 * Titanium.UI.iPhone.SystemButtonStyle.BAR.
 * <p>
 * Note that you cannot style individual buttons in a button bar. If you want to
 * give a distinct visual style to individual buttons, to use an icon and text
 * on the same button, or to use a button-bar type component on a platform other
 * than iOS, you can use a set of individual Button controls wrapped in a View
 * to create the appearance of a button bar.
 */
public class ButtonBar extends View {

    public ButtonBar() {
        createPeer();
    }

    public ButtonBar(String label) {
        this();

    }

    ButtonBar(JavaScriptObject obj) {
        jsObj = obj;
    }

    public ButtonBar(String label, ClickHandler clickHandler) {
        this(label);
        addClickHandler(clickHandler);
    }

    /**
     * Index of the currently selected button.
     */
    public native void setIndex(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.index = value;
    }-*/;

    /**
     * Index of the currently selected button.
     */
    public native int getIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.index;
    }-*/;

    /**
     * Array of labels for the button bar.
     * 
     * The labels can be specified either using an array of strings, in which
     * case each string defines the title for a button, or using an array of
     * simple dictionary objects, BarItemType, which can specify title, image,
     * width and enabled state for each button.
     */
    public native void setLabels(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.labels = value;
    }-*/;

    public void setLabels(String... values) {
        JsArrayString peers = JsArrayString.createArray().cast();
        for (String s : values) {
            peers.push(s);
        }
        setLabels(peers);
    }

    public native void setLabels(List<BarItemType> values) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.labels = @com.ait.toolkit.titanium.mobile.client.ui.BarItemType::fromList(Ljava/util/ArrayList;)(values);
    }-*/;

    public native void setStyle(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.style = value;
    }-*/;

    public native CallbackRegistration addClickHandler(ClickHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler::onClick(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/ClickEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /**
     * Index of the currently selected button.
     */
    public native JsArrayString getLabels() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.labels;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createButtonBar();
    }

    public static ButtonBar from(JsObject proxy) {
        return new ButtonBar(proxy.getJsObj());
    }

}
