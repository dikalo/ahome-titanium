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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Socket module, used for creating sockets.
 */
public class Socket extends TiModule {

    public static final double INITIALIZED = INITIALIZED();
    public static final double CONNECTED = CONNECTED();
    public static final double LISTENING = LISTENING();
    public static final double CLOSED = CLOSED();
    public static final double ERROR = ERROR();

    private static Socket instance = null;

    public static Socket get() {
        if (instance == null) {
            instance = new Socket();
        }
        return instance;
    }

    private Socket() {
        createPeer();
    }

    private Socket(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Returns new tcp socket object, takes object containing properties list
     * defined in 'titanium.network.socket.tcp'. some properties are only needed
     * based on whether the socket will be a connecting socket or a listening
     * socket.
     * 
     * @return New TCP socket.
     */
    public native TCP createTCP() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createTCP();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.socket.TCP::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns new tcp socket object, takes object containing properties list
     * defined in 'titanium.network.socket.tcp'. some properties are only needed
     * based on whether the socket will be a connecting socket or a listening
     * socket.
     * 
     * @param params
     *            creation parameters
     * @return New TCP socket.
     */
    public native TCP createTCP(JavaScriptObject params) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createTCP(params);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.network.socket.TCP::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a new TCP socket, connecting to the given host and port.
     * 
     * @param host
     * @param port
     * @return TCP
     * @since 1.1.0
     */
    public TCP createTCP(String host, int port) {
        JavaScriptObject jso = JavaScriptObject.createObject();
        JsoHelper.setAttribute(jso, "host", host);
        JsoHelper.setAttribute(jso, "port", port);
        return createTCP(jso);
    }

    private static native final double INITIALIZED() /*-{
		return Titanium.Network.Socket.INITIALIZED;
    }-*/;

    private static native final double CONNECTED() /*-{
		return Titanium.Network.Socket.CONNECTED;
    }-*/;

    private static native final double LISTENING() /*-{
		return Titanium.Network.Socket.LISTENING;
    }-*/;

    private static native final double CLOSED() /*-{
		return Titanium.Network.Socket.CLOSED;
    }-*/;

    private static native final double ERROR() /*-{
		return Titanium.Network.Socket.ERROR;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeSocketModule();
    }

}
