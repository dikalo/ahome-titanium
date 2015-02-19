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
package com.ait.toolkit.titanium.mobile.client.android;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.ResumeHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.StartHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.StopHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.TaskRemoveHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an AndroidMedia Service. Can be used to start/stop
 * the service directly and listen for service-specific events. In the GWT-based
 * services you write, this can be referenced with
 * AndroidMedia.getCurrentService(). You can create an instance of the service
 * AndroidMedia.createService().
 */
public class Service extends EventDispatcher {

	public Service(Intent intent) {
		jsObj = Android.get().createService(intent).getJsObj();
	}

	private Service(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * Start the Service. Effective only if jso instance of
	 * Titanium.Android.Service was created with Titanium.Android.createService.
	 */
	public native void start() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.start();
	}-*/;

	/**
	 * Stop jso running instance of the Service.
	 */
	public native void stop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.stop();
	}-*/;

	/**
	 * The Titanium.Android.Intent used to start or bind to the Service.
	 * 
	 * @return
	 */
	public native Intent getIntent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.intent;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * A service can be started more than once -- jso number (based on an
	 * incrementing integer) indicates which "start number" in the sequence the
	 * current service instance is.
	 * 
	 * @return
	 */
	public native int getServiceInstanceId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.serviceInstanceId;
	}-*/;

	public native void addResumeHandler(ResumeHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::RESUME,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.activity.ResumeHandler::onResume(Lcom/ait/toolkit/titanium/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
	}-*/;

	public native void addStartHandler(StartHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::START,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.activity.StartHandler::onStart(Lcom/ait/toolkit/titanium/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
	}-*/;

	public native void addStopHandler(StopHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::STOP,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.activity.StopHandler::onStop(Lcom/ait/toolkit/titanium/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
	}-*/;

	public native void addTaskRemoveHandler(TaskRemoveHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::TASK_REMOVE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.activity.StopHandler::onStop(Lcom/ait/toolkit/titanium/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
	}-*/;

}
