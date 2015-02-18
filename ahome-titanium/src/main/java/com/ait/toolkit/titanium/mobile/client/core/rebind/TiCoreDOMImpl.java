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
package com.ait.toolkit.titanium.mobile.client.core.rebind;

import com.google.gwt.dom.client.DOMImpl;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.EventTarget;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.dom.client.Node;

public class TiCoreDOMImpl extends DOMImpl {

  @Override
  public NativeEvent createHtmlEvent(Document doc, String type, boolean canBubble,
      boolean cancelable) {
    return null;
  }

  @Override
  public InputElement createInputRadioElement(Document doc, String name) {
    return null;
  }

  @Override
  public NativeEvent createKeyCodeEvent(Document document, String type, boolean ctrlKey,
      boolean altKey, boolean shiftKey, boolean metaKey, int keyCode) {
    return null;
  }

  @Override
  public NativeEvent createKeyEvent(Document doc, String type, boolean canBubble,
      boolean cancelable, boolean ctrlKey, boolean altKey, boolean shiftKey, boolean metaKey,
      int keyCode, int charCode) {
    return null;
  }

  @Override
  public NativeEvent createKeyPressEvent(Document document, boolean ctrlKey, boolean altKey,
      boolean shiftKey, boolean metaKey, int charCode) {
    return null;
  }

  @Override
  public NativeEvent createMouseEvent(Document doc, String type, boolean canBubble,
      boolean cancelable, int detail, int screenX, int screenY, int clientX, int clientY,
      boolean ctrlKey, boolean altKey, boolean shiftKey, boolean metaKey, int button,
      Element relatedTarget) {
    return null;
  }

  @Override
  public void dispatchEvent(Element target, NativeEvent evt) {
  }

  @Override
  public int eventGetCharCode(NativeEvent evt) {
    return 0;
  }

  @Override
  public int eventGetMouseWheelVelocityY(NativeEvent evt) {
    return 0;
  }

  @Override
  public EventTarget eventGetRelatedTarget(NativeEvent nativeEvent) {
    return null;
  }

  @Override
  public EventTarget eventGetTarget(NativeEvent evt) {
    return null;
  }

  @Override
  public void eventPreventDefault(NativeEvent evt) {
  }

  @Override
  public String eventToString(NativeEvent evt) {
    return null;
  }

  @Override
  public boolean isOrHasChild(Node parent, Node child) {
    return false;
  }

}
