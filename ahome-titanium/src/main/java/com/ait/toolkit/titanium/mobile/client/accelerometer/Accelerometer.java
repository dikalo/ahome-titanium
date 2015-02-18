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
package com.ait.toolkit.titanium.mobile.client.accelerometer;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.UpdateHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CallbackRegistration;

/**
 * The top level Accelerometer module. The Accelerometer modules contains methods and properties for using the device accelerometer.
 * 
 * You'll want to be selective about turning on and off the device accelerometer. It's recommended you turn off the accelerometer when you're not using it. You can turn off the
 * accelerometer by simply removing your event listener function. You can turn it back on by re-adding the same function with `addEventListener`.
 * Accelerometer.removeEventListener('update',fn);
 */
public class Accelerometer extends TiModule {

	private static Accelerometer instance = null;

	public static Accelerometer get() {
		if (instance == null) {
			instance = new Accelerometer();
		}
		return instance;
	}

	private Accelerometer() {
		createPeer();
	}

	/**
	 * Fired when the accelerometer changes.
	 * 
	 * @param handler
	 *            , the handler that will handle the event
	 */

	public native CallbackRegistration addUpdateHandler(UpdateHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.UpdateEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.UpdateHandler::onUpdate(Lcom/ait/toolkit/titanium/mobile/client/core/events/UpdateEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.UpdateEvent::UPDATE;
		jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	@Override
	public void createPeer() {
		jsObj = TiFactory.createAccelerometer();
	}

}
