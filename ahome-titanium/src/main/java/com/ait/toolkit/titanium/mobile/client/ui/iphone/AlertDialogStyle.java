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
package com.ait.toolkit.titanium.mobile.client.ui.iphone;

/**
 * A set of constants for the styles available for
 * {@link com.ait.toolkit.titanium.mobile.client.ui.ActivityIndicator} objects.
 */
public class AlertDialogStyle {

    public static final int ALERT_DIALOG_STYLE_DEFAULT = DEFAULT();
    public static final int ALERT_DIALOG_STYLE_LOGIN_AND_PASSOWRD_INPUT = LOGIN_AND_PASSWORD_INPUT();
    public static final int ACTIVITIY_INDICATIOR_STYLE_PLAIN_TEXT_INPUT = PLAIN_TEXT_INPUT();
    public static final int ACTIVITIY_INDICATIOR_STYLE_SECURE_TEXT_INPUT = SECURE_TEXT_INPUT();

    private AlertDialogStyle() {
    }

    public static native final int DEFAULT() /*-{
		return Titanium.UI.iPhone.AlertDialogStyle.DEFAULT;
    }-*/;

    public static native final int LOGIN_AND_PASSWORD_INPUT() /*-{
		return Titanium.UI.iPhone.AlertDialogStyle.LOGIN_AND_PASSWORD_INPUT;
    }-*/;

    public static native final int PLAIN_TEXT_INPUT() /*-{
		return Titanium.UI.iPhone.AlertDialogStyle.PLAIN_TEXT_INPUT;
    }-*/;

    public static native final int SECURE_TEXT_INPUT() /*-{
		return Titanium.UI.iPhone.AlertDialogStyle.SECURE_TEXT_INPUT;
    }-*/;

}
