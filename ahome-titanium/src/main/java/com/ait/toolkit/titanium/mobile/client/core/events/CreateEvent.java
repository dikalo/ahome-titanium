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

import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.CreateHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class CreateEvent extends TiEvent {

    public static final String CREATE = "create";

	/**
	 * UiBinder implementations
	 */
	private static Type<CreateHandler> TYPE = new Type<CreateHandler>(CREATE, null);
	public static Type<CreateHandler> getType() {
		return TYPE;
	}
	
	public static Type<CreateHandler> getAssociatedType() {
		return TYPE;
	}
    
    
    protected CreateEvent() {

    }

    @SuppressWarnings("unused")
    private CreateEvent(JavaScriptObject obj) {
        this.jsObj = obj;
    }
}
