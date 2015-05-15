/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.WebViewHandler;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The web view allows you to open an html5 based view which can load either
 * local or remote content. the content can be any valid web content such as
 * html, pdf, svg or other webkit supported content types. the web view is
 * created by the method
 * {@link com.ait.toolkit.titanium.mobile.client.ui.UI.createWebView}.
 * <p>
 * Creating webviews are more expensive than creating pure native views because
 * of the requirement to load the HTML browser into memory.
 * 
 * Since a webview internally wants to handle its own events, scrolling and
 * other related touch events against it's own view surface, you cannot have
 * both Titanium style events against the webview instance and internal
 * Javascript events in the DOM. You must choose between one or the other.
 */
public class WebView extends View {

    public WebView() {
        createPeer();
    }

    public WebView( String id ) {
        jsObj = UI.createWebView( id, new ArrayList<String>() );
    }

    public WebView( String id, List<String> classes ) {
        jsObj = UI.createWebView( id, classes );
    }

    WebView( JavaScriptObject obj ) {
        jsObj = obj;
    }

    /**
     * @return A data blob or file that is used to load the web document
     */
    public native <T> T getData() /*-{
		var jso = jso.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.data;
    }-*/;

    public native void setData( Blob value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.data = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setData( File value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.data = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The html content of the web document
     */
    public native String getHtml() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.html;
    }-*/;

    public native void setHtml( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.html = value;
    }-*/;

    /**
     * @return Boolean indicating if the webview is loading content
     */
    public native boolean isLoading() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.loading;
    }-*/;

    public native void setLoading( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.loading = value;
    }-*/;

    /**
     * @return Whether the webview should scale it's contents or not
     */
    public native boolean scalesPageToFit() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.scalesPageToFit;
    }-*/;

    public native void setScalesPageToFit( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scalesPageToFit = value;
    }-*/;

    /**
     * @return The url to the web document. jso property will change as the
     *         content of the webview changes (such as from internal hyperlinks,
     *         etc)
     */
    public native String getUrl() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.url;
    }-*/;

    public native void setUrl( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.url = value;
    }-*/;

    /**
     * Returns true if the webview can go back in history
     */
    public native boolean canGoBack() /*-{
		return jso.canGoBack();
    }-*/;

    /**
     * Returns true if the webview can go forward in history
     */
    public native boolean canGoForward() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.canGoForward();
    }-*/;

    /**
     * Invoke javascript inside the context of the webview and optionally,
     * return a result
     * 
     * @param content
     *            JavaScript code as a string. The code will be evaluated inside
     *            the webview context.
     */
    public native String evalJS( String content ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.evalJS(content);
    }-*/;

    /**
     * Go back one entry in history to the previous page
     */
    public native void goBack() /*-{
		return jso.goBack();
    }-*/;

    /**
     * Go forward one entry in history to the page before the current page
     */
    public native void goForward() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.goForward();
    }-*/;

    /**
     * Reload the current webpage
     */
    public native void reload() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.reload();
    }-*/;

    /**
     * Force the webview to repaint its contents
     */
    public native void repaint() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.repaint();
    }-*/;

    /**
     * Set the basic authentication for the webview instance to be used on
     * subsequent url requests
     * 
     * @param username
     *            the username
     * @param password
     *            the password
     */
    public native void setBasicAuthentication( String username, String password ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setBasicAuthentication(username, password);
    }-*/;

    /**
     * Stop loading a currently loading page
     */
    public native void stopLoading() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stopLoading();
    }-*/;

    public native void setColor( Object value )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.color = value;
    }-*/;

    public native void addBeforeLoadHandler( WebViewHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.webview.WebViewEvent::BEFORE_LOAD,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.webview.WebViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.WebViewHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/webview/WebViewEvent;)(eventObject);
						});
    }-*/;

    public native void addErrorHandler( WebViewHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.webview.WebViewEvent::ERROR,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.webview.WebViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.WebViewHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/webview/WebViewEvent;)(eventObject);
						});
    }-*/;

    public native void addLoadHandler( WebViewHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.webview.WebViewEvent::LOAD,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.webview.WebViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.WebViewHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/webview/WebViewEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createWebView( "", new ArrayList<String>() );
    }

    public static WebView from( JsObject proxy ) {
        return new WebView( proxy.getJsObj() );
    }

}
