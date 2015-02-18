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
package com.ait.toolkit.titanium.mobile.client.ui.interfaces;

public interface HasBackground extends HasBackgroundPosition {

    /**
     * @return The background color of the view
     */
    public String getBackgroundColor();

    /**
     * @return The disabled background color of the view. (android) Available on
     *         Android only
     */
    public String getBackgroundDisabledColor();

    public void setBackgroundDisabledColor(String value);

    /**
     * @return The disabled background image url of the view. (android)
     *         Available on Android only
     */
    public String getBackgroundDisabledImage();

    public void setBackgroundDisabledImage(String value);

    /**
     * @return The focused background color of the view. focusable must be true
     *         for normal views. (android)
     */
    public String getBackgroundFocusedColor();

    public void setBackgroundFocusedColor(String value);

    /**
     * @return The focused background image url of the view. focusable must be
     *         true for normal views. (android) Available on Android only
     */
    public String getBackgroundFocusedImage();

    public void setBackgroundFocusedImage(String value);

    /**
     * @return A background gradient for the view with the properties:
     *         type,startpoint
     *         ,endpoint,startradius,endradius,backfillstart,backfillend,colors.
     *         TODO: implements BackgroundGradient Object
     */
    public Object getBackgroundGradient();

    public void setBackgroundGradient(Object value);

    /**
     * @return The background image url of the view
     */
    public String getBackgroundImage();

    public void setBackgroundImage(String value);

    /**
     * @return The selected background color of the view. focusable must be true
     *         for normal views. (android) Available on Android only
     */
    public String getBackgroundSelectedColor();

    public void setBackgroundSelectedColor(String value);

    /**
     * @return The selected background image url of the view. focusable must be
     *         true for normal views. (android) Available on Android only
     */
    public String getBackgroundSelectedImage();

    public void setBackgroundSelectedImage(String value);

}