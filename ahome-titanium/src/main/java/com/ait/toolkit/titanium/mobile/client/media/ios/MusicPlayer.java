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
package com.ait.toolkit.titanium.mobile.client.media.ios;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.PlayingChangeHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.StateChangeHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.VolumeChangeHandler;
import com.ait.toolkit.titanium.mobile.client.media.Item;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * * The music player instance returned from
 * {@link com.ait.toolkit.titanium.mobile.client.media.Media.createMusicPlayer} this
 * object represents a music controller.
 * 
 * Available only on iOs.
 */
public class MusicPlayer extends EventDispatcher {

    public MusicPlayer() {
        jsObj = createNative();
    }

    public MusicPlayer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The current point in song playback
     */
    public native double getCurrentPlaybackTime() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.currentPlaybackTime;
    }-*/;

    public native void setCurrentPlaybackTime(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.currentPlaybackTime = value;
    }-*/;

    /**
     * @return An item object which indicates the currently playing media
     */
    public native Item getNowPlaying() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.nowPlaying;
    }-*/;

    public native void setNowPlaying(Item value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.nowPlaying = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The playback state;
     */
    public native int getPlaybackState() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.playbackState;
    }-*/;

    public native void setPlaybackState(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.playbackState = value;
    }-*/;

    /**
     * @return The repeat setting;
     */
    public native int getRepeatMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.repeatMode;
    }-*/;

    public native void setRepeatMode(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.repeatMode = value;
    }-*/;

    /**
     * @return The shuffle setting;
     */
    public native int getShuffleMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.shuffleMode;
    }-*/;

    public native void setShuffleMode(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.shuffleMode = value;
    }-*/;

    /**
     * @return A value between 0.0 and 1.0 indicating the volume level for the
     *         music player
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
     * Pause playback
     */
    public native void pause() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pause();
    }-*/;

    /**
     * Begin playback
     */
    public native void play() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.play();
    }-*/;

    /**
     * Seek backward in the currently playing media
     */
    public native void seekBackward() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.seekBackward();
    }-*/;

    /**
     * Seek forward in the currently playing media
     */
    public native void seekForward() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.seekForward();
    }-*/;

    /**
     * Set the media queue
     * 
     * @param queue a queue
     */
    public native void setQueue(Object queue) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setQueue(queue);
    }-*/;

    /**
     * Skip to the beginning of the currently playing media
     */
    public native void skipToBeginning() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.skipToBeginning();
    }-*/;

    /**
     * Skip to the next media in the queue
     */
    public native void skipToNext() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.skipToNext();
    }-*/;

    /**
     * Skip to the previous media in the queue
     */
    public native void skipToPrevious() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.skipToPrevious();
    }-*/;

    /**
     * Stop playback
     */
    public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stop();
    }-*/;

    /**
     * End a seek operation
     */
    public native void stopSeeking() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stopSeeking();
    }-*/;

    public native void addPlayingChangeHandler(PlayingChangeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.PlayEvent::PLAYING_CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.PlayEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.PlayingChangeHandler::onPlayingChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/PlayEvent;)(eventObject);
						});
    }-*/;

    public native void addStateChangeHandler(StateChangeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.PlayEvent::STATE_CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.PlayEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.StateChangeHandler::onStateChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/PlayEvent;)(eventObject);
						});
    }-*/;

    public native void addVolumeChangeHandler(VolumeChangeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.VolumentEvent::VOLUME_CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.VolumentEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.VolumeChangeHandler::onVolumeChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/VolumentEvent;)(eventObject);
						});
    }-*/;

    private static native JavaScriptObject createNative() /*-{
		return Titanium.Media.createMusicPlayer();
    }-*/;

}
