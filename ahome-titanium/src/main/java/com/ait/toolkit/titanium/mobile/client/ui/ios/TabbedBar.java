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

import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasStyle;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A tabbed bar is created by the method
 * {@link com.ait.toolkit.titanium.mobile.client.ui.UI.createTabbedBar}. the
 * difference between the tabbed bar and the button bar is that the tabbed bar
 * visually maintains a state (visually distinguished as a pressed or selected
 * look).
 * <p>
 * For iPhone, the style constants are available in the constants defined in
 * com.ait.toolkit.titanium.mobile.client.ui.iphone.IPhone.SystemButtonStyle.
 * 
 */
public class TabbedBar extends View implements HasStyle {

    public TabbedBar() {
        createPeer();
    }

    public TabbedBar( String id ) {
        this( id, new ArrayList<String>() );
    }

    public TabbedBar( String id, List<String> classes ) {
        jsObj = createTabbedBar( id, classes );
    }

    /**
     * @return The selected index
     */
    public native int getIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.index;
    }-*/;

    public native void setIndex( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.index = value;
    }-*/;

    public ArrayList<BarElement> getLabels() {
        ArrayList<BarElement> labels = new ArrayList<BarElement>();
        JsArray<JavaScriptObject> values = _getLabels();
        for( int i = 0; i < values.length(); i++ ) {
            labels.add( new BarElement( values.get( i ) ) );
        }
        return labels;
    }

    private native JsArray<JavaScriptObject> _getLabels() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.labels;
    }-*/;

    public void setLabels( ArrayList<BarElement> labels ) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for( BarElement element : labels ) {
            values.push( element.getJsObj() );
        }
        _setLabels( values );
    }

    public void setLabels( BarElement... labels ) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for( BarElement element : labels ) {
            values.push( element.getJsObj() );
        }
        _setLabels( values );
    }

    private native void _setLabels( JsArray<JavaScriptObject> value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.labels = value;
    }-*/;

    /**
     * @return The style of the tabbed bar
     */
    public native int getStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.style;
    }-*/;

    public native void setStyle( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.style = value;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = createTabbedBar( "", new ArrayList<String>() );
    }

    private static native JavaScriptObject createTabbedBar( String elId, List<String> classes ) /*-{
		var cls = @com.ait.toolkit.titanium.mobile.client.ui.UI::_createClassList(Ljava/util/List;)(classes);
		return Titanium.UI.iOS.createTabbedBar({
			id : elId,
			'class' : cls
		});
    }-*/;

}
