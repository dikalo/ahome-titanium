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
package com.ait.toolkit.titanium.mobile.client.ios.calendar;

import java.util.Date;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

class RecurrenceEnd extends JsObject {

    protected RecurrenceEnd(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * End date of the recurrence end, or undefined if the recurrence end is
     * count-based.
     */
    public Date getEndDate() {
        return JsoHelper.getAttributeAsDate(jsObj, "endDate");
    }

    /**
     * Occurrence count of the recurrence end, or 0 if the recurrence end is
     * date-based.
     */
    public int getOccurenceCount() {
        return JsoHelper.getAttributeAsInt(jsObj, "occurenceCount");
    }
}
