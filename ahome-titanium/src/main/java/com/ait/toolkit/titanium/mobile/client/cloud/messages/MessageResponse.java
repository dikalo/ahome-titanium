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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.cloud.core.AbstractHandlerResponse;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class MessageResponse extends AbstractHandlerResponse {

    public MessageResponse(JavaScriptObject obj) {
        jsObj = obj;
    }

    public List<Message> getMessages() {
        List<Message> toReturn = new ArrayList<Message>();
        int size = JsoHelper.getArrayLength(_getMessages());
        for (int i = 0; i < size; i++) {
            toReturn.add(new Message(JsoHelper.getValueFromJavaScriptObjectArray(_getMessages(), i)));
        }
        return toReturn;
    }

    private native JavaScriptObject _getMessages()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.messages;
    }-*/;

}
