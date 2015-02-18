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
package com.ait.toolkit.titanium.mobile.client.geolocation;

import java.util.ArrayList;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ReverseGeocoderResult extends JsObject {

    protected ReverseGeocoderResult() {
    }

    protected ReverseGeocoderResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    public ArrayList<Place> getPlaces() {
        ArrayList<Place> places = new ArrayList<Place>();
        JsArray<JavaScriptObject> nativePlaces = _getPlaces();
        for (int i = 0; i < nativePlaces.length(); i++) {
            places.add(new Place(nativePlaces.get(i)));
        }

        return places;
    }

    private final native JsArray<JavaScriptObject> _getPlaces() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.places;
    }-*/;
}
