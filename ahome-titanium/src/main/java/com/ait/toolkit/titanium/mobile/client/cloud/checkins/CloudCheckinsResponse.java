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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.cloud.core.AbstractHandlerResponse;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Argument passed to the callback when a request finishes successfully or
 * erroneously.
 * 
 */

public class CloudCheckinsResponse extends AbstractHandlerResponse {

	CloudCheckinsResponse(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * 
	 List of checkins response objects, if any
	 */
	public List<CheckinsResponse> getCheckins() {
		List<CheckinsResponse> list = new ArrayList<CheckinsResponse>();
		JavaScriptObject checkins = _getCheckins();
		int size = JsoHelper.getJavaScriptObjectArraySize(checkins);
		for (int i = 0; i < size; i++) {
			JavaScriptObject chat = JsoHelper
					.getValueFromJavaScriptObjectArray(checkins, i);
			list.add(new CheckinsResponse(chat));
		}
		return list;
	}

	/**
	 * 
	 Array of chat response objects, if any
	 */
	private native JavaScriptObject _getCheckins()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.checkins;
	}-*/;

}
