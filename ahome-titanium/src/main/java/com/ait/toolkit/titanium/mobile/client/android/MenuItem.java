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
package com.ait.toolkit.titanium.mobile.client.android;

import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.InteractionHandler;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an AndroidMedia MenuItem
 */
public class MenuItem extends EventDispatcher {

    protected MenuItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Custom view that replaces the default menu item button.
     * <p>
     * Action-bar specific. Only used on Android 3.0 (API level 11) or later.
     */
    public native View getActionView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.actionView;
		return @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Custom view that replaces the default menu item button.
     * <p>
     * Action-bar specific. Only used on Android 3.0 (API level 11) or later.
     */
    public native void setActionView(View vieww) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.actionView = view.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * True if this menu item's action view has been expanded.
     */
    public native String isActionViewExpanded() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.actionViewExpanded;
    }-*/;

    /**
     * retrieve the condensed title of the item
     * 
     * @return
     */
    public native String getTitleCondensed() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.titleCondensed;
    }-*/;

    public native void setTitleCondensed(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.titleCondensed = value;
    }-*/;

    /**
     * retrieve the groupId for this item
     * 
     * @return
     */
    public native int getGroupId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getGroupId();
    }-*/;

    /**
     * retrieve the itemId for this item
     * 
     * @return
     */
    public native int getItemId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getItemId();
    }-*/;

    /**
     * retrieve the title of the item
     * 
     * @return
     */
    public native String getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getTitle();
    }-*/;

    /**
     * retrieve the enabled state of the menu
     * 
     * @return
     */
    public native boolean isEnable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isEnable();
    }-*/;

    /**
     * retrieve the visible state of the menu
     * 
     * @return
     */
    public native boolean isVisible() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.isVisible();
    }-*/;

    /**
     * set the condensed title for the item
     * 
     * @param value
     *            , new condensed title
     */
    public native void setCondensedTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setCondensedTitle(value);
    }-*/;

    /**
     * set the enabled state of the item
     * 
     * @param value
     *            , true to enable item, false to disable
     */
    public native void setEnabled(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setEnabled(value);
    }-*/;

    public native boolean isEnabled()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.enabled;
    }-*/;

    /**
     * set the icon for the item
     * 
     * @param value
     *            , icon to use with the item
     */
    public native void setIcon(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setIcon(value);
    }-*/;

    public native void setIcon(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setIcon(value);
    }-*/;

    public native String getIcon() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.icon;
    }-*/;

    public native int getIconAsInt() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.icon;
    }-*/;

    public native boolean isCheckable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.checkable;
    }-*/;

    public native int setCheckable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.checkable = value;
    }-*/;

    public native boolean isChecked() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.checked;
    }-*/;

    public native void setChecked() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.checked = value;
    }-*/;

    public native int getShowsAsAction() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.showsAsAction;
    }-*/;

    public native void setShowsAsAction(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showsAsAction = value;
    }-*/;

    /**
     * set the title for the item
     * 
     * @param value
     *            , new title
     */
    public native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setTitle(value);
    }-*/;

    /**
     * set the visible state of the item
     * 
     * @param value
     *            , true to show the item, false to hide
     */
    public native void setVisible(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setVisible(value);
    }-*/;

    /**
     * retrieve the sort order
     * 
     * @return
     */
    public native int getOrder() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getOrder();
    }-*/;

    @Deprecated
    public native void addClickHandler(InteractionHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent::EVENT_NAME,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
						});
    }-*/;

    public native void addClickHandler(ClickHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler::onClick(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/ClickEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);

    }-*/;

    public void addExpandHandler(EventHandler handler) {
        this.addEventHandler("expand", handler);
    }

    public void addCollapseHandler(EventHandler handler) {
        this.addEventHandler("collapse", handler);
    }

}
