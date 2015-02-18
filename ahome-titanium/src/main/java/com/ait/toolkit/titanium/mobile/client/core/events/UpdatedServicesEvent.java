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

package com.ait.toolkit.titanium.mobile.client.core.events;

import java.util.ArrayList;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.network.BonjourService;
import com.google.gwt.core.client.JavaScriptObject;

public class UpdatedServicesEvent extends TiEvent {

    public static final String UPDATED_SERVICES = "updatedServices";

    protected UpdatedServicesEvent() {

    }

    /**
     * An array of BonjourService objects corresponding to currently available
     * services. If you cache this value, including using it as table data, be
     * aware that it could become out of date at any time due to the
     * asynchronous nature of Bonjour service discovery.
     */
    public ArrayList<BonjourService> getServices() {
        ArrayList<BonjourService> services = new ArrayList<BonjourService>();
        JavaScriptObject array = _getServices();
        int length = JsoHelper.getJavaScriptObjectArraySize(array);
        for (int i = 0; i < length; i++) {
            services.add(new BonjourService(JsoHelper.getValueFromJavaScriptObjectArray(array, i)));
        }
        return services;

    }

    public native JavaScriptObject _getServices() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.services;
    }-*/;

}
