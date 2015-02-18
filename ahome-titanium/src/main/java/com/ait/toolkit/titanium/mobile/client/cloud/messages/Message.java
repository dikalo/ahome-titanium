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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents a cloud message
 */
public class Message extends JsObject {

    public Message() {
        jsObj = JsoHelper.createObject();
    }

    public Message(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setToIds(String value) {
        JsoHelper.setAttribute(jsObj, "to_ids", value);
    }

    public String getToIds() {
        return JsoHelper.getAttribute(jsObj, "to_ids");
    }

    public void setBody(String value) {
        JsoHelper.setAttribute(jsObj, "body", value);
    }

    public String getBody() {
        return JsoHelper.getAttribute(jsObj, "body");
    }

    public void setSubject(String value) {
        JsoHelper.setAttribute(jsObj, "subject", value);
    }

    public String getSubject() {
        return JsoHelper.getAttribute(jsObj, "subject");
    }

    public void setId(String value) {
        JsoHelper.setAttribute(jsObj, "message_id", value);
    }

    public String getId() {
        return JsoHelper.getAttribute(jsObj, "message_id");
    }
}
