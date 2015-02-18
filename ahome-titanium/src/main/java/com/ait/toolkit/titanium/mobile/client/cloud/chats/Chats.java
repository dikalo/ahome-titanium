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
package com.ait.toolkit.titanium.mobile.client.cloud.chats;

import com.ait.toolkit.titanium.mobile.client.cloud.core.Query;
import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * 
 Provides methods for accessing ACS chat messages.
 * <p>
 * Chats provides API to send chat messages from one user to another user or a
 * group of users. If you have configured push notification in your app, you can
 * send optional push notifications to the recipients' devices as well.
 * 
 */
public class Chats extends TiModule {

    private static final Chats INSTANCE = new Chats();

    public static Chats get() {
        return INSTANCE;
    }

    private Chats() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeChats();
    }

    /**
     * Send a chat message to another user or a group of users.
     * 
     * @param message
     * @param handler
     */
    public native void create(ChatMessage message, CloudChatsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.create(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.chats.CloudChatsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.chats.CloudChatsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/chats/CloudChatsResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of chat messages with sorting and pagination.
     * <p>
     * Data is returned in the chats property of the parameter passed to the
     * callback.
     * 
     * @param message
     * @param handler
     */
    public native void query(Query query, CloudChatsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.query(
						query.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.chats.CloudChatsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.chats.CloudChatsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/chats/CloudChatsResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of chat groups the current user belongs to.
     * 
     * @param message
     * @param handler
     */
    public native void getChatGroups(CloudChatGroupResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.getChatGroups(function(e) {
					var response = @com.ait.toolkit.titanium.mobile.client.cloud.chats.CloudChatsGroupResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
					handler.@com.ait.toolkit.titanium.mobile.client.cloud.chats.CloudChatGroupResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/chats/CloudChatsGroupResponse;)(eventObject);
				});
    }-*/;

    /**
     * Retrieve a list of chat groups the current user belongs to.
     * 
     * @param message
     * @param handler
     */
    public native void getChatGroups(ChatMessage message, CloudChatGroupResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.getChatGroups(
						message.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.chats.CloudChatsGroupResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.chats.CloudChatGroupResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/chats/CloudChatsGroupResponse;)(eventObject);
						});
    }-*/;

}
