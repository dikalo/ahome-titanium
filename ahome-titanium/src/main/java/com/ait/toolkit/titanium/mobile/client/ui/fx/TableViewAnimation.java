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
package com.ait.toolkit.titanium.mobile.client.ui.fx;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.JsObject;

/**
 * A simple object for specifying the animation properties to use when inserting
 * or deleting rows, or scrolling the table.
 * <p>
 * These properties are only used on iOS. Not all properties apply to all
 * methods.
 * <p>
 * animationStyle does not apply to the scrollToTop or scrollToIndex methods.
 * <p>
 * positon only applies to the scrollToIndex method.
 */
public class TableViewAnimation extends JsObject {

    public TableViewAnimation() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Whether this table change should be animated. Ignored if any
     * animationStyle value is specified.
     * <p>
     * Default: true
     */
    public native void setAnimated(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.animated = value;
    }-*/;

    /**
     * 
     * Type of animation to use for row insertions and deletions. One of the
     * animation style constants defined in
     * Titanium.UI.iPhone.RowAnimationStyle.
     * <p>
     * Default: If animated is true but no animationStyle is specified, the
     * style defaults to FADE.
     */
    public native void setAnimationStyle(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.animationStyle = value;
    }-*/;

    /**
     * Specifies what position to scroll the selected row to. One of the
     * position constants from Titanium.UI.iPhone.TableViewScrollPosition.
     * <p>
     * Default: Titanium.UI.iPhone.TableViewScrollPosition.NONE
     */
    public native void setPosition(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.position = value;
    }-*/;

}
