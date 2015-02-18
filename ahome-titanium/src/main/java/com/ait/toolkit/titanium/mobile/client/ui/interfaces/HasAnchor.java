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

import com.ait.toolkit.titanium.mobile.client.ui.Point;

public interface HasAnchor extends HasBoxPosition {

    /**
     * @return A dictionary with properties x and y to indicate the anchor point
     *         value. anchor specifies the position by which animation should
     *         occur. center is 0.5, 0.5
     */
    public Point getAnchorPoint();

    public void setAnchorPoint(Point value);

    /**
     * @return Read-only object with x and y properties of where the view is
     *         during animation
     */
    public Point getAnimatedCenterPoint();

    public void setAnimatedCenterPoint(Point value);

}