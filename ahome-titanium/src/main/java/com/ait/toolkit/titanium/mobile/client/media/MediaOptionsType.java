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
package com.ait.toolkit.titanium.mobile.client.media;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.ui.Matrix2D;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JsArrayString;

/**
 * Simple object for specifying options to showCamera.
 */
public class MediaOptionsType extends JsObject {

    public MediaOptionsType() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Specifies if the media should be editable after capture/selection.
     * 
     * @iOS only
     * @param value
     */
    public void setAllowEditing(boolean value) {
        JsoHelper.setAttribute(jsObj, "allowEditing", value);
    }

    /**
     * Specifies if the dialog should be animated upon showing and hiding.
     * 
     * @iOS only
     * 
     * @param value
     */
    public void setAnimated(boolean value) {
        JsoHelper.setAttribute(jsObj, "animated", value);
    }

    public void setArrowDirection(double value) {
        JsoHelper.setAttribute(jsObj, "arrowDirection", value);
    }

    public void setAutoHide(boolean value) {
        JsoHelper.setAttribute(jsObj, "autoHide", value);
    }

    public native void setCallback(MediaSelectionCallback callback)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.error = function(e) {
			var errorObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.MediaError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onError(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/MediaError;)(errorObject);
		};
		jso.success = function(e) {
			var successObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.MediaEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onSuccess(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/MediaEvent;)(successObject);
		};
		jso.cancel = function() {
			callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onCancel()();
		};
    }-*/;

    /**
     * Show the camera in a popover.
     * 
     * Defaults to: False
     * 
     * Use inPopOver: true on iPad to display the camera view in a popover.
     * 
     * @iOS only
     * @param value
     */
    public void setInPopOver(boolean value) {
        JsoHelper.setAttribute(jsObj, "inPopOver", value);
    }

    public void setMediaTypes(String... values) {
        JsArrayString peers = JsArrayString.createArray().cast();
        for (String s : values) {
            peers.push(s);
        }
        setMediaTypes(peers);
    }

    public native void setMediaTypes(JsArrayString values)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.mediaTypes = values;
    }-*/;

    public native void setOverlay(View value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.overlay = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setPopoverView(View value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.popoverView = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setSaveToPhotoGallery(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.saveToPhotoGallery = value;
    }-*/;

    public native void setShowControls(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showControls = value;
    }-*/;

    public native void setTransform(Matrix2D value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.transform = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setVideoMaximumDuration(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.videoMaximumDuration = value;
    }-*/;

    public native void setVideoQuality(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.videoQuality = value;
    }-*/;

}
