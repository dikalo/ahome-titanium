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
package com.ait.toolkit.titanium.mobile.client.buffer;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class Buffer extends EventDispatcher {

	public static int DEFAULT_BUFFER_SIZE = 1024;

	public Buffer() {
		jsObj = JsoHelper.createObject();
	}

	public Buffer(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * Appends a sourcebuffer to the current buffer. buffer is grown dynamically
	 * to accommodate the additional data if need be.
	 * 
	 * @param sourceBuffer
	 *            buffer to append to current buffer
	 * @return The number of bytes appended.
	 */
	public native double append(Buffer sourceBuffer) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.append(sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Same as normal append(sourcebuffer) except this allows appending starting
	 * at an offset.
	 * 
	 * @param sourceBuffer
	 *            buffer to append to current buffer
	 * @param sourceOffset
	 *            offset to start reading buffer data from
	 * 
	 * @return The number of bytes appended.
	 */
	public native double append(Buffer sourceBuffer, int sourceOffset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.append(
						sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceOffset);
	}-*/;

	/**
	 * Same as normal append(sourcebuffer) except this allows appending only `a
	 * length bytes from the sourcebuffer starting at the offset.
	 * 
	 * @param sourceBuffer
	 *            buffer to append to current buffer
	 * @param sourceOffset
	 *            offset to start reading buffer data from
	 * @param sourceLength
	 *            length of data to read from buffer
	 * @return The number of bytes appended.
	 */
	public native double append(Buffer sourceBuffer, int sourceOffset,
			int sourceLength) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.append(
						sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						sourceOffset, sourceLength);
	}-*/;

	public native void clear() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.clear();
	}-*/;

	/**
	 * Create new copy of the current buffer
	 */
	public native Buffer clone() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.clone();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Create new copy of the current buffer
	 */
	public native Buffer clone(int offset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.clone(offset);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Create new copy of the current buffer
	 */
	public native Buffer clone(int offset, int length) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.clone(offset, length);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native double copy(Buffer sourceBuffer, int offset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.copy(
						sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset);
	}-*/;

	public native double copy(Buffer sourceBuffer, int offset, int sourceOffset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.copy(
						sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset, sourceOffset);
	}-*/;

	public native double copy(Buffer sourceBuffer, int offset,
			int sourceOffset, int sourceLength) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.copy(
						sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset, sourceOffset, sourceLength);
	}-*/;

	public native void fill(double fillByte) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fill(fillByte);
	}-*/;

	public native void fill(double fillByte, int offset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fill(fillByte, offset);
	}-*/;

	public native void fill(double fillByte, int offset, int length) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fill(fillByte, offset, length);
	}-*/;

	public native Buffer insert(Buffer sourceBuffer, int offset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.insert(
						sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						length);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native Buffer insert(Buffer sourceBuffer, int offset,
			int sourceOffset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.insert(
						sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						length, sourceOffset);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native Buffer insert(Buffer sourceBuffer, int offset,
			int sourceOffset, int sourceLength) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.insert(
						sourceBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						length, sourceOffset, sourceLength);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void release() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.release();
	}-*/;

	public native Blob toBlob() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.toBlob();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native String stringValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.toString();
	}-*/;

	/**
	 * @return The byte order of this buffer. the os native byte order is used
	 *         by default.
	 */
	public native double getByteOrder() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.byteOrder;
	}-*/;

	public native void setByteOrder(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.byteOrder = value;
	}-*/;

	/**
	 * @return The length of the buffer in bytes. when `length` is modified the
	 *         buffer will be re-sized while preserving existing data where
	 *         possible. if the new buffer length is smaller than the length of
	 *         the existing data then the existing data will be truncated down
	 *         to the size of the new buffer. resizing the buffer via setting
	 *         length should be used sparingly due to the associated overhead.
	 */
	public native double getLength() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.length;
	}-*/;

	public native void setLength(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.length = value;
	}-*/;

	/**
	 * @return The type of data encoding to use with `value`. required when
	 *         `value` is a number. when `value` is a string,
	 *         {@link com.ait.toolkit.titanium.mobile.examples.mobile.codec.CHARTSET_UTF8} is the
	 *         default.
	 */
	public native String getType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.type;
	}-*/;

	public native void setType(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.type = value;
	}-*/;

	/**
	 * @return Data to be encoded. if `value` is a number, `type` must also be
	 *         set.
	 */
	public native <T> T getValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.value;
	}-*/;

	public native void setValue(String newValue) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.value = newValue;
	}-*/;

	public native void setValue(double newValue) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.value = newValue;
	}-*/;

}
