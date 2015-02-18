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
package com.ait.toolkit.titanium.mobile.client.app;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * A service that runs when the application is placed in the background.
 * <p>
 * A background service is created by
 * Titanium.App.iOS.registerBackgroundService. At creation, a local URL to a
 * JavaScript file must be defined. The code it contains is executed each time
 * the application is no longer in the foreground, along with all other services
 * that have been registered in the same way. When this happens, all background
 * services continue to run until one of the following occurs:
 * <p>
 * A service is stopped with the stop method. The application resumes, at which
 * points all background services are stopped. The OS terminates the service for
 * one of the reasons discussed in "Background Service Limitations", below. A
 * background service can invoke a Titanium.App.iOS.LocalNotification, which
 * prompts users via a dialog to return to the application and provides a button
 * that brings it back into the foreground.
 * <p>
 * <b>Background Service Limitations</b>
 * <p>
 * A background service is subject to limitations imposed by the operating
 * system, such as <o>
 * <ul>
 * <li>The OS limits the total amount of time a background service can run for
 * after the application is paused, typically to no more than 10 minutes.</li>
 * <li>The OS may terminate the background service at any point to reclaim
 * resources.</li>
 * </ul>
 * 
 */
public class BackgroundService extends JsObject {

	protected BackgroundService(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * A local URL to a JavaScript file containing the code to run in the
	 * background.
	 */
	public native String getUrl() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.url;
	}-*/;

	/**
	 * Stops the service from running during the current background session to
	 * conserve resources.
	 */
	public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stop();
	}-*/;

	/**
	 * Unregisters the background service.
	 */
	public native void unregister() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.unregister();
	}-*/;
}
