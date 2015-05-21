package com.ait.toolkit.titanium.mobile.client.ui;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class ListViewMarkerProps extends JsObject {

    public ListViewMarkerProps() {
        jsObj = JsoHelper.createObject();
    }

    protected ListViewMarkerProps(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The itemIndex of the reference item.
     */
    public native int getItemIndex() /*-{
        var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	    return jso.itemIndex;
    }-*/;


    /**
     * The itemIndex of the reference item.
     */
    public native void setItemIndex(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.itemIndex = index;
    }-*/;

    /**
     * The sectionIndex of the reference item.
     */
    public native int getSectionIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	    return jso.sectionIndex;
    }-*/;


    /**
     * The sectionIndex of the reference item.
     */
    public native void setSectionIndex(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.sectionIndex = index;
    }-*/;

}
