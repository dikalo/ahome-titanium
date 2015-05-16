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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.Unit;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.scrollview.ScrollViewEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ScaleHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ScrollViewDragEndHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ScrollViewDragStartHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ScrollViewScrollHandler;
import com.ait.toolkit.titanium.mobile.client.platform.Platform;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A scroll view is used to create a scrollable region of content. views added
 * to the scroll view will be scrolled based on the content size of the scroll
 * view. In android, scroll views can only scroll in one direction, either
 * vertical or horizontal, but not both at the same time. see the
 * {@link com.ait.toolkit.titanium.mobile.client.ui.ScrollView.getScrollType}
 * property
 * 
 * <p>
 * If your scrollable region fits within the size of the content area the scroll
 * view will not scroll.
 */
public class ScrollView extends View {

    public static enum ScrollType {
        HORIZONTAL( "horizontal" ), VERTICAL( "vertical" );

        private final String value;

        private ScrollType( String value ) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        static ScrollType scrollFromValue( String value ) {
            ScrollType ret = HORIZONTAL;
            for( ScrollType s : ScrollType.values() ) {
                if( s.getValue().equals( value ) ) {
                    ret = s;
                    break;
                }
            }
            return ret;
        }
    }

    private double androidXOffset = 0;
    private double androidYOffset = 0;

    /**
     * On the Android platform, the contentOffset object is undefined.
     */
    private void doAndroidWorkaround() {
        if( Platform.get().isAndroid() ) {
            setContentOffset( new Point( 0, 0 ) );
            addScrollHandler( new ScrollViewScrollHandler() {

                @Override
                public void onScroll( ScrollViewEvent event ) {
                    androidXOffset = event.getX();
                    androidYOffset = event.getY();
                }
            } );
        }
    }

    public ScrollView() {
        createPeer();
        doAndroidWorkaround();
    }

    public ScrollView( String id ) {
        this( id, new ArrayList<String>() );
        doAndroidWorkaround();
    }

    public ScrollView( String id, List<String> classes ) {
        jsObj = UI.createScrollView( id, classes );
        doAndroidWorkaround();
    }

    ScrollView( JavaScriptObject proxy ) {
        jsObj = proxy;
        doAndroidWorkaround();
    }

