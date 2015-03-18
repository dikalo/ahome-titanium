package com.ait.toolkit.titanium.mobile.linker;

import java.util.Set;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.AbstractLinker;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.CompilationResult;
import com.google.gwt.dev.About;
import com.google.gwt.dev.util.DefaultTextOutput;

public abstract class TiMobileBaseLinker extends AbstractLinker {

	protected DefaultTextOutput out;

	public ArtifactSet link(TreeLogger logger, LinkerContext context,
			ArtifactSet artifacts) throws UnableToCompleteException {

		ArtifactSet toReturn = new ArtifactSet(artifacts);
		out = new DefaultTextOutput(true);
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
		out.print("if(typeof(window)!='undefined'){$wnd=window;$doc=$wnd.document;}");
		out.newline();
		out.print("if(typeof(navigator)=='undefined'){navigator={};navigator.userAgent='timobile';$doc={};$doc.documentMode=''; }");
		out.newline();
		out.print("var $gwt_version = \"" + About.getGwtVersionNum() + "\";");
		out.newlineOpt();
		out.print(javaScript[0]);
		out.newline();
		out.print("var $stats = function(){};");
		out.newline();
		out.print("var $sessionId = function(){};");
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
