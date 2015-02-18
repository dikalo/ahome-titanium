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
package com.ait.toolkit.titanium.mobile.client.cloud.acls;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * Provides methods for accessing ACS access control lists (ACLs).
 * 
 */
public class Acls extends TiModule {

    private static final Acls INSTANCE = new Acls();

    public static Acls get() {
        return INSTANCE;
    }

    private Acls() {
        createPeer();
    }

    /**
     * Adds one user to an ACL object.Requires user login.
     */
    public native void addUser(AclsEntity entry, AclsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addUser(
						entry.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/acls/AclsResponse;)(response);
						});
    }-*/;

    /**
     * Checks a user's permission in an ACL object. Requires user login.
     */
    public native void checkUser(AclsEntity entry, AclsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.checkUser(
						entry.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/acls/AclsResponse;)(response);
						});
    }-*/;

    /**
     * Creates an ACL object.
     * 
     * Requires user login.
     */
    public native void create(AclsEntity entry, AclsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.create(
						entry.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/acls/AclsResponse;)(response);
						});
    }-*/;

    /**
     * Remove an ACL object.
     * 
     * Requires user login.
     */
    public native void remove(AclsEntity entry, AclsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.remove(
						entry.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/acls/AclsResponse;)(response);
						});
    }-*/;

    /**
     * Removes one user from an ACL object.
     * 
     * Requires user login.
     */
    public native void removeUser(AclsEntity entry, AclsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.removeUser(
						entry.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/acls/AclsResponse;)(response);
						});
    }-*/;

    /**
     * Shows an ACL object.
     * 
     * Requires user login.
     */
    public native void show(AclsEntity entry, AclsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.show(
						entry.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/acls/AclsResponse;)(response);
						});
    }-*/;

    /**
     * Updates an ACL object.
     * 
     * Requires user login.
     */
    public native void update(AclsEntity entry, AclsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.update(
						entry.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.acls.AclsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/acls/AclsResponse;)(response);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createACLS();
    }

}
