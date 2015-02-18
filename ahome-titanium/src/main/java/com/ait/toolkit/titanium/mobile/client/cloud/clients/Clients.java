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
package com.ait.toolkit.titanium.mobile.client.cloud.clients;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * Provides location data about the mobile device or computer running your app
 * is running on, based on the IP address of the device. This feature uses
 * MaxMind GeoIP to return the most accurate IP-based geolocation data possible.
 * Note that the results are not not based on GPS signals nor WiFi triangulation
 * commonly used on mobile devices. See MaxMind GeoIP city accuracy for more
 * information. An example use of this data is to verify the country that the
 * app user in, so that access can be given to application data.
 * 
 * An error will be returned of the location cannot be determined from the IP
 * address. A successful lookup will return at minimum a ISO 3166 country code.
 */
public class Clients extends TiModule {

    public static final Clients INSTANCE = new Clients();

    public static Clients get() {
        return INSTANCE;
    }

    private Clients() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeClients();
    }

    /**
     * Locate a mobile device based on the IP address of the device.
     */
    public native void geolocate(Client client, CloudClientsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.geolocate(
						client.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.clients.CloudClientsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.clients.CloudClientsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/clients/CloudClientsResponse;)(response);
						});
    }-*/;

    /**
     * Locate a mobile device based on the IP address of the device.
     */
    public native void geolocate(String ipAddress, CloudClientsResponseHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.geolocate(
						{
							ip_address : ipAddress
						},
						function(e) {
							var response = @com.ait.toolkit.titanium.mobile.client.cloud.clients.CloudClientsResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.cloud.clients.CloudClientsResponseHandler::onResponse(Lcom/ait/toolkit/titanium/mobile/client/cloud/clients/CloudClientsResponse;)(response);
						});
    }-*/;

}
