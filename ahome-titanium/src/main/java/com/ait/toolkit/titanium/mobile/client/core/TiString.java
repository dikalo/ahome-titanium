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
package com.ait.toolkit.titanium.mobile.client.core;

import com.google.gwt.core.client.JsDate;

public class TiString {

    private TiString() {

    }

    /**
     * Encodes a string, replacing certain characters with a hexadecimal escape
     * sequence. See https://developer.mozilla.org/En/Window.escape
     * 
     * @param unescaped
     *            The string to escape
     * @return The escaped string
     */
    public static native String escape(String unescaped) /*-{
		return escape(unescaped);
    }-*/;

    /**
     * Decodes a value that has been encoded in hexadecimal using escape(). See
     * https://developer.mozilla.org/en/DOM/window.unescape
     * 
     * @param escaped
     *            The string to unescape
     * @return The unescaped string
     */
    public static native String unescape(String escaped) /*-{
		return unescape(escaped);
    }-*/;

    /**
     * Formats a date into the date format of the locale configured for the
     * system.
     * 
     * @param date
     * @return
     */
    public static native String formatDate(JsDate date) /*-{
		return String.formatDate(date);
    }-*/;

    /**
     * Formats a date into the date format of the locale configured for the
     * system.
     * 
     * @param date
     * @return
     */
    public static native String formatDate(JsDate date, String format) /*-{
		return String.formatDate(date, format);
    }-*/;

    /**
     * Formats a date into the time format of the locale configured for the
     * system.
     * <p>
     * On Android, this method returns the short format.
     * 
     * @param date
     * @return
     */
    public static native String formatTime(JsDate date) /*-{
		return String.formatTime(date);
    }-*/;

    public static native String formatCurrency(float currency) /*-{
		return String.formatCurrency(currency);
    }-*/;

    public static native String formatCurrency(double currency) /*-{
		return String.formatCurrency(currency);
    }-*/;

    /**
     * Formats a number into the decimal format, including decimal symbol, of
     * the locale configured for the system.
     * 
     * @param decimal
     * @return
     */
    public static native String formatDecimal(float decimal) /*-{
		return String.formatDecimal(decimal);
    }-*/;

    /**
     * Formats a number into the decimal format, including decimal symbol, of
     * the locale configured for the system.
     * 
     * @param decimal
     * @return
     */
    public static native String formatDecimal(double decimal) /*-{
		return String.formatDecimal(decimal);
    }-*/;

    public static native String format(String string, Object... args) /*-{
		args.unshift(string);
		return String.format.apply(String, args);
    }-*/;
}
