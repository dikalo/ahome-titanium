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

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.Size;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.video.VideoCompleteHandler;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasWidgets;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * The videoplayer object is returned by
 * {@link com.ait.toolkit.titanium.mobile.client.media.Media.createVideoPlayer} and
 * is useful for playing videos.
 * <p>
 * Starting in iPhone 3.2 SDK, the video player can be embedded in any normal
 * view. However, if you create multiple video players at one time, only the
 * last one to have its URL set will display video content or behave as if it is
 * a view for a video player. Prior to 3.2, only full screen views were available
 * on iPhone.
 */
public class VideoPlayer extends EventDispatcher {

    private VideoPlayer() {

    }

    public VideoPlayer(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Whether or not the movie can be played on a remote device. ios
     *         4.3+ only.
     */
    public native boolean allowsAirPlay() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allowsAirPlay;
    }-*/;

    public native void setAllowsAirPlay(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.allowsAirPlay = value;
    }-*/;

    /**
     * @return Indicates if a movie should automatically start playback when it
     *         is likely to finish uninterrupted based on e.g. network
     *         conditions. defaults to true.
     */
    public native boolean isAutoplay() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.autoplay;
    }-*/;

    public native void setAutoplay(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.autoplay = value;
    }-*/;

    /**
     * @return Deprecated. use url property instead.
     */
    public native String getContentURL() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.contentURL;
    }-*/;

    public native void setContentURL(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.contentURL = value;
    }-*/;

    /**
     * @return The duration of the movie, or 0.0 if not known.
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
     * @return The end time of movie playback. defaults to nan, which indicates
     *         natural end time of the movie.
     */
    public native double getEndPlaybackTime() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.endPlaybackTime;
    }-*/;

    public native void setEndPlaybackTime(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.endPlaybackTime = value;
    }-*/;

    /**
     * @return Determines if the movie is presented in the entire screen
     *         (obscuring all other application content). default is false.
     *         setting this property to true before the movie player's view is
     *         visible will have no effect.
     */
    public native boolean isFullscreen() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fullscreen;
    }-*/;

    public native void setFullscreen(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fullscreen = value;
    }-*/;

    /**
     * @return The start time of movie playback. defaults to nan, indicating the
     *         natural start time of the movie.
     */
    public native double getInitialPlaybackTime() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.initialPlaybackTime;
    }-*/;

    public native void setInitialPlaybackTime(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.initialPlaybackTime = value;
    }-*/;

    /**
     * @return Returns the network load state of the movie player.
     */
    public native int getLoadState() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.loadState;
    }-*/;

    public native void setLoadState(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.loadState = value;
    }-*/;

    /**
     * @return The media object, either a file or blob.
     */
    public native <T extends JavaScriptObject> T getMedia() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.media;
    }-*/;

    public native void setMedia(File value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.media = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setMedia(Blob value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.media = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The style of the playback controls. defaults to
     *         {@link org.urish.gwtit.titanium.media.video_control_default}
     */
    public native int getMediaControlStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.mediaControlStyle;
    }-*/;

    public native void setMediaControlStyle(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.mediaControlStyle = value;
    }-*/;

    /**
     * @return The types of media in the movie
     */
    public native int getMediaTypes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.mediaTypes;
    }-*/;

    public native void setMediaTypes(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.mediaTypes = value;
    }-*/;

    /**
     * @return Deprecated in 3.2+ of the iphone sdk - use 'mediacontrolstyle'.
     *         provides the ability to set the control mode of the movie player.
     * 
     */
    public native int getMovieControlMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.movieControlMode;
    }-*/;

    public native void setMovieControlMode(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.movieControlMode = value;
    }-*/;

    /**
     * @return Returns a dictionary with properties 'width' and 'height'.
     *         returns the natural size of the movie or 0 for both properties if
     *         not known or applicable.
     */
    public native Size getNaturalSize() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.naturalSize;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setNaturalSize(Size value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.naturalSize = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The currently playable duration of the movie, for progressively
     *         downloaded network content.
     */
    public native double getPlayableDuration() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.playableDuration;
    }-*/;

    public native void setPlayableDuration(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.playableDuration = value;
    }-*/;

    /**
     * @return Returns the current playback state of the music player
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
     * @return Boolean to indicate if the player has started playing.
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
     * @return Determines how the movie player repeats when reaching the end of
     *         playback.
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
     * @return Determines how the content scales to fit the view.
     */
    public native int getScalingMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.scalingMode;
    }-*/;

    public native void setScalingMode(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scalingMode = value;
    }-*/;

    /**
     * @return The playback type of the movie.
     */
    public native int getSourceType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.sourceType;
    }-*/;

    public native void setSourceType(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.sourceType = value;
    }-*/;

    /**
     * @return Url of the media.
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
     * @return Indicates if the movie player should inherit the application's
     *         audio session instead of creating a new session (which would
     *         interrupt the application's session). defaults to true. setting
     *         this property during playback will not take effect until playback
     *         is stopped and started again.
     */
    public native boolean useApplicationAudioSession() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.useApplicationAudioSession;
    }-*/;

    public native void setUseApplicationAudioSession(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.useApplicationAudioSession = value;
    }-*/;

    /**
     * Cancels all pending asynchronous thumbnail requests.
     */
    public native void cancelAllThumbnailImageRequests() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.cancelAllThumbnailImageRequests();
    }-*/;

    /**
     * Pause playing the video. on ios only available under 3.2 and later
     */
    public native void pause() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.pause();
    }-*/;

    /**
     * Start playing the video
     */
    public native void play() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.play();
    }-*/;

    /**
     * Release the internal video resources immediately. this is not usually
     * necessary but can help if you no longer need to use the player after it
     * is used to help converse memory.
     */
    public native void release() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.release();
    }-*/;

    /**
     * Asynchronously request thumbnails for one or more times, provided as an
     * array of numbers (double). fires a `thumbnail` event on completion.
     * optionally invokes the callback function passed in the method.
     * 
     * @param times array of doubles for each time to request
     * @param option .
     */
    public native void requestThumbnailImagesAtTimes(JsArrayNumber times, int option) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.requestThumbnailImagesAtTimes(times, option);
    }-*/;

    /**
     * A view for customization which is always displayed behind movie content.
     * 
     * @param view view to set
     */
    public native void setBackgroundView(HasWidgets view) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.setBackgroundView(view.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Stop playing the video
     */
    public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stop();
    }-*/;

    /**
     * Returns a thumbnail at the given time as a blob.
     * 
     * @param time playback time
     * @param option
     */
    public native Blob thumbnailImageAtTime(double time, int option) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.thumbnailImageAtTime(time, option);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void addCompleteHandler(VideoCompleteHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.video.VideoEvent::COMPLETE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.video.VideoEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.video.VideoCompleteHandler::onComplete(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/video/VideoEvent;)(eventObject);
						});
    }-*/;

    // public void addDurationAvailableHandler(TiEventListener<VideoEvent>
    // handler) {
    // this.addEventListener(VideoEvent.DURATION_AVAILABLE, handler);
    // }
    //
    // public void addErrorHandler(TiEventListener<VideoErrorEvent> handler) {
    // this.addEventListener(VideoErrorEvent.ERROR, handler);
    // }
    //
    // public void addFullscreenHandler(TiEventListener<FullScreenEvent>
    // handler) {
    // this.addEventListener(FullScreenEvent.FULLSCREEN, handler);
    // }
    //
    // public void addLoadHandler(TiEventListener<LoadEvent> handler) {
    // this.addEventListener(LoadEvent.LOAD, handler);
    // }
    //
    // public void addLoadstateHandler(TiEventListener<LoadEvent> handler) {
    // this.addEventListener(LoadEvent.LOAD_STATE, handler);
    // }
    //
    // public void
    // addMediaTypesAvailableHandler(TiEventListener<MediaTypeAvailableEvent>
    // handler) {
    // this.addEventListener(MediaTypeAvailableEvent.MEDIA_TYPE_AVAILABLE,
    // handler);
    // }
    //
    // public void
    // addNaturalSizeAvailableHandler(TiEventListener<NaturalSizeAvailableEvent>
    // handler) {
    // this.addEventListener(NaturalSizeAvailableEvent.NATURAL_SIZE_AVAILABLE,
    // handler);
    // }
    //
    // public void addPlaybackStateHandler(TiEventListener<PlayBackStateEvent>
    // handler) {
    // this.addEventListener(PlayBackStateEvent.PLAYBACK_STATE, handler);
    // }
    //
    // public void addPlayingHandler(TiEventListener<PlayingEvent> handler) {
    // this.addEventListener(PlayingEvent.PLAYING, handler);
    // }
    //
    // public void addPreloadHandler(TiEventListener<PreloadEvent> handler) {
    // this.addEventListener(PreloadEvent.PRELOAD, handler);
    // }
    //
    // public void addResizeHandler(TiEventListener<ResizeEvent> handler) {
    // this.addEventListener(ResizeEvent.RESIZE, handler);
    // }
    //
    // public void addSourceChangeHandler(TiEventListener<SourceChangeEvent>
    // handler) {
    // this.addEventListener(SourceChangeEvent.SOURCE_CHANGE, handler);
    // }
    //
    // public void addThumbnailHandler(TiEventListener<ThumbnailEvent> handler)
    // {
    // this.addEventListener(ThumbnailEvent.THUMBNAIL, handler);
    // }

}
