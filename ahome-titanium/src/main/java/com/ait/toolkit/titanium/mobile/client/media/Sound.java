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
import com.ait.toolkit.titanium.mobile.client.core.handlers.ErrorHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.audio.SoundCompleteHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.audio.SoundResumeHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The sound object is returned by
 * {@link com.ait.toolkit.titanium.mobile.client.media.Media.createSound} and is
 * useful for playing basic sounds. the sound object loads the entire media
 * resource in memory before playing. if you need to support streaming, use the
 * {@link com.ait.toolkit.titanium.mobile.client.media.Media.createAudioplayer} API.
 * <p>
 * You can pass the property 'preload' in the constructor as an object property
 * to cause the audio to be preloaded before 'play' is invoked. For larger audio
 * files, this is recommended if you want the audio to begin immediately when
 * invoking 'play'
 */
public class Sound extends EventDispatcher {

    public Sound() {
        jsObj = Media.get().createSound().getJsObj();
    }

    protected Sound(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Boolean to indicate if audio should continue playing even if
     *         activity is paused (android only as of 1.3.0)
     * 
     *         Availabble in AndroidMedia only
     */
    public native boolean getAllowBackground() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allowBackground;
    }-*/;

    public native void setAllowBackground(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.allowBackground = value;
    }-*/;

    /**
     * @return The duration of the audio.
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
     * @return Boolean to indicate if the audio should loop upon completion
     */
    public native boolean getLooping() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.looping;
    }-*/;

    public native void setLooping(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.looping = value;
    }-*/;

    /**
     * @return Boolean to indicate if the audio is paused
     */
    public native boolean getPaused() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.paused;
    }-*/;

    public native void setPaused(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.paused = value;
    }-*/;

    /**
     * @return Boolean to indicate if the audio is playing
     */
    public native boolean getPlaying() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.playing;
    }-*/;

    public native void setPlaying(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.playing = value;
    }-*/;

    /**
     * @return The time position of the audio.
     */
    public native double getTime() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.time;
    }-*/;

    public native void setTime(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.time = value;
    }-*/;

    /**
     * @return Url to the audio
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
     * @return The volume of the audio. this volume only affects the media, not
     *         the device audio.
     */
    public native double getVolume() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.volume;
    }-*/;

    public native void setVolume(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.volume = value;
    }-*/;

    /**
     * Returns true if the audio will loop
     */
    public native boolean isLooping() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isLooping();
    }-*/;

    /**
     * Returns true if the audio is paused
     */
    public native boolean isPaused() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isPaused();
    }-*/;

    /**
     * Returns true if the audio is playing
     */
    public native boolean isPlaying() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isPlaying();
    }-*/;

    /**
     * Temporarily pause the audio. to resume, invoke `play`.
     */
    public native void pause() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pause();
    }-*/;

    /**
     * Starting playing the source. if paused, will resume.
     */
    public native void play() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.play();
    }-*/;

    /**
     * Release all internal resources. this is typically unnecessary but can be
     * useful if you load a large audio file in `app.js` and play it only once
     * and you would like to release all releases after your play to reduce
     * memory.
     */
    public native void release() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.release();
    }-*/;

    /**
     * Reset the audio to the beginning.
     */
    public native void reset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.reset();
    }-*/;

    /**
     * Stop playing the audio and reset it to the beginning.
     */
    public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stop();
    }-*/;

    public native void addCompleteHandler(SoundCompleteHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.audio.SoundCompleteEvent::COMPLETE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.audio.SoundCompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.audio.SoundCompleteHandler::onSoundComplete(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/audio/SoundCompleteEvent;)(eventObject);
						});
    }-*/;

    public native void addErrorHandler(ErrorHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ErrorEvent::ERROR,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ErrorHandler::onError(Lcom/ait/toolkit/titanium/mobile/client/core/events/ErrorEvent;)(eventObject);
						});
    }-*/;

    public native void addResumeHandler(SoundResumeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.audio.SoundResumeEvent::RESUME,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.audio.SoundResumeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.audio.SoundResumeHandler::onSoundResume(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/audio/SoundResumeEvent;)(eventObject);
						});
    }-*/;

}
