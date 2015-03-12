/*
 Copyright (c) 2015 Ahomé Innovation Technologies. All rights reserved.

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
package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CoreMotionAttitude extends JsObject {

	public CoreMotionAttitude(JavaScriptObject peer) {
		jsObj = peer;
	}

	public double getPitch() {
		return JsoHelper.getAttributeAsDouble(jsObj, "pitch");
	}

	public double getYaw() {
		return JsoHelper.getAttributeAsDouble(jsObj, "yaw");
	}

	public double getRoll() {
		return JsoHelper.getAttributeAsDouble(jsObj, "roll");
	}

	public CoreMotionQuaternion getQuaternion() {
		return new CoreMotionQuaternion(
				JsoHelper.getAttributeAsJavaScriptObject(jsObj, "quaternion"));
	}

	public CoreMotionRotationMatrix getRotationMatrix() {
		return new CoreMotionRotationMatrix(
				JsoHelper.getAttributeAsJavaScriptObject(jsObj,
						"rotationmatrix"));
	}

	public native void multiplyByInverseOfAttitude()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.multiplyByInverseOfAttitude();
	}-*/;

}
