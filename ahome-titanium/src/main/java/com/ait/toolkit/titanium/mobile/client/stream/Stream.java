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

import com.ait.toolkit.titanium.mobile.client.buffer.Buffer;
import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Stream module containing stream utility methods
 */
public class Stream extends TiModule {

	public static final double MODE_READ = MODE_READ();
	public static final double MODE_WRITE = MODE_WRITE();
	public static final double MODE_APPEND = MODE_APPEND();
	private static Stream instance = null;

	public static Stream get() {
		if (instance == null) {
			instance = new Stream();
		}
		return instance;
	}

	private Stream() {
		createPeer();
	}

	/**
	 * Creates stream from specified container. returns titanium.bufferstream or
	 * titanium.blobstream depending on whether a buffer or blob is provided as
	 * the 'source' property in params. write and append mode only applies to
	 * buffer as blob is read only.
	 * 
	 * @param config
	 *            creation arguments
	 */
	public native IOStream createStream(StreamConfig config) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var configObjet = config.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createStream(configObject);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.stream.IOStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Async version of read on Iitanium.IOStream
	 * 
	 * @param sourceStream
	 *            Stream to read from
	 * @param buffer
	 *            Buffer to read into
	 */
	public native void read(IOStream sourceStream, Buffer buffer,
			ReadCallback readCallback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.read(
						sourceStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var args = @com.ait.toolkit.titanium.mobile.client.stream.ReadArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							readCallback.@com.ait.toolkit.titanium.mobile.client.stream.ReadCallback::onRead(Lcom/ait/toolkit/titanium/mobile/client/stream/ReadArguments;)(args);
						});
	}-*/;

	/**
	 * Async version of read on Iitanium.IOStream that takes offset and length
	 * 
	 * @param sourceStream
	 *            Stream to read from
	 * @param buffer
	 *            Buffer to read into
	 * @param offset
	 *            offset to start reading buffer data from
	 * @param length
	 *            length of data to read from buffer
	 */
	public native void read(IOStream sourceStream, Buffer buffer,
			double offset, double length, ReadCallback readCallback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.read(
						sourceStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset,
						length,
						function(e) {
							var args = @com.ait.toolkit.titanium.mobile.client.stream.ReadArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							readCallback.@com.ait.toolkit.titanium.mobile.client.stream.ReadCallback::onRead(Lcom/ait/toolkit/titanium/mobile/client/stream/ReadArguments;)(args);
						});
	}-*/;

	/**
	 * Reads all data from Titanium.IOStream
	 * 
	 * @param sourceStream
	 *            Stream to read from
	 */
	public static native void readAll(IOStream sourceStream) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.readAll(sourceStream.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Async version ofreadall
	 * 
	 * @param sourceStream
	 *            Stream to read from
	 */
	public native void readAll(IOStream sourceStream, Buffer buffer,
			ReadCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();

		jso
				.readAll(
						sourceStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var args = @com.ait.toolkit.titanium.mobile.client.stream.ReadArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							readCallback.@com.ait.toolkit.titanium.mobile.client.stream.ReadCallback::onRead(Lcom/ait/toolkit/titanium/mobile/client/stream/ReadArguments;)(args);
						});
	}-*/;

	/**
	 * 
	 * Async version of write on Ttitanium.IOStream
	 * 
	 * @param outputStream
	 *            Stream to write to
	 * @param buffer
	 *            Buffer to write from
	 * 
	 */
	public native void write(IOStream outputStream, Buffer buffer,
			WriteCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();

		jso
				.write(
						outputStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var args = @com.ait.toolkit.titanium.mobile.client.stream.WriteArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							readCallback.@com.ait.toolkit.titanium.mobile.client.stream.ReadCallback::onRead(Lcom/ait/toolkit/titanium/mobile/client/stream/ReadArguments;)(args);
						});
	}-*/;

	/**
	 * Async version of write on Ttitanium.IOStream that takes offset and length
	 * 
	 * @param outputStream
	 *            Stream to write to
	 * @param buffer
	 *            Buffer to write from
	 * @param offset
	 *            offset to start writing buffer data from
	 * @param length
	 *            length of data to write from buffer
	 */
	public native void write(IOStream outputStream, Buffer buffer,
			double offset, double length, WriteCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();

		jso
				.write(
						outputStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offset,
						length,
						function(e) {
							var args = @com.ait.toolkit.titanium.mobile.client.stream.WriteArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							readCallback.@com.ait.toolkit.titanium.mobile.client.stream.ReadCallback::onRead(Lcom/ait/toolkit/titanium/mobile/client/stream/ReadArguments;)(args);
						});
	}-*/;

	/**
	 * Writes all data from input stream to output stream
	 * 
	 * @param inputStream
	 *            Stream to read from
	 * @param outputStream
	 *            Stream to write to
	 * @param maxChunkSize
	 *            max size of data to write from inputStream to ouputStream at
	 *            once
	 * @return Number of bytes written
	 */
	public native void writeStream(IOStream inputStream, IOStream outputStream,
			double maxChunkSize) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.writeStream(
						inputStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						outputStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						maxChunkSize);
	}-*/;

	/**
	 * Writes all data from input stream to output stream
	 * 
	 * @param inputStream
	 *            Stream to read from
	 * @param outputStream
	 *            Stream to write to
	 * @param maxChunkSize
	 *            max size of data to write from inputStream to ouputStream at
	 *            once
	 * @return Number of bytes written
	 */
	public native void writeStream(IOStream inputStream, IOStream outputStream,
			double maxChunkSize, WriteStreamCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.writeStream(
						outputStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						outputStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						maxChunkSize,
						function(e) {
							var args = @com.ait.toolkit.titanium.mobile.client.stream.WriteArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							readCallback.@com.ait.toolkit.titanium.mobile.client.stream.ReadCallback::onRead(Lcom/ait/toolkit/titanium/mobile/client/stream/ReadArguments;)(args);
						});
	}-*/;

	/**
	 * Pumps data from input stream to handler method
	 * 
	 * @param inputStream
	 *            Stream to pump from
	 * @param maxChunkSize
	 *            max size of data to pump from inputStream to the handler
	 *            method at once
	 */
	public native void pump(IOStream inputStream, PumpCallback callback,
			double maxChunkSize) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.pump(
						inputStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var args = @com.ait.toolkit.titanium.mobile.client.stream.PumpArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.titanium.mobile.client.stream.PumpCallback::onPump(Lcom/ait/toolkit/titanium/mobile/client/stream/PumpArguments;)(args);
						}, maxChunkSize);
	}-*/;

	/**
	 * Variant of pump that allows for setting the async mode
	 * 
	 * @param inputStream
	 *            Stream to pump from
	 * @param maxChunkSize
	 *            max size of data to pump from inputStream to the handler
	 *            method at once
	 * @param isAsync
	 *            true is pump operation should be async, false is not
	 */
	public native void pump(IOStream inputStream, PumpCallback callback,
			double maxChunkSize, boolean async) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.pump(
						inputStream.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var args = @com.ait.toolkit.titanium.mobile.client.stream.PumpArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.titanium.mobile.client.stream.PumpCallback::onPump(Lcom/ait/toolkit/titanium/mobile/client/stream/PumpArguments;)(args);
						}, maxChunkSize, async);
	}-*/;

	private static native void addEventListener(String event,
			JavaScriptObject listener) /*-{
		Titanium.Stream.addEventListener(event, listener);
	}-*/;

	private static native final double MODE_READ() /*-{
		return Titanium.Stream.MODE_READ;
	}-*/;

	private static native final double MODE_WRITE() /*-{
		return Titanium.Stream.MODE_WRITE;
	}-*/;

	private static native final double MODE_APPEND() /*-{
		return Titanium.Stream.MODE_APPEND;
	}-*/;

	@Override
	public void createPeer() {
		jsObj = TiFactory.createNativeStreamModule();
	}
}