    /**
     * @return (iPhone only) boolean to indicate if the scroll view can cancel
     *         subview touches in order to scroll instead. default of true
     */
    public native boolean canCancelEvents() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.canCancelEvents;
    }-*/;

    public native void setCanCancelEvents( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.canCancelEvents = value;
    }-*/;

    /**
     * @return The height of the scrollable area
     */
    public native <T> T getContentHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.contentHeight;
    }-*/;

    public void setContentHeight( double value ) {
        UI.get().setSizePropertyAsDouble( jsObj, "contentHeight", value );
    }

    public void setContentHeight( String value ) {
        UI.get().setSizePropertyAsString( jsObj, "contentHeight", value );
    }

    public void setContentHeight( String value, Unit unit ) {
        UI.get().setSizePropertyAsString( jsObj, "contentHeight", value, unit );
    }

    /**
     * @return An object (with x and y properties) to indicate the offset of the
     *         content area
     */
    public Point getContentOffset() {
        // Workaround on the undefined content offset on Android
        if( Platform.get().isAndroid() ) {
            return new Point( androidXOffset, androidYOffset );
        } else {
            return _getContentOffset();
        }
    }

    private native Point _getContentOffset() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.contentOffset;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setContentOffset( Point value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.contentOffset = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The width of the scrollable area
     */
    public native <T> T getContentWidth() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.contentWidth;
    }-*/;

    public void setContentWidth( double value ) {
        UI.get().setSizePropertyAsDouble( jsObj, "contentWidth", value );
    }

    public void setContentWidth( String value ) {
        UI.get().setSizePropertyAsString( jsObj, "contentWidth", value );
    }

    public void setContentWidth( String value, Unit unit ) {
        UI.get().setSizePropertyAsString( jsObj, "contentWidth", value, unit );
    }

    /**
     * @return Disable view bouncing. ios only. Available only on iOs
     */
    public native boolean disableBounce() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.disableBounce;
    }-*/;

    public native void setDisableBounce( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.disableBounce = value;
    }-*/;

    /**
     * @return Boolean to control the horizontal bounce during scrolling
     *         Available only on iOs
     */
    public native boolean horizontalBounce() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.horizontalBounce;
    }-*/;

    public native void setHorizontalBounce( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.horizontalBounce = value;
    }-*/;

    /**
     * @return The maximum scale of the content Available only on iOs
     */
    public native double getMaxZoomScale() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.maxZoomScale;
    }-*/;

    public native void setMaxZoomScale( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.maxZoomScale = value;
    }-*/;

    /**
     * @return The minimum scale of the content Available only on iOs
     */
    public native double getMinZoomScale() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.minZoomScale;
    }-*/;

    public native void setMinZoomScale( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.minZoomScale = value;
    }-*/;

    /**
     * @return (android only) the type of scrollview: "vertical" or "horizontal"
     * 
     * @platforms android
     */
    public native String _getScrollType() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.scrollType;
    }-*/;

    public native void _setScrollType( String value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollType = value;
    }-*/;

    public ScrollType getScrollType() {
        return ScrollType.scrollFromValue( _getScrollType() );
    }

    public void setScrollType( ScrollType type ) {
        _setScrollType( type.getValue() );
    }

    /**
     * @return Boolean to indicate whether the horizontal scroll indicator is
     *         visible
     */
    public native boolean showHorizontalScrollIndicator() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.showHorizontalScrollIndicator;
    }-*/;

    public native void setShowHorizontalScrollIndicator( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showHorizontalScrollIndicator = value;
    }-*/;

    /**
     * @return Boolean to indicate whether the vertical scroll indicator is
     *         visible
     */
    public native boolean showVerticalScrollIndicator() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.showVerticalScrollIndicator;
    }-*/;

    public native void setShowVerticalScrollIndicator( boolean value ) /*-{
		jso.showVerticalScrollIndicator = value;
    }-*/;

    /**
     * @return Boolean to control the vertical bounce during scrolling Available
     *         only on iOs
     */
    public native boolean verticalBounce() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.verticalBounce;
    }-*/;

    public native void setVerticalBounce( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.verticalBounce = value;
    }-*/;

    /**
     * @return Set the zoom scale for the current content area Available only on
     *         iOs
     */
    public native double getZoomScale() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.zoomScale;
    }-*/;

    public native void setZoomScale( double value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.zoomScale = value;
    }-*/;

    /**
     * Scrollto a particular point
     * 
     * @param x
     *            the x point within the view
     * @param y
     *            the y point within the view
     */
    public native void scrollTo( double x, double y ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollTo(x, y);
    }-*/;

    public void scrollTo( Point point ) {
        scrollTo( point.getX(), point.getY() );
    }

    /**
     * Add a scroll event handler to this scroll view
     * 
     * @param handler
     *            The handler
     * @return The callback registration object
     */
    public native CallbackRegistration addScrollHandler(
            ScrollViewScrollHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.scrollview.ScrollViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ScrollViewScrollHandler::onScroll(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/scrollview/ScrollViewEvent;)(eventObject);
		};

		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.scrollview.ScrollViewEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;

    public native CallbackRegistration addScaleHandler( ScaleHandler handler )/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ScaleEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ScaleHandler::onScale(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/ScaleEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.ScaleEvent::SCALE;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;

    public native CallbackRegistration addDragStartHandler(
            ScrollViewDragStartHandler handler ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.scrollview.ScrollViewDragStartEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ScrollViewDragStartHandler::onDragStart(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/scrollview/ScrollViewDragStartEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.scrollview.ScrollViewDragStartEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;

    public native CallbackRegistration addDragEndHandler(
            ScrollViewDragEndHandler handler ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.ait.toolkit.titanium.mobile.client.core.events.ui.scrollview.ScrollViewDragEndEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ScrollViewDragEndHandler::onDragEnd(Lcom/ait/toolkit/titanium/mobile/client/core/events/ui/scrollview/ScrollViewDragEndEvent;)(eventObject);
		};
		var name = @com.ait.toolkit.titanium.mobile.client.core.events.ui.scrollview.ScrollViewDragEndEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.core.handlers.CallbackRegistration::new(Lcom/ait/toolkit/titanium/mobile/client/core/events/EventDispatcher;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createScrollView( "", new ArrayList<String>() );
    }

    public static ScrollView from( JsObject proxy ) {
        return new ScrollView( proxy.getJsObj() );
    }

    /**
     * Set whether the scrolling is enabled on this scroll view
     * 
     * @param value
     *            If true then scrolling is enabled
     */
    public native void setScrollingEnabled( boolean value ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.scrollingEnabled = value;
    }-*/;

    /**
     * Get whether scrolling is enabled on this scroll view
     * 
     * @return True if scrolling is enabled
     */
    public native boolean isScrollingEnabled() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var ret = jso.scrollingEnabled;
		if (ret == undefined) {
			ret = true;
		}
		return ret;
    }-*/;
}
