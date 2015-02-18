package com.ait.toolkit.titanium.mobile.client;

/**
 * Console logging facilities.
 * <p>
 * The toplevel console support is intended to supplement Titanium.API and make it easier for developers to port existing javascript code (especially CommonJS modules) to Titanium.
 * <p>
 * Note that console does not currently implement the complete firebug specification. Our support is roughly equivalent to that offered by node.js's console.
 * 
 * @author Alain Ekambi
 * 
 */
public class Console {

	private Console() {

	}

	/**
	 * Log a message at the info level.
	 * <p>
	 * The message to log can either be a single argument, or any number of arguments, which will be converted to strings and then concatenated together with a space character.
	 * <p>
	 * Note that this method has different behavior from Titanium.API.log, which can take multiple arguments, but in doing so interprets the first argument as a custom log level.
	 * 
	 * @param o
	 */
	public static native void log(Object... args)/*-{
		console.log.apply(args);
	}-*/;

	/**
	 * Log a message at the warn level.
	 * <p>
	 * The message to log can either be a single argument, or any number of arguments, which will be converted to strings and then concatenated together with a space character.
	 * <p>
	 * Note that this method has different behavior from Titanium.API.log, which can take multiple arguments, but in doing so interprets the first argument as a custom log level.
	 * 
	 * @param o
	 */
	public static native void warn(Object... args)/*-{
		console.log.apply(args);
	}-*/;

	/**
	 * Log a message at the info level.
	 * <p>
	 * The message to log can either be a single argument, or any number of arguments, which will be converted to strings and then concatenated together with a space character.
	 * <p>
	 * Note that this method has different behavior from Titanium.API.log, which can take multiple arguments, but in doing so interprets the first argument as a custom log level.
	 * 
	 * @param o
	 */
	public static native void info(Object... args)/*-{
		console.info.apply(args);
	}-*/;

	/**
	 * Log a message at the error level.
	 * <p>
	 * The message to log can either be a single argument, or any number of arguments, which will be converted to strings and then concatenated together with a space character.
	 * <p>
	 * Note that this method has different behavior from Titanium.API.log, which can take multiple arguments, but in doing so interprets the first argument as a custom log level.
	 * 
	 * @param o
	 */
	public static native void error(Object... args)/*-{
		console.error.apply(args);
	}-*/;

	/**
	 * Log a message at the info debug.
	 * <p>
	 * The message to log can either be a single argument, or any number of arguments, which will be converted to strings and then concatenated together with a space character.
	 * <p>
	 * Note that this method has different behavior from Titanium.API.log, which can take multiple arguments, but in doing so interprets the first argument as a custom log level.
	 * 
	 * @param o
	 */
	public static native void debug(Object... args)/*-{
		console.debug.apply(args);
	}-*/;

}
