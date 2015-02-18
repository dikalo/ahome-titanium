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

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;


public class OpenWindowParams extends JsObject {
	
	public OpenWindowParams() {
		jsObj = JavaScriptObject.createObject();
	}
	
	/**
	 * Unset the activity enter animation value
	 */
	public native final void setActivityEnterAnimation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.activityEnterAnimation = false;
	}-*/;
	
	/** 
	 * Android only
	 * Set the activity enter animation value to a number based on a anim.R file 
	 * @param val	Enter animation resource id
	 */
	public native final void setActivityEnterAnimation(int val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.activityEnterAnimation = val;
	}-*/;
	
	
	/**
	 * Android only
	 * Set the activity enter animation, based on a text lookup on the Android.R.anim object
	 * Refer to com.ait.toolkit.titanium.mobile.client.ui.android.Android for strings
	 * @param val
	 */
	public native final void setActivityEnterAnimation(String val) /*-{
		this.@com.ait.toolkit.titanium.mobile.client.ui.OpenWindowParams::setActivityEnterAnimation(Ljava/lang/String;Z)(val,true);
	}-*/;
	

	/**
	 * Android only
	 * Set the activity enter animation, based on a text lookup on the Android.R.anim object
	 * Refer to com.ait.toolkit.titanium.mobile.client.ui.android.Android for strings
	 * @param val		Lookup value
	 * @param system	Whether to look on Android.R or App.Android.R
	 */
	public native final void setActivityEnterAnimation(String val, boolean system) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var anim;
		if (system) {
			anim = Titanium.Android.R.anim[system];
		} else {
			anim = Titanium.App.Android.R.anim[system];
		}
		jso.activityEnterAnimation = anim;
	}-*/;
	
	/**
	 * Unset the activity enter animation value
	 */
	public native final void setActivityExitAnimation() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.activityExitAnimation;
	}-*/;

	/**
	 * Android only
	 * Set the activity exit animation, based on a text lookup on the Android.R.anim object
	 * Refer to com.ait.toolkit.titanium.mobile.client.ui.android.Android for strings
	 * @param val
	 */
	public native final void setActivityExitAnimation(String val) /*-{
		this.@com.ait.toolkit.titanium.mobile.client.ui.OpenWindowParams::setActivityExitAnimation(Ljava/lang/String;Z)(val,true);
	}-*/;

	/**
	 * Android only
	 * Set the activity exit animation, based on a text lookup on the Android.R.anim object
	 * Refer to com.ait.toolkit.titanium.mobile.client.ui.android.Android for strings
	 * @param val		Lookup value
	 * @param system	Whether to look on Android.R or App.Android.R
	 */
	public native final void setActivityExitAnimation(String val, boolean system) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var anim;
		if (system) {
			anim = Titanium.Android.R.anim[system];
		} else {
			anim = Titanium.App.Android.R.anim[system];
		}
		jso.activityExitAnimation = anim;
	}-*/;
	
	public native final void setAnimated(boolean val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.animated = true;
	}-*/; 
	
	public native final void setBottom() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.bottom;
	}-*/;
	
	public native final void setBottom(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.bottom = val;
	}-*/;
	
	public native final void setFullscreen() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.fullscreen;
	}-*/;
	
	public native final void setFullscreen(boolean val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fullscreen = val;
	}-*/;
	
	public native final void setHeight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.height;
	}-*/;
	
	public native final void setHeight(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.height = val;
	}-*/;
	
	public native final void setHeight(String val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.height = val;
	}-*/;
	
	public native final void setLeft() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.left;
	}-*/;
	
	public native final void setLeft(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.left = val;
	}-*/;
	
	public native final void setLeft(String val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.left = val;
	}-*/;
	
	public native final void setModal() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.modal;
	}-*/;
	
	public native final void setModal(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.modal = val;
	}-*/;
	
	public native final void setModal(String val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.modal = val;
	}-*/;
	
	public native final void setModalStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.modalStyle;
	}-*/;
	
	public native final void setModalStyle(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.modalStyle = val;
	}-*/;
	
	public native final void setModalTransitionStyle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.modalTransitionStyle;
	}-*/;
	
	public native final void setModalTransitionStyle(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.modalTransitionStyle = val;
	}-*/;
	
	public native final void setNavBarHidden() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.navBarHidden;
	}-*/;
	
	public native final void setNavBarHidden(boolean val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.navBarHidden = val;
	}-*/; 
	
	public native final void setRight() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.right;
	}-*/;
	
	public native final void setRight(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.right = val;
	}-*/;
	
	public native final void setRight(String val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.right = val;
	}-*/;
	
	public native final void setTop() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.top;
	}-*/;
	
	public native final void setTop(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.top = val;
	}-*/;
	
	public native final void setTop(String val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.top = val;
	}-*/;
	
	public native final void setTransition() /*-{
		delete this.transition;
	}-*/;
	
	public native final void setTransition(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.transition = val;
	}-*/;
	
	public native final void setWidth() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		delete jso.width;
	}-*/;
	
	public native final void setWidth(double val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.width = val;
	}-*/;
	
	public native final void setWidth(String val) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.width = val;
	}-*/;

}
