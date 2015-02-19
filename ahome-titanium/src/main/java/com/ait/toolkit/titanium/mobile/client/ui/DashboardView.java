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
package com.ait.toolkit.titanium.mobile.client.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CommitHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DashboardItemHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DeleteHandler;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.Editable;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The dashboard view provides a view that supports the ability to have
 * springboard-like view of icons which can be reordered by dragging and can
 * contain multiple pages of icons in a scrollable view.
 * <p>
 * 
 * Available only on iOS
 */
public class DashboardView extends View implements Editable {

    private List<DashboardItem> items;

    private DashboardView() {
        createPeer();
    }

    public DashboardView(int rowCount, int columnCount) {
        create(rowCount, columnCount);
        items = new ArrayList<DashboardItem>();
    }

    DashboardView(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return An array of
     *         {@link com.ait.toolkit.titanium.mobile.client.ui.DashboardItem} objects
     *         to display in the view
     */
    public ArrayList<DashboardItem> getData() {
        ArrayList<DashboardItem> items = new ArrayList<DashboardItem>();
        JsArray<JavaScriptObject> values = _getData();
        for (int i = 0; i < values.length(); i++) {
            items.add(new DashboardItem(values.get(i)));
        }
        this.items = items;
        return items;
    }

    private native JsArray<JavaScriptObject> _getData() /*-{
		var jso = jso.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.data;
    }-*/;

    public void setData(List<DashboardItem> data) {
        this.items = data;
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DashboardItem item : data) {
            values.push(item.getJsObj());
        }
        _setData(values);
    }

    public void setData(DashboardItem... data) {
        setData(Arrays.asList(data));
    }

    private void addItem(DashboardItem item) {
        this.items.add(item);
    }

    private void layoutData() {
        this.setData(this.items);
    }

    private native void _setData(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.data = value;
    }-*/;

    /**
     * @return True (default) to wobble during edit, false to disable wobble
     *         effect
     */
    public native boolean wobble() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.wobble;
    }-*/;

    public native void setWobble(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.wobble = value;
    }-*/;

    @Override
    public void add(View view) {
        if (view instanceof DashboardItem) {
            this.addItem((DashboardItem) view);
            this.layoutData();
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ait.toolkit.titanium.mobile.client.ui.Editable#startEditing()
     */
    @Override
    public native void startEditing() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.startEditing();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.ait.toolkit.titanium.mobile.client.ui.Editable#stopEditing()
     */
    @Override
    public native void stopEditing() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.stopEditing();
    }-*/;

    public native CallbackRegistration addCommitHandler(CommitHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.CommitEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.CommitHandler::onCommit(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/CommitEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.CommitEvent::COMMIT;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    public native CallbackRegistration addDeleteHandler(DeleteHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.DeleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DeleteHandler::onDelete(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/DeleteEvent;)(eventObjet);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.DeleteEvent::DELETE;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    // TODO move events to new API

    public native void addMoveHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.dashboard.DashboardEvent::MOVE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    public native void addDragEndHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						'dragEnd',
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    public native void addDragStartHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						'dragStart',
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    public native void addDragFinishHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						'dragend',
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    public native void addEditHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						'edit',
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    public native void addPageEndHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						'pagechanged',
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createDashboardView();
    }

    private void create(int row, int col) {
        jsObj = UI.createDashboardView(row, col);
    }

    public static DashboardView from(JsObject proxy) {
        return new DashboardView(proxy.getJsObj());
    }
}
