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

public interface HasBorder {

    /**
     * @return The border color of the view
     */
    public String getBorderColor();

    public void setBorderColor(String value);

    /**
     * @return The border radius of the view
     */
    public <T> T getBorderRadius();

    public void setBorderRadius(double value);

    public void setBorderRadius(String value);

    public void setBorderRadius(String value, Unit unit);

    /**
     * @return The border width of the view
     */
    public <T> T getBorderWidth();

    public void setBorderWidth(double value);

    public void setBorderWidth(String value);

    public void setBorderWidth(String value, Unit unit);

}