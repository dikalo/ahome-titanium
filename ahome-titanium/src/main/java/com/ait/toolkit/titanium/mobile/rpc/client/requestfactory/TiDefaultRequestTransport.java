/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

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
package com.ait.toolkit.titanium.mobile.rpc.client.requestfactory;

import static com.google.gwt.user.client.rpc.RpcRequestBuilder.STRONG_NAME_HEADER;

import com.ait.toolkit.titanium.mobile.client.platform.Platform;
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.RequestBuilder;
import com.google.web.bindery.requestfactory.gwt.client.DefaultRequestTransport;
import com.google.web.bindery.requestfactory.shared.RequestFactory;

/**
 * RequestTransport implementation to use with Titanium4j Mobile. This class
 * overrides the 'pagerul' header and sets the entry point of the internal
 * RequestBuilder to 'http://127.0.0.1:8888/' for iOS and
 * 'http://10.0.2.2:8888/' for Android. <br/>
 * <p>
 * You should extends this class and override the getHost method.
 * 
 */
public class TiDefaultRequestTransport extends DefaultRequestTransport {

	/**
	 * convenient method to create an instance of
	 * TiMobileDefaultRequestTransport
	 * 
	 * @return an instance of TiMobileDefaultRequestTransport
	 */
	public static TiDefaultRequestTransport create() {
		return new TiDefaultRequestTransport();
	}

	/**
	 * Override to change the headers sent in the HTTP request.
	 * 
	 * @param builder
	 *            a {@link RequestBuilder} instance
	 */
	protected void configureRequestBuilder(RequestBuilder builder) {
		builder.setHeader("Content-Type", RequestFactory.JSON_CONTENT_TYPE_UTF8);
		builder.setHeader("pageurl", getHost());
		builder.setHeader(STRONG_NAME_HEADER, GWT.getPermutationStrongName());
	}

	/**
	 * Constructs a {@link RequestBuilder} using the {@link RequestBuilder#POST}
	 * method sent to the URL returned from {@link #getRequestUrl()}.
	 * 
	 * @return a {@link RequestBuilder} instance
	 */
	protected RequestBuilder createRequestBuilder() {
		return new RequestBuilder(RequestBuilder.POST, getHost() + URL);
	}

	/**
	 * Returns the host from where the request is made.
	 * 
	 * @return
	 */
	protected String getHost() {
		String host = "http://127.0.0.1:8888/";
		if (Platform.get().isAndroid()) {
			host = "http://10.0.2.2:8888/";
		}
		return host;
	}

}
