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
package com.ait.toolkit.titanium.mobile.client.network;

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.events.Event;
import com.ait.toolkit.titanium.mobile.client.core.events.EventListener;
import com.ait.toolkit.titanium.mobile.client.xml.Document;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The HTTPClient instance returned from
 * {@link com.ait.toolkit.titanium.mobile.client.network.Network.createHttpClient} This
 * object (mostly) implements the XMLHTTPRequest specification
 */
public class HTTPClient extends EventDispatcher {

    /**
     * The DONE state is the state of the object when either the data transfer
     * has been completed or something went wrong during the transfer (infinite
     * redirects for instance).
     */
    public static final int DONE = 4;

    /**
     * The HEADERS_RECEIVED state is the state of the object when all response
     * headers have been received.
     */
    public static final int HEADERS_RECEIVED = 2;

    /**
     * The LOADING state is the state of the object when the response entity
     * body is being received.
     */
    public static final int LOADING = 3;

    /**
     * The OPENED state is the state of the object when the open() method has
     * been successfully invoked. During this state request headers can be set
     * using setRequestHeader() and the request can be made using send().
     */
    public static final int OPENED = 1;

    /**
     * When constructed, the XMLHttpRequest object must be in the UNSENT state.
     */
    public static int UNSENT = 0;

    private static String GET_METHOD = "GET";
    private static String POST_METHOD = "POST";
    private static String PUT_METHOD = "PUT";
    private static String DELETE_METHOD = "DELETE";

    public HTTPClient() {
        jsObj = createNative();
    }

    private HTTPClient(JavaScriptObject obj) {
        jsObj = obj;
    }

    public enum Method {

        GET {
            @Override
            public String getMethod() {
                return GET_METHOD;
            }
        },
        POST {
            @Override
            public String getMethod() {
                return POST_METHOD;
            }
        },
        PUT {
            @Override
            public String getMethod() {
                return PUT_METHOD;
            }
        },
        DELETE {
            @Override
            public String getMethod() {
                return DELETE_METHOD;
            }
        };

        public abstract String getMethod();

    }

