package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.videos;

import com.ait.toolkit.titanium.mobile.client.ui.Tab;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.utils.Assets;

public class VideosTab extends Tab {

    private static final VideosTab INSTANCE = new VideosTab();

    public static VideosTab get() {
        return INSTANCE;
    }

    private VideosTab() {
        this.setTitle("Video");
        this.setIcon(Assets.getImage("movies.png"));
        this.setWindow(VideosView.get());
    }
}
