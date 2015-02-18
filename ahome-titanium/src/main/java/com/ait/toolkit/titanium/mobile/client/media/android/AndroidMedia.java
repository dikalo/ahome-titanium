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
package com.ait.toolkit.titanium.mobile.client.media.android;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.events.TiEventListener;
import com.ait.toolkit.titanium.mobile.client.media.Media;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * AndroidMedia-specific media-related functionality.
 */
public class AndroidMedia extends TiModule {

    private static AndroidMedia instance = null;

    public static AndroidMedia get() {
        if (instance == null) {
            instance = Media.get().createAndroid();
        }
        return instance;

    }

    private AndroidMedia(JavaScriptObject obj) {
        jsObj = obj;
    }

    private AndroidMedia() {
    }

    /**
     * Use the android
     * mediascannerconnection(http://developer.android.com/reference
     * /android/media/mediascannerconnection.html) to request immediate scan of
     * particular files so that they become available to the appropriate media
     * providers (gallery, etc.).
     * 
     * @param paths Array of paths to the files you want to be scanned.
     * @param mimeTypes Array of mime types for the files in the paths
     *            parameter. Can be null, in which case the mime type will be
     *            inferred at scan time.
     * 
     * @param callback a calllback that gets executes one the scanning is done
     */
    public void scanMediaFiles(JsArrayString paths, JsArrayString mimeTypes, TiEventListener<?> callback) {
        scanMediaFiles(paths, mimeTypes, callback.getJsoPeer());
    }

    private native void scanMediaFiles(JsArrayString paths, JsArrayString mimeTypes, JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scanMediaFiles(paths, mimeTypes, callback);
    }-*/;

    /**
     * Set the system homescreen wallpaper
     * 
     * @param image Image blob such as what can be retrieved via callbacks for
     *            {@link com.ait.toolkit.titanium.mobile.client.media.Media.openPhotoGallery}
     *            and
     *            {@link com.ait.toolkit.titanium.mobile.client.media.Media.showCamera}
     *            , as well as from the return value of
     *            {@link com.ait.toolkit.titanium.mobile.client.filesystem.File.read}
     *            .
     * @param scale Set to true if you want the image to be scaled with respect
     *            to the system wallpaper desired width, or false to leave it
     *            as-is.
     */
    public native void setSystemWallpaper(Object image, boolean scale) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setSystemWallpaper(image, scale);
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeAndroidMediaModule();
    }
}
