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
package com.ait.toolkit.titanium.mobile.client.blob;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.Size;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The blob is an abstract data type that represents binary information, often
 * obtained through HTTPClient or via files. It often is used to store text or
 * the actual data of an image.
 */
public class Blob extends EventDispatcher {

	public Blob() {
		jsObj = JsoHelper.createObject();
	}

	public Blob(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * Generate a thumbnail version of an image, optionally with a border and
	 * rounded corners (currently iPhone/iPad only)
	 * 
	 * @param <T>
	 * @param size
	 *            , the size of the thumbnail, in either width or height
	 * @return
	 */
	public native <T extends JavaScriptObject> T imageAsThumbnail(int size) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.imageAsThumbnail(size);
	}-*/;

	/**
	 * Generate a thumbnail version of an image, optionally with a border and
	 * rounded corners (currently iPhone/iPad only)
	 * 
	 * @param <T>
	 * @param size
	 *            , the size of the thumbnail, in either width or height
	 * @param borderSize
	 *            , the optional width of the thumbnail's border. The default is
	 *            1.
	 * @return
	 */
	public native <T extends JavaScriptObject> T imageAsThumbnail(int size,
			int borderSize) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.imageAsThumbnail(size, borderSize, cornerRadius);
	}-*/;

	/**
	 * Generate a thumbnail version of an image, optionally with a border and
	 * rounded corners (currently iPhone/iPad only)
	 * 
	 * @param <T>
	 * @param size
	 *            , the size of the thumbnail, in either width or height
	 * @param borderSize
	 *            , the optional width of the thumbnail's border. The default is
	 *            1.
	 * @param cornerRadius
	 *            , the radius of the thumbnail's corners. The default is 0.
	 * @return
	 */
	public native <T extends JavaScriptObject> T imageAsThumbnail(int size,
			int borderSize, int cornerRadius) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.imageAsThumbnail(size, borderSize, cornerRadius);
	}-*/;

	/**
	 * Converts this blob to a string
	 * 
	 * @return, String representation of the blob
	 */
	public native String toStringValue() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.toString();
	}-*/;

	/**
	 * Get the dimensions of an image file
	 * 
	 * @return A Size object, with with and height as members
	 */
	public native Size getImageFileDimensions() /*-{
		var blob = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (blob.width && blob.height) {
			var t = @com.ait.toolkit.titanium.mobile.client.core.Size::new(DD)(
					blob.width, blob.height);
			return t;
		} else {
			var toReturn = @com.ait.toolkit.titanium.mobile.client.core.Size::new();
			return toReturn;
		}
	}-*/;

	/**
	 * Get the width of an image file
	 * 
	 * @return 0 if the file is not an image file, otherwise the width in pixels
	 */
	public native int getWidth() /*-{
		var blob = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return (blob.width ? blob.width : 0);
	}-*/;

	/**
	 * Get the height of the image file
	 * 
	 * @return 0 if the file is not an image file, otherwise the height in
	 *         pixels
	 */
	public native int getHeight() /*-{
		var blob = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return (blob.height ? blob.height : 0);
	}-*/;

	/**
	 * Crop an image blob and return the cropped blob The original blob will
	 * remain unaltered (a copy on write)
	 * 
	 * @param x
	 *            How far from the left in the image the crop should start
	 * @param y
	 *            How far from the top in the image the crop should start
	 * @param height
	 *            The height of the cropped blob
	 * @param width
	 *            The width of the cropped blob
	 * @return The cropped blob image
	 */
	public native Blob imageAsCropped(int x, int y, int height, int width) /*-{
		var blob = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var dict = {};
		dict.height = height;
		dict.width = width;
		dict.x = x;
		dict.y = y;
		var ret = blob.imageAsCropped(dict);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
		return toReturn;
	}-*/;

}
