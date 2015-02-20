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
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DialogClickHandler;
import com.ait.toolkit.titanium.mobile.client.ui.ios.AttributedString;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The RefreshControl is a representation of the native UIRefreshControl.
 * <p>
 * You use a RefreshControl with a {@link TableView} or {@Link ListView}
 * object. It provides an alternate method to implement pull to refresh
 * functionality provided by Titanium.UI.TableView.headerPullView and
 * Titanium.UI.ListView.pullView properties.
 */
public class RefreshControl extends EventDispatcher {

	public RefreshControl() {
		createPeer();
	}

	RefreshControl(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	/**
	 * @return A titanium.ui.view. allows for arbitrary contents inside a native
	 *         dialog. works for any dialog. (android)
	 * @platforms android
	 */
	public native String getTintColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.tintColor;
	}-*/;

	public native void setTintColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.tintColor = value;
	}-*/;

	/**
	 * @return An index to indicate which button should be the cancel button. if
	 *         no button should be the cancel button, use -1. if there is a
	 *         cancel button, it must be the last button for use on ipad.
	 */
	public native AttributedString getAttributedString() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.attributedString;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.ios.AttributedString::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native void setCancel(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.cancel = value;
	}-*/;

	/**
	 * @return The destructive button (indicated by a visual clue in the ui)
	 */
	public native int getDestructive() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.destructive;
	}-*/;

	public native void setDestructive(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.destructive = value;
	}-*/;

	/**
	 * @return Array of button names as strings
	 */
	public native JsArrayString getOptions() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.options;
	}-*/;

	public void setOptions(String... values) {
		JsArrayString strings = JsArrayString.createArray().cast();
		for (String s : values) {
			strings.push(s);
		}
		setOptions(strings);
	}

	public native void setOptions(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.options = value;
	}-*/;

	/**
	 * @return Set an initially selected option. only valid when options has
	 *         been specified. (android only)
	 * @platforms android
	 */
	public native int getSelectedIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.selectedIndex;
	}-*/;

	public native void setSelectedIndex(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selectedIndex = value;
	}-*/;

	/**
	 * @return The title of the dialog
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

	/**
	 * Cause the dialog to become visible
	 */
	public native void show() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.show();
	}-*/;

	public native CallbackRegistration addClickHandler(
			DialogClickHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.dialog.DialogClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DialogClickHandler::onClick(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/dialog/DialogClickEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	private void createPeer() {
		jsObj = UI.createRefreshControl();
	}

	public static RefreshControl from(JsObject proxy) {
		return new RefreshControl(proxy.getJsObj());
	}

}
