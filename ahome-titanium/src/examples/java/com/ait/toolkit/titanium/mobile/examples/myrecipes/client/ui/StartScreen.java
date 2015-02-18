package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui;

import com.ait.toolkit.titanium.mobile.client.core.events.ui.dialog.DialogClickEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.DialogClickHandler;
import com.ait.toolkit.titanium.mobile.client.platform.Platform;
import com.ait.toolkit.titanium.mobile.client.ui.OptionDialog;
import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.eventbus.EventBusUtil;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.JsonLoadStartEvent;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.XmlLoadStartEvent;

/**
 * Implements the start screen
 */
public class StartScreen extends Window {

    public static StartScreen get() {
        return INSTANCE;
    }

    private static final StartScreen INSTANCE = new StartScreen();

    private StartScreen() {
        this.setFullscreen(true);
        this.setBackgroundColor("#FFF");

    }

    public void display() {

        if (!Platform.get().isAndroid()) {
            this.add(LoadingIndicatior.get());
        }
        this.open();

        OptionDialog optionDialog = new OptionDialog();
        optionDialog.setTitle("Wich loading strategie do you want to use ? ");
        optionDialog.setOptions("XML", "JSON");
        optionDialog.addClickHandler(new DialogClickHandler() {
            @Override
            public void onClick(DialogClickEvent event) {
                int buttonIndex = event.getIndex();
                if (buttonIndex == 0) {
                    EventBusUtil.get().fireEvent(new XmlLoadStartEvent());
                } else if (buttonIndex == 1) {
                    EventBusUtil.get().fireEvent(new JsonLoadStartEvent());
                }
            }
        });
        optionDialog.setCancel(1);
        optionDialog.show();
    }
}
