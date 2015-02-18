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
 * The BonjourBrowser instance returned from
 * {@link com.ait.toolkit.titanium.mobile.client.network.NetWork.createBonjourBrowser}
 * This object is a browser for the discovery and retrieval of bonjour services
 * available on the network.
 * <p>
 * If your application publishes Bonjour services itself, that service will be
 * discovered by the browser if necessary; be prepared to perform a check if you
 * do not want to list local services as available. Bonjour service browsing is
 * an asynchronous operation, meaning that you should be extremely careful when
 * caching values from the 'services' property returned by the updatedServices
 * event. In particular, if you maintain a local copy of available services and
 * a user tries to connect to one, you should be prepared to handle failures
 * gracefully; the next updatedServices event should provide the new services
 * list, but you should not rely on it being delivered before user input. When a
 * window which uses Bonjour browsing is closed, if you do not want to continue
 * searching, you must call the stop() method.
 */
public class BonjourBrowser extends EventDispatcher {

    private BonjourBrowser() {

    }

    private BonjourBrowser(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The domain the browser is searching in
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
     * @return Whether or not the browser is currently searching
     */
    public native boolean getIsSearching() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isSearching;
    }-*/;

    public native void setIsSearching(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.isSearching = value;
    }-*/;

    /**
     * @return The type of the service the browser searches for
     */
    public native String getServiceType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.serviceType;
    }-*/;

    public native void setServiceType(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.serviceType = value;
    }-*/;

    /**
     * Conduct a search for bonjour services matching the type and domain
     * specified during creation
     */
    public native void search() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.search();
    }-*/;

    /**
     * Halt an ongoing search
     */
    public native void stopSearch() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stopSearch();
    }-*/;

    // public void
    // addUpdatedServicesHandler(TiEventListener<UpdatedServicesEvent> handler)
    // {
    // this.addEventListener(UpdatedServicesEvent.UPDATED_SERVICES, handler);
    // }

}
