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
package com.ait.toolkit.titanium.mobile.client.analytics;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

/**
 * The top level Analytics module. The Analytics module is used for transmitting
 * developer-defined Analytics event for your application to the Appcelerator
 * Analytics product. It can be used to augment additional context or
 * application-specific information which can then be accessed during analysis
 * using Analytics.
 * 
 * <p>
 * Use the <code>featureEvent</code> method to generate custom events that you
 * can view through the Analytics product. You can specify a name for the
 * feature event which is visible through Analytics.
 * <p>
 * <b>NOTE</b> The analytics module lets you transmit some data that is stored,
 * but not made accessible through the Analytics UI. To access this data, you
 * must sign up for the optional raw data export service.
 * 
 * <p>
 * The following types of data are stored but not made available through the
 * Analytics UI:
 * <ul>
 * <li>Navigation events.</li>
 * <li>Extra data added to feature events (the data parameter).</li>
 * </ul>
 * <p>
 * Viewing navigation events in the Analytics UI will be supported in a future
 * version of the Analytics product. There is no plan to support the other event
 * types, and they should not be used.
 */
public class Analytics extends TiModule {

	private static Analytics instance = null;

	public static Analytics get() {
		if (instance == null) {
			instance = new Analytics();
		}
		return instance;
	}

	private Analytics() {
		createPeer();
	}

	/**
	 * Send a generic event for the application session
	 * 
	 * @param type
	 *            , the event type
	 * @param name
	 *            , the event name
	 */
	public native void addEvent(String type, String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addEvent(type, name);
	}-*/;

	/**
	 * Send a generic event for the application session
	 * 
	 * @param type
	 *            , the event type
	 * @param name
	 *            , the event name
	 * @param data
	 *            , event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public native void addEvent(String type, String name, JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.addEvent(type, name, data);
	}-*/;

	/**
	 * send an analytics feature event for the application session
	 * 
	 * @param name
	 *            , the event name
	 */
	public native void featureEvent(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.featureEvent(name);
	}-*/;

	/**
	 * send an analytics feature event for the application session
	 * 
	 * @param name
	 *            , the event name
	 * @param data
	 *            , event data or null if not specified. the object must be
	 *            serializable as JSON
	 */

	public void featureEvent(String name, JsObject data) {
		featureEvent(name, data.getJsObj());
	}

	public native void featureEvent(String name, JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.featureEvent(name, data);
	}-*/;

	/**
	 * fire a synthesized event to the views listener
	 * 
	 * @param name
	 *            , the name of thr event
	 * @param event
	 *            , event object
	 */
	public static native void fireEvent(String name, Object event) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fireEvent(name, event);
	}-*/;

	/**
	 * send an analytics nav event for the application session
	 * 
	 * @param from
	 *            , the from location in the nav event
	 * @param to
	 *            , the to location in the nav event
	 * @param name
	 *            , the event name
	 */
	public static native void navEvent(String from, String to, String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.navEvent(from, to, name);
	}-*/;

	/**
	 * send an analytics nav event for the application session
	 * 
	 * @param from
	 *            , the from location in the nav event
	 * @param to
	 *            , the to location in the nav event
	 * @param name
	 *            , the event name
	 * @param data
	 *            , event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public static native void navEvent(String from, String to, String name,
			JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.navEvent(from, to, name, data);
	}-*/;

	/**
	 * send a analytics settings event for the application session
	 * 
	 * @param name
	 *            , the event name
	 */
	public static native void settingsEvent(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.settingsEvent(name);
	}-*/;

	/**
	 * send a analytics settings event for the application session
	 * 
	 * @param name
	 *            , the event name
	 * @param data
	 *            , event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public static native void settingsEvent(String name, JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.settingsEvent(name, data);
	}-*/;

	/**
	 * send an analytics timed event for the application session
	 * 
	 * @param name
	 *            , the event name
	 * @param start
	 *            , the event start as Date object
	 * @param stop
	 *            , the event end as Date object
	 * @param duration
	 *            , the event duration
	 */
	public native void timedEvent(String name, JsDate start, JsDate stop,
			double duration) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.timedEvent(name, start, stop, duration);
	}-*/;

	/**
	 * send an analytics timed event for the application session
	 * 
	 * @param name
	 *            , the event name
	 * @param start
	 *            , the event start as Date object
	 * @param stop
	 *            , the event end as Date object
	 * @param duration
	 *            , the event duration
	 * @param data
	 *            , event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public native void timedEvent(String name, JsDate start, JsDate stop,
			double duration, JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.timedEvent(name, start, stop, duration, data);
	}-*/;

	/**
	 * send an analytics user event for the application session
	 * 
	 * @param name
	 *            , the event name
	 * @param data
	 *            , event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public native void userEvent(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.userEvent(type, name);
	}-*/;

	/**
	 * send an analytics user event for the application session
	 * 
	 * @param name
	 *            , the event name
	 * @param data
	 *            , event data or null if not specified. the object must be
	 *            serializable as JSON
	 */
	public native void userEvent(String name, JavaScriptObject data) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.userEvent(type, name, data);
	}-*/;

	@Override
	public void createPeer() {
		jsObj = TiFactory.createAnalytics();
	}

}
