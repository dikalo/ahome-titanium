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

import java.io.IOException;

import com.ait.toolkit.titanium.mobile.client.Titanium;
import com.ait.toolkit.titanium.mobile.client.api.API;
import com.ait.toolkit.titanium.mobile.client.buffer.Buffer;
import com.ait.toolkit.titanium.mobile.client.codec.Codec;
import com.ait.toolkit.titanium.mobile.client.codec.DecodeNumberSpec;
import com.ait.toolkit.titanium.mobile.client.codec.DecodeStringSpec;
import com.ait.toolkit.titanium.mobile.client.codec.EncodeNumberSpec;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Iostream is the interface that all stream types implement
 */
public class IOStream extends EventDispatcher {

    protected IOStream() {
    }

    protected IOStream(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Reads data from stream into a buffer
     * 
     * @param buffer
     *            buffer to read stream data into
     * @return Number of bytes read.
     */
    public native double read(Buffer buffer) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.read(buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Reads data from stream into a buffer
     * 
     * @param buffer
     *            buffer to read stream data into
     * @param offset
     *            offset to start reading buffer data from
     * @param length
     *            length of data to read from buffer
     * @return Number of bytes read.
     */
    public native double read(Buffer buffer, double offset, double length) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.read(
				buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				offset, length);
    }-*/;

    /**
     * Writes data from buffer to stream
     * 
     * @param buffer
     *            buffer to write to stream
     * @return Number of bytes written.
     */
    public native float write(Buffer buffer) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.write(buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Reads data from stream into a buffer
     * 
     * @param buffer
     *            buffer to write to stream
     * @param offset
     *            offset to start writing buffer data from
     * @param length
     *            length of data to write from buffer
     * @return Number of bytes written.
     */
    public native double write(Buffer buffer, float offset, float length) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.write(
				buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				offset, length);
    }-*/;

    /**
     * Whether stream is writeable.
     * 
     * @return true if stream is writeable, false otherwise
     */
    public native boolean isWriteable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isWriteable();
    }-*/;

