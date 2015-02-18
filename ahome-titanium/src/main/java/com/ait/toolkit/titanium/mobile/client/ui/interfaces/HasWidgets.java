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

import java.util.Iterator;

import com.ait.toolkit.titanium.mobile.client.ui.IsWidget;
import com.ait.toolkit.titanium.mobile.client.ui.View;

public interface HasWidgets extends Iterable<View> {

    /**
     * Extends this interface with convenience methods to handle
     * {@link IsWidget}.
     */
    interface ForIsWidget extends HasWidgets {
        void add(IsWidget w);

        boolean remove(IsWidget w);
    }

    /**
     * Add a child to the view hierarchy
     * 
     * @param view
     *            the view to add to this views hierarchy
     */
    public void add(View view);

    /**
     * Remove a previously add view from the view hierarchy
     * 
     * @param view
     *            the view to remove from this views hierarchy
     */
    public void remove(View view);

    /**
     * Removes all children
     */
    public void clear();

    public Iterator<View> iterator();

}