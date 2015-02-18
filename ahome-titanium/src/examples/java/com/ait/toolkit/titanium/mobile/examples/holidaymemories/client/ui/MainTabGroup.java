package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui;

import com.ait.toolkit.titanium.mobile.client.ui.TabGroup;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.audio.AudioTab;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.photos.PhotosTab;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.videos.VideosTab;

public class MainTabGroup extends TabGroup {

	private static final MainTabGroup INSTANCE = new MainTabGroup();

	public static MainTabGroup get() {
		return INSTANCE;
	}

	private MainTabGroup() {
		this.addTab(PhotosTab.get());
		this.addTab(VideosTab.get());
		this.addTab(AudioTab.get());
	}
}
