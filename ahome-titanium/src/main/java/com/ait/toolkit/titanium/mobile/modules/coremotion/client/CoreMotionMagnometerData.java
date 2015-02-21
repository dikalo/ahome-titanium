package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CoreMotionMagnometerData extends CoreMotionLogItem {

	protected CoreMotionMagnometerData(JavaScriptObject peer) {
		jsObj = peer;
	}

	public CoreMotionMagneticField getMagneticField() {
		return new CoreMotionMagneticField(
				JsoHelper
						.getAttributeAsJavaScriptObject(jsObj, "magneticField"));
	}
}
