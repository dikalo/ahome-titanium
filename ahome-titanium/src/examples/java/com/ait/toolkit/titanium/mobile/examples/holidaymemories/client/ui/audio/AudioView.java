package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.audio;

import com.ait.toolkit.titanium.mobile.client.media.Media;
import com.ait.toolkit.titanium.mobile.client.ui.Button;
import com.ait.toolkit.titanium.mobile.client.ui.Label;
import com.ait.toolkit.titanium.mobile.client.ui.Switch;
import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.ait.toolkit.titanium.mobile.client.ui.style.Position;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.utils.Assets;

public class AudioView extends Window {

	private static final AudioView INSTANCE = new AudioView();

	public static AudioView get() {
		return INSTANCE;
	}

	private Label label;
	private Label lineType;
	private Label volume;
	private Label switchLabel;
	private Switch switcher;
	private Button playRecordingButton;
	private Button startRecordingButton;

	private AudioView() {
		this.setTitle("Audio");
		this.setBarColor("#000");
		this.setBackgroundImage(Assets.getImage("background.png"));

		label = new Label("");
		label.setTop(150);
		label.setColor("#999");
		label.setTextAlign(Position.CENTER);
		label.setWidth(250);
		label.setHeight("auto");
		this.add(label);

		lineType = new Label("audio line type : " + getLineTypeString());
		lineType.setBottom(15);
		lineType.setColor("#999");
		lineType.setTextAlign(Position.CENTER);
		lineType.setWidth(250);
		lineType.setHeight("auto");
		this.add(lineType);

		volume = new Label("Volume : " + Media.get().getVolume());
		volume.setBottom(50);
		volume.setColor("#999");
		volume.setTextAlign(Position.CENTER);
		volume.setWidth(250);
		volume.setHeight("auto");
		this.add(volume);

		switchLabel = new Label("Hi-fidelity");
		switchLabel.setBottom(115);
		switchLabel.setColor("#999");
		switchLabel.setTextAlign(Position.CENTER);
		switchLabel.setWidth(250);
		switchLabel.setHeight("auto");
		this.add(switchLabel);

		switcher = new Switch();
		switcher.setValue(false);
		switcher.setBottom(80);
		this.add(switcher);

		playRecordingButton = new Button("Playback Recording");
		playRecordingButton.setWidth(200);
		playRecordingButton.setHeight(40);
		playRecordingButton.setTop(80);
		this.add(playRecordingButton);

		startRecordingButton = new Button("Start Recording");
		startRecordingButton.setWidth(200);
		startRecordingButton.setHeight(40);
		startRecordingButton.setTop(20);
		this.add(startRecordingButton);
	}

	public String getLineTypeString() {
		int type = Media.get().getAudioLineType();
		if (type == Media.AUDIO_HEADSET_INOUT) {
			return "headset";
		} else if (type == Media.AUDIO_RECEIVER_AND_MIC) {
			return "receiver/mic";
		} else if (type == Media.AUDIO_RECEIVER_AND_MIC) {
			return "receiver/mic";
		} else if (type == Media.AUDIO_HEADPHONES) {
			return "headphones";
		} else if (type == Media.AUDIO_LINEOUT) {
			return "lineout";
		} else if (type == Media.AUDIO_SPEAKER) {
			return "speaker";
		} else if (type == Media.AUDIO_MICROPHONE) {
			return "microphone";
		} else if (type == Media.AUDIO_MUTED) {
			return "silence switch on";
		} else if (type == Media.AUDIO_UNAVAILABLE) {
			return "unavailable";
		} else if (type == Media.AUDIO_UNKNOWN) {
			return "unknown";
		}
		return "UNKNOW";
	}

	public Label getLabel() {
		return label;
	}

	public Label getVolume() {
		return volume;
	}

	public Label getSwitchLabel() {
		return switchLabel;
	}

	public Switch getSwitcher() {
		return switcher;
	}

	public Button getPlayRecordingButton() {
		return playRecordingButton;
	}

	public Button getStartRecordingButton() {
		return startRecordingButton;
	}

	public Label getLineType() {
		return lineType;
	}
}
