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
package com.ait.toolkit.titanium.mobile.client.locale;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * The top level locale module. the locale module works with localization files
 * to which are generated during compilation into the operating system specific
 * localization formats. the locale module provides locale-specific strings
 * which can be referenced at runtime. additionally, the module contains a few
 * methods and properties for querying device locale information.
 */
public class Locale extends TiModule {

    private static Locale instance = null;

    public Locale get() {
        if (instance == null) {
            return new Locale();
        }
        return instance;
    }

    private Locale() {
        createPeer();
    }

    /**
     * @return Return the current (default) iso 2-letter country code for the
     *         device.
     */
    public native String getCurrentCountry() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.currentCountry;
    }-*/;

    public native void setCurrentCountry(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.currentCountry = value;
    }-*/;

    /**
     * @return Return the current language for the device based on the user's
     *         settings (readonly)
     */
    public native String getCurrentLanguage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.currentLanguage;
    }-*/;

    public native void setCurrentLanguage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.currentLanguage = value;
    }-*/;

    /**
     * @return Return the current locale string for the device based on the
     *         user's settings (e.g., en-us). (readonly) (android only)
     * @platforms android
     */
    public native String getCurrentLocale() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.currentLocale;
    }-*/;

    public native void setCurrentLocale(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.currentLocale = value;
    }-*/;

    /**
     * Format a telephone number according to the current locale.
     * 
     * @param number
     *            the phone number to format
     */
    public static native String formatTelephoneNumber(String number) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.formatTelephoneNumber(number);
    }-*/;

    /**
     * Return a currency code for a given locale. (android only)
     * 
     * @param locale
     *            the locale for which you want to the currency code, e.g.
     *            getCurrencyCode('en-US') -> 'USD'
     */
    public native String getCurrencyCode(String locale) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getCurrencyCode(locale);
    }-*/;

    /**
     * Return a currency symbol for the given currency code. (android only)
     * 
     * @platforms android
     * @param currencyCode
     *            the currency for which you want the symbol, e.g.
     *            getCurrencySymbol('USD') -> '$'
     */
    public native String getCurrencySymbol(String currencyCode) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getCurrencySymbol(currencyCode);
    }-*/;

    /**
     * Return a currency symbol for the given locale. (android only)
     * 
     * @platforms android
     * @param locale
     *            the locale whose currency symbol you want, e.g.
     *            getLocaleCurrencySymbol('en-US') -> '$'
     */
    public native String getLocaleCurrencySymbol(String locale) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getLocaleCurrencySymbol(locale);
    }-*/;

    /**
     * Return a localization string
     * 
     * @param key
     *            the key to use when mapping into the localization file
     */
    public native String getString(String key) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getString(key);
    }-*/;

    /**
     * Return a localization string
     * 
     * @param key
     *            the key to use when mapping into the localization file
     * @param hint
     *            the text to use if no key found in the localization file
     */
    public native String getString(String key, String hint) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getString(key, hint);
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeLocaleModule();
    }
}
