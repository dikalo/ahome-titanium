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
package com.ait.toolkit.titanium.mobile.linker;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.LinkerOrder;
import com.google.gwt.dev.util.DefaultTextOutput;

/**
 * Linker for Titanium4j Mobile. This linker removes unnecessary GWT stuff to
 * make the generated JS work inside Titanium. Use this linker when working on a
 * hybrid titanium project.
 */
@LinkerOrder(LinkerOrder.Order.POST)
public class TiMobilePostLinker extends TiMobileBaseLinker {

	@Override
	public String getDescription() {
		return "Titanium4j Post Linker";
	}

	@Override
	public ArtifactSet link(TreeLogger logger, LinkerContext context,
			ArtifactSet artifacts) throws UnableToCompleteException {
		ArtifactSet toReturn = super.link(logger, context, artifacts);

		String scriptUrl = context.getModuleName() + ".nocache.js?"
				+ System.currentTimeMillis();

		out = new DefaultTextOutput(true);

		String scriptTag = "<script  type='text/javascript' language='javascript' src='"
				+ scriptUrl;
		scriptTag += "'></script>";

		out.print("<!doctype html>");
		out.newline();
		out.print("<html>");
		out.newline();
		out.print("<head>");
		out.newline();
		out.print("<meta http-equiv='content-type' content='text/html; charset=UTF-8'>");
		out.newline();
		out.print("<title>Titanium4j - Hybrid App</title>");
		out.newline();
		out.print(scriptTag);
		out.newline();
		out.print("</head>");
		out.newline();
		out.print("<body>");
		out.newline();
		out.print("</body>");
		out.newline();
		out.print("</html>");

		toReturn.add(emitString(logger, out.toString(), context.getModuleName()
				+ ".html"));

		return toReturn;
	}

}
