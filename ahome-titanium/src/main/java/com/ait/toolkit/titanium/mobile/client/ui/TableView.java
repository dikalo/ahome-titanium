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
import com.ait.toolkit.data.client.Bean;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowClickHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowDblClickHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowDeleteHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowDoubleTapHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewDragEndHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewDragStartHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewHandler;
import com.ait.toolkit.titanium.mobile.client.data.TableViewBaseModel;
import com.ait.toolkit.titanium.mobile.client.ui.android.SearchView;
import com.ait.toolkit.titanium.mobile.client.ui.fx.TableViewAnimation;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A table view allows you to create a scrollable table of content in a
 * list-based fashion.
 */
public class TableView extends View {

	private List<? extends TableViewBaseModel> data;
	private List<TableViewRow> rows;
	private List<TableViewSection> sections;

	public TableView() {
		createPeer();
		this.rows = new ArrayList<TableViewRow>();
		this.sections = new ArrayList<TableViewSection>();

	}

	public TableView(List<? extends TableViewBaseModel> data) {
		this();
		setDataFromModel(data);
	}

	public static TableView from(List<? extends Bean> beans) {
		List<TableViewBaseModel> data = new ArrayList<TableViewBaseModel>();
		for (Bean bean : beans) {
			data.add(new TableViewBaseModel(bean.getJsObj()));
		}
		return new TableView(data);
	}

	TableView(JavaScriptObject obj) {
		jsObj = obj;
	}

	/**
	 * Add a row to this TableView's row collection. The row is not yet added to
	 * the UI component. You to call <code>layout()</code> for the row to be
	 * physically added
	 * 
	 * 
	 * @param row
	 *            , the row to add
	 */
	public void addRow(TableViewRow row) {
		this.rows.add(row);
	}

	public void addSection(TableViewSection section) {
		this.sections.add(section);
	}

	public void layoutRows() {
		this.setData(rows);
	}

	public void layoutSections() {
		this.setSectionData(sections);
	}

