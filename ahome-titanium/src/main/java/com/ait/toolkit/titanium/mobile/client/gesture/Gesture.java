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
package com.ait.toolkit.titanium.mobile.client.gesture;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.events.OrientationChangeEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.ShakeEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.TiEventListener;
import com.ait.toolkit.titanium.mobile.client.core.handlers.OrientationChangeHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ShakeHandler;

/**
 * The top level gestures module. the gesture module is responsible for high
 * level device gestures that are device-wide.
 */
public class Gesture extends TiModule {

    private static Gesture instance = null;

    public static Gesture get() {
        if (instance == null) {
            instance = new Gesture();
        }
        return instance;
    }

    private Gesture() {
        createPeer();
    }

    @Deprecated
    public void addOrientationchangeHandler(TiEventListener<OrientationChangeEvent> listener) {
        addEventListener(OrientationChangeEvent.ORIENTATION_CHANGE, listener);
    }

    public native void addOrientationchangeHandler(OrientationChangeHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.OrientationChangeEvent::ORIENTATION_CHANGE,
						function(e) {
							var obj = @com.ait.toolkit.titanium.mobile.client.core.events.OrientationChangeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.titanium.mobile.client.core.handlers.OrientationChangeHandler::onOrientationChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/OrientationChangeEvent;)(obj);
						});
    }-*/;

    @Deprecated
    public void addShakeHandler(TiEventListener<ShakeEvent> listener) {
        addEventListener(ShakeEvent.SHAKE, listener);
    }

    public native void addShakeHandler(ShakeHandler handler) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ShakeEvent::SHAKE,
						function(e) {
							var obj = @com.ait.toolkit.titanium.mobile.client.core.events.ShakeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.titanium.mobile.client.core.handlers.ShakeHandler::onShake(Lcom/ait/toolkit/titanium/mobile/client/core/events/ShakeEvent;)(obj);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeGestureModule();
    }
}
