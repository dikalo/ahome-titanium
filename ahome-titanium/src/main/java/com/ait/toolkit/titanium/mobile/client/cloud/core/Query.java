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
package com.ait.toolkit.titanium.mobile.client.cloud.core;

import java.util.Date;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JsArrayString;

/**
 * Represent a chat object
 * 
 */
public class Query extends AbstractCloudObject {

    public Query() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Comma separated user id(s) of the recipient(s). The current user id and
     * to_ids together determine which chat group a message belongs to.
     * <p>
     * Alternatively, you can use chat_group_id to identify a chat group
     * instead.
     * 
     * @param ids
     */
    public void setParticipateIds(String... ids) {
        JsArrayString toIds = JsArrayString.createArray().cast();
        for (String s : ids) {
            toIds.push(s);
        }
        setParticipateIds(toIds.join(","));
    }

    /**
     * Comma separated user id(s) of the recipient(s). The current user id and
     * to_ids together determine which chat group a message belongs to.
     * <p>
     * Alternatively, you can use chat_group_id to identify a chat group
     * instead.
     * 
     * @param ids
     */
    public native void setParticipateIds(String ids)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.participate_ids = ids;
    }-*/;

    /**
     * Request page number, default is 1
     * 
     * @param ids
     */
    public native void setPage(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.page = value;
    }-*/;

    /**
     * Number of results per page, default is 10
     * 
     * @param value
     */
    public native void setPerPage(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.per_page = value;
    }-*/;

    /**
     * Instead of using page and per_page for pagination, you can use limit and
     * skip to do your own pagination, limit is the number of records you want
     * to fetch, it cannot be greater than 100
     * 
     * @param value
     */
    public native void setLimit(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.limit = value;
    }-*/;

    /**
     * Skip first number of records and must be used together with limit
     * 
     * @param value
     */
    public native void setSkip(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.skip = value;
    }-*/;

    /**
     * Sort results by one or more fields.
     * 
     * @param value
     */
    public native void setOrder(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.order = value;
    }-*/;

    /**
     * Sender's user id
     * 
     * @param value
     */
    public native void setUserId(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.user_id = value;
    }-*/;

    /**
     * Timestamp when the chat message was created
     * 
     * @param value
     */
    public native void setCreatedAt(Date value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.created_at = value;
    }-*/;

    /**
     * Timestamp when the chat message was last updated
     * 
     * @param value
     */
    public native void setUpdatedAt(Date value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.updated_at = value;
    }-*/;

    /**
     * Constrains values for fields. where should be encoded JSON. Without it,
     * query will simply return all objects. Please refer to using where query
     * for more information
     * 
     * @param value
     */
    public native void setWhere(Criteria value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.where = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

}
