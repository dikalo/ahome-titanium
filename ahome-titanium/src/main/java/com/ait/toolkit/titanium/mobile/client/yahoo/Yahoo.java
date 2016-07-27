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
package com.ait.toolkit.titanium.mobile.client.yahoo;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.events.Event;
import com.ait.toolkit.titanium.mobile.client.core.events.EventListener;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level yahoo module. the yahoo module is used for accessing yahoo
 * related api services.
 */
public class Yahoo extends TiModule {
	
	private static Yahoo instance = null;
	
	public static Yahoo get(){
		if(instance == null){
			instance = new Yahoo();
		}
		return instance;
	}

	private Yahoo() {
		createPeer();
	}

	public void yql(String yql, EventListener<Event> listener) {
		yql(yql, listener.getJsoPeer());
	}

	private native void yql(String yql, JavaScriptObject callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.yql(yql, callback);
	}-*/;


	@Override
	public void createPeer() {
		jsObj = TiFactory.createNativeYahooModule();
	}

}
