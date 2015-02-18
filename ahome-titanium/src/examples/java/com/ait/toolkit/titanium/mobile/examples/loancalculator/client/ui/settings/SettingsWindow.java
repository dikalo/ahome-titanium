package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.settings;

import com.ait.toolkit.titanium.mobile.client.Titanium;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler;
import com.ait.toolkit.titanium.mobile.client.ui.Window;

/**
 * Implements the MainWindow of the application
 */
public class SettingsWindow extends Window {

    private static final SettingsWindow INSTANCE = new SettingsWindow();

    public static SettingsWindow get() {
        return INSTANCE;
    }

    private SettingsWindow() {

        this.setWidth(320);
        this.setHeight(480);
        this.setTop(0);
        this.setLeft(0);
        this.setTitle("Settings");
        this.setBarImage("assets/navbar.png");
        this.setBackgroundImage("assets/background.png");
        this.add(SettingsView.get());
        this.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Titanium.alert("Hello World");

            }
        });

    }
}
