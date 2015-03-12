package com.ait.toolkit.titanium.mobile.modules.touchid.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class DeviceCanAuthenticateResult extends JsObject {

	private boolean success;
	private String error;
	private int code;

	public DeviceCanAuthenticateResult(boolean success, String error, int code) {
		super();
		this.success = success;
		this.error = error;
		this.code = code;
	}

	protected DeviceCanAuthenticateResult(JavaScriptObject peer) {
		jsObj = peer;
		this.success = JsoHelper.getAttributeAsBoolean(peer, "success");
		this.error = JsoHelper.getAttribute(jsObj, "error");
		this.code = JsoHelper.getAttributeAsInt(jsObj, "code");
	}

	public boolean isSuccess() {
		return success;
	}

	public String getError() {
		return error;
	}

	public int getCode() {
		return code;
	}

}
