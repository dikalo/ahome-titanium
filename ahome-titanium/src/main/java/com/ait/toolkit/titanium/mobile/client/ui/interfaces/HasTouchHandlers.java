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

import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.CallbackRegistration;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TouchCancelHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TouchEndHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TouchMoveHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TouchStartHandler;

public interface HasTouchHandlers {

    public abstract CallbackRegistration addTouchCancelHandler(TouchCancelHandler handler);

    public abstract CallbackRegistration addTouchEndHandler(TouchEndHandler handler);

    public abstract CallbackRegistration addTouchMoveHandler(TouchMoveHandler handler);

    public abstract CallbackRegistration addTouchStartHandler(TouchStartHandler handler);

}