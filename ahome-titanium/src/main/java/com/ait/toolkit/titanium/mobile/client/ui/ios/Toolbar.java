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
package com.ait.toolkit.titanium.mobile.client.ui.ios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * An iOS toolbar, which can contain buttons and certain other controls.
 * <p>
 * The toolbar is created by the Titanium.UI.iOS.createToolbar method.
 * <p>
 * A toolbar can contain buttons, as well as certain other widgets, including
 * text fields and labels.
 * <p>
 * To provide spacing between items in the toolbar, you can use the special iOS
 * system button types, FIXED_SPACE and FLEXIBLE_SPACE.
 * <p>
 * Note that toolbars are positioned like other views (using the top and bottom
 * properties, for example), but the iOS Human Interface Guidelines have
 * specific requirements for placing toolbars: on iPhone, a toolbar should be at
 * the bottom of the window. On the iPad, a toolbar should appear at the top or
 * bottom of a window.
 * <p>
 * You can specify that a border be drawn on the top or bottom of the toolbar,
 * using the borderTop and borderBottom properties. While the standard
 * borderColor, borderWidth, and borderRadius properties are supported on
 * toolbars, using these properties adds a border on all four sides of the
 * control, which may be undesirable.
 * <p>
 * Due to an iOS limitation, the buttons in the toolbar only support the click
 * event. The native object underlying a toolbar button does not generate
 * standard view events, such as touchstart and touchend.
 * <p>
 * iOS Only
 */
public class Toolbar extends View {

    private List<View> items;

    public Toolbar() {
        this(new ArrayList<View>());
    }

    public Toolbar(List<View> items) {
        this.items = items;
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (View v : items) {
            peers.push(v.getJsObj());
        }
        createPeer(peers);
    }

    public Toolbar(View... items) {
        this(Arrays.asList(items));
    }

    @Override
    public void createPeer() {
        jsObj = IOS.get().createToolbar();
    }

    /**
     * Background color for the toolbar, as a color name or hex triplet.
     * <p>
     * To use a background image on the toolbar, either barColor must be a fully
     * or partially transparent color, or the translucent property must be true.
     * <p>
     * To use a background gradient on a toolbar, barColor must be 'transparent'
     * and the the translucent property must be true.
     * 
     */
    public native void setBarColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setBarColor(value);
    }-*/;

    /**
     * Background color for the toolbar, as a color name or hex triplet.
     * <p>
     * To use a background image on the toolbar, either barColor must be a fully
     * or partially transparent color, or the translucent property must be true.
     * <p>
     * To use a background gradient on a toolbar, barColor must be 'transparent'
     * and the the translucent property must be true.
     * 
     */
    public native String getBarColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getBarColor();
    }-*/;

    /**
     * If true, a border is drawn on the bottom of the toolbar.
     * <p>
     * Default: true
     */
    public native void setBorderBottom(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setBorderBottom(value);
    }-*/;

    /**
     * If true, a border is drawn on the bottom of the toolbar.
     * <p>
     * Default: true
     * 
     */
    public native boolean hasBorderBottom() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getBorderBottom();
    }-*/;

    /**
     * If true, a border is drawn on the top of the toolbar.
     * <p>
     * Default: true
     */
    public native void setBorderTop(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setBorderTop(value);
    }-*/;

    /**
     * If true, a border is drawn on the top of the toolbar.
     * <p>
     * Default: true
     * 
     */
    public native boolean hasBorderTop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getBorderTop();
    }-*/;

    /**
     * If true, a translucent background color is used for the toolbar.
     * <p>
     * Note that if translucent is false, views under the toolbar are hidden,
     * even if barColor is set to a semi-transparent or transparent color.
     * <p>
     * Default: false
     */
    public native void setTranslucent(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setTranslucent(value);
    }-*/;

    /**
     * If true, a translucent background color is used for the toolbar.
     * <p>
     * Note that if translucent is false, views under the toolbar are hidden,
     * even if barColor is set to a semi-transparent or transparent color.
     * <p>
     * Default: false
     */
    public native boolean isTranslucent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getTranslucent();
    }-*/;

    /**
     * Sets the items of this toolbar. This method with override the items
     * collection with the content
     * 
     * @param items
     *            , the new items to add
     */
    public void setItems(View... items) {
        setItems(Arrays.asList(items));
    }

    /**
     * Sets the items of this toolbar. This method with override the items
     * collection with the content
     * 
     * @param items
     *            , the new items to add
     */
    public void setItems(List<View> items) {
        this.items = items;
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (View v : items) {
            peers.push(v.getJsObj());
        }
        _setItems(peers);
    }

    private native void _setItems(JavaScriptObject values) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setItems(values);
    }-*/;

    /**
     * Layout the toolbar updating it's items
     */
    public void layout() {
        this.setItems(this.items);
    }

    /**
     * Get an Item from the toolbar at the given positon
     * 
     * @param itemPosition
     *            , the position of the item
     * @return an item at a given position
     */
    public View getItem(int itemPosition) {
        return this.items.get(itemPosition);
    }

    public void addItem(View item) {
        this.items.add(item);
    }

    @Override
    public void add(View view) {
        this.addItem(view);
        this.layout();
    }

    native JavaScriptObject createPeer(JavaScriptObject children) /*-{
		return Titanium.UI.iOS.createToolbar({
			items : children
		})
    }-*/;

}
