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
import com.ait.toolkit.titanium.mobile.client.core.events.EventListener;
import com.ait.toolkit.titanium.mobile.client.core.handlers.MenuActionHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.CreateHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.DestroyHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.PauseHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.ResumeHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.StartHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.StopHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.intent.NewIntentHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an Android Activity.
 * <p>
 * According to the Android API Reference, an activity is "a single, focused thing that a user can do."
 * <p>
 * In almost all cases, an activity is associated with a window. Activities are central to the Android Back button navigation -- the Back button closes the current activity and
 * returns to whatever activity was open previously.
 * <p>
 * In Titanium, you can create either "lightweight" or a "heavyweight" windows, as described on the Titanium.UI.Window reference page. A heavyweight window creates a new Activity.
 * A lightweight window runs inside the same activity as the code that created it.
 * <p>
 * The activity is not created until the window is opened. When a window is created, its activity property refers to an empty JavaScript object. You can use it, for example, to add
 * an options menu by setting onCreateOptionsMenu. After the window is opened, a real Activity object is created and the properties from the JavaScript object are copied over. The
 * activity property now refers to this real Activity object, which you can use to call the various Activity methods. For example, to use the invalidateOptionsMenu method, you need
 * to get the activity proxy after the window is opened.
 * <p>
 * See: android.app.Activity in the Android API Reference.
 * <p>
 * <b>Activity Lifecycle</b>
 * <p>
 * In Android, activities are started, stopped, paused and resumed. Titanium generates lifecycle events for activities, but doesn't generate application-level start, stop, pause
 * and resume events. To be notified when an application is paused and resumed, you must add event listeners to its individual activities.
 */
public class Activity extends EventDispatcher {

	protected Activity(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * 
	 * The action bar for this activity.
	 * <p>
	 * See also: Action Bar in the Android Developer Reference.
	 */
	public native ActionBar getActionBar() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.actionBar;
		if (obj) {
			return @com.ait.toolkit.titanium.mobile.client.android.ActionBar::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		}
		return null;

	}-*/;

