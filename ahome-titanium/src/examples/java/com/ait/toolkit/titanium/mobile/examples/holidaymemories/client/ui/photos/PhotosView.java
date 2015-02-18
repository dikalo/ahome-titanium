package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.ui.photos;

import com.ait.toolkit.titanium.mobile.client.platform.Platform;
import com.ait.toolkit.titanium.mobile.client.ui.Button;
import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.utils.Assets;

public class PhotosView extends Window {

    private static final PhotosView INSTANCE = new PhotosView();
    private Button chooseButton;
    private Button saveButton;

    public static PhotosView get() {
        return INSTANCE;
    }

    private PhotosView() {
        this.setTitle("Photos");
        this.setBarColor("#000");
        this.add(PhotoDisplay.get());
        this.setBackgroundImage(Assets.getImage("background.png"));
        chooseButton = new Button("Choose");
        saveButton = new Button("Save Photo");
        saveButton.setZIndex(2);
        // set the right nav button to the choose button object
        // note that we are checking the osname and changing the button
        // location depending on if it is iphone/android
        if (Platform.get().isAndroid()) {
            chooseButton.setRight(20);
            chooseButton.setWidth(100);
            chooseButton.setTop(20);
            this.add(chooseButton);

            saveButton.setLeft(20);
            saveButton.setTop(20);
            saveButton.setWidth(100);
            this.add(saveButton);
        } else {
            this.setRightNavButton(chooseButton);
            this.setLeftNavButton(saveButton);
        }

    }

    public Button getChooseButton() {
        return chooseButton;
    }

    public Button getSaveButton() {
        return saveButton;
    }
}
