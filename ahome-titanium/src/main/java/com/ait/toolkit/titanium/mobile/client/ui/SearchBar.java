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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SearchBarHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Search bar object
 */
public class SearchBar extends View {

    public SearchBar() {
        createPeer();
    }

    SearchBar(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    public SearchBar(String hintText) {
        this();
        setHintText(hintText);
    }

    /**
     * @return One of
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_NONE}
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_WORDS}
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.TEXT_AUTOCAPICES} or
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_ALLl}
     *         to indicate how the field should be capitalized during typing.
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
     * @return Boolean to indicate if the text in the field should be
     *         autocorrected as typed
     */
    public native boolean isAutocorrect() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.autocorrect;
    }-*/;

    public native void setAutocorrect(boolean value) /*-{
		jso.autocorrect = value;
    }-*/;

    /**
     * @return The bar color of the search bar view
     */
    public native String getBarColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.barColor;
    }-*/;

    public native void setBarColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.barColor = value;
    }-*/;

    /**
     * @return The text to show when the search bar field is not focused
     */
    public native String getHintText() /*-{
		return jso.hintText;
    }-*/;

    public native void setHintText(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hintText = value;
    }-*/;

    /**
     * @return The key in the locale file to use for the hinttext property
     */
    public native String getHintTextId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hinttextid;
    }-*/;

    public native void setHintTextId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hinttextid = value;
    }-*/;

    /**
     * @return The keyboard type constant to use when the field is focused
     */
    public native int getKeyboardType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.keyboardType;
    }-*/;

    public native void setKeyboardType(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.keyboardType = value;
    }-*/;

    /**
     * @return A single line of text displayed at the top of the search bar
     */
    public native String getPrompt() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.prompt;
    }-*/;

    public native void setPrompt(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.prompt = value;
    }-*/;

    /**
     * @return The key in the locale file to use for the prompt property
     */
    public native String getPromptId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.promptid;
    }-*/;

    public native void setPromptId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.promptid = value;
    }-*/;

    /**
     * @return Boolean indicates whether the cancel button is displayed
     */
    public native boolean showCancel() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.showCancel;
    }-*/;

    public native void setShowCancel(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showCancel = value;
    }-*/;

    /**
     * @return The value of the search bar
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
     * Called to force the search bar to lose focus
     */
    public native void blur() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.blur();
    }-*/;

    /**
     * Called to force the search bar to focus
     */
    public native void focus() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.focus();
    }-*/;

    public native void addBlurHandler(SearchBarHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::BLUR,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.SearchBarEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SearchBarHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/SearchBarEvent;)(eventObject);
						});
    }-*/;

    public native void addChangeHandler(SearchBarHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.SearchBarEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SearchBarHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/SearchBarEvent;)(eventObject);
						});
    }-*/;

    public native void addFocusHandler(SearchBarHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::FOCUS,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.SearchBarEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SearchBarHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/SearchBarEvent;)(eventObject);
						});
    }-*/;

    public native void addReturnHandler(SearchBarHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::RETURN,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.SearchBarEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SearchBarHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/SearchBarEvent;)(eventObject);
						});
    }-*/;

    public native void addCancelHandler(SearchBarHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::CANCEL,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.SearchBarEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SearchBarHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/SearchBarEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createSearchBar();
    }

    public static SearchBar from(JsObject proxy) {
        return new SearchBar(proxy.getJsObj());
    }
}
