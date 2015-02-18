package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.recipes;

import com.ait.toolkit.titanium.mobile.client.ui.Tab;

public class RecipesTab extends Tab {

    private static final RecipesTab INSTANCE = new RecipesTab();

    public static RecipesTab get() {
        return INSTANCE;
    }

    private RecipesTab() {
        this.setTitle("Recipes");
        this.setIcon("recipes/fork-and-knife.png");
        this.setWindow(RecipesWindow.get());
    }
}
