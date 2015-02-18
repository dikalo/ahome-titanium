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
package com.ait.toolkit.titanium.mobile.client.core.events.media;

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.events.TiEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class MediaEvent extends TiEvent {

    protected MediaEvent() {

    }

    protected MediaEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the event media type
     */
    public native int getMediaType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.mediaType;
    }-*/;

    /**
     * the event media
     */
    public native Blob getMedia() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.media;
		return @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
