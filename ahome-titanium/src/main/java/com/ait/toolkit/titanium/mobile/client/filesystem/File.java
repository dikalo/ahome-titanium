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
package com.ait.toolkit.titanium.mobile.client.filesystem;

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The file object which support various filesystem based operations.
 */
public class File extends EventDispatcher {

    protected File() {
    }

    protected File(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Appends data to the file identified by this file object.
     * 
     */
    public native boolean append(String contents) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.append(contents);
    }-*/;

    /**
     * Appends data to the file identified by this file object.
     */
    public native boolean append(Blob contents) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.append(contents.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Appends data to the file identified by this file object.
     * 
     */
    public native boolean append(File contents) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.append(contents.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Copies the file identified by this file object to a new path.
     * 
     */
    public native void copy(String destinationPath) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.copy(destinationPath);
    }-*/;

    /**
     * @return Readonly returns the fully resolved native path
     */
    public native String getNativePath() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.nativePath;
    }-*/;

    /**
     * Create a directory at the path for the file object
     */
    public native boolean createDirectory() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createDirectory();
    }-*/;

    /**
     * Create a file path at the path for the file object
     */
    public native boolean createFile() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createFile();
    }-*/;

    /**
     * Return the created timestamp for the file
     */
    public native int createTimestamp() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.createTimestamp();
    }-*/;

    /**
     * Delete the file directory path
     * 
     * @param recursive
     *            pass true to recursively delete any contents. defaults to
     *            false
     */
    public native boolean deleteDirectory(boolean recursive) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.deleteDirectory(recursive);
    }-*/;

    /**
     * Delete the file
     */
    public native boolean deleteFile() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.deleteFile();
    }-*/;

    /**
     * Returns true if the file is executable
     * 
     * @return Returns true if file is executable.
     */
    public native boolean isExecutable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.executable;
    }-*/;

    /**
     * Returns true if the file or directory exists on the device
     */
    public native boolean exists() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.exists();
    }-*/;

    /**
     * Returns true if the file or directory exists on the device
     */
    public native FileStream open(int mode) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.open(mode);
		return @com.ait.toolkit.titanium.mobile.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Return the file extension
     */
    public native String getExtension() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.extension();
    }-*/;

    /**
     * Returns true if this file object represents an ordinary file.
     */
    public native boolean isFile() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isFile();
    }-*/;

    /**
     * Return an array of paths in the directory of the file object
     */
    public native JsArrayString getDirectoryListing() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getDirectoryListing();
    }-*/;

    /**
     * Return the file parent
     */
    public native File getParent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.parent;
		return @com.ait.toolkit.titanium.mobile.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns true if the file is hidden
     */
    public native boolean isHidden() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hidden;
    }-*/;

    /**
     * Return the last modification timestamp for the file
     */
    public native int getModificationTimestamp() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.modificationTimestamp();
    }-*/;

    /**
     * Move the file to another path
     * 
     * @param newpath
     *            new location
     */
    public native boolean move(String newpath) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.move(newpath);
    }-*/;

    /**
     * The name of the file
     */
    public native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    /**
     * Return the contents of file as blob
     */
    public native Blob read() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.read();
		return @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns true if the file is readonly
     */
    public native boolean isReadonly() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.readonly;
    }-*/;

    /**
     * Value indicating whether or not to back up to a cloud service.
     * 
     * Some apps may be rejected by Apple for backing up specific files; if this
     * is the case, ensure that this value is set to false for them. This value
     * should only need to be set once by your app, but setting it multiple
     * times will not cause problems. For files distributed with your app, this
     * will need to be set on boot. This flag will only affect iOS versions
     * 5.0.1 and later, but is safe to set on earlier versions.
     * 
     * Note that setting this property to false will also prevent the file
     * identified by this object from being backed up to iTunes.
     */
    public native boolean isRemoteBackup() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.remoteBackup;
    }-*/;

    /**
     * Value indicating whether or not to back up to a cloud service.
     * 
     * Some apps may be rejected by Apple for backing up specific files; if this
     * is the case, ensure that this value is set to false for them. This value
     * should only need to be set once by your app, but setting it multiple
     * times will not cause problems. For files distributed with your app, this
     * will need to be set on boot. This flag will only affect iOS versions
     * 5.0.1 and later, but is safe to set on earlier versions.
     * 
     * Note that setting this property to false will also prevent the file
     * identified by this object from being backed up to iTunes.
     */
    public native void setRemoteBackup(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.remoteBackup = value
    }-*/;

    /**
     * true if the file identified by this object is read-only.
     * 
     * @return
     */
    public native boolean isReadOnly() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.readOnly;
    }-*/;

    /**
     * Size, in bytes, of the file identified by this object.
     * 
     * @return
     */
    public native double getSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.size;
    }-*/;

    /**
     * Returns the fully-resolved native path associated with this file object.
     * 
     * On iOS, the path returned by this method is a plain file path, not a URL.
     * It is suitable for use in native modules that need to access the file
     * using native APIs.
     * 
     * On Android, the return value of resolve is a file:// URL, identical to
     * the nativePath property.
     * 
     * @return
     */
    public native String resolve() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.resolve();
    }-*/;

    /**
     * Rename the file
     * 
     * @param newname
     *            new name
     */
    public native boolean rename(String newName) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rename(newName);
    }-*/;

    /**
     * Make the file hidden
     */
    public native void setHidden(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setHidden = value;
    }-*/;

    /**
     * Make the file readonly
     */
    public native void setReadonly() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.setReadonly();
    }-*/;

    /**
     * Return boolean to indicate if the path has space available for storage
     */
    public native boolean getSpaceAvailable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.spaceAvailable();
    }-*/;

    /**
     * Returns true if the file points to a symbolic link
     */
    public native boolean isSymbolicLink() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.symbolicLink;
    }-*/;

    /**
     * Write the contents to file.
     * 
     */
    public native boolean write(String contents) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.write(contents);
    }-*/;

    /**
     * Write the contents to file.
     */
    public native boolean write(Blob contents) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.write(contents.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Write the contents to file.
     * 
     */
    public native boolean write(File contents) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.write(contents.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Write the contents to file.
     * 
     * @param contents
     *            write the contents of string, blob or
     *            {@link com.ait.toolkit.titanium.mobile.client.filesystem.File} to file
     * @param append
     *            (optional) append the string to the end of the file.
     */
    public native boolean write(Blob contents, boolean append) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.write(
						contents.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						append);
    }-*/;

    /**
     * Write the contents to file.
     * 
     * @param contents
     *            write the contents of string, blob or
     *            {@link com.ait.toolkit.titanium.mobile.client.filesystem.File} to file
     * @param append
     *            (optional) append the string to the end of the file.
     */
    public native boolean write(String contents, boolean append) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.write(contents, append);
    }-*/;

    /**
     * Write the contents to file.
     * 
     * @param contents
     *            write the contents of string, blob or
     *            {@link com.ait.toolkit.titanium.mobile.client.filesystem.File} to file
     * @param append
     *            (optional) append the string to the end of the file.
     */
    public native boolean write(File contents, boolean append) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.write(
						contents.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						append);
    }-*/;

    /**
     * Returns true if the file is writeable
     */
    public native boolean isWritable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.writable;
    }-*/;
}