    /**
     * Whether stream is readable.
     * 
     * @return true if stream is readable, false otherwise
     */
    public native boolean isReadable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isReadable();
    }-*/;

    /**
     * Closes stream and throws exception on error
     */
    public native void close() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.close();
    }-*/;

    /**
     * Reads a number from this stream.
     * 
     * @param codec
     * @return Number
     * @throws IOException
     * @since 1.1.0
     */
    private Number readNumber(String type) throws IOException {
        Buffer buffer = Titanium.createBuffer();

        // set the encoding
        EncodeNumberSpec encodeSpec = new EncodeNumberSpec();
        encodeSpec.setByteOrder(Codec.CODEC_BIG_ENDIAN);
        encodeSpec.setDest(buffer);
        encodeSpec.setType(type);
        encodeSpec.setSource(0);
        int length = Codec.get().encodeNumber(encodeSpec);

        double bytesRead = this.read(buffer, 0, length);

        if (bytesRead < length) {
            throw new IOException("Read " + bytesRead + " bytes instead of " + length);
        }

        // decode the number we are getting from the stream
        DecodeNumberSpec decodeNumberSpec = new DecodeNumberSpec();
        decodeNumberSpec.setSource(buffer);
        decodeNumberSpec.setType(type);
        decodeNumberSpec.setByteOrder(Codec.CODEC_BIG_ENDIAN);

        return Codec.get().decodeNumber(decodeNumberSpec);
    }

    /**
     * Reads an int from the input stream.
     * 
     * @return int
     * @since 1.1.0
     */
    public int readInt() throws IOException {
        Number number = readNumber(Codec.CODEC_TYPE_INT);
        return number.intValue();
    }

    /**
     * Reads a single char from the input stream
     * 
     * @return char
     * @throws IOException
     * @since 1.1.0
     */
    public char readChar() throws IOException {
        short ch = readShort();
        return (char) ch;
    }

    /**
     * Reads a long from the input stream.
     * 
     * @return long
     * @since 1.1.0
     */
    public long readLong() throws IOException {
        Number number = readNumber(Codec.CODEC_TYPE_LONG);
        return number.longValue();
    }

    /**
     * Reads a byte from the input stream.
     * 
     * @return byte
     * @since 1.1.0
     */
    public byte readByte() throws IOException {
        Number number = readNumber(Codec.CODEC_TYPE_BYTE);
        return number.byteValue();
    }

    /**
     * Reads a short from the input stream.
     * 
     * @return short
     * @since 1.1.0
     */
    public short readShort() throws IOException {
        Number number = readNumber(Codec.CODEC_TYPE_SHORT);
        return number.shortValue();
    }

    /**
     * Reads a float from the input stream.
     * 
     * @return float
     * @since 1.1.0
     */
    public float readFloat() throws IOException {
        Number number = readNumber(Codec.CODEC_TYPE_FLOAT);
        return number.floatValue();
    }

    /**
     * Reads a double from the input stream.
     * 
     * @return double
     * @since 1.1.0
     */
    public double readDouble() throws IOException {
        Number number = readNumber(Codec.CODEC_TYPE_DOUBLE);
        return number.doubleValue();
    }

    /**
     * Reads a boolean from the input stream.
     * 
     * @return boolean
     * @throws IOException
     * @since 1.1.0
     */
    public boolean readBoolean() throws IOException {
        int bool = readByte();
        // 1 is true, 0 is false
        return bool == 1;
    }

    /**
     * Reads a UTF8 string from this stream.
     * 
     * @return String
     * @throws IOException
     * @since 1.1.0
     */
    public String readUtf8String() throws IOException {
        int length = readInt();
        Buffer buffer = Titanium.createBuffer(length);
        double bytesRead = this.read(buffer, 0, length);

        if (bytesRead < length) {
            throw new IOException("Read " + bytesRead + " instead of " + length);
        }

        DecodeStringSpec decodeSpec = new DecodeStringSpec();
        decodeSpec.setCharset(Codec.CODEC_CHARSET_UTF8);
        decodeSpec.setLength(length);
        decodeSpec.setPosition(0);
        decodeSpec.setSource(buffer);

        return Codec.get().decodeString(decodeSpec);
    }

    /**
     * Writes a number to this stream.
     * 
     * @param codec
     * @param number
     *            the number to write
     * @throws IOException
     * @since 1.1.0
     */
    private void writeNumber(String type, Number number) throws IOException {
        Buffer buffer = Titanium.createBuffer();
        API.get().info(" 1. .1");
        // set the encoding
        EncodeNumberSpec encodeSpec = new EncodeNumberSpec();
        encodeSpec.setByteOrder(Codec.CODEC_BIG_ENDIAN);
        encodeSpec.setDest(buffer);
        encodeSpec.setType(type);
        encodeSpec.setSource(number.doubleValue());
        int length = Codec.get().encodeNumber(encodeSpec);

        double bytesWritten = this.write(buffer, 0, length);
        API.get().info(" 1. .8");

        if (bytesWritten < length) {
            throw new IOException("Wrote " + bytesWritten + " bytes instead of " + length);
        }
    }

    /**
     * Writes a byte to this stream.
     * 
     * @param value
     *            byte to be written
     * @throws IOException
     * @since 1.1.0
     */
    public void writeByte(int value) throws IOException {
        writeNumber(Codec.CODEC_TYPE_BYTE, value);
    }

    /**
     * Writes an int to this stream.
     * 
     * @param value
     *            int to be written
     * @throws IOException
     * @since 1.1.0
     */
    public void writeInt(int value) throws IOException {
        writeNumber(Codec.CODEC_TYPE_INT, value);
    }

    /**
     * Writes a char to this stream.
     * 
     * @param ch
     * @throws IOException
     * @since 1.1.0
     */
    public void writeChar(char ch) throws IOException {
        writeShort((short) ch);
    }

    /**
     * Writes a short to this stream.
     * 
     * @param value
     *            short to be written
     * @throws IOException
     * @since 1.1.0
     */
    public void writeShort(short value) throws IOException {
        writeNumber(Codec.CODEC_TYPE_SHORT, value);
    }

    /**
     * Writes a long to this stream.
     * 
     * @param value
     *            long to be written
     * @throws IOException
     * @since 1.1.0
     */
    public void writeLong(long value) throws IOException {
        writeNumber(Codec.CODEC_TYPE_LONG, value);
    }

    /**
     * Writes a float to this stream.
     * 
     * @param value
     *            float to be written
     * @throws IOException
     * @since 1.1.0
     */
    public void writeFloat(float value) throws IOException {
        writeNumber(Codec.CODEC_TYPE_FLOAT, value);
    }

    /**
     * Writes a double to this stream.
     * 
     * @param value
     *            double to be written
     * @throws IOException
     * @since 1.1.0
     */
    public void writeDouble(double value) throws IOException {
        writeNumber(Codec.CODEC_TYPE_DOUBLE, value);
    }

    /**
     * Writes a boolean to this stream.
     * 
     * @param value
     *            boolean to be written
     * @throws IOException
     * @since 1.1.0
     */
    public void writeBoolean(boolean value) throws IOException {
        int bool = (value ? 1 : 0);
        writeByte(bool);
    }

    /**
     * Writes a string to this this stream.
     * 
     * @param value
     *            the string to be written
     * @throws IOException
     * @since 1.1.0
     */
    public void writeUtf8String(String value) throws IOException {
        if (value == null || value.length() == 0) {
            writeInt(0);
            return;
        }

        Buffer buffer = Titanium.createBuffer(value);
        int length = (int) buffer.getLength();
        writeInt(length);
        double bytesWritten = this.write(buffer, 0, length);

        if (bytesWritten < length) {
            throw new IOException("Wrote " + bytesWritten + " bytes instead of " + length);
        }
    }

    /**
     * Flushes the stream.
     */
    public void flush() {
        // there is no flush in IOStream, but we are including it for
        // consistency with traditional Java IO Apis. Perhaps in the
        // future we can force a flush on IOStream.
    }

}
