package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.favorites;

import com.ait.toolkit.titanium.mobile.client.ui.TableView;

/**
 * TableView for favorites
 */
public class FavoritesTable extends TableView {

    private static final FavoritesTable INSTANCE = new FavoritesTable();

    public static FavoritesTable get() {
        return INSTANCE;
    }

    private FavoritesTable() {

    }
}
