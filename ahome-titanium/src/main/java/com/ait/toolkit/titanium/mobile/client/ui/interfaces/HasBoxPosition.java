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

public interface HasBoxPosition {

    public void setBottom(double value);

    public void setBottom(String value);

    /**
     * @return A dictionary with properties x and y to indicate the center of
     *         the views position relative to the parent view
     */
    public Point getCenter();

    public void setCenter(Point value);

    public void setLeft(double value);

    public void setLeft(String value);

    /**
     * @return Property for the view left position. this position is relative to
     *         the view's parent. can be either a double value or a dimension
     *         string ie 'auto' (default).
     */
    public double getLeft();

    public void setRight(double value);

    public void setRight(String value);

    /**
     * @return Property for the view right position. this position is relative
     *         to the view's parent. can be either a double value or a dimension
     *         string ie 'auto' (default).
     */
    public double getRight();

    public void setTop(double value);

    public void setTop(String value);

    /**
     * @return Property for the view top position. this position is relative to
     *         the view's parent. can be either a double value or a dimension
     *         string ie 'auto' (default).
     */
    public double getTop();

    /**
     * @return Property for the view bottom position. this position is relative
     *         to the view's parent. can be either a double value or a dimension
     *         string ie 'auto' (default).
     */
    public double getBottom();

}