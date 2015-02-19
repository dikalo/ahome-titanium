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
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.Displayable;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasMessage;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasTitle;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The alert dialog allows you to show a modal application dialog.
 * <p>
 * 
 * you should be careful not to call alert more than once while a pending alert
 * is visible.
 * 
 * On iOS 4, alert dialogs will automatically be cancelled upon application
 * suspend.
 */
public class AlertDialog extends EventDispatcher implements Displayable,
		HasTitle, HasMessage {

	public AlertDialog() {
		jsObj = UI.createAlertDialog();
	}

	public AlertDialog(String... buttonNames) {
		JsArrayString names = JsArrayString.createArray().cast();
		for (String name : buttonNames) {
			names.push(name);
		}
		jsObj = UI.createAlertDialog(names);
	}

	private AlertDialog(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * @return Array of button names as strings
	 */
	public ArrayList<String> getButtonNames() {
		JsArrayString strings = _getButtonNames();
		ArrayList<String> values = new ArrayList<String>();
		for (int i = 0; i < strings.length(); i++) {
			values.add(strings.get(i));
		}
		return values;
	}

	private native JsArrayString _getButtonNames() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.buttonNames;
	}-*/;

	/**
	 * @return An index to indicate which button should be the cancel button
	 */
	public native int getCancel() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.cancel;
	}-*/;

	/**
	 * View to load inside the message area, to create a custom layout.
	 * 
	 * @param view
	 */
	public native void setAndroidView(View view) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.androidView = view.@com.ait.toolkit.core.client.JsObject::getJsObj()();

	}-*/;

	/**
	 * View to load inside the message area, to create a custom layout.
	 * 
	 * @return
	 */
	public native View getAndroidView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.androidView;
		return @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);

	}-*/;

	public native void setCancel(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.cancel = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.HasMessage#getMessage()
	 */
	@Override
	public native String getMessage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.message;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.HasMessage#setMessage(java.
	 * lang. String)
	 */
	@Override
	public native void setMessage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.message = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.HasMessage#getMessageId()
	 */
	@Override
	public native String getMessageId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.messageid;
	}-*/;

	/**
	 * Text for the OK button.
	 * 
	 * @param value
	 */
	public native void setOk(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ok = value;
	}-*/;

	/**
	 * Text for the OK button.
	 * 
	 * @return
	 */
	public native String getOk() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.ok;
	}-*/;

	/**
	 * Key identifying a string in the locale file to use for the ok text.
	 * 
	 * @param value
	 */
	public native void setOkId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.okid = value;
	}-*/;

	/**
	 * Key identifying a string in the locale file to use for the ok text.
	 * 
	 * @return
	 */
	public native String getOkId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.okid;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.HasMessage#setMessageId(java
	 * .lang .String)
	 */
	@Override
	public native void setMessageId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.messageid = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.HasTitle#getTitle()
	 */
	@Override
	public native String getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.title;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.HasTitle#setTitle(java.lang
	 * .String)
	 */
	@Override
	public native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
	}-*/;

	/**
	 * Key identifying a string in the locale file to use for the title text.
	 * 
	 * @return
	 */
	public native String getTitleId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.titleid;
	}-*/;

	/**
	 * Key identifying a string in the locale file to use for the title text.
	 * 
	 * @param value
	 */
	public native void setTitleId(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.titleid = value;
	}-*/;

	/**
	 * Cause the dialog to become hidden
	 */
	public native void hide() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hide();
	}-*/;

	/**
	 * Cause the dialog to become visible
	 */
	public native void show() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.show();
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

	public static AlertDialog from(JsObject proxy) {
		return new AlertDialog(proxy.getJsObj());
	}
}
