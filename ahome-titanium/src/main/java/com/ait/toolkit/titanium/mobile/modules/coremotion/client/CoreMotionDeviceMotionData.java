package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CoreMotionDeviceMotionData extends JsObject {

	protected CoreMotionDeviceMotionData(JavaScriptObject peer) {
		jsObj = peer;
	}

	public CoreMotionAcceleration getGravity() {
		return new CoreMotionAcceleration(
				JsoHelper.getAttributeAsJavaScriptObject(jsObj, "gravity"));
	}

	public CoreMotionAttitude getAttitude() {
		return new CoreMotionAttitude(JsoHelper.getAttributeAsJavaScriptObject(
				jsObj, "attitude"));
	}

}
