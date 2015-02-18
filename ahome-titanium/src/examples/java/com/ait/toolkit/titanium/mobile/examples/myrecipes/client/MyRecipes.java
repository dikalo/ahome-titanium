package com.ait.toolkit.titanium.mobile.examples.myrecipes.client;

import com.ait.toolkit.titanium.mobile.client.core.TiEntryPoint;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.controller.AppController;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyRecipes extends TiEntryPoint {
    @Override
    public void onStart() {
        AppController.get().startApp();
    }
}