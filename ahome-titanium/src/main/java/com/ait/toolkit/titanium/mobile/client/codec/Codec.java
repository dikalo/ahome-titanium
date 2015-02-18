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
package com.ait.toolkit.titanium.mobile.client.codec;

import com.ait.toolkit.titanium.mobile.client.api.API;
import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * A module for converting Numbers and Strings to and from a
 * {@link com.ait.toolkit.titanium.mobile.client.buffer.Buffer}.
 */
public class Codec extends TiModule {

    private static Codec instance;

    public static Codec get() {
        if (instance == null) {
            instance = new Codec();
        }
        return instance;
    }

    private Codec() {
        createPeer();
    }

    public static final String CODEC_CHARSET_UTF8 = CHARSET_UTF8();
    public static final String CODEC_CHARSET_ASCII = CHARSET_ASCII();
    public static final String CODEC_CHARSET_ISO_LATIN_1 = CHARSET_ISO_LATIN_1();
    public static final String CODEC_CHARSET_UTF16 = CHARSET_UTF16();
    public static final String CODEC_CHARSET_UTF16BE = CHARSET_UTF16BE();
    public static final String CODEC_CHARSET_UTF16LE = CHARSET_UTF16LE();
    public static final String CODEC_TYPE_BYTE = TYPE_BYTE();
    public static final String CODEC_TYPE_SHORT = TYPE_SHORT();
    public static final String CODEC_TYPE_INT = TYPE_INT();
    public static final String CODEC_TYPE_FLOAT = TYPE_FLOAT();
    public static final String CODEC_TYPE_LONG = TYPE_LONG();
    public static final String CODEC_TYPE_DOUBLE = TYPE_DOUBLE();
    public static final int CODEC_BIG_ENDIAN = BIG_ENDIAN();
    public static final int CODEC_LITTLE_ENDIAN = LITTLE_ENDIAN();

