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

import com.ait.toolkit.titanium.mobile.client.core.handlers.activity.ResumeHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ResumeEvent extends Event {

    public static final String RESUME = "resume";
    public static final String RESUMED = "resumed";


	/**
	 * UiBinder implementations
	 */
	private static Type<ResumeHandler> TYPE = new Type<ResumeHandler>(RESUME, null);
	public static Type<ResumeHandler> getType() {
		return TYPE;
	}
	
	public static Type<ResumeHandler> getAssociatedType() {
		return TYPE;
	}
	
    protected ResumeEvent() {

    }

    @SuppressWarnings("unused")
    private ResumeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }
}
