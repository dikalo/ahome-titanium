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

import java.util.Set;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.AbstractLinker;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.CompilationResult;
import com.google.gwt.core.ext.linker.LinkerOrder;
import com.google.gwt.dev.About;
import com.google.gwt.dev.util.DefaultTextOutput;

/**
 * Linker for Titanium4j Mobile. This linker removes unnecessary GWT stuff to
 * make the generated JS work inside Titanium. Use this linker when working on a
 * titanium only project.
 */
@LinkerOrder(LinkerOrder.Order.POST)
public class TiMobilePostLinker extends AbstractLinker {

	// private final String APP_COMPILATION_FILE_NAME =
	// "applicationCompileDateTime.txt";

	@Override
	public String getDescription() {
		return "Ahome-Titanium  Mobile Primary Linker";
	}

	public ArtifactSet link(TreeLogger logger, LinkerContext context,
			ArtifactSet artifacts) throws UnableToCompleteException {

		ArtifactSet toReturn = new ArtifactSet(artifacts);
		DefaultTextOutput out = new DefaultTextOutput(true);
		long compilationTime = System.currentTimeMillis();
		out.print("exports.start = function(){");
		out.newline();

		// get compilation result
		Set<CompilationResult> results = artifacts
				.find(CompilationResult.class);
		if (results.size() == 0) {
			logger.log(TreeLogger.WARN, "Requested 0 permutations");
			return toReturn;
		}

		CompilationResult result = results.iterator().next();

		// get the generated javascript
		String[] javaScript = result.getJavaScript();
		out.print("var $wnd;var $doc;");
		out.print("var $moduleName, $moduleBase;");
		out.newline();
		out.print("if(typeof(window) != 'undefined'){ $wnd = window;  $doc = $wnd.document; }");
		out.newline();
		out.print("var $gwt_version = \"" + About.getGwtVersionNum() + "\";");
		out.newlineOpt();
		out.print(javaScript[0]);
		out.newline();
		out.print("var $stats = function(){};");
		out.newline();
		out.print("var $sessionId = function(){};");
		out.newline();
		out.print("var navigator = {};");
		out.newline();
		out.print("navigator.userAgent = 'timobile';");
		out.newline();
		out.print("$strongName = '" + result.getStrongName() + "';");
		out.newline();
		out.print("$ti4jCompilationDate = " + compilationTime + ";");
		out.newline();
		out.print("gwtOnLoad(null,'" + context.getModuleName() + "',null);");
		out.newline();
		out.print("};");
		out.newline();

		// toReturn.add(emitString(logger, out.toString(),
		// context.getModuleName() + ".js"));
		toReturn.add(emitString(logger, out.toString(), "ti4j.js"));

		// toReturn.add(emitString(logger, Long.toString(compilationTime),
		// APP_COMPILATION_FILE_NAME));

		return toReturn;
	}

}
