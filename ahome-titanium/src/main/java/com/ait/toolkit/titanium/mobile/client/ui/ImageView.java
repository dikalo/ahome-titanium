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
package com.ait.toolkit.titanium.mobile.client.ui;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ImageActionHandler;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.ait.toolkit.titanium.mobile.client.filesystem.FileSystem;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.resources.client.ImageResource;

/**
 * An image view is used to display an image or a series of images in an
 * animation.
 * <p>
 * If you specify a width and/or height property on the image, the image will be
 * scaled to fit into jso space if the image is larger.
 */
public class ImageView extends View {

    private ImageResource resource = null;
    private boolean clipped = false;
    private boolean pathIsDirectory = false;
    private String path = "";

    public ImageView() {
        createPeer();
    }

    ImageView(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return Readonly boolean to indicate if the animation is animating
     */
    public native boolean isAnimating() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.animating;
    }-*/;

    /**
     * @return Allow image to scale (android)
     */
    public native boolean canScale() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.canScale;
    }-*/;

    public native void setCanScale(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.canScale = value;
    }-*/;

    /**
     * @return Number of times to retry decoding the bitmap at jso url (1.7.0 /
     *         android only. default: 5)
     * 
     */
    public native int getDecodeRetries() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.decodeRetries;
    }-*/;

    public native void setDecodeRetries(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.decodeRetries = value;
    }-*/;

    /**
     * @return Url to the default image to display while loading a remote image
     */
    public native String getDefaultImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.defaultImage;
    }-*/;

    public native void setDefaultImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.defaultImage = value;
    }-*/;

    /**
     * @return Amount of time in milliseconds to animate one cycle
     */
    public native double getDuration() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.duration;
    }-*/;

    public native void setDuration(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.duration = value;
    }-*/;

    /**
     * @return Enable zoom controls on android. default is true for backward
     *         compatibility. (1.3.0) Available only on Android
     * 
     */
    public native boolean enableZoomControls() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.enableZoomControls;
    }-*/;

    public native void setEnableZoomControls(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.enableZoomControls = value;
    }-*/;

    /**
     * @return Indicates whether or not the source image is in 2x resolution for
     *         retina displays. use for remote images only. (ios)
     * @platforms iphone, ipad
     */
    public native boolean hires() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hires;
    }-*/;

    public native void setHires(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hires = value;
    }-*/;

    /**
     * @return Image to display either as string url, blob or file
     */
    public native <T> T getImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.image;
    }-*/;

    public native void setImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.image = value;
    }-*/;

    public native void setImage(Blob value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.image = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setImage(File value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.image = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Set the image of the image view, using an GWT image resource, the file's
     * url. Clip is to clip it according to the detail in the image resource.
     * 
     * @param resource
     *            The image resource
     * @param url
     *            The file's url
     * @param clip
     *            Whether to clip the image
     */
    public void setImage(ImageResource resource, String url, boolean clip) {
        File f = FileSystem.get().getFile(url);
        if (f.exists()) {
            if (!clip) {
                setImage(f);
            } else {
                setImage(f.read(), resource);
            }
        }
    }

    /**
     * Set the image of the image view according to a blob, and then clip it
     * using a GWT image resource.
     * 
     * @param blob
     *            The blob
     * @param resource
     *            The resource
     */
    public void setImage(Blob blob, ImageResource resource) {
        setImage(blob.imageAsCropped(resource.getLeft(), resource.getTop(), resource.getHeight(), resource.getWidth()));
    }

    /**
     * @return Array of images (either as string url, blob or file) to display
     *         in an animation
     */
    public native <T> T getImages() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.images;
    }-*/;

    public native void setImages(JsArrayString value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.images = value;
    }-*/;

    /**
     * 
     * @param value
     *            , must be Blob or File
     */
    public native void setImages(JsArray<?> value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.images = value;
    }-*/;

    /**
     * @return Readonly boolean to indicate if the animation is paused
     */
    public native boolean isPaused() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.paused;
    }-*/;

    /**
     * @return Boolean to indicate if the default image should be displaying
     *         while loading a remote image
     */
    public native boolean preventDefaultImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.preventDefaultImage;
    }-*/;

    public native void setPreventDefaultImage(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.preventDefaultImage = value;
    }-*/;

    /**
     * @return Number of times to repeat the image animation
     */
    public native int getRepeatCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.repeatCount;
    }-*/;

    public native void setRepeatCount(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.repeatCount = value;
    }-*/;

    /**
     * @return Boolean to indicate if the animation should happen in reverse
     *         (from last to first)
     */
    public native boolean reverse() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.reverse;
    }-*/;

    public native void setReverse(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.reverse = value;
    }-*/;

    /**
     * @return Url to the image to display (note: jso property is deprecated.
     *         use image instead)
     */
    public native String getUrl() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.url;
    }-*/;

    public native void setUrl(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.url = value;
    }-*/;

    /**
     * Pause a started animation.
     */
    public native void pause() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pause();
    }-*/;

    /**
     * Start the image animation. jso method only works if you set multiple
     * images
     */
    public native void start() /*-{
		return jso.start();
    }-*/;

    /**
     * Stop a started animation and reset the index to the first image
     */
    public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stop();
    }-*/;

    /**
     * Return the image as a blob object
     */
    public native Blob toBlob() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jso.toBlob());
		return toReturn;
    }-*/;

    public native void addChangeHandler(ImageActionHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.image.ImageEvent::CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.image.ImageEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ImageActionHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/image/ImageEvent;)(eventObject);
						});
    }-*/;

    public native void addLoadHandler(ImageActionHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.image.ImageEvent::LOAD,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.image.ImageEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ImageActionHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/image/ImageEvent;)(eventObject);
						});
    }-*/;

    public native void addStartHandler(ImageActionHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.image.ImageEvent::START,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.image.ImageEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ImageActionHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/image/ImageEvent;)(eventObject);
						});
    }-*/;

    public native void addStopHandler(ImageActionHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.StopEvent::STOP,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.image.ImageEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ImageActionHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/image/ImageEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createImageView();
    }

    public static ImageView from(JsObject proxy) {
        return new ImageView(proxy.getJsObj());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ait.toolkit.titanium.mobile.client.ui.HasBlob#toImage() Watch out as
     * Android returns the actual Blob on blob.media
     */
    @Override
    public native Blob toImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.toImage();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    private void setUpResourceImage() {
        if (path != null && resource != null) {
            path = path + (pathIsDirectory ? resource.getSafeUri().asString().substring(4) : "");
            setImage(resource, path, clipped);
        }
    }

    public void setPath(String path) {
        this.path = path;
        setUpResourceImage();
    }

    public void setResource(ImageResource resource) {
        this.resource = resource;
        setUpResourceImage();
    }

    public void setClipped(boolean clipped) {
        this.clipped = clipped;
        setUpResourceImage();
    }

    public void setPathIsDirectory(boolean pathIsDirectory) {
        this.pathIsDirectory = pathIsDirectory;
        setUpResourceImage();
    }
}
