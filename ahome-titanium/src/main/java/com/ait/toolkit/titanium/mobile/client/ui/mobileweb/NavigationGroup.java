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

package com.ait.toolkit.titanium.mobile.client.ui.mobileweb;

import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Navigation Group implements a specialized view that manages the navigation
 * of hierarchical content.
 * <p>
 * The navigation group is created with the method
 * Titanium.UI.MobileWeb.createNavigationGroup. The window property must be set
 * initially in the constructor when creating a navigation group. All navigation
 * groups must have a root window that cannot be removed.
 * 
 */
public class NavigationGroup extends View {

	public NavigationGroup(Window parentWindow) {
		create(parentWindow);
	}

	/**
	 * Closes a window and removes it from the navigation group.
	 * 
	 * @param window
	 *            , window to close
	 */
	public native void close(Window window)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.close(window.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * * Closes a window and removes it from the navigation group.
	 * 
	 * @param window
	 *            , window to close
	 * @param animateClosing
	 *            ,determine whether the window will be animated (default) while
	 *            being closed.
	 */
	public native void close(Window window, boolean animateClosing)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.close(window.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Open a window and removes it from the navigation group.
	 * 
	 * @param window
	 *            , window to close
	 */
	public native void open(Window window)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.open(window.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * * Open a window and removes it from the navigation group.
	 * 
	 * @param window
	 *            , window to close
	 * @param animateClosing
	 *            ,determine whether the window will be animated (default) while
	 *            being opened.
	 */
	public native void open(Window window, boolean animateClosing)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.open(window.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Gets the value of the navBarAtTop property.
	 */
	public native boolean isNavBarAtTop()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getNavBarAtTop();
	}-*/;

	/**
	 * Gets the value of the window property.
	 * 
	 * @return
	 */
	public native Window getWindow()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.getWindow();
		return @com.ait.toolkit.titanium.mobile.client.ui.Window::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Sets the value of the navBarAtTop property.
	 */
	public native boolean setNavBarAtTop(boolean value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.setNavBarAtTop(value);
	}-*/;

	@Override
	public void createPeer() {
		jsObj = createNavigationGroup();
	}

	private void create(Window parentWindow) {
		jsObj = createPeer(parentWindow.getJsObj());
	}

	private static native JavaScriptObject createNavigationGroup() /*-{
		return Titanium.UI.MobileWeb.createNavigationGroup();
	}-*/;

	private native JavaScriptObject createPeer(JavaScriptObject parentWindow)/*-{
		return Titanium.UI.MobileWeb.createNavigationGroup({
			window : parentWindow
		});
	}-*/;

}
