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
package com.ait.toolkit.titanium.mobile.client.cloud.emails;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;

/**
 * Represents an email
 */
public class Email extends JsObject {

    public Email() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Comma separated email addresses
     */
    public native void setRecipients(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.recipients = value;
    }-*/;

    /**
     * Name of the email template you have created
     */
    public native void setTemplate(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.template = value;
    }-*/;

    /**
     * Sender's email address, if you use google as your SMTP server, you can't
     * change your sender's email address dynamically, your email will always be
     * sent out as the email account you used to configure the SMTP. Some SMTP
     * service such as BlueHost requires the sender's email address to be
     * present.
     */
    public native void setFrom(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.from = value;
    }-*/;

    /**
     * Dynamic fields you defined in your email template. If you have defined a
     * field {{username}} in the email template, you can pass username=joe to
     * have the field username substituted by the value you provide in the
     * outgoing email.
     */
    public native void setDynamicFields(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.dynamic_fields = value;
    }-*/;

}
