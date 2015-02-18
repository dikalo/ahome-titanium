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
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.ProgressHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.audio.AudioChangeHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The audioplayer object is returned by
 * {@link com.ait.toolkit.titanium.mobile.client.media.Media.createAudioPlayer} and
 * is used for streaming audio to the device and low-level control of the audio
 * playback.
 */
public class AudioPlayer extends EventDispatcher {

    public static final int STATE_BUFFERING = STATE_BUFFERING();
    public static final int STATE_INITIALIZED = STATE_INITIALIZED();
    public static final int STATE_PAUSED = STATE_PAUSED();
    public static final int STATE_PLAYING = STATE_PLAYING();
    public static final int STATE_STARTING = STATE_STARTING();
    public static final int STATE_STOPPED = STATE_STOPPED();
    public static final int STATE_STOPPING = STATE_STOPPING();
    public static final int STATE_WAITING_FOR_DATA = STATE_WAITING_FOR_DATA();
    public static final int STATE_WAITING_FOR_QUEUE = STATE_WAITING_FOR_QUEUE();

    public AudioPlayer() {
        jsObj = createNative();
    }

    protected AudioPlayer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Boolean to indicate if audio should continue playing even if
     *         activity is paused (android only as of 1.3.0)
     */
    public native boolean allowBackground() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allowBackground;
    }-*/;

    public native void setAllowBackground(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.allowBackground = value;
    }-*/;

    /**
     * @return Bit rate of the current playback stream
     */
    public native double getBitRate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.bitRate;
    }-*/;

    public native void setBitRate(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.bitRate = value;
    }-*/;

    /**
     * @return Returns boolean indicating if the playback is idle
     */
    public native boolean isIdle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.idle;
    }-*/;

    public native void setIdle(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.idle = value;
    }-*/;

    /**
     * @return Returns boolean indicating if the playback is paused
     */
    public native boolean isPaused() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.paused;
    }-*/;

    public native void setPaused(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.paused = value;
    }-*/;

    /**
     * @return Returns boolean indicating if the playback is streaming audio
     */
    public native boolean isPlaying() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.playing;
    }-*/;

    public native void setPlaying(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.playing = value;
    }-*/;

    /**
     * @return Returns the current playback progress. will return zero if
     *         samplerate has not yet been detected
     */
    public native double getProgress() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.progress;
    }-*/;

    public native void setProgress(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.progress = value;
    }-*/;

    /**
     * @return Returns int for the current state of playback
     */
    public native int getState() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.state;
    }-*/;

    public native void setState(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.state = value;
    }-*/;

    /**
     * @return Returns the url for the current playback
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
     * @return Returns boolean indicating if the playback is waiting for audio
     *         data from the network
     */
    public native boolean isWaiting() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.waiting;
    }-*/;

    public native void setWaiting(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.waiting = value;
    }-*/;

    /**
     * @return The size of the buffer used for streaming, in bytes
     * @platforms iphone, ipad
     */
    public native double getBufferSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.bufferSize;
    }-*/;

    public native void setBufferSize(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.bufferSize = value;
    }-*/;

    /**
     * Pause playback
     */
    public native void pause() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.pause();
    }-*/;

    /**
     * Start playback
     */
    public native void start() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.start();
    }-*/;

    /**
     * Convert a state into a textual description suitable for display
     */
    public native String stateDescription() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stateDescription();
    }-*/;

    /**
     * Stop playback
     */
    public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stop();
    }-*/;

    public native void addChangeHandler(AudioChangeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.audio.ChangeEvent::CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.audio.ChangeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.audio.AudioChangeHandler::onChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/audio/ChangeEvent;)(eventObject);
						});
    }-*/;

    public native void addProgressHandler(ProgressHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.ProgressEvent::PROGRESS,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.ProgressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.ProgressHandler::onProgess(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/ProgressEvent;)(eventObject);
						});
    }-*/;

    private static native int STATE_BUFFERING() /*-{
		return Titanium.Media.AudioPlayer.STATE_BUFFERING;
    }-*/;

    private static native int STATE_INITIALIZED() /*-{
		return Titanium.Media.AudioPlayer.STATE_INITIALIZED;
    }-*/;

    private static native int STATE_PAUSED() /*-{
		return Titanium.Media.AudioPlayer.STATE_PAUSED;
    }-*/;

    private static native int STATE_PLAYING() /*-{
		return Titanium.Media.AudioPlayer.STATE_PLAYING;
    }-*/;

    private static native int STATE_STARTING() /*-{
		return Titanium.Media.AudioPlayer.STATE_STARTING;
    }-*/;

    private static native int STATE_STOPPED() /*-{
		return Titanium.Media.AudioPlayer.STATE_STOPPED;
    }-*/;

    private static native int STATE_STOPPING() /*-{
		return Titanium.Media.AudioPlayer.STATE_STOPPING;
    }-*/;

    private static native int STATE_WAITING_FOR_DATA() /*-{
		return Titanium.Media.AudioPlayer.STATE_WAITING_FOR_DATA;
    }-*/;

    private static native int STATE_WAITING_FOR_QUEUE() /*-{
		return Titanium.Media.AudioPlayer.STATE_WAITING_FOR_QUEUE;
    }-*/;

    private static native JavaScriptObject createNative()/*-{
		return Titanium.Media.createAudioPlayer();
    }-*/;

}
