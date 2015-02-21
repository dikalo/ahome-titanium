package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CoreMotionGyroData extends CoreMotionLogItem {

	protected CoreMotionGyroData(JavaScriptObject peer) {
		jsObj = peer;
	}

	public CoreMotionRotationRate getRotationRate() {
		return new CoreMotionRotationRate(
				JsoHelper.getAttributeAsJavaScriptObject(jsObj, "rotationRate"));
	}
}
