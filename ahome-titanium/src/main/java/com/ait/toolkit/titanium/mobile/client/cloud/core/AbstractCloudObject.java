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

import com.ait.toolkit.core.client.JsObject;

/**
 * Base class for chat request objects
 * 
 */
public abstract class AbstractCloudObject extends JsObject {

	/**
	 * By default, the chat group with participate users' info will be included
	 * in the json output. If you have already cached all the user objects
	 * participating in the chat group and wish to receive smaller json
	 * response, you can set response_json_depth = 2 to remove participate
	 * user's info from chat group in the json response.
	 * 
	 * @param value
	 */
	public native void setResponseJsonDepth(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.response_json_depth = value;
	}-*/;

	/**
	 * User defined fields.
	 * 
	 * @param value
	 */
	public native void setCustomFields(JsObject value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.custom_fields = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * A chat group's id. Instead of using to_id , if you already know the id of
	 * a chat group, you can use it to specify which chat group this message
	 * should go to.
	 * 
	 * @param ids
	 */
	public native void setMessage(String id)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.message = id;
	}-*/;

	/**
	 * Assign a new photo or an existing photo to the chat. When you use photo
	 * parameter to attach a new photo, you can use it with custom resize and
	 * sync options.
	 * <p>
	 * Alternatively, you assign an existing photo by providing photo_id of an
	 * existing photo.
	 * 
	 * @param value
	 */
	public native void setPhoto(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.photo = value;
	}-*/;

	/**
	 * Assign a new photo or an existing photo to the chat. When you use photo
	 * parameter to attach a new photo, you can use it with custom resize and
	 * sync options.
	 * <p>
	 * Alternatively, you assign an existing photo by providing photo_id of an
	 * existing photo.
	 * 
	 * @param value
	 */
	public native void setPhotoId(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.photo_id = value;
	}-*/;

}
