/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.core;

import com.google.gwt.core.client.EntryPoint;

/**
 * EntryPoint for Titanium hybrid applications. This class should be extends
 * when using an HTML5 based UI inside Ti4j
 */
public abstract class TiHybridEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        if (TiUtils.isWebMode()) {
            TiUtils.bindTi();
            onWebLoad();
        } else {
            onNativeLoad();
        }
    }

    /**
     * called from the native part of the mobile application
     */
    public abstract void onNativeLoad();

    /**
     * called from the web part of the mobile application
     */
    public abstract void onWebLoad();

}
