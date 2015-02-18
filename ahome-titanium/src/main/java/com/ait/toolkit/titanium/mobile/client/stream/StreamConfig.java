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
package com.ait.toolkit.titanium.mobile.client.stream;

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.buffer.Buffer;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;

public class StreamConfig extends JsObject {

	public StreamConfig() {
		jsObj = JsoHelper.createObject();
	}

	public native void setSource(Blob value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.source = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public native void setSource(Buffer value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.source = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * @return Object to create stream around
	 */
	public native Buffer getSource() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.source;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * @return Mode for the stream to be opened in. can be
	 *         com.ait.toolkit.titanium.mobile.client.stream.Stream.MODE_READ,
	 *         com.ait.toolkit.titanium.mobile.client.stream.Stream.MODE_WRITE or
	 *         com.ait.toolkit.titanium.mobile.client.stream.STEAM.MODE_APPEND
	 */
	public native int getMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.mode;
	}-*/;

	public native void setMode(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.mode = value;
	}-*/;

}
