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

import java.util.ArrayList;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.events.LineChangeEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.RecordingInputEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.TiEventListener;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.LineChangeHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.RecordingInputHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.media.VolumeHandler;
import com.ait.toolkit.titanium.mobile.client.media.android.AndroidMedia;
import com.ait.toolkit.titanium.mobile.client.media.ios.MusicPlayer;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;

/**
 * The top level media module. the media module is used accessing the device's
 * media related functionality such as playing audio or recording video.
 */
public class Media extends TiModule {

    public static final int AUDIO_FILEFORMAT_3GP2 = AUDIO_FILEFORMAT_3GP2();
    public static final int AUDIO_FILEFORMAT_3GPP = AUDIO_FILEFORMAT_3GPP();
    public static final int AUDIO_FILEFORMAT_AIFF = AUDIO_FILEFORMAT_AIFF();
    public static final int AUDIO_FILEFORMAT_AMR = AUDIO_FILEFORMAT_AMR();
    public static final int AUDIO_FILEFORMAT_CAF = AUDIO_FILEFORMAT_CAF();
    public static final int AUDIO_FILEFORMAT_MP3 = AUDIO_FILEFORMAT_MP3();
    public static final int AUDIO_FILEFORMAT_MP4 = AUDIO_FILEFORMAT_MP4();
    public static final int AUDIO_FILEFORMAT_MP4A = AUDIO_FILEFORMAT_MP4A();
    public static final int AUDIO_FILEFORMAT_WAVE = AUDIO_FILEFORMAT_WAVE();
    public static final int AUDIO_FORMAT_AAC = AUDIO_FORMAT_AAC();
    public static final int AUDIO_FORMAT_ALAW = AUDIO_FORMAT_ALAW();
    public static final int AUDIO_FORMAT_APPLE_LOSSLESS = AUDIO_FORMAT_APPLE_LOSSLESS();
    public static final int AUDIO_FORMAT_ILBC = AUDIO_FORMAT_ILBC();
    public static final int AUDIO_FORMAT_IMA4 = AUDIO_FORMAT_IMA4();
    public static final int AUDIO_FORMAT_LINEAR_PCM = AUDIO_FORMAT_LINEAR_PCM();
    public static final int AUDIO_FORMAT_ULAW = AUDIO_FORMAT_ULAW();
    public static final int AUDIO_HEADPHONES = AUDIO_HEADPHONES();
    public static final int AUDIO_HEADPHONES_AND_MIC = AUDIO_HEADPHONES_AND_MIC();
    public static final int AUDIO_HEADSET_INOUT = AUDIO_HEADSET_INOUT();
    public static final int AUDIO_LINEOUT = AUDIO_LINEOUT();
    public static final int AUDIO_MICROPHONE = AUDIO_MICROPHONE();
    public static final int AUDIO_MUTED = AUDIO_MUTED();
    public static final int AUDIO_RECEIVER_AND_MIC = AUDIO_RECEIVER_AND_MIC();
    public static final int AUDIO_SESSION_MODE_AMBIENT = AUDIO_SESSION_MODE_AMBIENT();
    public static final int AUDIO_SESSION_MODE_PLAYBACK = AUDIO_SESSION_MODE_PLAYBACK();
    public static final int AUDIO_SESSION_MODE_PLAY_AND_RECORD = AUDIO_SESSION_MODE_PLAY_AND_RECORD();
    public static final int AUDIO_SESSION_MODE_RECORD = AUDIO_SESSION_MODE_RECORD();
    public static final int AUDIO_SESSION_MODE_SOLO_AMBIENT = AUDIO_SESSION_MODE_SOLO_AMBIENT();
    public static final int AUDIO_SPEAKER = AUDIO_SPEAKER();
    public static final int AUDIO_UNAVAILABLE = AUDIO_UNAVAILABLE();
    public static final int AUDIO_UNKNOWN = AUDIO_UNKNOWN();
    public static final int DEVICE_BUSY = DEVICE_BUSY();
    public static final int MEDIA_TYPE_PHOTO = MEDIA_TYPE_PHOTO();
    public static final int MEDIA_TYPE_VIDEO = MEDIA_TYPE_VIDEO();
    public static final int MUSIC_MEDIA_TYPE_ALL = MUSIC_MEDIA_TYPE_ALL();
    public static final int MUSIC_MEDIA_TYPE_ANY_AUDIO = MUSIC_MEDIA_TYPE_ANY_AUDIO();
    public static final int MUSIC_MEDIA_TYPE_AUDIOBOOK = MUSIC_MEDIA_TYPE_AUDIOBOOK();
    public static final int MUSIC_MEDIA_TYPE_MUSIC = MUSIC_MEDIA_TYPE_MUSIC();
    public static final int MUSIC_MEDIA_TYPE_PODCAST = MUSIC_MEDIA_TYPE_PODCAST();
    public static final int MUSIC_MEDIA_GROUP_TITLE = MUSIC_MEDIA_GROUP_TITLE();
    public static final int MUSIC_MEDIA_GROUP_ALBUM = MUSIC_MEDIA_GROUP_ALBUM();
    public static final int MUSIC_MEDIA_GROUP_ARTIST = MUSIC_MEDIA_GROUP_ARTIST();
    public static final int MUSIC_MEDIA_GROUP_ALBUM_ARTIST = MUSIC_MEDIA_GROUP_ALBUM_ARTIST();
    public static final int MUSIC_MEDIA_GROUP_COMPOSER = MUSIC_MEDIA_GROUP_COMPOSER();
    public static final int MUSIC_MEDIA_GROUP_GENRE = MUSIC_MEDIA_GROUP_GENRE();
    public static final int MUSIC_MEDIA_GROUP_PLAYLIST = MUSIC_MEDIA_GROUP_PLAYLIST();
    public static final int MUSIC_MEDIA_GROUP_PODCAST_TITLE = MUSIC_MEDIA_GROUP_PODCAST_TITLE();
    public static final int MUSIC_PLAYER_REPEAT_ALL = MUSIC_PLAYER_REPEAT_ALL();
    public static final int MUSIC_PLAYER_REPEAT_DEFAULT = MUSIC_PLAYER_REPEAT_DEFAULT();
    public static final int MUSIC_PLAYER_REPEAT_NONE = MUSIC_PLAYER_REPEAT_NONE();
    public static final int MUSIC_PLAYER_REPEAT_ONE = MUSIC_PLAYER_REPEAT_ONE();
    public static final int MUSIC_PLAYER_SHUFFLE_ALBUMS = MUSIC_PLAYER_SHUFFLE_ALBUMS();
    public static final int MUSIC_PLAYER_SHUFFLE_DEFAULT = MUSIC_PLAYER_SHUFFLE_DEFAULT();
    public static final int NO_CAMERA = NO_CAMERA();
    public static final int NO_VIDEO = NO_VIDEO();
    public static final int QUALITY_HIGH = QUALITY_HIGH();
    public static final int QUALITY_LOW = QUALITY_LOW();
    public static final int QUALITY_MEDIUM = QUALITY_MEDIUM();
    public static final int UNKNOWN_ERROR = UNKNOWN_ERROR();
    public static final int VIDEO_CONTROL_DEFAULT = VIDEO_CONTROL_DEFAULT();
    public static final int VIDEO_CONTROL_EMBEDDED = VIDEO_CONTROL_EMBEDDED();
    public static final int MUSIC_PLAYER_SHUFFLE_NONE = MUSIC_PLAYER_SHUFFLE_NONE();
    public static final int MUSIC_PLAYER_SHUFFLE_SONGS = MUSIC_PLAYER_SHUFFLE_SONGS();
    public static final int MUSIC_PLAYER_STATE_INTERRUPTED = MUSIC_PLAYER_STATE_INTERRUPTED();
    public static final int MUSIC_PLAYER_STATE_PAUSED = MUSIC_PLAYER_STATE_PAUSED();
    public static final int MUSIC_PLAYER_STATE_PLAYING = MUSIC_PLAYER_STATE_PLAYING();
    public static final int MUSIC_PLAYER_STATE_SEEK_BACKWARD = MUSIC_PLAYER_STATE_SEEK_BACKWARD();
    public static final int MUSIC_PLAYER_STATE_SKEEK_FORWARD = MUSIC_PLAYER_STATE_SKEEK_FORWARD();
    public static final int MUSIC_PLAYER_STATE_STOPPED = MUSIC_PLAYER_STATE_STOPPED();
    public static final int VIDEO_CONTROL_FULLSCREEN = VIDEO_CONTROL_FULLSCREEN();
    public static final int VIDEO_CONTROL_HIDDEN = VIDEO_CONTROL_HIDDEN();
    public static final int VIDEO_CONTROL_NONE = VIDEO_CONTROL_NONE();
    public static final int VIDEO_FINISH_REASON_PLAYBACK_ENDED = VIDEO_FINISH_REASON_PLAYBACK_ENDED();
    public static final int VIDEO_FINISH_REASON_PLAYBACK_ERROR = VIDEO_FINISH_REASON_PLAYBACK_ERROR();
    public static final int VIDEO_FINISH_REASON_USER_EXITED = VIDEO_FINISH_REASON_USER_EXITED();
    public static final int VIDEO_LOAD_STATE_PLAYABLE = VIDEO_LOAD_STATE_PLAYABLE();
    public static final int VIDEO_LOAD_STATE_PLAYTHROUGH_OK = VIDEO_LOAD_STATE_PLAYTHROUGH_OK();
    public static final int VIDEO_LOAD_STATE_STALLED = VIDEO_LOAD_STATE_STALLED();
    public static final int VIDEO_LOAD_STATE_UNKNOWN = VIDEO_LOAD_STATE_UNKNOWN();
    public static final int VIDEO_MEDIA_TYPE_AUDIO = VIDEO_MEDIA_TYPE_AUDIO();
    public static final int VIDEO_MEDIA_TYPE_NONE = VIDEO_MEDIA_TYPE_NONE();
    public static final int VIDEO_MEDIA_TYPE_VIDEO = VIDEO_MEDIA_TYPE_VIDEO();
    public static final int VIDEO_PLAYBACK_STATE_INTERRUPTED = VIDEO_PLAYBACK_STATE_INTERRUPTED();
    public static final int VIDEO_PLAYBACK_STATE_PAUSED = VIDEO_PLAYBACK_STATE_PAUSED();
    public static final int VIDEO_PLAYBACK_STATE_PLAYING = VIDEO_PLAYBACK_STATE_PLAYING();
    public static final int VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD = VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD();
    public static final int VIDEO_PLAYBACK_STATE_SEEKING_FORWARD = VIDEO_PLAYBACK_STATE_SEEKING_FORWARD();
    public static final int VIDEO_PLAYBACK_STATE_STOPPED = VIDEO_PLAYBACK_STATE_STOPPED();
    public static final int VIDEO_REPEAT_MODE_NONE = VIDEO_REPEAT_MODE_NONE();
    public static final int VIDEO_REPEAT_MODE_ONE = VIDEO_REPEAT_MODE_ONE();
    public static final int VIDEO_SCALING_ASPECT_FILL = VIDEO_SCALING_ASPECT_FILL();
    public static final int VIDEO_SCALING_ASPECT_FIT = VIDEO_SCALING_ASPECT_FIT();
    public static final int VIDEO_SCALING_MODE_FILL = VIDEO_SCALING_MODE_FILL();
    public static final int VIDEO_SCALING_NONE = VIDEO_SCALING_NONE();
    public static final int VIDEO_SOURCE_TYPE_FILE = VIDEO_SOURCE_TYPE_FILE();
    public static final int VIDEO_SOURCE_TYPE_STREAMING = VIDEO_SOURCE_TYPE_STREAMING();
    public static final int VIDEO_SOURCE_TYPE_UNKNOWN = VIDEO_SOURCE_TYPE_UNKNOWN();
    public static final int VIDEO_TIME_OPTION_EXACT = VIDEO_TIME_OPTION_EXACT();
    public static final int VIDEO_TIME_OPTION_NEAREST_KEYFRAME = VIDEO_TIME_OPTION_NEAREST_KEYFRAME();

