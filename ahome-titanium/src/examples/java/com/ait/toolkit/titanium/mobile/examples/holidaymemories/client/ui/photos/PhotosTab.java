package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.photos;

import com.ait.toolkit.titanium.mobile.client.ui.Tab;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.utils.Assets;

public class PhotosTab extends Tab {

    private static final PhotosTab INSTANCE = new PhotosTab();

    public static PhotosTab get() {
        return INSTANCE;
    }

    private PhotosTab() {
        this.setTitle("Photos");
        this.setIcon(Assets.getImage("photos.png"));
        this.setWindow(PhotosView.get());
    }
}
