package com.ait.toolkit.titanium.mobile.client.ui.iphone;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class ListViewSeparatorInsets extends JsObject {

    public ListViewSeparatorInsets() {
        jsObj = JsoHelper.createObject();
    }

    protected ListViewSeparatorInsets( JavaScriptObject obj ) {
        jsObj = obj;
    }

    public ListViewSeparatorInsets( String left, String right) {
        this();
        setLeft(left);
        setRight(right);
    }

    public native String getLeft() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.left;
    }-*/;

    public native void setLeft( String left ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.left = left;
    }-*/;

    public native String getRight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.right;
    }-*/;

    public native void setRight( String right ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.right = right;
    }-*/;
}
