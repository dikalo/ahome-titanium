package com.ait.toolkit.titanium.mobile.client.core;

/**
 * Base interface for implementing user interfaces in titanium4j. This interface
 * is usually used when creating hybrid applications. Users should create two
 * implementations of this interface and use GWT's deferred binding mechanism to
 * load the right class at runtime.
 */
public interface MobileUI {

	public void createUI();
}
