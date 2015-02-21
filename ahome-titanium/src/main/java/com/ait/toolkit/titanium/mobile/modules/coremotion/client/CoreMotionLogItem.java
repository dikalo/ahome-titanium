package com.ait.toolkit.titanium.mobile.modules.coremotion.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CoreMotionLogItem extends JsObject {

	protected CoreMotionLogItem() {

	}

	protected CoreMotionLogItem(JavaScriptObject peer) {
		jsObj = peer;
	}

	public double getTimeStamp() {
		return JsoHelper.getAttributeAsDouble(jsObj, "timestamp");
	}
}
