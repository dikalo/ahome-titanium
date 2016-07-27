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
package com.ait.toolkit.titanium.mobile.client.core.events.activity;

import com.ait.toolkit.titanium.mobile.client.core.events.Event;
import com.google.gwt.core.client.JavaScriptObject;

public class ActivityEvent extends Event {

	public static final String CREATE = "create";
	public static final String DESTROY = "destroy";
	public static final String PAUSE = "pause";
	public static final String RESUME = "resume";
	public static final String RESUMED = "resumed";
	public static final String START = "start";
	public static final String STOP = "stop";
	public static final String TASK_REMOVE = "taskremove";

	protected ActivityEvent() {

	}

	protected ActivityEvent(JavaScriptObject obj) {
		jsObj = obj;
	}

}
