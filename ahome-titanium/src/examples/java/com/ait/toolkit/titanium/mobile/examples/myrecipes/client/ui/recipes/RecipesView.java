package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.recipes;

import com.ait.toolkit.titanium.mobile.client.ui.View;

/**
 * MainView of the loan calculator
 * 
 */
public class RecipesView extends View {

	private final static RecipesView INSTANCE = new RecipesView();

	public static RecipesView get() {
		return INSTANCE;
	}

	private RecipesView() {
		this.setLeft(0);
		this.setTop(0);
		this.setRight(0);
		this.setBottom(0);
		this.setBackgroundColor("#FFF");
		this.add(RecipesTable.get());
	}

}
