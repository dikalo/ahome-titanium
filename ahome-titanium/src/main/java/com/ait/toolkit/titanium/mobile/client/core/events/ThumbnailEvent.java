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

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.ui.Point;

public class ThumbnailEvent extends TiEvent {

    public static final String THUMBNAIL = "thumbnail";

    protected ThumbnailEvent() {

    }

    /**
     * boolean to indicate success or failure
     */
    public final native boolean isSuccess() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.success;
    }-*/;

    /**
     * blob of the thumbnail image
     */
    public final native Blob getImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		var obj = jso.image;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * time
     */
    public final native double getTime() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.time;
    }-*/;

    /**
     * if success is 'false', error message as string for reason
     */
    public final native String getError() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.error;
    }-*/;

    /**
     * the y point of the event, in receiving view coordinates
     */
    public final native double getY() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.y;
    }-*/;

    /**
     * the x point of the event in receiving view coordiantes
     */
    public final native double getX() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.x;
    }-*/;

    /**
     * a dictionary with properties x and y describing the point of the event in
     * screen coordinates
     */
    public final native Point getGlobalPoint() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		var obj = jso.globalPoint;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
