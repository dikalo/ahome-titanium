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

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Audiorecorder object is returned by
 * {@link com.ait.toolkit.titanium.mobile.client.media.Media.createAudiorecorder} and
 * is used for recording audio from the device microphone.
 */
public class AudioRecorder extends EventDispatcher {

    public AudioRecorder() {
        jsObj = createNative();
    }

    public AudioRecorder(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Audio compression constant to be used for the recording
     */
    public native int getCompression() /*-{
		var jso = jso.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.compression;
    }-*/;

    public native void setCompression(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.compression = value;
    }-*/;

    /**
     * @return Audio format constant for used for the recording
     */
    public native int getFormat() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.format;
    }-*/;

    public native void setFormat(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.format = value;
    }-*/;

    /**
     * @return Readonly property to indicate if paused
     */
    public native boolean isPaused() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.paused;
    }-*/;

    /**
     * @return Readonly property to indicate if recording
     */
    public native boolean isRecording() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.recording;
    }-*/;

    /**
     * @return Readonly property to indicate if stopped
     */
    public native boolean isStopped() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stopped;
    }-*/;

    /**
     * Called to temporarily pause recording
     */
    public native void pause() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.pause();
    }-*/;

    /**
     * Called to resume audio recording
     */
    public native void resume() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.resume();
    }-*/;

    /**
     * Called to start recording audio
     */
    public native void start() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.start();
    }-*/;

    /**
     * Called to stop recording audio
     */
    public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stop();
    }-*/;

    private static native JavaScriptObject createNative()/*-{
		return Titanium.Media.createAudioRecorder();
    }-*/;
}
