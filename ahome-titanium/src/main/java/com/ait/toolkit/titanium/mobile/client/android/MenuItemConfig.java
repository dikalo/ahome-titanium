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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.ui.View;

public class MenuItemConfig extends JsObject {

	public MenuItemConfig() {
		jsObj = JsoHelper.createObject();
	}

	public final native void setItemId(int value) /*-{
		var jso = jso.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.itemId = value;
	}-*/;

	public final native void setGroupId(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.groupId = value;
	}-*/;

	public final native void setTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.title = value;
	}-*/;

	public final native void setOrder(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.order = value;
	}-*/;

	public final native void setActionView(View value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.actionView = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public final native void setCheckable(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.checkable = value;
	}-*/;

	public final native void setChecked(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.checked = value;
	}-*/;

	public final native void setEnabled(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.enabled = value;
	}-*/;

	public final native void setIcon(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.icon = value;
	}-*/;

	public final native void setIcon(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.icon = value;
	}-*/;

	public final native void setShowsAsAction(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showAsAction = value;
	}-*/;

	public final native void setTitleCondensed(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.titleCondensed = value;
	}-*/;

}
