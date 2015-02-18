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
package com.ait.toolkit.titanium.mobile.client.filesystem;

import com.ait.toolkit.titanium.mobile.client.buffer.Buffer;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Wrapper around `titanium.filesystem.file` that implements the
 * `titanium.iostream` interface
 */
public class FileStream extends File {

    protected FileStream() {
    }

    protected FileStream(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Closes stream and throws exception on error
     */
    public native void close() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.close();
    }-*/;

    /**
     * Reads true if stream is readable, false otherwise
     * 
     * @return
     */
    public native boolean isReadable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isReadable();
    }-*/;

    /**
     * Reads true if stream is writeable, false otherwise
     * 
     * @return
     */
    public native boolean isWritable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isWritable();
    }-*/;

    /**
     * reads data from stream into a buffer.
     * 
     * @param buffer
     * @return
     */
    public native double read(Buffer buffer) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.read(buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * reads data from stream into a buffer. Optional offset to specify position
     * in buffer in which to start writing the read data
     * 
     * @param buffer
     * @param offset
     * @return
     */
    public native double read(Buffer buffer, double offset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.read(
				buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				offset);
    }-*/;

    /**
     * reads data from stream into a buffer. Optional offset and length
     * arguments to specify position in buffer in which to start writing the
     * read data, and the amount of data to read.
     * 
     * @param buffer
     * @param offset
     * @param length
     * @return
     */
    public native double read(Buffer buffer, double offset, double length) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.read(
				buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				offset, length);
    }-*/;

    /**
     * writes data from buffer to stream.
     * 
     * @param buffer
     * @return
     */
    public native double write(Buffer buffer) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.write(buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * writes data from buffer to stream. Optional offset in buffer in which to
     * start reading data that is written to the stream.
     * 
     * @param buffer
     * @param offset
     * @return
     */
    public native double write(Buffer buffer, double offset) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.write(
				buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				offset);
    }-*/;

    /**
     * writes data from buffer to stream. Optional offset and length arguments
     * to specify position in buffer in which to start reading data that is
     * written to the stream, and the length of the data to take from the
     * buffer.
     * 
     * @param buffer
     * @param offset
     * @param length
     * @return
     */
    public native double write(Buffer buffer, double offset, double length) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.write(
				buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				offset, length);
    }-*/;

}
