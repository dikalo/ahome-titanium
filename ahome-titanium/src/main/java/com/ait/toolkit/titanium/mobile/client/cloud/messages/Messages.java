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
package com.ait.toolkit.titanium.mobile.client.cloud.messages;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * Provides methods for accessing ACS messages.
 */
public class Messages extends TiModule {

    private static final Messages INSTANCE = new Messages();

    public static Messages get() {
        return INSTANCE;
    }

    private Messages() {
        createPeer();
    }

    /**
     * Create a message.
     * 
     * Requires user login.
     */
    public native void create(Message message, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.create(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Delete a message.
     * 
     * Requires user login.
     */
    public native void remove(Message message, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.remove(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Reply to all recipients of a message.
     * 
     */
    public native void reply(Message message, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.reply(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve information about a message.
     */
    public native void show(Message message, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.show(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Delete a message.
     * 
     * Requires user login.
     */
    public native void removeThread(MessageThread messageThread, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.removeThread(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showInBox(MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.showInBox(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showInBox(SearchConfig config, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.showInBox(
						config.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showSent(MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.showSent(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showSent(SearchConfig config, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.showSent(
						config.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showThread(ThreadSearchConfig config, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.showThread(
						config.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of messages in the current user's inbox.
     */
    public native void showThreads(ThreadSearchConfig config, MessageResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.showThreads(
						config.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.messages.MessageResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/messages/MessageResponse;)(response);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createMessages();
    }

}
