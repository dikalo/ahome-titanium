package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CoreMotionRotationMatrix extends JsObject {

	CoreMotionRotationMatrix(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public double getM11M13() {
		return JsoHelper.getAttributeAsDouble(jsObj, "m11-m13");
	}

}
