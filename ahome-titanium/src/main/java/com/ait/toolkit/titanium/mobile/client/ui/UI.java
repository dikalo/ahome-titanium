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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.Unit;
import com.ait.toolkit.titanium.mobile.client.platform.Platform;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The main ui module. The ui module is responsible for native user-interface
 * components and interaction inside titanium. the goal of the ui module is to
 * provide a native experience along with native performance by compiling
 * javascript code into their native counterparts as part of the build process.
 * <p>
 * 
 * Design
 * 
 * The UI module is broken down into 3 major area:
 * 
 * **Views** - [Views](Titanium.UI.View-object.html) are containers that host
 * visual elements such as controls or other views. Views can have their
 * properties customized, such as their border color and radius, can fire events
 * such as swipe events or touches, and can optionally contain a hierarchy or
 * other views as children. In Titanium, most views are specialized to perform
 * both a visual function and set of interaction behaviors such as [Table
 * View](Titanium.UI.TableView-object.html) or [Coverflow
 * View](Titanium.UI.CoverFlowView-object.html). Views are always named with the
 * suffix `View`. **Controls** - controls, or sometimes referred as widgets, are
 * visual elements such as [sliders](Titanium.UI.Slider-object.html),
 * [buttons](Titanium.UI.Button-object.html) and
 * [switches](Titanium.UI.Switch-object.html). They provide a visual element
 * which has a defined behavior and typical have special configuration and
 * special events. Controls themselves are views and also inherit a views
 * properties, functions and events. **Windows** -
 * [Windows](Titanium.UI.Window-object.html) are typically top-level visual
 * constructs that are the main part of your interface. An application will
 * always have at least one window and windows can take different shapes and
 * sizes, can have display and interaction properties such as fullscreen or
 * modal and can be customized, such as changing their opacity or background
 * color. Windows themselves are views and also inherit a views properties,
 * functions and events. There are a few specialization of Windows such as a
 * [Tab Group](Titanium.UI.TabGroup-object.html) which offer additional behavior
 * beyond the basic Window.
 * 
 * 
 * Titanium uses the [Factory
 * Pattern](http://en.wikipedia.org/wiki/Factory_method_pattern) for
 * constructing objects and a general naming pattern for APIs. For example, to
 * construct a [Alert Dialog](Titanium.UI.AlertDialog-object.html), you call the
 * method <Titanium.UI.createAlertDialog>. To create a
 * [TextArea](Titanium.UI.TextArea-object.html), you call the method
 * <Titanium.UI.createTextArea>. Once an object is created, it will be available
 * until it goes out of scope.
 * 
 * Optimizations
 * 
 * UI objects are optimized by Titanium to not be realized into the drawing
 * context and placed into the device UI surface until needed. That means that
 * you can create UI objects, set their properties and add them to their
 * hierarchy without much worry about memory or performance. When the native
 * drawing surface needs to render a specific view or control, Titanium will
 * automatically create the view as needed. Additionally, Titanium is optimized
 * to also release memory once the view is no longer needed, on screen or in low
 * memory situations. However, it's a good idea to help Titanium along in
 * certain cases where you are no longer using objects. For example, you should
 * call `close` on a [Window](Titanium.UI.Window-object.html) instance when you
 * are no longer using it. You can safely call `open` on the
 * [Window](Titanium.UI.Window-object.html) again to re-open it.
 * 
 * Global Context and Threading
 * 
 * Be careful with the objects that are created in 'app.js' but only used once.
 * Since the 'app.js' context is global and generally is not garbage collected
 * until the application exits, you should think about the design of your
 * application as it relates to this fact.
 * [Window](Titanium.UI.Window-object.html) objects that are opened up with the
 * 'url' property to another Javascript file contain a nice way to decompose
 * your application into smaller units. The other benefit is that when a
 * [Window](Titanium.UI.Window-object.html) is closed, its resources can be
 * immediately cleaned up, saving resources such as memory and CPU.
 * Additionally, [Window](Titanium.UI.Window-object.html) objects run in a
 * separate Javascript context and Thread. While all UI processing is done on
 * the main UI thread, other processing inside a Window or the 'app.js' that
 * does not have UI interaction will run in its own thread.
 * 
 * 
 * Portability
 * 
 * Titanium components are designed to be portable across as many platforms as
 * it supports. However, there are cases where a device either does not support
 * a specific feature or capability or where it support additional
 * functionality. For cases where the device OS supports capabilities that other
 * platforms do not, we attempt to place those capabilities in a separate
 * namespace, such as [Titanium.UI.iPhone](Titanium.UI.iPhone-module.html).
 * However, in cases where the control is in a common namespace and support
 * additional features, we continue to place that functionality directly on the
 * object.
 */
public class UI extends TiModule {

    private static UI instance = null;

    public static UI get() {
        if (instance == null) {
            instance = new UI();
        }
        return instance;
    }

    private UI() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeUiModule();
    }

    /**
     * @return This sets the background color of the master uiview (when there
     *         are no windows/tab groups on it)
     */
    public native String getBackgroundColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundColor;
    }-*/;

    /**
     * The currently active tab, if a tab group is open.
     * <p>
     * If no tab group is open, this value is undefined.
     */
    public native Tab getCurrentTab()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = obj.currentTab;
		return @com.ait.toolkit.titanium.mobile.client.ui.Tab::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setCurrentTab(Tab tab)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.currentTab = tab.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * The active window associated with the executing JavaScript context.
     */
    public native Window getCurrentWindow()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = obj.currentWindow;
		return @com.ait.toolkit.titanium.mobile.client.ui.Window::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setBackgroundColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundColor = value;
    }-*/;

    /**
     * @return Path/url to an image file for setting a background for the master
     *         uiview (when there are no windows/tab groups on it).
     */
    public native String getBackgroundImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundImage;
    }-*/;

    public native void setBackgroundImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundImage = value;
    }-*/;

    /**
     * Inspired from grid-drawing module : https://gist.github.com/1187384. Draw
     * a grid on the given view.
     * 
     * @param view
     *            , the view to draw the grid on
     * @param gridSpacing
     *            , the spacing of the grid lines
     * @param color
     *            , the color of the grid lines
     */
    public void drawGrid(View view, int gridSpacing, String color) {

        double numHorizontal = Math.ceil(Platform.get().getDisplayCaps().getPlatformHeight() / gridSpacing);
        double numVertical = Math.ceil(Platform.get().getDisplayCaps().getPlatformWidth() / gridSpacing);

        for (int i = 0; i < numHorizontal; i++) {
            View hLine = new View();
            hLine.setHeight(1);
            hLine.setWidth(100, Unit.PERCENT);
            hLine.setBackgroundColor(color);
            hLine.setTop(i * gridSpacing);
            hLine.setLeft(0);
            view.add(hLine);
        }

        for (int i = 0; i < numVertical; i++) {
            View vLine = new View();
            vLine.setHeight(100, Unit.PERCENT);
            vLine.setWidth(1);
            vLine.setBackgroundColor(color);
            vLine.setLeft(i * gridSpacing);
            vLine.setTop(0);
            view.add(vLine);
        }

    }

    public void drawGrid(View view, int gridSpacing) {
        drawGrid(view, gridSpacing, "#dedede");
    }

    public void drawGrid(View view) {
        drawGrid(view, 20, "#dedede");
    }

    public void setSizePropertyAsDouble(JavaScriptObject peer, String property, double value) {
        if (Platform.get().isAndroid()) {
            JsoHelper.setAttribute(peer, property, value + Unit.DP.getValue());
        } else {
            JsoHelper.setAttribute(peer, property, value);
        }

    }

    public void setSizePropertyAsString(JavaScriptObject peer, String property, String value) {
        if (Platform.get().isAndroid()) {
            // Check if the value ends with a non-number, then we know it
            // contains the unit at the back
            if (value != null && value.length() > 2 && !value.substring(value.length() - 2).matches("/^[0-9]+$/")) {
                JsoHelper.setAttribute(peer, property, value);
            } else if (!"auto".equalsIgnoreCase(value)) { // Used the string
                                                          // literal first to
                                                          // keep from running
                                                          // validation code on
                                                          // a null object
                JsoHelper.setAttribute(peer, property, value + Unit.DP.getValue());
            } else {
                JsoHelper.setAttribute(peer, property, value);
            }

        } else {
            JsoHelper.setAttribute(peer, property, value);
        }

    }

    public void setSizePropertyAsString(JavaScriptObject peer, String property, String value, Unit unit) {
        JsoHelper.setAttribute(peer, property, value + unit.getValue());
    }

    private void setSizeProperty(JavaScriptObject peer, String property, String value) {
        if (Platform.get().isAndroid()) {
            JsoHelper.setAttribute(peer, property, value + Unit.DP.getValue());
        } else {
            JsoHelper.setAttribute(peer, property, value);
        }

    }

    static native JavaScriptObject create2DMatrix() /*-{
		return Titanium.UI.create2DMatrix();
    }-*/;

    static native JavaScriptObject createActivityIndicator() /*-{
		return Titanium.UI.createActivityIndicator();
    }-*/;

    static native JavaScriptObject createAlertDialog() /*-{
		return Titanium.UI.createAlertDialog();
    }-*/;

    static native JavaScriptObject createAlertDialog(JsArrayString buttons) /*-{
		return Titanium.UI.createAlertDialog({
			buttonNames : buttons
		});
    }-*/;

    static native JavaScriptObject createAnimation() /*-{
		return Titanium.UI.createAnimation();
    }-*/;

    static native JavaScriptObject createButton() /*-{
		return Titanium.UI.createButton();
    }-*/;

    static native JavaScriptObject create3DMatrix() /*-{
		return Titanium.UI.create3DMatrix();
    }-*/;

    static native JavaScriptObject createDashboardItem() /*-{
		return Titanium.UI.createDashboardItem();
    }-*/;

    static native JavaScriptObject createDashboardView() /*-{
		return Titanium.UI.createDashboardView();
    }-*/;

    static native JavaScriptObject createDashboardView(int column, int row) /*-{
		return Titanium.UI.createDashboardView({
			columnCount : column,
			rowCount : row
		});
    }-*/;

    static native JavaScriptObject createEmailDialog() /*-{
		return Titanium.UI.createEmailDialog();
    }-*/;

    static native JavaScriptObject createImageView() /*-{
		return Titanium.UI.createImageView();
    }-*/;

    static native JavaScriptObject createMaskedImage() /*-{
		return Titanium.UI.createMaskedImage();
    }-*/;

    static native JavaScriptObject createNotification() /*-{
		return Titanium.UI.createNotification();
    }-*/;

    static native JavaScriptObject createLabel() /*-{
		return Titanium.UI.createLabel();
    }-*/;

    static native JavaScriptObject createOptionDialog() /*-{
		return Titanium.UI.createOptionDialog();
    }-*/;

    static native JavaScriptObject createPicker() /*-{
		return Titanium.UI.createPicker();
    }-*/;

    static native JavaScriptObject createPicker(boolean spinner) /*-{
		return Titanium.UI.createPicker({
			useSpinner : spinner
		});
    }-*/;

    static native JavaScriptObject createPickerColumn() /*-{
		return Titanium.UI.createPickerColumn();
    }-*/;

    static native JavaScriptObject createPickerRow() /*-{
		return Titanium.UI.createPickerRow();
    }-*/;

    static native JavaScriptObject createProgressBar() /*-{
		return Titanium.UI.createProgressBar();
    }-*/;

    static native JavaScriptObject createScrollableView() /*-{
		return Titanium.UI.createScrollableView();
    }-*/;

    static native JavaScriptObject createScrollView() /*-{
		return Titanium.UI.createScrollView();
    }-*/;

    static native JavaScriptObject createSearchBar() /*-{
		return Titanium.UI.createSearchBar();
    }-*/;

    static native JavaScriptObject createSlider() /*-{
		return Titanium.UI.createSlider();
    }-*/;

    static native JavaScriptObject createSwitch() /*-{
		return Titanium.UI.createSwitch();
    }-*/;

    static native JavaScriptObject createTab() /*-{
		return Titanium.UI.createTab();
    }-*/;

    static native JavaScriptObject createTabGroup() /*-{
		return Titanium.UI.createTabGroup();
    }-*/;

    static native JavaScriptObject createTableView() /*-{
		return Titanium.UI.createTableView();
    }-*/;

    static native JavaScriptObject createTableViewRow() /*-{
		return Titanium.UI.createTableViewRow();
    }-*/;

    static native JavaScriptObject createTableViewSection() /*-{
		return Titanium.UI.createTableViewSection();
    }-*/;

    static native JavaScriptObject createTextArea() /*-{
		return Titanium.UI.createTextArea();
    }-*/;

    static native JavaScriptObject createTextField() /*-{
		return Titanium.UI.createTextField();
    }-*/;

    static native JavaScriptObject createToolbar() /*-{
		return Titanium.UI.iOS.createToolbar();
    }-*/;

    static native JavaScriptObject createView() /*-{
		return Titanium.UI.createView();
    }-*/;

    static native JavaScriptObject createWebView() /*-{
		return Titanium.UI.createWebView();
    }-*/;

    static native JavaScriptObject createWindow() /*-{
		return Titanium.UI.createWindow();
    }-*/;

    static native JavaScriptObject createAndroid() /*-{
		return Titanium.UI.createAndroid();
    }-*/;

    public static native JavaScriptObject createIOs() /*-{
		return Titanium.UI.createiOS();
    }-*/;

    static native JavaScriptObject createIPad() /*-{
		return Titanium.UI.createiPad();
    }-*/;

    static native JavaScriptObject createIPhone() /*-{
		return Titanium.UI.createiPhone();
    }-*/;

    static native JavaScriptObject createButtonBar() /*-{
		return Titanium.UI.createButtonBar();
    }-*/;

    static native JavaScriptObject createListItem() /*-{
		return Titanium.UI.createListItem();
    }-*/;

    static native JavaScriptObject createListView() /*-{
		return Titanium.UI.createListView();
    }-*/;

    static native JavaScriptObject createListSection() /*-{
		return Titanium.UI.createListSection();
    }-*/;

    public native final int ANIMATION_CURVE_EASE_IN() /*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_IN ? Titanium.UI.ANIMATION_CURVE_EASE_IN
				: 0;
    }-*/;

    public native final int ANIMATION_CURVE_EASE_IN_OUT() /*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_IN_OUT ? Titanium.UI.ANIMATION_CURVE_EASE_IN_OUT
				: 0;
    }-*/;

    public native final int ANIMATION_CURVE_EASE_OUT() /*-{
		return Titanium.UI.ANIMATION_CURVE_EASE_OUT ? Titanium.UI.ANIMATION_CURVE_EASE_OUT
				: 0;
    }-*/;

    public native final int ANIMATION_CURVE_LINEAR() /*-{
		return Titanium.UI.ANIMATION_CURVE_LINEAR ? Titanium.UI.ANIMATION_CURVE_LINEAR
				: 0;
    }-*/;

    public native final int AUTOLINK_ALL() /*-{
		return Titanium.UI.AUTOLINK_ALL ? Titanium.UI.AUTOLINK_ALL : 0;
    }-*/;

    public native final int AUTOLINK_CALENDAR() /*-{
		return Titanium.UI.AUTOLINK_CALENDAR ? AUTOLINK_CALENDAR : 0;
    }-*/;

    public native final int AUTOLINK_EMAIL_ADDRESS() /*-{
		return Titanium.UI.AUTOLINK_EMAIL_ADDRESS ? AUTOLINK_EMAIL_ADDRESS : 0;
    }-*/;

    public native final int AUTOLINK_MAP_ADDRESS() /*-{
		return Titanium.UI.AUTOLINK_MAP_ADDRESS ? AUTOLINK_MAP_ADDRESS : 0;
    }-*/;

    public native final int AUTOLINK_NONE() /*-{
		return Titanium.UI.AUTOLINK_NONE ? AUTOLINK_NONE : 0;
    }-*/;

    public native final int AUTOLINK_PHONE_NUMBERS() /*-{
		return Titanium.UI.AUTOLINK_PHONE_NUMBERS ? AUTOLINK_PHONE_NUMBERS : 0;
    }-*/;

    public native final int AUTOLINK_URLS() /*-{
		return Titanium.UI.AUTOLINK_URLS ? AUTOLINK_URLS : 0;
    }-*/;

    public native final int INPUT_BORDERSTYLE_BEZEL() /*-{
		return Titanium.UI.INPUT_BORDERSTYLE_BEZEL ? Titanium.UI.INPUT_BORDERSTYLE_BEZEL
				: 0;
    }-*/;

    public native final int INPUT_BORDERSTYLE_LINE() /*-{
		return Titanium.UI.INPUT_BORDERSTYLE_LINE ? Titanium.UI.INPUT_BORDERSTYLE_LINE
				: 0;
    }-*/;

    public native final int INPUT_BORDERSTYLE_NONE() /*-{
		return Titanium.UI.INPUT_BORDERSTYLE_NONE ? Titanium.UI.INPUT_BORDERSTYLE_NONE
				: 0;
    }-*/;

    public native final int INPUT_BORDERSTYLE_ROUNDED() /*-{
		return Titanium.UI.INPUT_BORDERSTYLE_ROUNDED ? Titanium.UI.INPUT_BORDERSTYLE_ROUNDED
				: 0;
    }-*/;

    public native final int INPUT_BUTTONMODE_ALWAYS() /*-{
		return Titanium.UI.INPUT_BUTTONMODE_ALWAYS ? Titanium.UI.INPUT_BUTTONMODE_ALWAYS
				: 0;
    }-*/;

    public native final int INPUT_BUTTONMODE_NEVER() /*-{
		return Titanium.UI.INPUT_BUTTONMODE_NEVER ? Titanium.UI.INPUT_BUTTONMODE_NEVER
				: 0;
    }-*/;

    public native final int INPUT_BUTTONMODE_ONBLUR() /*-{
		return Titanium.UI.INPUT_BUTTONMODE_ONBLUR ? Titanium.UI.INPUT_BUTTONMODE_ONBLUR
				: 0;
    }-*/;

    public native final int INPUT_BUTTONMODE_ONFOCUS() /*-{
		return Titanium.UI.INPUT_BUTTONMODE_ONFOCUS ? Titanium.UI.INPUT_BUTTONMODE_ONFOCUS
				: 0;
    }-*/;

    public native final int KEYBOARD_APPEARANCE_ALERT() /*-{
		return Titanium.UI.KEYBOARD_APPEARANCE_ALERT ? Titanium.UI.KEYBOARD_APPEARANCE_ALERT
				: 0;
    }-*/;

    public native final int KEYBOARD_APPEARANCE_DEFAULT() /*-{
		return Titanium.UI.KEYBOARD_APPEARANCE_DEFAULT ? Titanium.UI.KEYBOARD_APPEARANCE_DEFAULT
				: 0;
    }-*/;

    public native final int KEYBOARD_ASCII() /*-{
		return Titanium.UI.KEYBOARD_ASCII ? Titanium.UI.KEYBOARD_APPEARANCE_DEFAULT
				: 0;
    }-*/;

    public native final int KEYBOARD_DEFAULT() /*-{
		return Titanium.UI.KEYBOARD_DEFAULT ? Titanium.UI.KEYBOARD_DEFAULT : 0;
    }-*/;

    public native final int KEYBOARD_EMAIL() /*-{
		return Titanium.UI.KEYBOARD_EMAIL ? Titanium.UI.KEYBOARD_EMAIL : 0;
    }-*/;

    public native final int KEYBOARD_NAMEPHONE_PAD() /*-{
		return Titanium.UI.KEYBOARD_NAMEPHONE_PAD ? Titanium.UI.KEYBOARD_NAMEPHONE_PAD
				: 0;
    }-*/;

    public native final int KEYBOARD_DECIMAL_PAD() /*-{
		return Titanium.UI.KEYBOARD_DECIMAL_PAD ? Titanium.UI.KEYBOARD_DECIMAL_PAD
				: 0;
    }-*/;

    public native final int KEYBOARD_NUMBERS_PUNCTUATION() /*-{
		return Titanium.UI.KEYBOARD_NUMBERS_PUNCTUATION ? Titanium.UI.KEYBOARD_NUMBERS_PUNCTUATION
				: 0;
    }-*/;

    public native final int KEYBOARD_NUMBER_PAD() /*-{
		return Titanium.UI.KEYBOARD_NUMBER_PAD ? Titanium.UI.KEYBOARD_NUMBER_PAD
				: 0;
    }-*/;

    public native final int KEYBOARD_PHONE_PAD() /*-{
		return Titanium.UI.KEYBOARD_PHONE_PAD ? Titanium.UI.KEYBOARD_PHONE_PAD
				: 0;
    }-*/;

    public native final int KEYBOARD_URL() /*-{
		return Titanium.UI.KEYBOARD_URL ? Titanium.UI.KEYBOARD_URL : 0;
    }-*/;

    public native final int LANDSCAPE_LEFT() /*-{
		return Titanium.UI.LANDSCAPE_LEFT ? Titanium.UI.LANDSCAPE_LEFT : 0;
    }-*/;

    public native final int LANDSCAPE_RIGHT() /*-{
		return Titanium.UI.LANDSCAPE_RIGHT ? Titanium.UI.LANDSCAPE_RIGHT : 0;
    }-*/;

    public native final int NOTIFICATION_DURATION_LONG() /*-{
		return Titanium.UI.NOTIFICATION_DURATION_LONG ? Titanium.UI.NOTIFICATION_DURATION_LONG
				: 0;
    }-*/;

    public native final int NOTIFICATION_DURATION_SHORT() /*-{
		return Titanium.UI.NOTIFICATION_DURATION_SHORT ? Titanium.UI.NOTIFICATION_DURATION_SHORT
				: 0;
    }-*/;

    public native final int PICKER_TYPE_COUNT_DOWN_TIMER() /*-{
		return Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER ? Titanium.UI.PICKER_TYPE_COUNT_DOWN_TIMER
				: 0;
    }-*/;

    public native final int PICKER_TYPE_DATE() /*-{
		return Titanium.UI.PICKER_TYPE_DATE ? Titanium.UI.PICKER_TYPE_DATE : 0;
    }-*/;

    public native final int PICKER_TYPE_DATE_AND_TIME() /*-{
		return Titanium.UI.PICKER_TYPE_DATE_AND_TIME ? Titanium.UI.PICKER_TYPE_DATE_AND_TIME
				: 0;
    }-*/;

    public native final int PICKER_TYPE_PLAIN() /*-{
		return Titanium.UI.PICKER_TYPE_PLAIN ? Titanium.UI.PICKER_TYPE_PLAIN
				: 0;
    }-*/;

    public native final int PICKER_TYPE_TIME() /*-{
		return Titanium.UI.PICKER_TYPE_TIME ? Titanium.UI.PICKER_TYPE_TIME : 0;
    }-*/;

    public native final int PORTRAIT() /*-{
		return Titanium.UI.PORTRAIT ? Titanium.UI.PORTRAIT : 0;
    }-*/;

    public native final int RETURNKEY_DEFAULT() /*-{
		return Titanium.UI.RETURNKEY_DEFAULT ? Titanium.UI.RETURNKEY_DEFAULT
				: 0;
    }-*/;

    public native final int RETURNKEY_DONE() /*-{
		return Titanium.UI.RETURNKEY_DONE ? Titanium.UI.RETURNKEY_DONE : 0;
    }-*/;

    public native final int RETURNKEY_EMERGENCY_CALL() /*-{
		return Titanium.UI.RETURNKEY_EMERGENCY_CALL ? Titanium.UI.RETURNKEY_EMERGENCY_CALL
				: 0;
    }-*/;

    public native final int RETURNKEY_GO() /*-{
		return Titanium.UI.RETURNKEY_GO ? Titanium.UI.RETURNKEY_GO : 0;
    }-*/;

    public native final int RETURNKEY_GOOGLE() /*-{
		return Titanium.UI.RETURNKEY_GOOGLE ? Titanium.UI.RETURNKEY_GOOGLE : 0;
    }-*/;

    public native final int RETURNKEY_JOIN() /*-{
		return Titanium.UI.RETURNKEY_JOIN ? Titanium.UI.RETURNKEY_JOIN : 0;
    }-*/;

    public native final int RETURNKEY_NEXT() /*-{
		return Titanium.UI.RETURNKEY_NEXT ? Titanium.UI.RETURNKEY_NEXT : 0;
    }-*/;

    public native final int RETURNKEY_ROUTE() /*-{
		return Titanium.UI.RETURNKEY_ROUTE ? Titanium.UI.RETURNKEY_ROUTE : 0;
    }-*/;

    public native final int RETURNKEY_SEARCH() /*-{
		return Titanium.UI.RETURNKEY_SEARCH ? Titanium.UI.RETURNKEY_SEARCH : 0;
    }-*/;

    public native final int RETURNKEY_SEND() /*-{
		return Titanium.UI.RETURNKEY_SEND ? Titanium.UI.RETURNKEY_SEND : 0;
    }-*/;

    public native final int RETURNKEY_YAHOO() /*-{
		return Titanium.UI.RETURNKEY_YAHOO ? Titanium.UI.RETURNKEY_YAHOO : 0;
    }-*/;

    public native final int SIZE() /*-{
		return Titanium.UI.SIZE ? Titanium.UI.SIZE : 0;
    }-*/;

    public native final int TEXT_ALIGNMENT_CENTER() /*-{
		return Titanium.UI.TEXT_ALIGNMENT_CENTER ? Titanium.UI.TEXT_ALIGNMENT_CENTER
				: 0;
    }-*/;

    public native final int TEXT_ALIGNMENT_LEFT() /*-{
		return Titanium.UI.TEXT_ALIGNMENT_LEFT ? Titanium.UI.TEXT_ALIGNMENT_LEFT
				: 0;
    }-*/;

    public native final int TEXT_ALIGNMENT_RIGHT() /*-{
		return Titanium.UI.TEXT_ALIGNMENT_RIGHT ? Titanium.UI.TEXT_ALIGNMENT_RIGHT
				: 0;
    }-*/;

    public native final int TEXT_AUTOCAPITALIZATION_ALL() /*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_ALL ? Titanium.UI.TEXT_AUTOCAPITALIZATION_ALL
				: 0;
    }-*/;

    public native final int TEXT_AUTOCAPITALIZATION_NONE() /*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_NONE ? Titanium.UI.TEXT_AUTOCAPITALIZATION_NONE
				: 0;
    }-*/;

    public native final int TEXT_AUTOCAPITALIZATION_SENTENCES() /*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES ? Titanium.UI.TEXT_AUTOCAPITALIZATION_SENTENCES
				: 0;
    }-*/;

    public native final int TEXT_AUTOCAPITALIZATION_WORDS() /*-{
		return Titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS ? Titanium.UI.TEXT_AUTOCAPITALIZATION_WORDS
				: 0;
    }-*/;

    public native final int TEXT_VERTICAL_ALIGNMENT_BOTTOM() /*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_BOTTOM ? Titanium.UI.TEXT_VERTICAL_ALIGNMENT_BOTTOM
				: 0;
    }-*/;

    public native final int TEXT_VERTICAL_ALIGNMENT_CENTER() /*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_CENTER ? Titanium.UI.TEXT_VERTICAL_ALIGNMENT_CENTER
				: 0;
    }-*/;

    public native final int TEXT_VERTICAL_ALIGNMENT_TOP() /*-{
		return Titanium.UI.TEXT_VERTICAL_ALIGNMENT_TOP ? Titanium.UI.TEXT_VERTICAL_ALIGNMENT_TOP
				: 0;
    }-*/;

    public native final int UNKNOWN() /*-{
		return Titanium.UI.UNKNOWN ? Titanium.UI.UNKNOWN : 0;
    }-*/;

    public native final int UPSIDE_PORTRAIT() /*-{
		return Titanium.UI.UPSIDE_PORTRAIT ? Titanium.UI.UPSIDE_PORTRAIT : 0;
    }-*/;

    public native final int LIST_ACCESSSSORY_TYPE_CHECKMARK() /*-{
		return Titanium.UI.LIST_ACCESSSSORY_TYPE_CHECKMARK ? Titanium.UI.LIST_ACCESSSSORY_TYPE_CHECKMARK
				: 0;
    }-*/;

    public native final int LIST_ACCESSSSORY_TYPE_DETAIL() /*-{
		return Titanium.UI.LIST_ACCESSSSORY_TYPE_DETAIL ? Titanium.UI.LIST_ACCESSSSORY_TYPE_DETAIL
				: 0;
    }-*/;

    public native final int LIST_ACCESSSSORY_TYPE_DISCLOSURE() /*-{
		return Titanium.UI.LIST_ACCESSSSORY_TYPE_DISCLOSURE ? Titanium.UI.LIST_ACCESSSSORY_TYPE_DISCLOSURE
				: 0;
    }-*/;

    public native final int LIST_ACCESSSSORY_TYPE_NONE() /*-{
		return Titanium.UI.LIST_ACCESSSSORY_TYPE_NONE ? Titanium.UI.LIST_ACCESSSSORY_TYPE_NONE
				: 0;
    }-*/;

    public native final int LIST_ITEM_TEMPLATE_CONTACTS() /*-{
		return Titanium.UI.LIST_ITEM_TEMPLATE_CONTACTS ? Titanium.UI.LIST_ITEM_TEMPLATE_CONTACTS
				: 0;
    }-*/;

    public native final int LIST_ITEM_TEMPLATE_DEFAULT() /*-{
		return Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT ? Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT
				: 0;
    }-*/;

    public native final int LIST_ITEM_TEMPLATE_SETTINGS() /*-{
		return Titanium.UI.LIST_ITEM_TEMPLATE_SETTINGS ? Titanium.UI.LIST_ITEM_TEMPLATE_SETTINGS
				: 0;
    }-*/;

    public native final int LIST_ITEM_TEMPLATE_SUBTITLE() /*-{
		return Titanium.UI.LIST_ITEM_TEMPLATE_SUBTITLE ? Titanium.UI.LIST_ITEM_TEMPLATE_SUBTITLE
				: 0;
    }-*/;

    public native final String UNIT_CM() /*-{
		return Titanium.UI.UNIT_CM ? Titanium.UI.UNIT_CM : "";
    }-*/;

    public native final String UNIT_DIP() /*-{
		return Titanium.UI.UNIT_DIP ? Titanium.UI.UNIT_DIP : "";
    }-*/;

    public native final String UNIT_IN() /*-{
		return Titanium.UI.UNIT_IN ? Titanium.UI.UNIT_IN : "";
    }-*/;

    public native final String UNIT_MM() /*-{
		return Titanium.UI.UNIT_MM ? Titanium.UI.UNIT_MM : "";
    }-*/;

    public native final String UNIT_PX() /*-{
		return Titanium.UI.UNIT_PX ? Titanium.UI.UNIT_PX : "";
    }-*/;

    public native final int URL_ERROR_BAR_URL() /*-{
		return Titanium.UI.URL_ERROR_BAR_URL ? Titanium.UI.URL_ERROR_BAR_URL
				: 0;
    }-*/;

    public native final int URL_ERROR_CONNECT() /*-{
		return Titanium.UI.URL_ERROR_CONNECT ? Titanium.UI.URL_ERROR_CONNECT
				: 0;
    }-*/;

    public native final int URL_ERROR_FILE() /*-{
		return Titanium.UI.URL_ERROR_FILE ? Titanium.UI.URL_ERROR_FILE : 0;
    }-*/;

    public native final int URL_ERROR_FILE_NOT_FOUND() /*-{
		return Titanium.UI.URL_ERROR_FILE_NOT_FOUND ? Titanium.UI.URL_ERROR_FILE_NOT_FOUND
				: 0;
    }-*/;

    public native final int URL_ERROR_HOST_LOOKUP() /*-{
		return Titanium.UI.URL_ERROR_HOST_LOOKUP ? Titanium.UI.URL_ERROR_HOST_LOOKUP
				: 0;
    }-*/;

    public native final int URL_ERROR_SSL_FAILED() /*-{
		return Titanium.UI.URL_ERROR_SSL_FAILED ? Titanium.UI.URL_ERROR_SSL_FAILED
				: 0;
    }-*/;

    public native final int URL_ERROR_TIMEOUT() /*-{
		return Titanium.UI.URL_ERROR_TIMEOUT ? Titanium.UI.URL_ERROR_TIMEOUT
				: 0;
    }-*/;

    public native final int URL_ERROR_UNKNOWN() /*-{
		return Titanium.UI.URL_ERROR_UNKNOWN ? Titanium.UI.URL_ERROR_UNKNOWN
				: 0;
    }-*/;

    public native final int URL_ERROR_UNSUPPORTED_SCHEME() /*-{
		return Titanium.UI.URL_ERROR_UNSUPPORTED_SCHEME ? Titanium.UI.URL_ERROR_UNSUPPORTED_SCHEME
				: 0;
    }-*/;

    public native final int FACE_DOWN() /*-{
		return Titanium.UI.FACE_DOWN ? Titanium.UI.FACE_DOWN : 0;
    }-*/;

    public native final int FACE_UP() /*-{
		return Titanium.UI.FACE_UP ? Titanium.UI.FACE_UP : 0;
    }-*/;

    public native final String FILL() /*-{
		return Titanium.UI.FILL ? Titanium.UI.FILL : 0;
    }-*/;

    public native final String INHERIT() /*-{
		return Titanium.UI.INHERIT ? Titanium.UI.INHERIT : 0;
    }-*/;

}
