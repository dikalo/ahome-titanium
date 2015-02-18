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

import com.ait.toolkit.titanium.mobile.client.core.Unit;

public interface HasBackgroundPosition {

    public void setBackgroundColor(String value);

    /**
     * @return End caps specify the portion of an image that should not be
     *         resized when an image is stretched. this technique is used to
     *         implement buttons and other resizable image-based interface
     *         elements. when a button with end caps is resized, the resizing
     *         occurs only in the middle of the button, in the region between
     *         the end caps. the end caps themselves keep their original size
     *         and appearance. this property specifies the size of the left end
     *         cap. the middle (stretchable) portion is assumed to be 1 pixel
     *         wide. the right end cap is therefore computed by adding the size
     *         of the left end cap and the middle portion together and then
     *         subtracting that value from the width of the image
     */
    public <T> T getBackgroundLeftCap();

    public void setBackgroundLeftCap(double value);

    public void setBackgroundLeftCap(String value);

    public void setBackgroundLeftCap(String value, Unit unit);

    /**
     * @return End caps specify the portion of an image that should not be
     *         resized when an image is stretched. this technique is used to
     *         implement buttons and other resizable image-based interface
     *         elements. when a button with end caps is resized, the resizing
     *         occurs only in the middle of the button, in the region between
     *         the end caps. the end caps themselves keep their original size
     *         and appearance. this property specifies the size of the top end
     *         cap. the middle (stretchable) portion is assumed to be 1 pixel
     *         wide. the bottom end cap is therefore computed by adding the size
     *         of the top end cap and the middle portion together and then
     *         subtracting that value from the height of the image
     */
    public <T> T getBackgroundTopCap();

    public void setBackgroundTopCap(double value);

    public void setBackgroundTopCap(String value);

    public void setBackgroundTopCap(String value, Unit unit);

    public <T> T getBackgroundRightCap();

    public void setBackgroundRightCap(double value);

    public void setBackgroundRightCap(String value);

    public void setBackgroundRightCap(String value, Unit unit);

    public <T> T getBackgroundBottomCap();

    public void setBackgroundBottomCap(double value);

    public void setBackgroundBottomCap(String value);

    public void setBackgroundBottomCap(String value, Unit unit);

}