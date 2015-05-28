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
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.Color;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ListViewItemClickHandler;
import com.ait.toolkit.titanium.mobile.client.ui.fx.TableViewAnimation;
import com.google.gwt.core.client.JavaScriptObject;

public class ListView extends View {

    public ListView() {
        jsObj = UI.createListView( "", new ArrayList<String>() );
    }

    public ListView( String id ) {
        jsObj = UI.createListView( id, new ArrayList<String>() );
    }

    public ListView( String id, List<String> classes ) {
        jsObj = UI.createListView( id, classes );
    }

    public ListView( ListViewTemplate template ) {
        jsObj = creetePeer( template.getJsObj() );
    }

    public ListView( ListSection... sections ) {
        this();
        setSections( sections );
    }

    public ListView( String id, ListSection... sections ) {
        this( id );
        setSections( sections );
    }

    public ListView( String id, List<String> classes, ListSection... sections ) {
        this( id, classes );
        setSections( sections );
    }

    /**
     * Adds a new section the the underlying section collection But does not
     * draw it. Call <code>layout()</code> to actually add the section to the
     * listview
     */
    public void addSection( ListSection section ) {
        this.appendSection( section );
    }

    public native boolean getCanScroll() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.canScroll;
    }-*/;

    public native void setCanScroll( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.canScroll = value;
    }-*/;

    /**
     * Sets the default template for list data items that do not specify the
     * template property.
     * <p>
     * Can be set to any of the built-in templates or those defined in the
     * templates property.
     * <p>
     * Can be changed dynamically.
     * <p>
     * Default: Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT
     * 
     * @param value
     */
    public native void setDefaultItemTemplate( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.defaultItemTemplate = value;
    }-*/;

    public native void setDefaultItemTemplate( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.defaultItemTemplate = value;
    }-*/;

    public native void setFooterTitle( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.footerTitle = value;
    }-*/;

    public native String getFooterTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.footerTitle;
    }-*/;

    /**
     * List view footer as a view that will be rendered instead of a label.
     */
    public native View getFooterView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return @com.ait.toolkit.titanium.mobile.client.ui.View::from(Lcom/ait/toolkit/core/client/JsObject;)(jso.footerView);
    }-*/;

    /**
     * List view footer as a view that will be rendered instead of a label.
     */

    public native void setFooterView( View view ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.footerView = view.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    public native void setHeaderTitle( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerTitle = value;
    }-*/;

    public native String getHeaderTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.headerTitle;
    }-*/;

    /**
     * List view header as a view that will be rendered instead of a label.
     */
    public native void setHeaderView( View view ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerView = view.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * List view header as a view that will be rendered instead of a label.
     */
    public native View getHeaderView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return @com.ait.toolkit.titanium.mobile.client.ui.View::from(Lcom/ait/toolkit/core/client/JsObject;)(jso.headerView);
    }-*/;

    public native void setMarker( ListViewMarkerProps markerProps ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setMarker(markerProps.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setScrollIndicatorStyle( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollIndicatorStyle = value;
    }-*/;

    public native int getScrollIndictorStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.scrollIndicatorStyle;
    }-*/;

    public native int getSectionCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.sectionCount;
    }-*/;

    public native List<ListSection> getSections() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.sections;
		return @com.ait.toolkit.titanium.mobile.client.ui.ListSection::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setSections( List<ListSection> values ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.sections = @com.ait.toolkit.titanium.mobile.client.ui.ListSection::fromList(Ljava/util/List;)(values);
    }-*/;

    public void setSections( ListSection... sections ) {
        this.setSections( Arrays.asList( sections ) );
    }

    /**
     * Separator line color between rows.
     */
    public native String getSeparatorColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.separatorColor;
    }-*/;

    /**
     * Separator line color between rows.
     */
    public native void setSeparatorColor( String color ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.separatorColor = color;
    }-*/;

    /**
     * Separator line color between rows.
     */
    public void setSeparatorColor( Color color ) {
        setSeparatorColor( color.getValue() );
    }

    /**
     * Separator style constant.
     *
     * This API can be assigned the following constants:
     *   Titanium.UI.iPhone.ListViewSeparatorStyle.NONE
     *   Titanium.UI.iPhone.ListViewSeparatorStyle.SINGLE_LINE
     */
    public native int getSeparatorStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.separatorStyle;
    }-*/;

    /**
     * Separator style constant.
     *
     * This API can be assigned the following constants:
     *   Titanium.UI.iPhone.ListViewSeparatorStyle.NONE
     *   Titanium.UI.iPhone.ListViewSeparatorStyle.SINGLE_LINE
     */
    public native void setSeparatorStyle( int style ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.separatorStyle = style;
    }-*/;

    public native void setWillScrollOnStatusTap( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.willScrollOnStatusTap = value;
    }-*/;

    public native boolean willScrollOnStatusTap() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.willScrollOnStatusTap;
    }-*/;

    public native void appendSection( List<ListSection> items ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListSection::fromList(Ljava/util/List;)(items);
		jso.appendSection(obj);
    }-*/;

    public native void appendSection( List<ListSection> items, TableViewAnimation animation ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.ListSection::fromList(Ljava/util/List;)(items);
		jso.appendSection(obj,
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void appendSection( ListSection... dataItems ) {
        appendSection( Arrays.asList( dataItems ) );
    }

    public native void deleteSectionAt( int index ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteSectionAt(index);
    }-*/;

    public native void deleteSectionAt( int index, int count, TableViewAnimation animation ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteSectionAt(index,
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native int getStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getStyle();
    }-*/;

    /**
     * Style of the list view.
     * Style should always be set before setting the sections on list view.
     *
     * This API can be assigned the following constants:
     *  Titanium.UI.iPhone.ListViewStyle.GROUPED
     *  Titanium.UI.iPhone.ListViewStyle.PLAIN
     */
    public native void setStyle( int style ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.style = style;
    }-*/;

    public native void replaceSectionAt( int index, ListSection section ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.replaceSectionAt(index,
				section.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void replaceSectionAt( int index, ListSection section, TableViewAnimation animation ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.replaceSectionAt(index,
				section.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void scrollToItem( int sectionIndex, int itemIndex ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollToItem(sectionIndex, itemIndex);
    }-*/;

    public native void scrollToItem( int sectionIndex, int itemIndex, TableViewAnimation animation ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollToItem(sectionIndex, itemIndex,
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void selectItem( int sectionIndex, int itemIndex ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selectItem(sectionIndex, itemIndex);
    }-*/;

    public native CallbackRegistration addListViewItemClickHandler( ListViewItemClickHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ListViewItemClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ListViewItemClickHandler::onListViewItemClick(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/ListViewItemClickEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ListViewItemClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    public ListView( JavaScriptObject obj ) {
        super( obj );
    }

    public static ListView from( JsObject proxy ) {
        return new ListView( proxy.getJsObj() );
    }

    private native JavaScriptObject creetePeer( JavaScriptObject template )/*-{
		return Ti.UI.createListView(template);
    }-*/;

}
