package com.ait.toolkit.titanium.mobile.examples.holidaymemories.client.utils;

import com.ait.toolkit.titanium.mobile.client.platform.Platform;

public class Assets {

    private Assets() {

    }

    public static String getImage(String imageName) {
        String prefix = "";
        if (Platform.get().isAndroid()) {
            prefix = "holiday/";
        } else {
            prefix = "/holiday/";
        }
        return prefix + imageName;
    }
}
