/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui;

import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class ListViewTemplate extends JsObject {

    public ListViewTemplate() {
        jsObj = JsoHelper.createObject();
    }

    public void addViewTemplate( ViewTemplate viewTemplate ) {
        addTemplate( "template", viewTemplate );
    }

    public void setId( String id ) {
        JsoHelper.setAttribute( jsObj, "id", id );
    }

    public void setClasses( List<String> classes ) {
        JsoHelper.setAttribute( jsObj, "classes", UI._createClassList( classes ) );
    }

    public native void addTemplate( String templateId, ViewTemplate template )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var tlp = template.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = {};
		o[templateId] = tpl;
		jso.templates = o;
		jso.defaultItemTemplate = templateId;
    }-*/;

}
