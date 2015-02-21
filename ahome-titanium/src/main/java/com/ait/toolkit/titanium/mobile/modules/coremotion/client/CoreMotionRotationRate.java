package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CoreMotionRotationRate extends JsObject {

	CoreMotionRotationRate(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public double getX() {
		return JsoHelper.getAttributeAsDouble(jsObj, "x");
	}

	public double getY() {
		return JsoHelper.getAttributeAsDouble(jsObj, "y");
	}

	public double getZ() {
		return JsoHelper.getAttributeAsDouble(jsObj, "z");
	}

}
