/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.core.events;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.ait.toolkit.titanium.mobile.client.ui.TabGroup;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.ait.toolkit.titanium.mobile.client.ui.Window;

/**
 * Base class of all objects that are able to dispatch events
 * 
 */
public abstract class EventDispatcher extends JsObject {

    protected EventDispatcher() {

    }

    public native void addEventHandler( String event, EventHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						event,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.Event::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/Event;)(eventObject);
						});
    }-*/;

    /**
     * Fires a synthesized event to the views listener
     * 
     * @param name
     *            , name of event
     * @param eventObject
     *            , event object
     */
    public native void fireEvent( String name, Event eventObject ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.fireEvent(
						name,
						eventObject.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * The Window whose Activity lifecycle should be triggered on the proxy.
     * 
     * @param value
     */
    public static native void setLifeCycleContainer( Window value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setLifeCycleContainer(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * The TabGroup whose Activity lifecycle should be triggered on the proxy.
     * 
     * @param value
     */
    public static native void setLifeCycleContainer( TabGroup value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setLifeCycleContainer(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native String getApiName()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.apiName;
    }-*/;

    public native View getLifeCycleContainer()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.lifeCycleContainer;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    public void fireEvent( String eventName ) {
        this.fireEvent( eventName, new Event() );
    }

}
