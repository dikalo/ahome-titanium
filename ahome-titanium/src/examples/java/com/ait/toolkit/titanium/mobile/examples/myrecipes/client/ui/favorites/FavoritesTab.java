package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.favorites;

import com.ait.toolkit.titanium.mobile.client.ui.Tab;

public class FavoritesTab extends Tab {

    private static final FavoritesTab INSTANCE = new FavoritesTab();

    public static FavoritesTab get() {
        return INSTANCE;
    }

    private FavoritesTab() {
        this.setTitle("Favorites");
        this.setIcon("recipes/heart.png");
        this.setWindow(FavoritesWindow.get());
    }
}
