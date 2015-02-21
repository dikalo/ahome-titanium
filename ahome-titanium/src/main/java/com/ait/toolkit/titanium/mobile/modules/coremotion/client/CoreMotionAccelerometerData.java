package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CoreMotionAccelerometerData extends CoreMotionLogItem {

	protected CoreMotionAccelerometerData(JavaScriptObject peer) {
		jsObj = peer;
	}

	public CoreMotionAcceleration getAcceleration() {
		return new CoreMotionAcceleration(
				JsoHelper.getAttributeAsJavaScriptObject(jsObj, "acceleration"));
	}
}
