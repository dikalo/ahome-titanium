package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.favorites;

import com.ait.toolkit.titanium.mobile.client.ui.View;

/**
 * MainView of the loan calculator
 * 
 */
public class FavoritesView extends View {

	private final static FavoritesView INSTANCE = new FavoritesView();

	public static FavoritesView get() {
		return INSTANCE;
	}

	private FavoritesView() {
		this.setLeft(0);
		this.setTop(0);
		this.setRight(0);
		this.setBottom(0);
		this.setBackgroundColor("#FFF");
		this.add(FavoritesTable.get());
	}

}