	/**
	 * @return True if the rows can be selected
	 */
	public native boolean allowsSelection() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allowsSelection;
	}-*/;

	public native void setAllowsSelection(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.allowsSelection = value;
	}-*/;

	/**
	 * @return True if the rows can be selected while editing the table (ios
	 *         only) Available only on iOs
	 */
	public native boolean allowsSelectionDuringEditing() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.allowsSelectionDuringEditing;
	}-*/;

	public native void setAllowsSelectionDuringEditing(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.allowsSelectionDuringEditing = value;
	}-*/;

	/**
	 * @return The data array of objects to be used for the rows of the table
	 *         view
	 */
	public native List<TableViewRow> getDataAsTableViewRow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.data;
		return @com.ait.toolkit.titanium.mobile.client.ui.TableViewRow::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native List<TableViewSection> getDataAsTableViewSection() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.data;
		return @com.ait.toolkit.titanium.mobile.client.ui.TableViewSection::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public void setDataFromModel(List<? extends TableViewBaseModel> data) {
		this.data = data;
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (TableViewBaseModel model : data) {
			values.push(model.getJsObj());
		}
		_setData(values);
	}

	public void setData(List<? extends TableViewRow> rows) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (TableViewRow row : rows) {
			values.push(row.getJsObj());
		}
		_setData(values);
	}

	public void setData(List<? extends TableViewRow> rows,
			TableViewAnimation animation) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (TableViewRow row : rows) {
			values.push(row.getJsObj());
		}
		_setData(values, animation.getJsObj());
	}

	public void setSectionData(List<? extends TableViewSection> sections,
			TableViewAnimation animation) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (TableViewSection section : sections) {
			values.push(section.getJsObj());
		}
		_setData(values, animation.getJsObj());
	}

	public void setSectionData(List<? extends TableViewSection> sections) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (TableViewSection section : sections) {
			values.push(section.getJsObj());
		}
		_setData(values);
	}

	private native void _setData(Object value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.data = value;
	}-*/;

	private native void _setData(Object value, JavaScriptObject animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setData(value, animation);
	}-*/;

	/**
	 * @return Allow the table view to be editable (jso must be true for
	 *         swipe-to-delete) (ios only)
	 * 
	 */
	public native boolean isEditable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.editable;
	}-*/;

	public native void setEditable(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.editable = value;
	}-*/;

	/**
	 * @return Boolean to control the editing state of the table view (ios only)
	 *         Available only on iOs
	 */
	public native boolean isEditing() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.editing;
	}-*/;

	public native void setEditing(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.editing = value;
	}-*/;

	/**
	 * @return The filter attribute to be used when searching. jso property maps
	 *         to your data object or a property on the row object
	 */
	public native String getFilterAttribute() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.filterAttribute;
	}-*/;

	public native void setFilterAttribute(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.filterAttribute = value;
	}-*/;

	/**
	 * @return Boolean to indicate if the search should be case sensitive or
	 *         case insensitive (default)
	 */
	public native boolean isFilterCaseInsensitive() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.filterCaseInsensitive;
	}-*/;

	public native void setFilterCaseInsensitive(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.filterCaseInsensitive = value;
	}-*/;

	/**
	 * @return The table view footer title
	 */
	public native String getFooterTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.footerTitle;
	}-*/;

	public native void setFooterTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.footerTitle = value;
	}-*/;

	/**
	 * @return The table view footer as a view that will be rendered instead of
	 *         a label
	 */
	public native View getFooterView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.footerView;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setFooterView(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.footerView = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * @return The table view header title
	 */
	public native String getHeaderTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.headerTitle;
	}-*/;

	public native void setHeaderTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerTitle = value;
	}-*/;

	/**
	 * @return The table view header as a view that will be rendered instead of
	 *         a label
	 */
	public native View getHeaderView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.headerView;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setHeaderView(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerView = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * @return The table view header as a view that will be rendered instead of
	 *         a label
	 */
	public native View getHeaderPullView() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.headerPullView;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public native void setHeaderPullView(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.headerPullView = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * @return An array of objects (with title and index properties) to control
	 *         the table view index
	 */
	public native List<TableViewIndexEntry> getIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.index;
		return @com.ait.toolkit.titanium.mobile.client.ui.TableViewIndexEntry::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native void setIndex(List<TableViewIndexEntry> values) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.index = @com.ait.toolkit.titanium.mobile.client.ui.TableViewIndexEntry::fromList(Ljava/util/List;)(values);
	}-*/;

	public void setIndex(TableViewIndexEntry... values) {
		setIndex(Arrays.asList(values));
	}

	/**
	 * @return Max row height for table view rows
	 */
	public native double getMaxRowHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.maxRowHeight;
	}-*/;

	public native void setMaxRowHeight(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.maxRowHeight = value;
	}-*/;

	/**
	 * @return Min row height for table view rows
	 */
	public native double getMinRowHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.minRowHeight;
	}-*/;

	public native void setMinRowHeight(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.minRowHeight = value;
	}-*/;

	/**
	 * @return Boolean to control the moveable state of the table view (ios
	 *         only) Available only on iOs
	 */
	public native boolean isMoving() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.moving;
	}-*/;

	public native void setMoving(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.moving = value;
	}-*/;

	/**
	 * @return Default row height for table view rows
	 */
	public native double getRowHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.rowHeight;
	}-*/;

	public native void setRowHeight(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.rowHeight = value;
	}-*/;

	/**
	 * One of Titanium.UI.Android.OVER_SCROLL_ALWAYS,
	 * Titanium.UI.Android.OVER_SCROLL_IF_CONTENT_SCROLLS, or
	 * Titanium.UI.Android.OVER_SCROLL_NEVER.
	 * <p>
	 * Default: Titanium.UI.Android.OVER_SCROLL_ALWAYS
	 */
	public native int getOverScrollMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.overScrollMode;
	}-*/;

	/**
	 * One of Titanium.UI.Android.OVER_SCROLL_ALWAYS,
	 * Titanium.UI.Android.OVER_SCROLL_IF_CONTENT_SCROLLS, or
	 * Titanium.UI.Android.OVER_SCROLL_NEVER.
	 * <p>
	 * Default: Titanium.UI.Android.OVER_SCROLL_ALWAYS
	 */
	public native void setOverScrollMode(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.overScrollMode = value;
	}-*/;

	/**
	 * Style of the scrollbar, specified using one of the constants from
	 * Titanium.UI.iPhone.ScrollIndicatorStyle.
	 * <p>
	 * Default: Titanium.UI.iPhone.ScrollIndicatorStyle.DEFAULT
	 */
	public native int getScrollIndocatorStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.scrollIndicatorStyle;
	}-*/;

	/**
	 * Style of the scrollbar, specified using one of the constants from
	 * Titanium.UI.iPhone.ScrollIndicatorStyle.
	 * <p>
	 * Default: Titanium.UI.iPhone.ScrollIndicatorStyle.DEFAULT
	 */
	public native void setScrollIndocatorStyle(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollIndicatorStyle = value;
	}-*/;

	/**
	 * @return True (default) if tableview can be scrolled
	 */
	public native boolean isScrollable() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.scrollable;
	}-*/;

	public native void setScrollable(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollable = value;
	}-*/;

	/**
	 * @return The search field to use for the table view
	 */
	public native View getSearch() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.search;
		return @com.ait.toolkit.titanium.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native void setSearch(SearchBar value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.search = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public native void setSearch(SearchView value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.search = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	/**
	 * Determines whether the SearchBar or SearchView appears as part of the
	 * TableView.
	 * <p>
	 * Set to false if the search view will be displayed in the action bar.
	 * <p>
	 * Default: true
	 */
	public native boolean searchAsChild() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.searchAsChild;
	}-*/;

	/**
	 * Determines whether the SearchBar or SearchView appears as part of the
	 * TableView.
	 * <p>
	 * Set to false if the search view will be displayed in the action bar.
	 * <p>
	 * Default: true
	 */
	public native void setSearchAsChild(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.searchAsChild = value;
	}-*/;

	/**
	 * @return Boolean to control the visibility of the search field
	 */
	public native boolean isSearchHidden() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.searchHidden;
	}-*/;

	public native void setSearchHidden(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.searchHidden = value;
	}-*/;

	/**
	 * Number of sections in this table view.
	 */
	public native int getSectionCount() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.sectionCount;
	}-*/;

	/**
	 * @return The separator color color as a hex or named value
	 */
	public native String getSeparatorColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.separatorColor;
	}-*/;

	public native void setSeparatorColor(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.separatorColor = value;
	}-*/;

	/**
	 * @return The separator style constant. For iphone, com.emitrom.gwt4.ti.
	 *         .mobile.client.ui.iphone.TableViewSeparatorStyle
	 */
	public native int getSeparatorStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.separatorStyle;
	}-*/;

	public native void setSeparatorStyle(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.separatorStyle = value;
	}-*/;

	/**
	 * Sections of this table.
	 * <p>
	 * In Release 3.0, this property is read-only on Android.
	 * <p>
	 * Due to a known issue, TIMOB-12616, the sections property should not be
	 * used for adding sections on iOS.
	 */
	public native List<TableViewSection> getSections() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.sections;
		return @com.ait.toolkit.titanium.mobile.client.ui.TableViewSection::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Sections of this table.
	 * <p>
	 * In Release 3.0, this property is read-only on Android.
	 * <p>
	 * Due to a known issue, TIMOB-12616, the sections property should not be
	 * used for adding sections on iOS.
	 */
	public native void setSections(List<TableViewSection> values) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.sections = @com.ait.toolkit.titanium.mobile.client.ui.TableViewSection::fromList(Ljava/util/List;)(values);
	}-*/;

	public void setSection(TableViewSection... values) {
		setSections(Arrays.asList(values));
	}

	/**
	 * @return Whether tableview displays vertical scroll indicator (ios only)
	 *         Available only on iOs
	 */
	public native boolean showVerticalScrollIndicator() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.showVerticalScrollIndicator;
	}-*/;

	public native void setShowVerticalScrollIndicator(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showVerticalScrollIndicator = value;
	}-*/;

	/**
	 * @return The style of the table view. constant from
	 *         {@link com.ait.toolkit.titanium.mobile.client.ui.iphone.TableViewStyle}
	 *         Iphone only
	 */
	public native int getStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.style;
	}-*/;

	public native void setStyle(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.style = value;
	}-*/;

	public void appendRow(TableViewRow... rows) {
		appendRow(Arrays.asList(rows));
	}

	public void appendRow(TableViewAnimation animation, TableViewRow... rows) {
		appendRow(Arrays.asList(rows), animation);
	}

	/**
	 * Append a row to the table, optionally with animation
	 * 
	 * @param row
	 *            row to append
	 * @param properties
	 *            animation properties
	 */
	public native void appendRow(List<TableViewRow> rows) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.appendRow(@com.ait.toolkit.titanium.mobile.client.ui.TableViewRow::fromList(Ljava/util/List;)(rows));
	}-*/;

	/**
	 * Append a row to the table, optionally with animation
	 * 
	 * @param row
	 *            row to append
	 * @param animation
	 *            animation properties
	 */
	public native void appendRow(List<TableViewRow> rows,
			TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.appendRow(
						@com.ait.toolkit.titanium.mobile.client.ui.TableViewRow::fromList(Ljava/util/List;)(rows),
						animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public void appendSection(TableViewSection... sections) {
		appendSection(Arrays.asList(sections));
	}

	public void appendSection(TableViewAnimation animation,
			TableViewSection... sections) {
		appendSection(Arrays.asList(sections), animation);
	}

	/**
	 * Append a section to the table, optionally with animation
	 * 
	 * @param row
	 *            row to append
	 * @param properties
	 *            animation properties
	 */
	public native void appendSection(List<TableViewSection> sections) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.appendSection(@com.ait.toolkit.titanium.mobile.client.ui.TableViewSection::fromList(Ljava/util/List;)(sections));
	}-*/;

	/**
	 * Append a section to the table, optionally with animation
	 * 
	 * @param row
	 *            row to append
	 * @param animation
	 *            animation properties
	 */
	public native void appendSection(List<TableViewSection> sections,
			TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.appendSection(
						@com.ait.toolkit.titanium.mobile.client.ui.TableViewSection::fromList(Ljava/util/List;)(sections),
						animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Delete an existing row, optionally with animation
	 * 
	 * @param row
	 *            index of row to delete
	 * @param animation
	 *            animation properties
	 */
	public native void deleteRow(int row, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteRow(row,
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Delete an existing row, optionally with animation
	 * 
	 * @param row
	 *            index of row to delete
	 */
	public native void deleteRow(int row) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteRow(row);
	}-*/;

	public native void deleteSection(int section, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteSection(section,
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void deleteSection(int section) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deleteSection(section);
	}-*/;

	/**
	 * Programmatically deselect a row
	 * 
	 * @param row
	 *            row index to deselect
	 */
	public native void deselectRow(int row) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.deselectRow(row);
	}-*/;

	/**
	 * Insert a row before another row, optionally with animation
	 * 
	 * @param index
	 *            index
	 * @param row
	 *            row to insert
	 * @param animation
	 *            animation properties
	 */
	public native void insertRowAfter(int index, TableViewRow row,
			TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertRowAfter(index,
				row.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void insertRowAfter(int index, TableViewRow row) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertRowAfter(index,
				row.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Insert a row after another row, optionally with animation
	 * 
	 * @param index
	 *            index
	 * @param row
	 *            row to insert
	 * @param properties
	 *            animation properties
	 */
	public native void insertRowBefore(int index, TableViewRow row,
			TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertRowBefore(index,
				row.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void insertRowBefore(int index, TableViewRow row) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertRowBefore(index,
				row.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void insertSectionBefore(int index, TableViewSection section,
			TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertSectionBefore(index,
				section.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void insertSectionBefore(int index, TableViewSection section) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertSectionBefore(index,
				section.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void insertSectionAfter(int index, TableViewSection section,
			TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertSectionAfter(index,
				section.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void insertSectionAfter(int index, TableViewSection section) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.insertSectionAfter(index,
				section.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Scroll to a specific row index and ensure that that row is on screen
	 * 
	 * @param index
	 *            index
	 * @param animation
	 *            animation properties. 'position' property controls the
	 *            position constant to use for position (on iPhone, use
	 *            constants from
	 *            com.ait.toolkit.titanium.mobile.client.ui.iphone.
	 *            TableViewScrollPosition).
	 */
	public native void scrollToIndex(int index, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollToIndex(index,
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Scroll to a specific row index and ensure that that row is on screen
	 * 
	 * @param index
	 *            index
	 */
	public native void scrollToIndex(int index) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollToIndex(index);
	}-*/;

	/**
	 * Scroll the table to a specific top position where 0 is the topmost y
	 * position in the table view
	 * 
	 * @param top
	 *            y position
	 * @param animation
	 *            optional dictionary with the key `animated` (default, true) as
	 *            boolean to indicate if the scroll should be animated or
	 *            immediate
	 */
	public native void scrollToTop(double top, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollToTop(top,
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void scrollToTop(double top) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollToTop(top);
	}-*/;

	/**
	 * Programmatically select a row
	 * 
	 * @param row
	 *            row index to select
	 */
	public native void selectRow(int row) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.selectRow(row);
	}-*/;

	/**
	 * Sets this tableview's content insets.
	 * 
	 * A table view is essentially a scroll view that contains a set of static
	 * row views that represents the content. Thus, the setContentInsets method
	 * facilitates a margin, or inset, distance between the content and the
	 * container scroll view.
	 * 
	 * Typically used with the headerPullView property.
	 * 
	 * @iOs Only
	 */
	public native void setContentInsets(TableViewEdgeInsets value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.setContentInsets(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Sets this tableview's content insets.
	 * 
	 * A table view is essentially a scroll view that contains a set of static
	 * row views that represents the content. Thus, the setContentInsets method
	 * facilitates a margin, or inset, distance between the content and the
	 * container scroll view.
	 * 
	 * Typically used with the headerPullView property.
	 * 
	 * @iOs Only
	 */
	public native void setContentInsets(TableViewEdgeInsets value,
			boolean animate) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setContentInsets(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(), {
					animated : animate
				});
	}-*/;

	public native void setContentInsets(TableViewEdgeInsets value,
			boolean animate, int animationDuration) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setContentInsets(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(), {
					animated : animate,
					duration : animationDuration
				});
	}-*/;

	/**
	 * Sets this tableview's content insets.
	 * 
	 * A table view is essentially a scroll view that contains a set of static
	 * row views that represents the content. Thus, the setContentInsets method
	 * facilitates a margin, or inset, distance between the content and the
	 * container scroll view.
	 * 
	 * Typically used with the headerPullView property.
	 * 
	 * @iOs Only
	 */
	public native void setContentInsets(TableViewEdgeInsets value,
			Animation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setContentInsets(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Update an existing row, optionally with animation
	 * 
	 * @param row
	 *            row data to update
	 * @param animation
	 *            animation properties
	 */
	public native void updateRow(TableViewRow row, TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.updateRow(row.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void updateRow(TableViewRow row) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.updateRow(row.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void updateSection(TableViewSection section,
			TableViewAnimation animation) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.updateSection(
				section.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void updateSection(TableViewSection section) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.updateSection(section.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	@Deprecated
	public native CallbackRegistration addRowSelectionHandler(
			TableViewHandler handler)
	/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	/**
	 * Fired when a table row is clicked by the user. <p< There is a subtle
	 * difference between singletap and click events.
	 * <p>
	 * A singletap event is generated when the user taps the screen briefly
	 * without moving their finger. This gesture will also generate a click
	 * event.
	 * <p>
	 * However, a click event can also be generated when the user touches, moves
	 * their finger, and then removes it from the screen.
	 * <p>
	 * On Android, a click event can also be generated by a trackball click.
	 * 
	 * @param handler
	 * @return
	 */
	public native CallbackRegistration addTableRowClickHandler(
			TableRowClickHandler handler)
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

	/**
	 * Fired when the device detects a double click against the view.
	 */
	public native CallbackRegistration addTableRowDblClickHandler(
			TableRowDblClickHandler handler)
	/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableRowDblClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowDblClickHandler::onTableRowDblClick(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableRowDblClickEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableRowDblClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	public native CallbackRegistration addTableRowDeleteHandler(
			TableRowDeleteHandler handler)
	/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableRowDeleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowDeleteHandler::onTableRowDelete(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableRowDeleteEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableRowDeleteEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	public native CallbackRegistration addTableRowDoubleTapHandler(
			TableRowDoubleTapHandler handler)
	/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableRowDoubleTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableRowDoubleTapHandler::onTableRowDoubleTap(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableRowDoubleTapEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableRowDoubleTapEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	public native CallbackRegistration addTableViewDragEndHandler(
			TableViewDragEndHandler handler)
	/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewDragEndEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewDragEndHandler::onTableViewDragEnd(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableViewDragEndEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewDragEndEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	public native CallbackRegistration addTableViewDragStartHandler(
			TableViewDragStartHandler handler)
	/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewDragStartEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewDragStartHandler::onTableViewDragStart(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableViewDragStartEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewDragStartEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

	}-*/;

	@Deprecated
	public native void addDeleteHandler(TableViewHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::DELETE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						});
	}-*/;

	@Deprecated
	public native void addMoveHandler(TableViewHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::MOVE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						});
	}-*/;

	@Deprecated
	public native void addScrollHandler(TableViewHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::SCROLL,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						});
	}-*/;

	@Deprecated
	public native void addScrollEndHandler(TableViewHandler handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::SCROLL_END,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						});
	}-*/;

	// TODO Finish Events

	@Override
	public void createPeer() {
		jsObj = UI.createTableView();
	}

	@Override
	public void add(View view) {
		if (view instanceof TableViewRow) {
			TableViewRow toAdd = (TableViewRow) view;
			this.addRow(toAdd);
			this.layoutRows();
		} else if (view instanceof TableViewSection) {
			TableViewSection section = (TableViewSection) view;
			this.addSection(section);
			this.layoutSections();
		} else {
			// throw new
			// IllegalArgumentException("TableView can only take a TableViewRow or a TableViewSection as child");
			super.add(view);
		}
	}

	public static TableView from(JsObject obj) {
		return new TableView(obj.getJsObj());
	}

}
