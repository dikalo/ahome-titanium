package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.videos;

import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.utils.Assets;

public class VideosView extends Window {

    private static final VideosView INSTANCE = new VideosView();

    public static VideosView get() {
        return INSTANCE;
    }

    private VideosView() {
        this.setTitle("Video");
        this.setBarColor("#000");
        this.setBackgroundImage(Assets.getImage("background.png"));
    }
}
