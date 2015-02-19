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

import java.util.ArrayList;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.Unit;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TextChangedHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TextReturnHandler;
import com.ait.toolkit.titanium.mobile.client.ui.style.Font;
import com.ait.toolkit.titanium.mobile.client.ui.style.Position;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The text area is a multiline field.
 * <p>
 * Both Text Areas and Text Fields can control the buttons displayed in a button
 * bar above the keyboard when it's visible.
 */
public class TextArea extends View {

    public TextArea() {
        createPeer();
    }

    TextArea(JavaScriptObject obj) {
        jsObj = obj;

    }

    /**
     * @return Whether or not to convert text within jso area to clickable
     *         links. iOs only.
     */
    public native int getAutoLink() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.autoLink;
    }-*/;

    public native void setAutoLink(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.autoLink = value;
    }-*/;

    /**
     * @return The left padding of the text field
     */
    public native <T> T getPaddingLeft() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.paddingLeft;
    }-*/;

    /**
     * Sets the left padding
     * 
     * @param value, the value of the left padding
     */
    public void setPaddingLeft(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "paddingLeft", value);
    }

    /**
     * Sets the left padding
     * 
     * @param value, the value of the left padding
     */
    public void setPaddingLeft(String value) {
        UI.get().setSizePropertyAsString(jsObj, "paddingLeft", value);
    }

    /**
     * Sets the left padding with the given unit system
     * 
     * @param value, the value of the left padding
     * @param unit, the unit system to use
     */
    public void setPaddingLeft(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "paddingLeft", value, unit);
    }

    /**
     * @return The right padding of the text field
     */
    public native <T> T getPaddingRight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.paddingRight;
    }-*/;

    /**
     * Sets the right padding.
     * 
     * @param value, the value of the left padding
     */
    public void setPaddingRight(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "paddingRight", value);
    }

    /**
     * Sets the right padding.
     * 
     * @param value, the value of the left padding
     */
    public void setPaddingRight(String value) {
        UI.get().setSizePropertyAsString(jsObj, "paddingRight", value);
    }

    /**
     * Sets the right padding with the given unit system
     * 
     * @param value, the value of the left padding
     * @param unit, the unit system to be used
     */
    public void setPaddingRight(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "paddingRight", value, unit);
    }

    /**
     * Sets the padding value. The left and right padding will be set
     * 
     * @param value, the value of the padding
     */
    public void setPadding(double value) {
        setPaddingLeft(value);
        setPaddingRight(value);
    }

    /**
     * Sets the padding value. The left and right padding will be set
     * 
     * @param value, the value of the padding
     */
    public void setPadding(String value) {
        setPaddingLeft(value);
        setPaddingRight(value);
    }

    /**
     * Sets the padding value. The left and right padding will be set using the
     * given unit
     * 
     * @param value, the value of the padding
     */
    public void setPadding(String value, Unit unit) {
        setPaddingLeft(value, unit);
        setPaddingRight(value, unit);
    }

    /**
     * Sets the left and right padding
     * 
     * @param leftPadding, the left padding
     * @param rightPadding, the right padding
     */
    public void setPadding(double leftPadding, double rightPadding) {
        setPaddingLeft(leftPadding);
        setPaddingRight(rightPadding);
    }

    /**
     * Sets the left and right padding
     * 
     * @param leftPadding, the left padding
     * @param rightPadding, the right padding
     */
    public void setPadding(String leftPadding, String rightPadding) {
        setPaddingLeft(leftPadding);
        setPaddingRight(rightPadding);
    }

    /**
     * Sets the left and right padding using the given unitsystem
     * 
     * @param leftPadding, the left padding
     * @param rightPadding, the right padding
     * @param unit, the unit system to be used
     */
    public void setPadding(String leftPadding, String rightPadding, Unit unit) {
        setPaddingLeft(leftPadding, unit);
        setPaddingRight(rightPadding, unit);
    }

    /**
     * @return The left button view
     */
    public native Button getLeftButton() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.leftButton;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setLeftButton(Button value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.leftButton = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The mode of the left button view
     */
    public native int getLeftButtonMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.leftButtonMode;
    }-*/;

    public native void setLeftButtonMode(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.leftButtonMode = value;
    }-*/;

    /**
     * @return The right button view
     */
    public native Button getRightButton() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.rightButton;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setRightButton(Button value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rightButton = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return Boolean that indicates if the value of the field is cleared upon
     *         editing
     */
    public native boolean clearOnEdit() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.clearOnEdit;
    }-*/;

    public native void setClearOnEdit(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.clearOnEdit = value;
    }-*/;

    public native void setTextAlign(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.textAlign = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public void setTextAlign(Position position) {
        setTextAlign(position.getValue());
    }

    public native void setFont(Font value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.font = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * set the keyborad type
     * 
     * @param value, value of the keyboard type
     */
    public native void setKeyboardType(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.keyboardType = value;
    }-*/;

    /**
     * 
     * @return the value of the keyboard type
     */
    public native int getKeyboardType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.keyboardType;
    }-*/;

    /**
     * set the returnKey type
     * 
     * @param value, value of the returnkey type
     */
    public native void setReturnKeyType(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.returnKeyType = value;
    }-*/;

    /**
     * 
     * @return the value of the appearance
     */
    public native int getAppearance() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.appearance;
    }-*/;

    /**
     * set the appearance value
     * 
     * @param value, value of the returnkey type
     */
    public native void setAppearance(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.appearance = value;
    }-*/;

    /**
     * sets wheter of not this TextField enables thr return key
     * 
     * @param value
     */
    public native void setEnableReturnKey(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.enableReturnKey = value;
    }-*/;

    /**
     * wheter of not this TextField enables thr return key
     * 
     * @param value
     */
    public native boolean enableReturnKey() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.enableReturnKey;
    }-*/;

    /**
     * 
     * @return the value of the returnkey type
     */
    public native int getReturnKeyType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.returnKeyType;
    }-*/;

    /**
     * @return One of
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_NONE}
     *         ,
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_WORDS}
     *         ,
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_SENTENCES}
     *         , or
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_ALL}
     *         to indicate how the field should be capitalized during typing.
     *         (only android)
     * 
     */
    public native int getAutocapitalization() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.autocapitalization;
    }-*/;

    public native void setAutocapitalization(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.autocapitalization = value;
    }-*/;

    /**
     * @return Boolean indicating if the field is editable
     */
    public native boolean isEditable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.editable;
    }-*/;

    public native void setEditable(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.editable = value;
    }-*/;

    /**
     * @return Boolean indicating the enabled state of the field
     */
    public native boolean isEnabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.enabled;
    }-*/;

    public native void setEnabled(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.enabled = value;
    }-*/;

    /**
     * @return Array of toolbar button objects to be used when the keyboard is
     *         displayed
     */
    public ArrayList<Button> getKeyboardToolbar() {
        ArrayList<Button> buttons = new ArrayList<Button>();
        JsArray<JavaScriptObject> values = _getKeyboardToolbar();
        for (int i = 0; i < values.length(); i++) {
            buttons.add(new Button(values.get(i)));
        }
        return buttons;
    }

    private native JsArray<JavaScriptObject> _getKeyboardToolbar() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.keyboardToolbar;
    }-*/;

    public void setKeyboardToolbar(ArrayList<Button> buttons) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Button button : buttons) {
            values.push(button.getJsObj());
        }
        _setKeyboardToolbar(values);
    }

    public void setKeyboardToolbar(Button... buttons) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Button button : buttons) {
            values.push(button.getJsObj());
        }
        _setKeyboardToolbar(values);
    }

    private native void _setKeyboardToolbar(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.keyboardToolbar = value;
    }-*/;

    /**
     * @return The color of the keyboard toolbar
     */
    public native String getKeyboardToolbarColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.keyboardToolbarColor;
    }-*/;

    public native void setKeyboardToolbarColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.keyboardToolbarColor = value;
    }-*/;

    /**
     * @return The height of the keyboard toolbar
     */
    public native double getKeyboardToolbarHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.keyboardToolbarHeight;
    }-*/;

    public native void setKeyboardToolbarHeight(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.keyboardToolbarHeight = value;
    }-*/;

    /**
     * @return Boolean to indicate if the return key should be suppressed during
     *         entry
     */
    public native boolean suppressReturn() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.suppressReturn;
    }-*/;

    public native void setSuppressReturn(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.suppressReturn = value;
    }-*/;

    public native void setSoftKeyboardOnFocus(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.softKeyboardOnFocus = value;
    }-*/;

    /**
     * @return Value of the field
     */
    public native String getValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.value;
    }-*/;

    public native void setValue(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.value = value;
    }-*/;

    /**
     * @return True (default) if textarea can be scrolled.
     * @platforms iphone, ipad
     */
    public native boolean isScrollable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.scrollable;
    }-*/;

    public native void setScrollable(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollable = value;
    }-*/;

    /**
     * Force the field to lose focus
     */
    public native void blur() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.blur();
    }-*/;

    /**
     * Force the field to gain focus
     */
    public native void focus() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.focus();
    }-*/;

    /**
     * Return boolean (true) if the field has text
     */
    public native boolean hasText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasText();
    }-*/;

    public native CallbackRegistration addChangeHandler(TextChangedHandler handler)/*-{
    	var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.text.TextChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TextChangedHandler::onChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/text/TextChangedEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.text.TextChangedEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;
    
    public native CallbackRegistration addReturnHandler(TextReturnHandler handler)/*-{
    	var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.text.TextReturnEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TextReturnHandler::onReturn(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/text/TextReturnEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.text.TextReturnEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;    
    
    @Override
    public void createPeer() {
        jsObj = UI.createTextArea();
    }

    public static TextArea from(JsObject proxy) {
        return new TextArea(proxy.getJsObj());
    }

}
