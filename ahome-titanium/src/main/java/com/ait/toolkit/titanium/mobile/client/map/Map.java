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
package com.ait.toolkit.titanium.mobile.client.map;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;

/**
 * The top level map module. the map module is used for creating in-application
 * native maps.
 */
public class Map extends TiModule {

    public static final int HYBRID_TYPE = HYBRID_TYPE();
    public static final int SATELLITE_TYPE = SATELLITE_TYPE();
    public static final int STANDARD_TYPE = STANDARD_TYPE();

    private static Map instance = null;

    public static Map get() {
        if (instance == null) {
            instance = new Map();
        }
        return instance;
    }

    private Map() {
        createPeer();
    }

    public native Annotation createAnnotation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createAnnotation();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.map.Annotation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return Titanium.Map.createAnnotation();
    }-*/;

    public static native MapView createView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createView();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.map.MapView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    private static native final int STANDARD_TYPE() /*-{
		return Titanium.Map.STANDARD_TYPE;
    }-*/;

    private static native final int SATELLITE_TYPE() /*-{
		return Titanium.Map.SATELLITE_TYPE;
    }-*/;

    private static native final int HYBRID_TYPE() /*-{
		return Titanium.Map.HYBRID_TYPE;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeMapModule();
    }

}
