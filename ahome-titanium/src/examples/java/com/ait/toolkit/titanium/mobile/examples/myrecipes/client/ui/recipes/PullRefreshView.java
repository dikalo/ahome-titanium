package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.recipes;

import com.ait.toolkit.core.client.Color;
import com.ait.toolkit.titanium.mobile.client.ui.ActivityIndicator;
import com.ait.toolkit.titanium.mobile.client.ui.Label;
import com.ait.toolkit.titanium.mobile.client.ui.View;
import com.ait.toolkit.titanium.mobile.client.ui.style.Font;
import com.ait.toolkit.titanium.mobile.client.ui.style.FontWeight;
import com.ait.toolkit.titanium.mobile.client.ui.style.Position;
import com.ait.toolkit.titanium.mobile.client.ui.style.ShadowOffset;

/**
 * Implements the pullrefresh widget at the top of the recipe window
 */
public class PullRefreshView extends View {

	private static final PullRefreshView INSTANCE = new PullRefreshView();

	public static PullRefreshView get() {
		return INSTANCE;
	}

	private View arrowImage;
	private Label statusLabel;
	private ActivityIndicator activityIndicator;

	private PullRefreshView() {
		this.setWidth(320);
		this.setHeight(81);
		this.setBackgroundImage("recipes/header.png");

		arrowImage = new View();
		arrowImage.setBackgroundImage("recipes/arrow-down.png");
		arrowImage.setWidth(40);
		arrowImage.setHeight(40);
		arrowImage.setBottom(20);
		arrowImage.setLeft(20);
		this.add(arrowImage);

		statusLabel = new Label("Pull to refresh ...");
		statusLabel.setLeft(85);
		statusLabel.setWidth(200);
		statusLabel.setBottom(28);
		statusLabel.setHeight("auto");
		statusLabel.setColor(Color.BLACK);
		statusLabel.setTextAlign(Position.CENTER);
		statusLabel.setShadowColor("#999");
		statusLabel.setFont(new Font(20, FontWeight.BOLD));
		statusLabel.setShadowOffset(new ShadowOffset(0, 1));
		this.add(statusLabel);

		activityIndicator = new ActivityIndicator();
		activityIndicator.setLeft(20);
		activityIndicator.setBottom(20);
		activityIndicator.setWidth(40);
		activityIndicator.setHeight(40);
		this.add(activityIndicator);
	}

	public View getArrowImage() {
		return arrowImage;
	}

	public Label getStatusLabel() {
		return statusLabel;
	}

	public ActivityIndicator getActivityIndicator() {
		return activityIndicator;
	}
}
