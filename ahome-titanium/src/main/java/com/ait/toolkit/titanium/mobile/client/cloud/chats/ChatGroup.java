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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.cloud.core.User;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represent the person that send the chat message
 */
public class ChatGroup extends JsObject {

	ChatGroup(JavaScriptObject obj) {
		jsObj = obj;
	}

	public native String Id()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.id;
	}-*/;

	public native String getCreatedAt()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.created_at;
	}-*/;

	public native String getUpdatedAt()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.updated_at;
	}-*/;

	public List<User> getParticipateUsers() {
		List<User> list = new ArrayList<User>();
		JavaScriptObject users = _getParticicapteUsers();
		int size = JsoHelper.getJavaScriptObjectArraySize(users);
		for (int i = 0; i < size; i++) {
			JavaScriptObject user = JsoHelper
					.getValueFromJavaScriptObjectArray(users, i);
			list.add(new User(user));
		}
		return list;
	}

	private native JavaScriptObject _getParticicapteUsers()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.participate_users;
	}-*/;

}
