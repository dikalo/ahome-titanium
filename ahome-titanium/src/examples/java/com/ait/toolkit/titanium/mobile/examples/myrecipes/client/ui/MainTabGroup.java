package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui;

import com.ait.toolkit.titanium.mobile.client.ui.TabGroup;
import com.ait.toolkit.titanium.mobile.client.ui.UI;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.favorites.FavoritesTab;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.recipes.RecipesTab;

public class MainTabGroup extends TabGroup {

    private static final MainTabGroup INSTANCE = new MainTabGroup();

    public static MainTabGroup get() {
        return INSTANCE;
    }

    private MainTabGroup() {
        UI.get().setBackgroundColor("#000");
        this.addTab(RecipesTab.get());
        this.addTab(FavoritesTab.get());
    }

    public void display() {
        this.open();
    }

}
