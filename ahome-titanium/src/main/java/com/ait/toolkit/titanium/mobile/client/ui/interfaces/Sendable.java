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
package com.ait.toolkit.titanium.mobile.client.ui.interfaces;

import com.google.gwt.core.client.JsArrayString;

public interface Sendable {

    /**
     * @return Array of email bcc: recipients
     */
    public JsArrayString getBccRecipients() /*-{
                                            var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                            return jso.bccRecipients;
                                            }-*/;

    public void setBccRecipients(JsArrayString value) /*-{
                                                      var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                                      jso.bccRecipients = value;
                                                      }-*/;

    /**
     * @return Array of email cc: recipients
     */
    public JsArrayString getCcRecipients() /*-{
                                           var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                           return jso.ccRecipients;
                                           }-*/;

    public void setCcRecipients(JsArrayString value) /*-{
                                                     var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                                     jso.ccRecipients = value;
                                                     }-*/;

    /**
     * @return Boolean to indicate whether the email messagebody should be sent
     *         as html content type. defaults to false. (android note: you
     *         should not use html messages in 1.6: after that is okay.)
     */
    public boolean isHtml() /*-{
                            var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                            return jso.html;
                            }-*/;

    public void setHtml(boolean value) /*-{
                                       var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                       jso.html = value;
                                       }-*/;

    /**
     * @return The email message body
     */
    public String getMessageBody() /*-{
                                   var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                   return jso.messageBody;
                                   }-*/;

    public void setMessageBody(String value) /*-{
                                             var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                             jso.messageBody = value;
                                             }-*/;

    /**
     * @return The subject line for the email
     */
    public String getSubject() /*-{
                               var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                               return jso.subject;
                               }-*/;

    public void setSubject(String value) /*-{
                                         var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                         jso.subject = value;
                                         }-*/;

    /**
     * @return Array of email recipients
     */
    public JsArrayString getToRecipients() /*-{
                                           var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                           return jso.toRecipients;
                                           }-*/;

    public void setToRecipients(JsArrayString value) /*-{
                                                     var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                                     jso.toRecipients = value;
                                                     }-*/;

    /**
     * Return whether or not sending email is supported
     */
    public void isSupported() /*-{
                              var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                              return jso.isSupported();
                              }-*/;

    /**
     * Open the email dialog. the email dialog itself is a modal window
     * 
     * @param properties object of animation properties. pass 'animated'
     *            property (as boolean) to indicate if the dialog should be
     *            animated on open.
     */
    public void open(Object properties) /*-{
                                        var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                                        return jso.open(properties);
                                        }-*/;

    public void open() /*-{
                       var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
                       return jso.open();
                       }-*/;

}