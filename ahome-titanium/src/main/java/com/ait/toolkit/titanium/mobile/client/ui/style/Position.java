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
package com.ait.toolkit.titanium.mobile.client.ui.style;

public enum Position {
    TOP("top"), LEFT("left"), RIGHT("right"), BOTTOM("bottom"), CENTER("center");

    private String value;

    private Position(String position) {
        this.value = position;
    }

    public String getValue() {
        return this.value;
    }

    public static Position fromValue(String value) {
        if (value.equalsIgnoreCase(Position.BOTTOM.value)) {
            return Position.BOTTOM;
        } else if (value.equalsIgnoreCase(Position.CENTER.value)) {
            return Position.CENTER;
        } else if (value.equalsIgnoreCase(Position.LEFT.value)) {
            return Position.LEFT;
        } else if (value.equalsIgnoreCase(Position.RIGHT.value)) {
            return Position.RIGHT;
        } else if (value.equalsIgnoreCase(Position.TOP.value)) {
            return Position.TOP;
        }
        return null;
    }
}