    private static Media instance = null;

    public static Media get() {
        if (instance == null) {
            instance = new Media();
        }
        return instance;
    }

    private Media() {
        createPeer();
    }

    /**
     * @return An instance of
     *         {@link com.ait.toolkit.titanium.mobile.client.media.ios.MusicPlayer}
     *         representing the app-specific music player. iphone/ipad only
     */
    public native MusicPlayer getAppMusicPlayer() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.appMusicPlayer;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.ios.MusicPlayer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setAppMusicPlayer(Object value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.appMusicPlayer = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return Returns the line type constant for the current line type
     */
    public native int getAudioLineType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.audioLineType;
    }-*/;

    public native void setAudioLineType(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.audioLineType = value;
    }-*/;

    /**
     * @return Returns true if the device is playing audio
     */
    public native boolean isAudioPlaying() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.audioPlaying;
    }-*/;

    public native void setAudioPlaying(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.audioPlaying = value;
    }-*/;

    /**
     * @return A constant for the audio session mode to be used. must be set
     *         while the audio session is inactive (no sounds are playing, no
     *         listeners for audio properties on the media module, but the ipod
     *         may be active).
     */
    public native int getAudioSessionMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.audioSessionMode;
    }-*/;

    public native void setAudioSessionMode(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.audioSessionMode = value;
    }-*/;

    /**
     * @return Return an array of media type constants supported for the camera
     */
    public native <T> T getAvailableCameraMediaTypes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.availableCameraMediaTypes;
    }-*/;

    public native void setAvailableCameraMediaTypes(Object value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.availableCameraMediaTypes = value;
    }-*/;

    /**
     * @return Return an array of media type constants supported for saving to
     *         the photo gallery
     */
    public native <T> T getAvailablePhotoGalleryMediaTypes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.availablePhotoGalleryMediaTypes;
    }-*/;

    public native void setAvailablePhotoGalleryMediaTypes(Object value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.availablePhotoGalleryMediaTypes = value;
    }-*/;

    /**
     * @return Return an array of media type constants supported for the photo
     */
    public native <T> T getAvailablePhotoMediaTypes() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.availablePhotoMediaTypes;
    }-*/;

    public native void setAvailablePhotoMediaTypes(Object value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.availablePhotoMediaTypes = value;
    }-*/;

    /**
     * @return Return the current average microphone level in db or -1 if
     *         microphone monitoring is disabled
     */
    public native int getAverageMicrophonePower() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.averageMicrophonePower;
    }-*/;

    public native void setAverageMicrophonePower(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.averageMicrophonePower = value;
    }-*/;

    /**
     * @return Returns true if the device has recording input device available
     */
    public native boolean canRecord() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.canRecord;
    }-*/;

    public native void setCanRecord(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.canRecord = value;
    }-*/;

    /**
     * @return Returns true if the device has camera support
     */
    public native boolean isCameraSupported() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isCameraSupported;
    }-*/;

    public native void setIsCameraSupported(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.isCameraSupported = value;
    }-*/;

    /**
     * @return Return the current microphone level peak power in db or -1 if
     *         microphone monitoring is disabled
     */
    public native int getPeakMicrophonePower() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return Titanium.Media.peakMicrophonePower;
    }-*/;

    public native void setPeakMicrophonePower(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.peakMicrophonePower = value;
    }-*/;

    /**
     * @return An instance of
     *         {@link com.emitrom.gwt4ti.client.media.ios.MusicPlayer}
     *         representing the system-wide music player. iphone/ipad only
     */
    public native MusicPlayer getSystemMusicPlayer() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.systemMusicPlayer;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.ios.MusicPlayer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setSystemMusicPlayer(MusicPlayer value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.systemMusicPlayer = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The current volume of the playback device
     */
    public native int getVolume() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.volume;
    }-*/;

    public native void setVolume(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.volume = value;
    }-*/;

    public native AudioPlayer createAudioPlayer() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createAudioPlayer();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.AudioPlayer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native AudioRecorder createAudioRecorder() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createAudioRecorder();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.AudioRecorder::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Item createItem() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createItem();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.Item::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native MusicPlayer createMusicPlayer() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createItem();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.ios.MusicPlayer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Sound createSound() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createSound();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.Sound::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native VideoPlayer createVideoPlayer() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createVideoPlayer();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.VideoPlayer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native AndroidMedia createAndroid() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createVideoPlayer();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.media.android.AndroidMedia::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Play a device beep notification
     */
    public native void beep() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.beep();
    }-*/;

    /**
     * Hide the device camera ui. this must be called after calling `showcamera`
     * and only when `autohide` is set to false. this method will cause the
     * media capture device be hidden.
     */
    public native void hideCamera() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hideCamera();
    }-*/;

    /**
     * Hide the music library. this must be called after calling
     * `showmusiclibrary` and only when `autohide` is set to false. iphone and
     * ipad only.
     */
    public native void hideMusicLibrary() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hideMusicLibrary();
    }-*/;

    /**
     * Return boolean to indicate if the media type is supported
     * 
     * @param media
     *            media type as a string of either `camera`, `photo` or
     *            `photogallery`.
     * @param type
     *            the type of media to check
     */
    public native boolean isMediaTypeSupported(String media, String type) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isMediaTypeSupported(media, type);
    }-*/;

    /**
     * Open the photo gallery picker
     * 
     * @param options
     *            pass a dictionary with the following supported keys: `success`
     *            a function that will be called when the camera is completed,
     *            `error` a function that will be called upon receiving an
     *            error, `cancel` a function that will be called if the user
     *            presses the cancel button, `autohide` boolean if the camera
     *            should auto hide after the media capture is completed
     *            (defaults to true), `animated` boolean if the dialog should be
     *            animated (defaults to true) upon showing and hiding,
     *            `saveToPhotoGallery` boolean if the media should be saved to
     *            the photo gallery upon successful capture, `allowEditing`
     *            boolean if the media should be editable after capture in the
     *            UI interface, `mediaTypes` an array of media type constants
     *            supported by the capture device UI, `showControls` boolean to
     *            indicate if the built-in UI controls should be displayed,
     *            `overlay` view which is added as an overlay to the UI (on
     *            top), `transform` an transformation matrix that applies to the
     *            UI transform. For iPad, `popoverView` can be provided to
     *            position the photo gallery popover a specific view and
     *            `arrowDirection` can be provided to control the type of arrow
     *            and position of the gallery.
     * 
     *            TODO: implement options object
     */
    public native void openPhotoGallery(MediaOptionsType options) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.openPhotoGallery(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void openPhotoGallery(MediaSelectionCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.openPhotoGallery({
					error : function(e) {
						var errorObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.MediaError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
						callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onError(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/MediaError;)(errorObject);
					},
					success : function(e) {
						var successObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.MediaEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
						callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onSuccess(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/MediaEvent;)(successObject);
					},
					cancel : function() {
						callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onCancel()();
					}
				});
    }-*/;

    /**
     * Save media to photo gallery / camera roll
     * 
     * @param media
     *            save the media passed to the cameras photo roll/media gallery.
     *            must be one of Blob object or File object or an error will be
     *            generated.
     * @param callbacks
     *            pass a dictionary with the following supported keys: `success`
     *            a function that will be called when the save succeeds, and
     *            `error` a function that will be called upon anreceiving an
     *            error
     */
    public native void saveToPhotoGallery(Object media, Object callbacks) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.saveToPhotoGallery(media, callbacks);
    }-*/;

    /**
     * Show the camera
     * 
     * @param options
     *            pass a dictionary with the following supported keys: `success`
     *            a function that will be called when the camera is completed,
     *            `error` a function that will be called upon receiving an
     *            error, `cancel` a function that will be called if the user
     *            presses the cancel button, `autohide` boolean if the camera
     *            should auto hide after the media capture is completed
     *            (defaults to true), `animated` boolean if the dialog should be
     *            animated (defaults to true) upon showing and hiding,
     *            `saveToPhotoGallery` boolean if the media should be saved to
     *            the photo gallery upon successful capture, `allowEditing`
     *            boolean if the media should be editable after capture in the
     *            UI interface, `mediaTypes` an array of media type constants
     *            supported by the capture device UI, `videoMaximumDuration` int
     *            duration on how long in milliseconds to allow capture before
     *            completing, `videoQuality` constant to indicate the video
     *            quality during capture, `showControls` boolean to indicate if
     *            the built-in UI controls should be displayed, `overlay` view
     *            which is added as an overlay to the camera UI (on top),
     *            `transform` an transformation matrix that applies to the
     *            camera UI transform.
     */
    public native void showCamera(MediaOptionsType options) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.showCamera(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Show the camera
     * 
     * @param options
     *            pass a dictionary with the following supported keys: `success`
     *            a function that will be called when the camera is completed,
     *            `error` a function that will be called upon receiving an
     *            error, `cancel` a function that will be called if the user
     *            presses the cancel button, `autohide` boolean if the camera
     *            should auto hide after the media capture is completed
     *            (defaults to true), `animated` boolean if the dialog should be
     *            animated (defaults to true) upon showing and hiding,
     *            `saveToPhotoGallery` boolean if the media should be saved to
     *            the photo gallery upon successful capture, `allowEditing`
     *            boolean if the media should be editable after capture in the
     *            UI interface, `mediaTypes` an array of media type constants
     *            supported by the capture device UI, `videoMaximumDuration` int
     *            duration on how long in milliseconds to allow capture before
     *            completing, `videoQuality` constant to indicate the video
     *            quality during capture, `showControls` boolean to indicate if
     *            the built-in UI controls should be displayed, `overlay` view
     *            which is added as an overlay to the camera UI (on top),
     *            `transform` an transformation matrix that applies to the
     *            camera UI transform.
     */
    public native void showCamera(MediaSelectionCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.showCamera({
					error : function(e) {
						var errorObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.MediaError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
						callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onError(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/MediaError;)(errorObject);
					},
					success : function(e) {
						var successObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.MediaEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
						callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onSuccess(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/MediaEvent;)(successObject);
					},
					cancel : function() {
						callback.@com.ait.toolkit.titanium.mobile.client.media.MediaSelectionCallback::onCancel()();
					}
				});
    }-*/;

    /**
     * Show the music library. iphone and ipad only.
     * 
     * Works ony on iOs
     * 
     * @param options
     *            pass a dictionary with the following supported keys: `success`
     *            a function that will be called when the camera is completed,
     *            `error` a function that will be called upon receiving an
     *            error, `cancel` a function that will be called if the user
     *            presses the cancel button, `autohide` boolean if the library
     *            listing should auto hide after selection is completed
     *            (defaults to true), `animated` boolean if the dialog should be
     *            animated (defaults to true) upon showing and hiding,
     *            `mediaTypes` an array of media type constants defining
     *            selectable media (see MUSIC_MEDIA_TYPE_* properties below) as
     *            either an array or a bitwise-or single value,
     *            `allowMultipleSelections` boolean whether or not more than one
     *            media selection is allowed
     */
    public native void showMusicLibrary(Object options) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showMusicLibrary(options);
    }-*/;

    /**
     * Run a search for music library items matching the specified search
     * predicates.
     * 
     * Works ony on iOs
     * 
     * @param query
     *            The query object to extract information from.
     */
    public ArrayList<MediaItemType> queryMusicLibrary(MediaQueryType query) {
        ArrayList<MediaItemType> items = new ArrayList<MediaItemType>();
        JsArray<JavaScriptObject> array = _queryMusicLibrary(query);
        for (int i = 0; i < array.length(); i++) {
            items.add(new MediaItemType(array.get(i)));
        }
        return items;
    }

    private native JsArray<JavaScriptObject> _queryMusicLibrary(MediaQueryType query) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.queryMusicLibrary(query.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Start the monitoring of microphone sound level
     */
    public native void startMicrophoneMonitor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.startMicrophoneMonitor();
    }-*/;

    /**
     * Stop the monitoring of microphone sound level
     */
    public native void stopMicrophoneMonitor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stopMicrophoneMonitor();
    }-*/;

    /**
     * Use the device camera to capture a photo. this must be called after
     * calling `showcamera` and only when `autohide` is set to false. this
     * method will cause the media capture device to capture a photo and call
     * the `success` callback.
     */
    public native void takePicture() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.takePicture();
    }-*/;

    /**
     * Take a screen shot of the visible ui on the device
     */
    public native void takeScreenshot(ScrenShotCallback callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso
				.takeScreenshot(function(e) {
					var scObject = @com.ait.toolkit.titanium.mobile.client.media.ScreenShotCallbackArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
					callback.@com.ait.toolkit.titanium.mobile.client.media.ScrenShotCallback::onEvent(Lcom/ait/toolkit/titanium/mobile/client/media/ScreenShotCallbackArguments;)(scObject);
				});
    }-*/;

    /**
     * Play a device vibration
     */
    public native void vibrate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.vibrate();
    }-*/;

    /**
     * Play a device vibration with the given duration.
     * 
     * @Android only
     */
    public native void vibrate(int duration) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var pattern = [];
		pattern.push(0);
		pattern.push(duration);
		jso.vibrate(pattern);
    }-*/;

    /**
     * Play a device vibration with the given durationOn Android, a pattern
     * argument can be provided to specify a vibration pattern. The pattern is
     * an array of Number values. Each number in the array is interpreted as a
     * duration in milliseconds. The first number is the delay before the
     * pattern starts, and the remaining numbers are interpreted as alternating
     * periods of on and off times. For example, the following pattern: [ 0,
     * 500, 100, 500, 100, 500 ] Would cause the vibration to start immediately
     * (delay = 0), and perform three long vibrations (500 ms) separated by
     * short pauses (100ms).
     * 
     * @Android only
     */
    public void vibrate(int[] pattern) {
        JsArrayInteger values = JsArrayInteger.createArray().cast();
        for (int i : pattern) {
            values.push(i);
        }
        _vibrate(values);
    }

    private native void _vibrate(JsArrayInteger pattern) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.vibrate(pattern);
    }-*/;

    /**
     * Use addLineChangeHandler(LineChangeHandler) instead
     * 
     * @deprecated
     */
    public void addLinechangeHandler(TiEventListener<LineChangeEvent> handler) {
        addEventListener(LineChangeEvent.LINE_CHANGE, handler);
    }

    /**
     * Use addRecordinginputHandler(RecordingInputHandler) instead
     * 
     * @deprecated
     */
    public void addRecordinginputHandler(TiEventListener<RecordingInputEvent> handler) {
        addEventListener(RecordingInputEvent.RECORDING_INPUT, handler);
    }

    public native void addRecordinginputHandler(RecordingInputHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.RecordingInputEvent::RECORDING_INPUT,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.RecordingInputEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.RecordingInputHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/RecordingInputEvent;)(eventObject);
						});
    }-*/;

    public native void addLineChangeHandler(LineChangeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.LineChangeEvent::LINE_CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.LineChangeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.LineChangeHandler::onLineChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/LineChangeEvent;)(eventObject);
						});
    }-*/;

    public native void addVolumeHandler(VolumeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.media.VolumentEvent::VOLUME,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.media.VolumentEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.media.VolumeHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/media/VolumentEvent;)(eventObject);
						});
    }-*/;

    private static native final int AUDIO_FORMAT_AAC() /*-{
		return Titanium.Media.AUDIO_FORMAT_AAC;
    }-*/;

    private static native final int AUDIO_FORMAT_ALAW() /*-{
		return Titanium.Media.AUDIO_FORMAT_ALAW;
    }-*/;

    private static native final int AUDIO_FORMAT_APPLE_LOSSLESS() /*-{
		return Titanium.Media.AUDIO_FORMAT_APPLE_LOSSLESS;
    }-*/;

    private static native final int AUDIO_FORMAT_ILBC() /*-{
		return Titanium.Media.AUDIO_FORMAT_ILBC;
    }-*/;

    private static native final int AUDIO_FORMAT_IMA4() /*-{
		return Titanium.Media.AUDIO_FORMAT_IMA4;
    }-*/;

    private static native final int AUDIO_FORMAT_LINEAR_PCM() /*-{
		return Titanium.Media.AUDIO_FORMAT_LINEAR_PCM;
    }-*/;

    private static native final int AUDIO_FORMAT_ULAW() /*-{
		return Titanium.Media.AUDIO_FORMAT_ULAW;
    }-*/;

    private static native final int AUDIO_HEADPHONES() /*-{
		return Titanium.Media.AUDIO_HEADPHONES;
    }-*/;

    private static native final int AUDIO_HEADPHONES_AND_MIC() /*-{
		return Titanium.Media.AUDIO_HEADPHONES_AND_MIC;
    }-*/;

    private static native final int AUDIO_HEADSET_INOUT() /*-{
		return Titanium.Media.AUDIO_HEADSET_INOUT;
    }-*/;

    private static native final int AUDIO_LINEOUT() /*-{
		return Titanium.Media.AUDIO_LINEOUT;
    }-*/;

    private static native final int AUDIO_MICROPHONE() /*-{
		return Titanium.Media.AUDIO_MICROPHONE;
    }-*/;

    private static native final int AUDIO_MUTED() /*-{
		return Titanium.Media.AUDIO_MUTED;
    }-*/;

    private static native final int AUDIO_RECEIVER_AND_MIC() /*-{
		return Titanium.Media.AUDIO_RECEIVER_AND_MIC;
    }-*/;

    private static native final int AUDIO_SESSION_MODE_AMBIENT() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_AMBIENT;
    }-*/;

    private static native final int AUDIO_SESSION_MODE_PLAYBACK() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_PLAYBACK;
    }-*/;

    private static native final int AUDIO_SESSION_MODE_PLAY_AND_RECORD() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_PLAY_AND_RECORD;
    }-*/;

    private static native final int AUDIO_SESSION_MODE_RECORD() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_RECORD;
    }-*/;

    private static native final int AUDIO_SESSION_MODE_SOLO_AMBIENT() /*-{
		return Titanium.Media.AUDIO_SESSION_MODE_SOLO_AMBIENT;
    }-*/;

    private static native final int AUDIO_SPEAKER() /*-{
		return Titanium.Media.AUDIO_SPEAKER;
    }-*/;

    private static native final int AUDIO_UNAVAILABLE() /*-{
		return Titanium.Media.AUDIO_UNAVAILABLE;
    }-*/;

    private static native final int AUDIO_UNKNOWN() /*-{
		return Titanium.Media.AUDIO_UNKNOWN;
    }-*/;

    private static native final int DEVICE_BUSY() /*-{
		return Titanium.Media.DEVICE_BUSY;
    }-*/;

    private static native final int MEDIA_TYPE_PHOTO() /*-{
		return Titanium.Media.MEDIA_TYPE_PHOTO;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_3GP2() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_3GP2;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_3GPP() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_3GPP;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_AIFF() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_AIFF;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_AMR() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_AMR;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_CAF() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_CAF;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_MP3() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP3;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_MP4() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP4;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_MP4A() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_MP4A;
    }-*/;

    private static native final int AUDIO_FILEFORMAT_WAVE() /*-{
		return Titanium.Media.AUDIO_FILEFORMAT_WAVE;
    }-*/;

    private static native final int MEDIA_TYPE_VIDEO() /*-{
		return Titanium.Media.MEDIA_TYPE_VIDEO;
    }-*/;

    private static native final int MUSIC_MEDIA_TYPE_ALL() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_ALL;
    }-*/;

    private static native final int MUSIC_MEDIA_TYPE_ANY_AUDIO() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_ANY_AUDIO;
    }-*/;

    private static native final int MUSIC_MEDIA_TYPE_AUDIOBOOK() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_AUDIOBOOK;
    }-*/;

    private static native final int MUSIC_MEDIA_TYPE_MUSIC() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_MUSIC;
    }-*/;

    private static native final int MUSIC_MEDIA_TYPE_PODCAST() /*-{
		return Titanium.Media.MUSIC_MEDIA_TYPE_PODCAST;
    }-*/;

    private static native final int MUSIC_MEDIA_GROUP_TITLE() /*-{
		return Titanium.Media.MUSIC_MEDIA_GROUP_TITLE;
    }-*/;

    private static native final int MUSIC_MEDIA_GROUP_ALBUM() /*-{
		return Titanium.Media.MUSIC_MEDIA_GROUP_ALBUM;
    }-*/;

    private static native final int MUSIC_MEDIA_GROUP_ARTIST() /*-{
		return Titanium.Media.MUSIC_MEDIA_GROUP_ARTIST;
    }-*/;

    private static native final int MUSIC_MEDIA_GROUP_ALBUM_ARTIST() /*-{
		return Titanium.Media.MUSIC_MEDIA_GROUP_ALBUM_ARTIST;
    }-*/;

    private static native final int MUSIC_MEDIA_GROUP_COMPOSER() /*-{
		return Titanium.Media.MUSIC_MEDIA_GROUP_COMPOSER;
    }-*/;

    private static native final int MUSIC_MEDIA_GROUP_GENRE() /*-{
		return Titanium.Media.MUSIC_MEDIA_GROUP_GENRE;
    }-*/;

    private static native final int MUSIC_MEDIA_GROUP_PLAYLIST() /*-{
		return Titanium.Media.MUSIC_MEDIA_GROUP_PLAYLIST;
    }-*/;

    private static native final int MUSIC_MEDIA_GROUP_PODCAST_TITLE() /*-{
		return Titanium.Media.MUSIC_MEDIA_GROUP_PODCAST_TITLE;
    }-*/;

    private static native final int MUSIC_PLAYER_REPEAT_ALL() /*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_ALL;
    }-*/;

    private static native final int MUSIC_PLAYER_REPEAT_DEFAULT() /*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_DEFAULT;
    }-*/;

    private static native final int MUSIC_PLAYER_REPEAT_NONE() /*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_NONE;
    }-*/;

    private static native final int MUSIC_PLAYER_REPEAT_ONE() /*-{
		return Titanium.Media.MUSIC_PLAYER_REPEAT_ONE;
    }-*/;

    private static native final int MUSIC_PLAYER_SHUFFLE_ALBUMS() /*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_ALBUMS;
    }-*/;

    private static native final int MUSIC_PLAYER_SHUFFLE_DEFAULT() /*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_DEFAULT;
    }-*/;

    private static native final int MUSIC_PLAYER_SHUFFLE_NONE() /*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_NONE;
    }-*/;

    private static native final int MUSIC_PLAYER_SHUFFLE_SONGS() /*-{
		return Titanium.Media.MUSIC_PLAYER_SHUFFLE_SONGS;
    }-*/;

    private static native final int MUSIC_PLAYER_STATE_INTERRUPTED() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_INTERRUPTED;
    }-*/;

    private static native final int MUSIC_PLAYER_STATE_PAUSED() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_PAUSED;
    }-*/;

    private static native final int MUSIC_PLAYER_STATE_PLAYING() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_PLAYING;
    }-*/;

    private static native final int MUSIC_PLAYER_STATE_SEEK_BACKWARD() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_SEEK_BACKWARD;
    }-*/;

    private static native final int MUSIC_PLAYER_STATE_SKEEK_FORWARD() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_SKEEK_FORWARD;
    }-*/;

    private static native final int MUSIC_PLAYER_STATE_STOPPED() /*-{
		return Titanium.Media.MUSIC_PLAYER_STATE_STOPPED;
    }-*/;

    private static native final int NO_CAMERA() /*-{
		return Titanium.Media.NO_CAMERA;
    }-*/;

    private static native final int NO_VIDEO() /*-{
		return Titanium.Media.NO_VIDEO;
    }-*/;

    private static native final int QUALITY_HIGH() /*-{
		return Titanium.Media.QUALITY_HIGH;
    }-*/;

    private static native final int QUALITY_LOW() /*-{
		return Titanium.Media.QUALITY_LOW;
    }-*/;

    private static native final int QUALITY_MEDIUM() /*-{
		return Titanium.Media.QUALITY_MEDIUM;
    }-*/;

    private static native final int UNKNOWN_ERROR() /*-{
		return Titanium.Media.UNKNOWN_ERROR;
    }-*/;

    private static native final int VIDEO_CONTROL_DEFAULT() /*-{
		return Titanium.Media.VIDEO_CONTROL_DEFAULT;
    }-*/;

    private static native final int VIDEO_CONTROL_EMBEDDED() /*-{
		return Titanium.Media.VIDEO_CONTROL_EMBEDDED;
    }-*/;

    private static native final int VIDEO_CONTROL_FULLSCREEN() /*-{
		return Titanium.Media.VIDEO_CONTROL_FULLSCREEN;
    }-*/;

    private static native final int VIDEO_CONTROL_HIDDEN() /*-{
		return Titanium.Media.VIDEO_CONTROL_HIDDEN;
    }-*/;

    private static native final int VIDEO_CONTROL_NONE() /*-{
		return Titanium.Media.VIDEO_CONTROL_NONE;
    }-*/;

    private static native final int VIDEO_FINISH_REASON_PLAYBACK_ENDED() /*-{
		return Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED;
    }-*/;

    private static native final int VIDEO_FINISH_REASON_PLAYBACK_ERROR() /*-{
		return Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR;
    }-*/;

    private static native final int VIDEO_FINISH_REASON_USER_EXITED() /*-{
		return Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED;
    }-*/;

    private static native final int VIDEO_LOAD_STATE_PLAYABLE() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_PLAYABLE;
    }-*/;

    private static native final int VIDEO_LOAD_STATE_PLAYTHROUGH_OK() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_PLAYTHROUGH_OK;
    }-*/;

    private static native final int VIDEO_LOAD_STATE_STALLED() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_STALLED;
    }-*/;

    private static native final int VIDEO_LOAD_STATE_UNKNOWN() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_UNKNOWN;
    }-*/;

    private static native final int VIDEO_CONTROL_UNKNOWN() /*-{
		return Titanium.Media.VIDEO_LOAD_STATE_UNKNOWN;
    }-*/;

    private static native final int VIDEO_MEDIA_TYPE_AUDIO() /*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_AUDIO;
    }-*/;

    private static native final int VIDEO_MEDIA_TYPE_NONE() /*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_NONE;
    }-*/;

    private static native final int VIDEO_MEDIA_TYPE_VIDEO() /*-{
		return Titanium.Media.VIDEO_MEDIA_TYPE_VIDEO;
    }-*/;

    private static native final int VIDEO_PLAYBACK_STATE_INTERRUPTED() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_INTERRUPTED;
    }-*/;

    private static native final int VIDEO_PLAYBACK_STATE_PAUSED() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_PAUSED;
    }-*/;

    private static native final int VIDEO_PLAYBACK_STATE_PLAYING() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_PLAYING;
    }-*/;

    private static native final int VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD;
    }-*/;

    private static native final int VIDEO_PLAYBACK_STATE_SEEKING_FORWARD() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_FORWARD;
    }-*/;

    private static native final int VIDEO_PLAYBACK_STATE_STOPPED() /*-{
		return Titanium.Media.VIDEO_PLAYBACK_STATE_STOPPED;
    }-*/;

    private static native final int VIDEO_REPEAT_MODE_NONE() /*-{
		return Titanium.Media.VIDEO_REPEAT_MODE_NONE;
    }-*/;

    private static native final int VIDEO_REPEAT_MODE_ONE() /*-{
		return Titanium.Media.VIDEO_REPEAT_MODE_ONE;
    }-*/;

    private static native final int VIDEO_SCALING_ASPECT_FILL() /*-{
		return Titanium.Media.VIDEO_SCALING_ASPECT_FILL;
    }-*/;

    private static native final int VIDEO_SCALING_ASPECT_FIT() /*-{
		return Titanium.Media.VIDEO_SCALING_ASPECT_FIT;
    }-*/;

    private static native final int VIDEO_SCALING_MODE_FILL() /*-{
		return Titanium.Media.VIDEO_SCALING_MODE_FILL;
    }-*/;

    private static native final int VIDEO_SCALING_NONE() /*-{
		return Titanium.Media.VIDEO_SCALING_NONE;
    }-*/;

    private static native final int VIDEO_SOURCE_TYPE_FILE() /*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_FILE;
    }-*/;

    private static native final int VIDEO_SOURCE_TYPE_STREAMING() /*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_STREAMING;
    }-*/;

    private static native final int VIDEO_SOURCE_TYPE_UNKNOWN() /*-{
		return Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN;
    }-*/;

    private static native final int VIDEO_TIME_OPTION_EXACT() /*-{
		return Titanium.Media.VIDEO_TIME_OPTION_EXACT;
    }-*/;

    private static native final int VIDEO_TIME_OPTION_NEAREST_KEYFRAME() /*-{
		return Titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeMediaModule();
    }

}