	/**
	 * Called when the activity is done and should be closed. Also see AndroidMedia's documentation for finish (http://developer.android.com/reference/android/
	 * app/activity.html#finish)
	 */
	public native void finish() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.finish();
	}-*/;

	/**
	 * Returns the Titanium.Android.Intent that was used to start this Activity.
	 * 
	 * @return The intent that was used to start this Activity.
	 */
	public native Intent getIntent() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getIntent();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	/**
	 * Get an AndroidMedia or Application string using the passed-in Resource ID Also see AndroidMedia's documentation for getString
	 * 
	 * @param resourceId
	 *            , A Resource ID from the Application or AndroidMedia.
	 * @return
	 */
	public native String getString(int resourceId) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getString(resourceId);
	}-*/;

	/**
	 * Get an AndroidMedia or Application string using the passed-in Resource ID and optional format arguments. Also see AndroidMedia's documentation for getString and String
	 * Resources
	 * 
	 * @param resourceId
	 *            , a Resource ID from the Application or AndroidMedia.
	 * @param format
	 *            , optional format arguments for the String resource
	 * @return
	 */
	public native String getString(int resourceId, Object format) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getString(resourceId, format);
	}-*/;

	/**
	 * Set the requested Activity orientation. Also see AndroidMedia's documentation for setRequestedOrientation
	 * 
	 * @param orientation
	 *            , Can be one of AndroidMedia.SCREEN_ORIENTATION_BEHIND, AndroidMedia.SCREEN_ORIENTATION_LANDSCAPE, AndroidMedia.SCREEN_ORIENTATION_NOSENSOR,
	 *            AndroidMedia.SCREEN_ORIENTATION_PORTRAIT, AndroidMedia.SCREEN_ORIENTATION_SENSOR, AndroidMedia.SCREEN_ORIENTATION_UNSPECIFIED,
	 *            AndroidMedia.SCREEN_ORIENTATION_USER
	 */
	public native void setRequestedOrientation(int orientation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setRequestedOrientation(orientation);
	}-*/;

	/**
	 * Declares that the option menu has changed and should be recreated.
	 * <p>
	 * This method needs to be used in Android 3.0 and above when changing menus at runtime. See changingTheMenu in the Android API Reference for more details.
	 */
	public native void invalidateOptionsMenu() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.invalidateOptionsMenu();
	}-*/;

	/**
	 * Programmatically opens the options menu.
	 * <p>
	 * See also: onMenuOpened in the Android API Reference.
	 */
	public native void openOptionsMenu() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.openOptionsMenu();
	}-*/;

	/**
	 * @return The requested orientation of this activity. see possible constant values that begin with SCREEN_ORIENTATION in
	 *         {@link com.ait.toolkit.titanium.mobile.client.android.Android}.
	 */
	public native int getRequestedOrientation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.requestedOrientation;
	}-*/;

	/**
	 * Sets the result of this Activity using an Intent. This should be used in the case when the Activity responds to startActivityForResult. Also see AndroidMedia's documentation
	 * for setResult
	 * 
	 * @param resultCode
	 *            , The result code for this Activity. Must be one of AndroidMedia.RESULT_OK,AndroidMedia.RESULT_CANCELED, AndroidMedia.RESULT_FIRST_USER
	 */
	public native void setResult(int resultCode) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setResult(resultCode);
	}-*/;

	/**
	 * Sets the result of this Activity using an Intent. This should be used in the case when the Activity responds to startActivityForResult. Also see AndroidMedia's documentation
	 * for setResult
	 * 
	 * @param resultCode
	 *            , The result code for this Activity. Must be one of AndroidMedia.RESULT_OK,AndroidMedia.RESULT_CANCELED, AndroidMedia.RESULT_FIRST_USER
	 * 
	 * @param intent
	 *            , An optional Titanium.Android.Intent with extra result data
	 */
	public native void setResult(int resultCode, Intent intent) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setResult(resultCode,
				intent.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Starts a new Activity, using the passed in Intent as the description. Also see AndroidMedia's documentation for startActivity
	 * 
	 * @param intent
	 *            , Description of the Activity to start
	 */
	public native void startActivity(Intent intent) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.startActivity(intent.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * The same as startActivity, but also accepts a event listener for handling the result of the started Activity. Also see AndroidMedia's documentation for
	 * startActivityForResult
	 * 
	 * @param intent
	 *            , Description of the Activity to start
	 * @param listener
	 *            , A event listener that is executed when the Activity has set it's result.
	 */
	public void startActivityForResult(Intent intent, EventListener<?> listener) {
		_startActivityForResult(intent.getJsObj(), listener.getJsoPeer());
	}

	private native void _startActivityForResult(JavaScriptObject intent, JavaScriptObject listener) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.startActivityForResult(intent, listener);
	}-*/;

	/**
	 * The Intent that was used to start this Activity
	 * 
	 * @return, The Intent that was used to start this Activity
	 */
	public native Intent getIntentProperty() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.intent;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setOncreateOptionsMenu(MenuActionHandler callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.oncreateOptionsMenu = function(e) {
			var event = @com.ait.toolkit.titanium.mobile.client.core.events.MenuEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
			callback.@com.ait.toolkit.titanium.mobile.client.core.handlers.MenuActionHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/MenuEvent;)(event);
		};
	}-*/;

	private native void setOncreateOptionsMenu(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.oncreateOptionsMenu = callback;
	}-*/;

	private native void setOnPrepareOptionsMenu(JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.onPrepareOptionsMenu = callback;
	}-*/;

	/**
	 * Set an event listener that is called to prepare an Options Menu for displaying on this Activity when the user presses the Menu button.
	 * 
	 * @param listener
	 */
	public native void setOnPrepareOptionsMenu(MenuActionHandler callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.onPrepareOptionsMenu = function(e) {
			var event = @com.ait.toolkit.titanium.mobile.client.core.events.MenuEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
			callback.@com.ait.toolkit.titanium.mobile.client.core.handlers.MenuActionHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/MenuEvent;)(event);
		};
	}-*/;

	public native void addCreateHandler(CreateHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::CREATE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.CreateEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.activity.CreateHandler::onCreate(Lcom/ait/toolkit/titanium/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
	}-*/;

	public native void addDestroyHandler(DestroyHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::DESTROY,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.DestroyEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.activity.DestroyHandler::onDestroy(Lcom/ait/toolkit/titanium/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
	}-*/;

	public native void addNewIntentHandler(NewIntentHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.android.NewIntentEvent::NEW_INTENT,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.android.NewIntentEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.intent.NewIntentHandler::onNewIntent(Lcom/ait/toolkit/titanium/mobile/client/core/events/android/NewIntentEvent;)(eventObject);
						});
	}-*/;

	public native void addPauseHandler(PauseHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.activity.ActivityEvent::PAUSE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.PauseEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.activity.PauseHandler::onPause(Lcom/ait/toolkit/titanium/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
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

}
