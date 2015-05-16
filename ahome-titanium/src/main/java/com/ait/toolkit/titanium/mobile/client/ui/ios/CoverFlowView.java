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
package com.ait.toolkit.titanium.mobile.client.ui.ios;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CoverFlowIndexChangeHandler;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The cover flow view is container for showing animated, three dimensional
 * images in a nice ui.
 * 
 */
public class CoverFlowView extends View {

    public CoverFlowView() {
        createPeer();
    }

    public CoverFlowView( String id ) {
        this( id, new ArrayList<String>() );
    }

    public CoverFlowView( String id, List<String> classes ) {
        jsObj = createCoverFlowView( id, classes );
    }

    CoverFlowView( JavaScriptObject proxy ) {
        jsObj = proxy;
    }

    public native JsArrayString getImages() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.images;
    }-*/;

    public native void setImages( JsArrayString value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.images = value;
    }-*/;

    public native int getSelected() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.selected;
    }-*/;

    public native void setSelected( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selected = value;
    }-*/;

    public native void setImage( int index, Object image ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setImage(index, image);
    }-*/;

    public native void setImage( int index, Blob image ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setImage(index,
				image.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setImage( int index, File image ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setImage(index,
				image.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void addChangeHandler( CoverFlowIndexChangeHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.ChangeEvent::CHANGE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ChangeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CoverFlowIndexChangeHandler::onChange(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/ChangeEvent;)(eventObject);
						});

    }-*/;

    @Override
    public void createPeer() {
        jsObj = createCoverFlowView( "", new ArrayList<String>() );
    }

    public static CoverFlowView from( JsObject proxy ) {
        return new CoverFlowView( proxy.getJsObj() );
    }

    static native JavaScriptObject createCoverFlowView( String elId, List<String> classes ) /*-{
		var cls = @com.ait.toolkit.titanium.mobile.client.ui.UI::_createClassList(Ljava/util/List;)(classes);
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.UI::createIfPossible(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)('Titanium.UI.iOS.CoverFlowView', elId, classes)
		return obj || Titanium.UI.iOS.createCoverFlowView({
			id : elId,
			'class' : cls
		});
    }-*/;

}