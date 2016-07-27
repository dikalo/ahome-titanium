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

import com.ait.toolkit.titanium.mobile.client.core.handlers.media.StateChangeHandler;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class StateChangeEvent extends Event {

    public static final String STATE_CHANGE = "stateChange";


	/**
	 * UiBinder implementations
	 */
	private static Type<StateChangeHandler> TYPE = new Type<StateChangeHandler>(STATE_CHANGE, null);
	public static Type<StateChangeHandler> getType() {
		return TYPE;
	}
	
	public static Type<StateChangeHandler> getAssociatedType() {
		return TYPE;
	}
	
    protected StateChangeEvent() {

    }
}
