package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.audio;

import com.ait.toolkit.titanium.mobile.client.ui.Tab;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.utils.Assets;

public class AudioTab extends Tab {

	private static final AudioTab INSTANCE = new AudioTab();

	public static AudioTab get() {
		return INSTANCE;
	}

	private AudioTab() {
		this.setTitle("Audio");
		this.setIcon(Assets.getImage("audio.png"));
		this.setWindow(AudioView.get());
	}

}
