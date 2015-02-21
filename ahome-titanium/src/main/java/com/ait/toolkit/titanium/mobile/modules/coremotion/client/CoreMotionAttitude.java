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
