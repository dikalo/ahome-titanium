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
package com.ait.toolkit.titanium.mobile.client.cloud.checkins;

import com.ait.toolkit.titanium.mobile.client.cloud.core.AbstractCloudResponse;
import com.ait.toolkit.titanium.mobile.client.cloud.core.Photo;
import com.ait.toolkit.titanium.mobile.client.cloud.core.Place;
import com.ait.toolkit.titanium.mobile.client.cloud.core.User;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represent the response coming from a chat request
 */
public class CheckinsResponse extends AbstractCloudResponse {

    CheckinsResponse(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native Place getPlace()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.place;
		return @com.ait.toolkit.titanium.mobile.client.cloud.core.Place::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native User getUser()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.user;
		return @com.ait.toolkit.titanium.mobile.client.cloud.core.User::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Photo getPhoto()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.photo;
		return @com.ait.toolkit.titanium.mobile.client.cloud.core.Photo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
