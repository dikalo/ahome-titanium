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
package com.ait.toolkit.titanium.mobile.client.core.json;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Global JSON object providing the parse and stringify methods.
 */
public class JSON {

    private JSON() {

    }

    /**
     * Parses a JSON text to produce an object or array.
     * 
     * @param text
     *            , JSON text to parse
     * @return, a JSON Object
     */
    public static native <T extends JavaScriptObject> T parse(String text)/*-{
		return JSON.parse(text);
    }-*/;

    /**
     * Parses a JSON text to produce an object or array.
     * 
     * @param text
     *            , JSON text to parse
     * @param reviver
     *            , Function to filter and transform the results
     * @return, a JSON Object
     */
    public static native <T extends JavaScriptObject> T parse(String text, Reviver reviver)/*-{
		return JSON
				.parse(
						text,
						function(key, value) {
							return reviver.@com.ait.toolkit.titanium.mobile.client.core.json.Reviver::evaluate(Ljava/lang/String;Ljava/lang/String;)(key, value);
						});
    }-*/;

    /**
     * Produces a JSON text from a JavaScript value.
     */
    public static native String stringify(Object value)/*-{
		return JSON.stringify(text);
    }-*/;

    /**
     * Produces a JSON text from a JavaScript value.
     */
    public static native void stringify(Object value, Reviver reviver)/*-{
		return JSON
				.stringify(
						value,
						function(key, value) {
							return reviver.@com.ait.toolkit.titanium.mobile.client.core.json.Reviver::evaluate(Ljava/lang/String;Ljava/lang/String;)(key, value);
						});
    }-*/;

    /**
     * Produces a JSON text from a JavaScript value.
     */
    public static native void stringify(Object value, Reviver reviver, int space)/*-{
		return JSON
				.stringify(
						value,
						function(key, value) {
							return reviver.@com.ait.toolkit.titanium.mobile.client.core.json.Reviver::evaluate(Ljava/lang/String;Ljava/lang/String;)(key, value);
						}, space);
    }-*/;

    /**
     * Produces a JSON text from a JavaScript value.
     */
    public static native void stringify(Object value, Reviver reviver, String space)/*-{
		return JSON
				.stringify(
						value,
						function(key, value) {
							return reviver.@com.ait.toolkit.titanium.mobile.client.core.json.Reviver::evaluate(Ljava/lang/String;Ljava/lang/String;)(key, value);
						}, space);
    }-*/;

}
