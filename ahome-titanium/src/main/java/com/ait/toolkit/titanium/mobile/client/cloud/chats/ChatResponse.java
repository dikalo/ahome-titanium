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

import com.ait.toolkit.titanium.mobile.client.cloud.core.AbstractCloudResponse;
import com.ait.toolkit.titanium.mobile.client.cloud.core.User;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represent the response coming from a chat request
 */
public class ChatResponse extends AbstractCloudResponse {

    ChatResponse(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native User getFrom()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var user = peer.from;
		return @com.ait.toolkit.titanium.mobile.client.cloud.core.User::new(Lcom/google/gwt/core/client/JavaScriptObject;)(user);
    }-*/;

    public native ChatGroup getChatGroup()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var group = peer.chat_group;
		return @com.ait.toolkit.titanium.mobile.client.cloud.chats.ChatGroup::new(Lcom/google/gwt/core/client/JavaScriptObject;)(group);
    }-*/;

}
