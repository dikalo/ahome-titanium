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
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowClickHandler;
import com.ait.toolkit.titanium.mobile.client.ui.interfaces.HasTitle;
import com.ait.toolkit.titanium.mobile.client.ui.style.Font;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A tableview row object created by the method
 * {@link com.ait.toolkit.titanium.mobile.client.ui.UI.createTableviewRow}.
 * <p>
 * Make sure you set the tableClass on each row instance if using more than one
 * type of row layout. You can use the same value for each instance of a row
 * where the layout is the same - even if the value of the elements inside the
 * row have different values. For example, if the text is the only thing
 * different between two cells but the layout is the same, both row instances
 * should have the same value for tableClass.
 * 
 * You can listen for table row events on all rows by adding an event listener
 * to the table view instance. Events automatically propagate to parent views.
 */
public class TableViewRow extends View implements HasTitle {

    public TableViewRow() {
        createPeer();
    }

    TableViewRow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * A succint label associated with the table row for the device's
     * accessibility service.
     */
    public native String getAccessibilityLabel() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.accessibilityLabel;
    }-*/;

    /**
     * A succint label associated with the table row for the device's
     * accessibility service.
     */
    public native void setAccessibilityLabel(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.accessibilityLabel = value;
    }-*/;

    /**
     * @return The class name of the table. each table view cell must have a
     *         unique class name if the cell layout is different. however, use
     *         the same name for rows that have the same structural layout (even
     *         if the content is different) to provide maximum rendering
     *         performance.
     */
    public native String getClassName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.className;
    }-*/;

    public native void setClassName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.className = value;
    }-*/;

    /**
     * @return Default color of the row when not selected
     */
    public native String getColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.color;
    }-*/;

    public native void setColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.color = value;
    }-*/;

    /**
     * Determines the rows' editable behavior, which allows them to be deleted
     * by the user when the table is in editing or moving mode.
     * <p>
     * If this property is not explicitly set, it will return undefined and the
     * row's editable behavior will be determined by its parent table's editable
     * property.
     * <p>
     * See the Titanium.UI.TableView description section for a full explanation
     * of the TableView's row editing and moving modes.
     */
    public native boolean isEditable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.editable;
    }-*/;

    /**
     * Determines the rows' editable behavior, which allows them to be deleted
     * by the user when the table is in editing or moving mode.
     * <p>
     * If this property is not explicitly set, it will return undefined and the
     * row's editable behavior will be determined by its parent table's editable
     * property.
     * <p>
     * See the Titanium.UI.TableView description section for a full explanation
     * of the TableView's row editing and moving modes.
     */
    public native void setEditable(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.editable = value;
    }-*/;

    /**
     * Font to use for the row title.
     * <p>
     * Default: System default font.
     */
    public native void setFont(Font value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.font = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Font to use for the row title.
     * <p>
     * Default: System default font.
     */
    public native Font getFont() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.font;
		return @com.ait.toolkit.titanium.mobile.client.ui.style.Font::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * @return Render a system provided check mark in the right image area of
     *         the row cell
     */
    public native boolean hasCheck() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasCheck;
    }-*/;

    public native void setHasCheck(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hasCheck = value;
    }-*/;

    /**
     * @return Render a system provided right arrow in the right image area of
     *         the row cell
     */
    public native boolean hasChild() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasChild;
    }-*/;

    public native void setHasChild(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hasChild = value;
    }-*/;

    /**
     * @return Render a system provided blue indicator icon in the right image
     *         area of the row cell
     */
    public native boolean hasDetail() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.hasDetail;
    }-*/;

    public native void setHasDetail(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.hasDetail = value;
    }-*/;

    /**
     * @return The indention level for the cell (defaults to 0)
     */
    public native int getIndentionLevel() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.indentionLevel;
    }-*/;

    public native void setIndentionLevel(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.indentionLevel = value;
    }-*/;

    /**
     * @return Image url to render in the left image area of the row cell
     */
    public native String getLeftImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.leftImage;
    }-*/;

    public native void setLeftImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.leftImage = value;
    }-*/;

    /**
     * @return Image url to render in the right image area of the row cell
     */
    public native String getRightImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rightImage;
    }-*/;

    public native void setRightImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rightImage = value;
    }-*/;

    /**
     * Determines the rows' moveable behavior, which allows them to be
     * re-ordered by the user when the table is in editing or moving mode.
     * <p>
     * If this property is not explicitly set, it will return undefined and the
     * row's moveable behavior will be determined by its parent table's moveable
     * property.
     * <p>
     * See the Titanium.UI.TableView description section for a full explanation
     * of the TableView's row editing and moving modes.
     */
    public native boolean isMoveable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.moveable;
    }-*/;

    /**
     * Determines the rows' moveable behavior, which allows them to be
     * re-ordered by the user when the table is in editing or moving mode.
     * <p>
     * If this property is not explicitly set, it will return undefined and the
     * row's moveable behavior will be determined by its parent table's moveable
     * property.
     * <p>
     * See the Titanium.UI.TableView description section for a full explanation
     * of the TableView's row editing and moving modes.
     */
    public native void setMoveable(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.moveable = value;
    }-*/;

    /**
     * @return The background color to render when the row cell is selected
     */
    public native String getSelectedBackgroundColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.selectedBackgroundColor;
    }-*/;

    public native void setSelectedBackgroundColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selectedBackgroundColor = value;
    }-*/;

    /**
     * @return The background image to render when the row cell is selected
     */
    public native String getSelectedBackgroundImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.selectedBackgroundImage;
    }-*/;

    public native void setSelectedBackgroundImage(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selectedBackgroundImage = value;
    }-*/;

    /**
     * @return Color of the row during selection
     */
    public native String getSelectedColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.selectedColor;
    }-*/;

    public native void setSelectedColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selectedColor = value;
    }-*/;

    /**
     * @return A selection style constant to control the selection color. for
     *         iphone, use the constants from com.ait.toolkit.titanium.mobile.client
     *         .ui.iphone.TableViewCellSelectionStyle
     */
    public native int getSelectionStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.selectionStyle;
    }-*/;

    public native void setSelectionStyle(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selectionStyle = value;
    }-*/;

    /**
     * @return The title cell value. do not specify if using views as children
     *         of the row
     */
    public native String getTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
    }-*/;

    public native CallbackRegistration addTableRowClickHandler(TableRowClickHandler handler)
    /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableRowClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowClickHandler::onTableRowClick(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableRowClickEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableRowClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    static JavaScriptObject fromList(List<TableViewRow> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (TableViewRow rule : values) {
            peers.push(rule.getJsObj());
        }
        return peers;
    }

    static List<TableViewRow> fromJsArray(JavaScriptObject obj) {
        List<TableViewRow> toReturn = new ArrayList<TableViewRow>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new TableViewRow(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

    @Override
    public void createPeer() {
        jsObj = UI.createTableViewRow();
    }

}
