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
package com.ait.toolkit.titanium.mobile.client.network.socket;

import com.ait.toolkit.titanium.mobile.client.stream.IOStream;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * TCP socket that implements the 'titanium.iostream' interface. created by
 * com.ait.toolkit.titanium.mobile.client.network.socket.Socket
 */
public class TCP extends IOStream {

    protected TCP() {
    }

    private TCP(JavaScriptObject obj) {
        jsObj = obj;
    }

    public TCP(String host, int port) {
        jsObj = Socket.get().createTCP(host, port).getJsObj();
    }

    /**
     * @return The host to connect to or listen on. cannot be modified when not
     *         in the initialized state. supports both ipv4 and ipv6
     */
    public native String getHost() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.host;
    }-*/;

    public native void setHost(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.host = value;
    }-*/;

    /**
     * @return The port to connect to or listen on. cannot be modified when not
     *         in the initialized state
     */
    public native int getPort() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.port;
    }-*/;

    public native void setPort(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.port = value;
    }-*/;

    /**
     * @return Max number of pending incoming connections to be allowed when
     *         listen() is called. any incoming connections received while the
     *         max number of pending connections has been reached will be
     *         rejected.
     */
    public native double getListenQueueSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.listenQueueSize;
    }-*/;

    public native void setListenQueueSize(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.listenQueueSize = value;
    }-*/;

    /**
     * @return The timeout for connect() and all i/o write() operations. cannot
     *         be modified when not in the initialized state
     */
    public native double getTimeout() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.timeout;
    }-*/;

    public native void setTimeout(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.timeout = value;
    }-*/;

    /**
     * @return Set the callback to be fired after the socket enters the
     *         "connected" state. only invoked following a successful connect()
     *         call
     */

    public native void setConnected(ConnectedCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.connected = function(e) {
			var obj = @com.ait.toolkit.titanium.mobile.client.network.socket.ConnectedCallbackArgs::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			callback.@com.ait.toolkit.titanium.mobile.client.network.socket.ConnectedCallback::onConnect(Lcom/ait/toolkit/titanium/mobile/client/network/socket/ConnectedCallbackArgs;)(obj);
		};
    }-*/;

    /**
     * @return The callback to be fired after the socket enters the error state
     */

    public native void setError(ErrorCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.error = function(e) {
			var obj = @com.ait.toolkit.titanium.mobile.client.network.socket.ErrorCallbackArgs::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e)
			callback.@com.ait.toolkit.titanium.mobile.client.network.socket.ErrorCallback::onError(Lcom/ait/toolkit/titanium/mobile/client/network/socket/ErrorCallbackArgs;)(obj);
		};
    }-*/;

    /**
     * @return The callback to be fired when a listener accepts a connection
     */

    public native void setAccepted(AcceptedCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.accepted = function(e) {
			var obj = @com.ait.toolkit.titanium.mobile.client.network.socket.AcceptedCallbackArgs::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			callback.@com.ait.toolkit.titanium.mobile.client.network.socket.AcceptedCallback::onAccepted(Lcom/ait/toolkit/titanium/mobile/client/network/socket/AcceptedCallbackArgs;)(obj);
		};
    }-*/;

    /**
     * @return Current state of the socket
     */
    public native int getState() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.state;
    }-*/;

    /**
     * Attempts to connect the socket to its host/port. throws exception if the
     * socket is in a connected or listening state. throws exception if a valid
     * host and port has not been set on the proxy. nonblocking; connection
     * attempts are asynchronous
     */
    public native void connect() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.connect();
    }-*/;

    /**
     * Attempts to start listening on the socket's host/port. listen() call will
     * attempt to listen on the specified host and/or port property for the
     * socket if they are set. jso function blocks execution and throws an
     * exception on error (and sets the socket state to error) but does not fire
     * the error callback in jso event. throws exception if the socket is in a
     * listening or connected state
     */
    public native void listen() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.listen();
    }-*/;

    /**
     * Tells a listening socket to accept a connection request at the top of a
     * listener's request queue when one becomes available. takes an argument, a
     * box object which assigns callbacks to the created socket. note that the
     * connected callback is not called (the socket does not "transition to" the
     * connected state - it's created in the connected state) on the newly
     * created socket. the accepted callback is called when a new connection is
     * accepted as a result of calling accept(). if the socket is already
     * flagged to accept the next connection, the existing accept options will
     * be update to use the newly specified options object. throws an exception
     * if the socket is not in a listening state
     * 
     * @param params
     *            parameters that contain callbacks to be set on next accepted
     *            socket
     */
    public native void accept(AcceptParams params) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.accept(params.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

}
