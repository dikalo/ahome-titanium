package com.ait.toolkit.titanium.mobile.examples.loancalculator.client;

import com.ait.toolkit.titanium.mobile.client.core.TiEntryPoint;
import com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.MainTabGroup;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class LoanCalculator extends TiEntryPoint {

	@Override
	public void onStart() {
		MainTabGroup.get();
	}

}