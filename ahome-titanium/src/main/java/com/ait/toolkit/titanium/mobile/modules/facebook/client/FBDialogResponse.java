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
package com.ait.toolkit.titanium.mobile.modules.facebook.client;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class FBDialogResponse extends ErrorResponse {

    protected FBDialogResponse(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Indicates if the user canceled the dialog.
     */
    public boolean isCancelled() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "cancelled");
    }

    /**
     * If successful, returns the JSON response containing the post_id of the
     * new post. If the user canceled the dialog, the results is undefined.
     */
    public String getResult() {
        return JsoHelper.getAttribute(jsObj, "result");
    }

}
