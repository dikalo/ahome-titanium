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

package com.ait.toolkit.titanium.mobile.client.core.events;

import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class TiEventListener<T extends TiEvent> {

    final JavaScriptObject jsoPeer = createPeer(this);

    protected abstract void onEvent(T event);

    private static native JavaScriptObject createPeer(TiEventListener<?> listener) /*-{
		var callback = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			listener.@com.ait.toolkit.titanium.mobile.client.core.events.TiEventListener::fireOnEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/TiEvent;)(eventObject);
		};
		callback.jso = listener;
		return callback;
    }-*/;

    // Called from JSNI
    private final void fireOnEvent(T event) {
        onEvent(event);
    }

    private void fireOnEventAndCatch(T event, UncaughtExceptionHandler handler) {
        try {
            onEvent(event);
        } catch (Throwable e) {
            handler.onUncaughtException(e);
        }
    }

    public JavaScriptObject getJsoPeer() {
        return jsoPeer;
    }
}