    /**
     * Get the os native byte order (either
     * {@link com.ait.toolkit.titanium.mobile.client.codec.CODEC.BIG_ENDIAN} or
     * {@link com.ait.toolkit.titanium.mobile.client.codec.CODEC.LITTLE_ENDIAN} )
     * 
     * @return The OS native byte order
     */
    public native int getNativeByteOrder() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getNativeByteOrder();
    }-*/;

    /**
     * Encodes the number .
     * 
     * @param options
     *            encodeNumber named options
     * @return The position after the encoded number in 'dest'.
     */
    public native int encodeNumber(EncodeNumberSpec options) /*-{
		var o = Titanium.Codec
				.encodeNumber(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return o;
    }-*/;

    /**
     * Decodes the buffer.
     * 
     * @param options
     *            decodeNumber named options
     * @return The Number decoded from `source`.
     */
    public native double decodeNumber(DecodeNumberSpec options) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.decodeNumber(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Encodes the string.
     * 
     * @param options
     *            encodeString named options
     * @return The position after the encoded String inside 'dest'.
     */
    public native int encodeString(EncodeStringSpec options) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.encodeString(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Decodes the buffer.
     * 
     * @param options
     *            decodeString named options
     * @return The decoded string
     */
    public native String decodeString(DecodeStringSpec options) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.decodeString(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public static native final String CHARSET_ASCII() /*-{
		Titanium.API.info("Type CHARSET_ASCII ? : ");
		Titanium.API.info("Type CHARSET_ASCII ? : " + Ti.Codec.CHARSET_ASCII);
		return Titanium.Codec.CHARSET_ASCII ? Titanium.Codec.CHARSET_ASCII
				: null;
    }-*/;

    public static native final String CHARSET_ISO_LATIN_1() /*-{
		Titanium.API.info("Type CHARSET_ISO_LATIN_1 ? : ");
		Titanium.API.info("Type CHARSET_ISO_LATIN_1 ? : "
				+ Ti.Codec.CHARSET_ISO_LATIN_1);
		return Titanium.Codec.CHARSET_ISO_LATIN_1 ? Titanium.Codec.CHARSET_ISO_LATIN_1
				: null;
    }-*/;

    public static native final String CHARSET_UTF8() /*-{
		Titanium.API.info("Type CHARSET_UTF8 ? : ");
		Titanium.API.info("Type CHARSET_UTF8 ? : " + Ti.Codec.CHARSET_UTF8);
		return Titanium.Codec.CHARSET_UTF8 ? Titanium.Codec.CHARSET_UTF8 : null;
    }-*/;

    public static native final String CHARSET_UTF16() /*-{
		Titanium.API.info("Type CHARSET_UTF16 ? : ");
		Titanium.API.info("Type CHARSET_UTF16 ? : " + Ti.Codec.CHARSET_UTF16);
		return Titanium.Codec.CHARSET_UTF16 ? Titanium.Codec.CHARSET_UTF16
				: null;
    }-*/;

    public static native final String CHARSET_UTF16BE() /*-{
		Titanium.API.info("Type CHARSET_UTF16BE ? : ");
		Titanium.API.info("Type CHARSET_UTF16BE ? : " + Ti.Codec.CHARSET_UTF16);
		return Titanium.Codec.CHARSET_UTF16BE ? Titanium.Codec.CHARSET_UTF16BE
				: null;
    }-*/;

    public static native final String CHARSET_UTF16LE() /*-{
		return Titanium.Codec.CHARSET_UTF16LE ? Titanium.Codec.CHARSET_UTF16LE
				: null;
    }-*/;

    public static native final String TYPE_BYTE() /*-{
		Titanium.API.info("Type Byte ? : ");
		Titanium.API.info("Type Byte ? : " + Ti.Codec.TYPE_BYTE);
		return Titanium.Codec.TYPE_BYTE ? Titanium.Codec.TYPE_BYTE : null;
    }-*/;

    public static native final String TYPE_SHORT() /*-{
		Titanium.API.info("Type TYPE_SHORT ? : ");
		Titanium.API.info("Type TYPE_SHORT ? : " + Ti.Codec.TYPE_SHORT);
		return Titanium.Codec.TYPE_SHORT ? Titanium.Codec.TYPE_SHORT : null;
    }-*/;

    public static native final String TYPE_INT() /*-{
		Titanium.API.info("Type TYPE_INT ? : ");
		Titanium.API.info("Type TYPE_INT ? : " + Ti.Codec.TYPE_INT);
		return Titanium.Codec.TYPE_INT ? Titanium.Codec.TYPE_INT : null;
    }-*/;

    public static native final String TYPE_FLOAT() /*-{
		Titanium.API.info("Type TYPE_FLOAT ? : ");
		Titanium.API.info("Type TYPE_FLOAT ? : " + Ti.Codec.TYPE_FLOAT);
		return Titanium.Codec.TYPE_FLOAT ? Titanium.Codec.TYPE_FLOAT : null;
    }-*/;

    public static native final String TYPE_LONG() /*-{
		Titanium.API.info("Type TYPE_LONG ? : ");
		Titanium.API.info("Type TYPE_LONG ? : " + Ti.Codec.TYPE_FLOAT);
		return Titanium.Codec.TYPE_LONG ? Titanium.Codec.TYPE_LONG : null;
    }-*/;

    public static native final String TYPE_DOUBLE() /*-{
		Titanium.API.info("Type TYPE_DOUBLE ? : ");
		Titanium.API.info("Type TYPE_DOUBLE ? : " + Ti.Codec.TYPE_DOUBLE);
		return Titanium.Codec.TYPE_DOUBLE ? Titanium.Codec.TYPE_DOUBLE : null;
    }-*/;

    public static native final int BIG_ENDIAN() /*-{
		Titanium.API.info("Type BIG_ENDIAN ? : ");
		Titanium.API.info("Type BIG_ENDIAN ? : " + Ti.Codec.BIG_ENDIAN);
		return Titanium.Codec.BIG_ENDIAN ? Titanium.Codec.BIG_ENDIAN : 0;
    }-*/;

    public static native final int LITTLE_ENDIAN() /*-{
		Titanium.API.info("Type LITTLE_ENDIAN ? : ");
		Titanium.API.info("Type LITTLE_ENDIAN ? : " + Ti.Codec.LITTLE_ENDIAN);
		return Titanium.Codec.LITTLE_ENDIAN ? Titanium.Codec.LITTLE_ENDIAN : 0;
    }-*/;

    @Override
    public void createPeer() {
        API.get().info("Before creatiiiing");
        jsObj = TiFactory.createCodec();
        API.get().info("Creaaaaated ? ");
    }

}
