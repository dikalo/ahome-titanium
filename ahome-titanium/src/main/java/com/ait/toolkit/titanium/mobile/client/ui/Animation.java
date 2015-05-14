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
import java.util.List;

import com.ait.toolkit.core.client.Color;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.AnimationCompleteHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.AnimationStartHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The animation object is used for specifying lower-level animation properties
 * and more low-level control of events during an animation.
 */
public class Animation extends EventDispatcher {

    public Animation() {
        this( "", new ArrayList<String>() );
    }

    public Animation( String id ) {
        this( id, new ArrayList<String>() );
    }

    public Animation( String id, List<String> classes ) {
        jsObj = UI.createAnimation( id, classes );
    }

    private Animation( JavaScriptObject obj ) {
        jsObj = obj;
    }

    /**
     * @return The property specifies if the animation should be replayed in
     *         reverse upon completion
     */
    public native boolean isAutoReverse() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.autoreverse;
    }-*/;

    public native void setAutoReverse( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.autoreverse = value;
    }-*/;

    /**
     * @return Value of the backgroundcolor property to change during animation
     */
    public native String getBackgroundColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.backgroundColor;
    }-*/;

    public native void setBackgroundColor( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.backgroundColor = value;
    }-*/;

    public void setBackgroundColor( Color color ) {
        setBackgroundColor( color.getValue() );
    }

    /**
     * @return Value of the bottom property to change during animation
     */
    public native double getBottom() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.bottom;
    }-*/;

    public native void setBottom( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.bottom = value;
    }-*/;

    /**
     * @return Value of the center property to change during animation
     */
    public native Object getCenter() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.center;
    }-*/;

    public native void setCenter( Object value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.center = value;
    }-*/;

    /**
     * @return Value of the color property to change during animation
     */
    public native String getColor() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.color;
    }-*/;

    public native void setColor( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.color = value;
    }-*/;

    public void setColor( Color color ) {
        setColor( color.getValue() );
    }

    /**
     * @return The curve of the animation
     */
    public native int getCurve() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.curve;
    }-*/;

    public native void setCurve( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.curve = value;
    }-*/;

    /**
     * @return The duration of time in milliseconds before starting the
     *         animation
     */
    public native double getDelay() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.delay;
    }-*/;

    public native void setDelay( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.delay = value;
    }-*/;

    /**
     * @return The duration of time in milliseconds to perform the animation
     */
    public native double getDuration() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.duration;
    }-*/;

    public native void setDuration( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.duration = value;
    }-*/;

    /**
     * @return Value of the height property to change during animation
     */
    public native double getHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.height;
    }-*/;

    public void setHeight( double value ) {
        setHeight( "" + value );
    }

    public native void setHeight( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.height = value;
    }-*/;

    /**
     * @return Value of the left property to change during animation
     */
    public native double getLeft() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.left;
    }-*/;

    public native void setLeft( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.left = value;
    }-*/;

    public native void setLeft( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.left = value;
    }-*/;

    /**
     * @return Value of the opacity property to change during animation
     */
    public native double getOpacity() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.opacity;
    }-*/;

    public native void setOpacity( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.opacity = value;
    }-*/;

    /**
     * @return Value of the opaque property to change during animation
     */
    public native boolean isOpaque() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.opaque;
    }-*/;

    public native void setOpaque( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.opaque = value;
    }-*/;

    /**
     * @return The number of times the animation should be performed
     */
    public native int getRepeat() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.repeat;
    }-*/;

    public native void setRepeat( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.repeat = value;
    }-*/;

    /**
     * @return Value of the right property to change during animation
     */
    public native double getRight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.right;
    }-*/;

    public native void setRight( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.right = value;
    }-*/;

    public native void setRight( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.right = value;
    }-*/;

    /**
     * @return Value of the top property to change during animation
     */
    public native double getTop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.top;
    }-*/;

    public native void setTop( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.top = value;
    }-*/;

    public native void setTop( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.top = value;
    }-*/;

    /**
     * @return Value of the transform property to change during animation
     */
    public native Object getTransform() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.transform;
    }-*/;

    public native void setTransform( Object value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.transform = value;
    }-*/;

    /**
     * @return During a transition animation, jso is the constant to the type of
     *         transition to use
     */
    public native int getTransition() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.transition;
    }-*/;

    public native void setTransition( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.transition = value;
    }-*/;

    /**
     * @return Value of the visible property to change during animation
     */
    public native boolean isVisible() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.visible;
    }-*/;

    public native void setVisible( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.visible = value;
    }-*/;

    /**
     * @return Value of the width property to change during animation
     */
    public native double getWidth() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.width;
    }-*/;

    public native void setWidth( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.width = value;
    }-*/;

    public native void setWidth( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.width = value;
    }-*/;

    /**
     * @return Value of the zindex property to change during animation
     */
    public native int getZIndex() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.zIndex;
    }-*/;

    public native void setZIndex( int value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.zIndex = value;
    }-*/;

    public native void addCompleteHandler( AnimationCompleteHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.CompleteEvent::COMPLETE,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.CompleteEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.AnimationCompleteHandler::onComplete(Lcom/ait/toolkit/titanium/mobile/client/core/events/CompleteEvent;)(eventObject);
						});
    }-*/;

    public native void addStartHandler( AnimationStartHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.addEventListener(
						@com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::START,
						function(e) {
							var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.UIEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.AnimationStartHandler::onStart(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/UIEvent;)(eventObject);
						});
    }-*/;

    public static Animation from( JsObject proxy ) {
        return new Animation( proxy.getJsObj() );
    }

}
