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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Template that represents a view subcomponent of an ItemTemplate.
 */
public class ViewTemplate extends JsObject {

    public ViewTemplate() {
        jsObj = JsoHelper.createObject();
    }

    protected ViewTemplate( JavaScriptObject obj ) {
        jsObj = obj;
    }

    public native String getBindId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.bindId;
    }-*/;

    public native void setBindId( String value )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.bindId = value;
    }-*/;

    public native List<ViewTemplate> getChildTemplates() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.childTemplates;
		return @com.ait.toolkit.titanium.mobile.client.ui.ViewTemplate::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setChildTemplate( List<ViewTemplate> values )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.childTemplates = @com.ait.toolkit.titanium.mobile.client.ui.ViewTemplate::fromList(Ljava/util/List;)(values);
    }-*/;

    public native TemplateEvent getEvents() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.properties;
		return @com.ait.toolkit.titanium.mobile.client.ui.TemplateEvent::from(Lcom/ait/toolkit/core/client/JsObject;)(obj);
    }-*/;

    public native void setEvents( TemplateEvent event ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.events = event.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native ViewTemplateProperties getProperties() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.properties;
		return @com.ait.toolkit.titanium.mobile.client.ui.ViewTemplateProperties::from(Lcom/ait/toolkit/core/client/JsObject;)(obj);
    }-*/;

    public native void setProperties( ViewTemplateProperties value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.properties = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native String getType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.type;
    }-*/;

    public native void setType( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.type = value;
    }-*/;

    static JavaScriptObject fromList( List<ViewTemplate> values ) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for( ViewTemplate item : values ) {
            peers.push( item.getJsObj() );
        }
        return peers;
    }

    static List<ViewTemplate> fromJsArray( JavaScriptObject obj ) {
        if(obj == null)
            return null;

        List<ViewTemplate> toReturn = new ArrayList<ViewTemplate>();
        int size = JsoHelper.arrayLength( obj );
        for( int i = 0; i < size; i++ ) {
            toReturn.add( new ViewTemplate( JsoHelper.getValueFromJavaScriptObjectArray( obj, i ) ) );
        }
        return toReturn;
    }

}
