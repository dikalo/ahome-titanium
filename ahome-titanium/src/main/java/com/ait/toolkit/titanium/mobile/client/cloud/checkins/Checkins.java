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

import com.ait.toolkit.titanium.mobile.client.cloud.core.Query;
import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * Checkins provides API to create and manage checkins to a place or an event.
 */
public class Checkins extends TiModule {

    private static final Checkins INSTANCE = new Checkins();

    public static Checkins get() {
        return INSTANCE;
    }

    private Checkins() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeCheckins();
    }

    /**
     * Check in to a place or event
     */
    public native void create(Checkin request, CloudCheckinsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.create(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.checkins.CloudCheckinsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.checkins.CloudCheckinsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/checkins/CloudCheckinsResponse;)(response);
						});
    }-*/;

    /**
     * Retrieve a list of checkins with sorting and pagination.
     * 
     */
    public native void query(Query query, CloudCheckinsResponseHandler handler)/*-{
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
     * Delete a checkin.
     * <p>
     * Note that the checkin id must be set through setCheckinIds
     */
    public native void remove(Checkin request, CloudCheckinsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.remove(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.checkins.CloudCheckinsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.checkins.CloudCheckinsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/checkins/CloudCheckinsResponse;)(response);
						});
    }-*/;

    /**
     * Delete a checkin.
     * <p>
     * Note that the checkin id must be set through setCheckinIds
     */
    public native void show(Checkin request, CloudCheckinsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.show(
						request.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.checkins.CloudCheckinsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.checkins.CloudCheckinsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/checkins/CloudCheckinsResponse;)(response);
						});
    }-*/;

}
