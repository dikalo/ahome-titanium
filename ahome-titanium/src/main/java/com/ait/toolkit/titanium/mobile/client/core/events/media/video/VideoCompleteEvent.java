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

package com.ait.toolkit.titanium.mobile.client.core.events.media.video;

public class VideoCompleteEvent extends VideoEvent {

    public static final String COMPLETE = "complete";
    public static final String DURATION_AVAILABLE = "durationAvailable";

    protected VideoCompleteEvent() {

    }

    /**
     * the completion reason. One of
     * Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED,
     * Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR or
     * Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED.
     */
    public native int getReason() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.reason;
    }-*/;

}
