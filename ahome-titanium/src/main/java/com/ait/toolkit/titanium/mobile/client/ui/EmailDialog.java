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
import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EmailCompleteHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.email.CompleteHandler;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasAttachment;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.Sendable;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * The email dialog allows you to send in application emails on behalf of the
 * application user.
 */
public class EmailDialog extends EventDispatcher implements HasAttachment,
		Sendable {

	private static final EmailDialog INSTANCE = new EmailDialog();

	public static final int CANCELLED = INSTANCE._getCancelled();
	public static final int FAILED = INSTANCE._getFailed();
	public static final int SENT = INSTANCE._getSent();
	public static final int SAVED = INSTANCE._getSaved();

	public EmailDialog() {
		createPeer();
	}

	EmailDialog(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	/**
	 * @return The bar color of the email dialog window when opened
	 */
	public native String getBarColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.barColor;
	}-*/;

	public native void setBarColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.barColor = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.Sendable#getBccRecipients()
	 */
	@Override
	public native JsArrayString getBccRecipients() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.bccRecipients;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.Sendable#setBccRecipients(com
	 * .google .gwt.core.client.JsArrayString)
	 */
	@Override
	public native void setBccRecipients(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.bccRecipients = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.Sendable#getCcRecipients()
	 */
	@Override
	public native JsArrayString getCcRecipients() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.ccRecipients;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.Sendable#setCcRecipients(com
	 * .google .gwt.core.client.JsArrayString)
	 */
	@Override
	public native void setCcRecipients(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ccRecipients = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.Sendable#isHtml()
	 */
	@Override
	public native boolean isHtml() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.html;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.Sendable#setHtml(boolean)
	 */
	@Override
	public native void setHtml(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.html = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.Sendable#getMessageBody()
	 */
	@Override
	public native String getMessageBody() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.messageBody;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.Sendable#setMessageBody(java
	 * .lang .String)
	 */
	@Override
	public native void setMessageBody(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.messageBody = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.Sendable#getSubject()
	 */
	@Override
	public native String getSubject() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.subject;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.Sendable#setSubject(java.lang
	 * .String )
	 */
	@Override
	public native void setSubject(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.subject = value;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.Sendable#getToRecipients()
	 */
	@Override
	public native JsArrayString getToRecipients() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.toRecipients;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.Sendable#setToRecipients(com
	 * .google .gwt.core.client.JsArrayString)
	 */
	@Override
	public native void setToRecipients(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.toRecipients = value;
	}-*/;

	public void setToRecipients(String... values) {
		JsArrayString peers = JsArray.createArray().cast();
		for (String s : values) {
			peers.push(s);
		}
		setToRecipients(peers);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.HasAttachment#addAttachment
	 * (com. emitrom.gwt4.ti.mobile.client.blob.Blob)
	 */
	@Override
	public native void addAttachment(Blob attachment) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addAttachment(attachment.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.HasAttachment#addAttachment
	 * (com. emitrom.gwt4.ti.mobile.client.filesystem.File)
	 */
	@Override
	public native void addAttachment(File attachment) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addAttachment(attachment.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.Sendable#isSupported()
	 */
	@Override
	public native void isSupported() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isSupported();
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ait.toolkit.titanium.mobile.client.ui.Sendable#open(java.lang.Object)
	 */
	@Override
	public native void open(Object properties) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.open(properties);
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ait.toolkit.titanium.mobile.client.ui.Sendable#open()
	 */
	@Override
	public native void open() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.open();
	}-*/;

	@Deprecated
	public native void addCompleteHandler(EmailCompleteHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.email.EmailCompleteEvent::COMPLETE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.email.EmailCompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.EmailCompleteHandler::onComplete(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/email/EmailCompleteEvent;)(eventObject);
						});
	}-*/;

	public native CallbackRegistration addCompleHandler(CompleteHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.email.CompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.email.CompleteHandler::onComplete(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/email/CompleteEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.email.CompleteEvent::COMPLETE;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	private native int _getCancelled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.CANCELLED;
	}-*/;

	private native int _getFailed() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.FAILED;
	}-*/;

	private native int _getSent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.sENT;
	}-*/;

	private native int _getSaved() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.SAVED;
	}-*/;

	private void createPeer() {
		jsObj = UI.createEmailDialog();
	}

	public static EmailDialog from(JsObject proxy) {
		return new EmailDialog(proxy.getJsObj());
	}

}