    /**
     * @return Boolean to indicate that the response was successful
     */
    public native boolean isConnected() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.connected;
    }-*/;

    public native void setConnected(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.connected = value;
    }-*/;

    /**
     * @return The connection type, normally either `get` or `post`.
     */
    public native String getConnectionType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.connectionType;
    }-*/;

    public native void setConnectionType(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.connectionType = value;
    }-*/;

    /**
     * @return File to download contents to. can only be set after calling open.
     *         ios only
     */
    public native String getFile() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.file;
    }-*/;

    public native void setFile(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.file = value;
    }-*/;

    /**
     * @return The absolute url of the request
     */
    public native String getLocation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.location;
    }-*/;

    public native void setLocation(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.location = value;
    }-*/;

    public void setOnDataStream(EventListener<?> callback) {
        this.setOndataStream(callback.getJsoPeer());
    }

    private native void setOndataStream(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ondatastream = callback;
    }-*/;

    /**
     * Set this to a function before calling open to cause the function to be
     * called upon a error response
     */

    public void setOnError(EventListener<Event> callBack) {
        setOnError(callBack.getJsoPeer());
    }

    private native void setOnError(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.onerror = callback;
    }-*/;

    /**
     * Set this to a function before calling open to cause the function to be
     * called upon a successful response
     */

    public void setOnLoad(EventListener<?> callback) {
        setOnLoad(callback.getJsoPeer());
    }

    private native void setOnLoad(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.onload = callback;
    }-*/;

    /**
     * @return Set this to a function before calling open to cause the function
     *         to be called for each readystate change
     */

    public void setOnReadyStateChange(EventListener<?> callback) {
        setOnReadyStateChange(callback.getJsoPeer());
    }

    private native void setOnReadyStateChange(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.onreadystatechange = callback;
    }-*/;

    /**
     * @return Set this to a function before calling open to cause the function
     *         to be called at regular intervals as the request data is being
     *         transmitted. the `progress` property of the event will contain a
     *         value from 0.0-1.0 with the progress.
     */
    public void setOnSendStream(EventListener<?> callback) {
        setOnSendStream(callback.getJsoPeer());
    }

    private native void setOnSendStream(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.onsendstream = callback;
    }-*/;

    /**
     * @return The readystate value
     */
    public native int getReadyState() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.readyState;
    }-*/;

    public native void setReadyState(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.readyState = value;
    }-*/;

    /**
     * @return Readonly the response data as a blob object.
     */
    public native Blob getResponseData() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.responseData;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * @return Readonly the response as text or null if an error was received or
     *         no data was returned
     */
    public native String getResponseText() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.responseText;
    }-*/;

    /**
     * @return Readonly the response object as an xml domdocument object.
     *         returns null if the content type returned by the server was not
     *         xml or the content could not be parsed
     */
    public native Document getResponseXML() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.responseXML;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.xml.Document::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * @return Readonly the response http status code
     */
    public native int getStatus() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.status;
    }-*/;

    /**
     * @return Timeout is milliseconds when the connection should be aborted
     */
    public native int getTimeout() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.timeout;
    }-*/;

    public native void setTimeout(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.timeout = value;
    }-*/;

    /**
     * @return Set this to control how ssl certification validation is performed
     *         on connection. defaults to false if in simulator or device
     *         testing and true if release for distribution mode.
     */
    public native boolean validatesSecureCertificate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.validatesSecureCertificate;
    }-*/;

    public native void setValidatesSecureCertificate(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.validatesSecureCertificate = value;
    }-*/;

    /**
     * Abort a pending request
     */
    public native void abort() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.abort();
    }-*/;

    /**
     * Return the response header.
     * 
     * @param name
     *            the header name
     */
    public native String getResponseHeader(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getResponseHeader(name);
    }-*/;

    /**
     * Open the request and ready the connection
     * 
     * @param method
     *            the HTTP method
     * @param url
     *            the URL for the request
     */
    public void open(Method method, String url) {
        open(method.getMethod(), url);
    }

    /**
     * Open the request and ready the connection
     * 
     * @param method
     *            the HTTP method
     * @param url
     *            the URL for the request
     * @param async
     *            optional property to indicate if asynchronous (default) or not
     */
    public void open(Method method, String url, boolean async) {
        open(method.getMethod(), url, async);
    }

    /**
     * Send the request (only async is currently supported)
     */
    public native void send() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.send();
    }-*/;

    /**
     * Send the request (only async is currently supported)
     * 
     * @param data
     *            the data to send in the request. can either be null,
     *            dictionary, string, File object or Blob.
     */
    public native void send(Object data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.send(data);
    }-*/;

    public void send(RequestParameter parameter) {
        this.send(parameter.getModel().getJsObj());
    }

    /**
     * Set the request header. must be called after `open` but before `send`.
     * 
     * @param name
     *            name of the header
     * @param value
     *            value of the header. May be null to clearing out a property,
     *            such as X-Requested-With
     */
    public native void setRequestHeader(String name, String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.setRequestHeader(name, value);
    }-*/;

    /**
     * Open the request and ready the connection
     * 
     * @param method
     *            the HTTP method
     * @param url
     *            the URL for the request
     */
    private native void open(String method, String url) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.open(method, url);
    }-*/;

    /**
     * Open the request and ready the connection
     * 
     * @param method
     *            the HTTP method
     * @param url
     *            the URL for the request
     * @param async
     *            optional property to indicate if asynchronous (default) or not
     */
    private native void open(String method, String url, boolean async) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.open(method, url, async);
    }-*/;

    private static native JavaScriptObject createNative()/*-{
		return Titanium.Network.createHTTPClient();
    }-*/;

}
