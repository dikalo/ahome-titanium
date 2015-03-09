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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

public class BoundaryCollisionEvent extends TiEvent {

	public static final String EVENT_NAME = "boundarycollision";

	protected BoundaryCollisionEvent() {

	}

	protected BoundaryCollisionEvent(JavaScriptObject peer) {
		jsObj = peer;
	}

	public String getIdentifier() {
		return JsoHelper.getAttribute(jsObj, "identifier");
	}

	public String getType() {
		return JsoHelper.getAttribute(jsObj, "type");
	}

	public boolean isStart() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "start");
	}

	public View getItem() {
		return new View(JsoHelper.getAttributeAsJavaScriptObject(jsObj, "item"));
	}

	public Point getPoint() {
		return new Point(JsoHelper.getAttributeAsJavaScriptObject(jsObj,
				"point"));
	}
}
