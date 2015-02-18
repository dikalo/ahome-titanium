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

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The BonjourService instance returned either from
 * {@link com.ait.toolkit.titanium.mobile.client.network.NetWork.createBonjourService}
 * or via the service list from a bonjourbrowser 'updatedservices' event. jso
 * object describes a service on the network which is published by bonjour.
 * <p>
 * You can only publish Bonjour services attached to a socket which is currently
 * listening; you cannot publish a service for a remotely connected socket. If
 * you stop the Bonjour service and wish to close the socket it uses, it is
 * strongly recommended that you stop the service first. When a window which
 * publishes a Bonjour service is closed, you must stop the service if the
 * associated socket is also to be closed, or if it is no longer necessary to
 * publish. Unlike other network operations, Bonjour service resolution and
 * publishing is synchronous, so be aware that your code may block while
 * resolution is going on. In particular, you may wish to display UI elements
 * indicating background activity before beginning resolution.
 * 
 * Available on iOs only
 */

public class BonjourService extends EventDispatcher {

    private BonjourService() {
    }

    public BonjourService(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The domain of the service
     */
    public native String getDomain() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.domain;
    }-*/;

    public native void setDomain(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.domain = value;
    }-*/;

    /**
     * @return Whether or not the service is local to the device
     */
    public native boolean isLocal() /*-{
		return jso.isLocal;
    }-*/;

    public native void setIsLocal(boolean value) /*-{
		jso.isLocal = value;
    }-*/;

    /**
     * @return The name of the service
     */
    public native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    public native void setName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.name = value;
    }-*/;

    /**
     * @return The type of the service
     */
    public native String getType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.type;
    }-*/;

    public native void setType(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.type = value;
    }-*/;

    /**
     * Publish a bonjour service to the network. only works if islocal is true
     * 
     * @param socket
     *            a TCPSocket object to associate with the Bonjour service.
     */
    public native void publish(Object socket) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.publish(socket);
    }-*/;

    /**
     * Resolve a bonjour service from the network. must be done before
     * attempting to access the service's socket information, if a remote
     * service. you cannot resolve a locally published service.
     * 
     * @param timeout
     *            the timeout for service resolution, in seconds. Optional,
     *            default is 120s.
     */
    public native void resolve(double timeout) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.resolve(timeout);
    }-*/;

    /**
     * Halts publication of a service.
     */
    public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stop();
    }-*/;

}
