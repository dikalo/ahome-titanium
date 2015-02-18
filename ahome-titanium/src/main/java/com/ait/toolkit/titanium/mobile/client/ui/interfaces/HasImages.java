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
package com.ait.toolkit.titanium.mobile.client.ui.interfaces;

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.google.gwt.core.client.JsArrayString;

public interface HasImages {

    /**
     * @return Array of images to display in the view
     */
    public JsArrayString getImages();

    public void setImages(JsArrayString value);

    /**
     * Change an image for a index
     * 
     * @param index index to change
     * @param image the image to set the index to. May be a TiBlob, TiFile, URL,
     *            or dictionary with 'image' (may be any of TiBlob, TiFile,
     *            URL), 'width', 'height' keys. 'auto' is not allowed, only
     *            exact sizes (although a size may be omitted to keep the image
     *            at that size). If passed as a TiFile or URL, will perform a
     *            check for '@2x' on Retina displays
     */
    public void setImage(int index, Object image);

    /**
     * Change an image for a index
     * 
     * @param index index to change
     * @param image the image to set the index to. May be a TiBlob, TiFile, URL,
     *            or dictionary with 'image' (may be any of TiBlob, TiFile,
     *            URL), 'width', 'height' keys. 'auto' is not allowed, only
     *            exact sizes (although a size may be omitted to keep the image
     *            at that size). If passed as a TiFile or URL, will perform a
     *            check for '@2x' on Retina displays
     */
    public void setImage(int index, Blob image);

    /**
     * Change an image for a index
     * 
     * @param index index to change
     * @param image the image to set the index to. May be a TiBlob, TiFile, URL,
     *            or dictionary with 'image' (may be any of TiBlob, TiFile,
     *            URL), 'width', 'height' keys. 'auto' is not allowed, only
     *            exact sizes (although a size may be omitted to keep the image
     *            at that size). If passed as a TiFile or URL, will perform a
     *            check for '@2x' on Retina displays
     */
    public void setImage(int index, File image);

}