/**
 *
 *    Copyright 2015 levigo holding gmbh
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.jadice.web.gwt.fontawesome.client;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Button;

public class IconButton extends Button {

  public IconButton() {
  }

  public IconButton(SafeHtml html) {
    super(html);
  }

  public IconButton(String html) {
    super(html);
  }

  public IconButton(SafeHtml html, ClickHandler handler) {
    super(html, handler);
  }

  public IconButton(String html, ClickHandler handler) {
    super(html, handler);
  }

  private FontAwesome icon;

  public FontAwesome getIcon() {
    return icon;
  }

  public void setIcon(FontAwesome icon) {
    this.icon = icon;
  }

  @Override
  public void setText(String text) {
    super.setText(text);
    if (icon != null) {
      getElement().insertFirst(icon.createElement(getElement().getOwnerDocument()));
    }
  }

  @Override
  public void setHTML(String html) {
    super.setHTML(html);
    if (icon != null) {
      getElement().insertFirst(icon.createElement(getElement().getOwnerDocument()));
    }
  }

  @Override
  public void setHTML(SafeHtml html) {
    setHTML(html.asString());
  }

  @Override
  public String getHTML() {
    // FIXME this will include the HTML of the icon if present
    return super.getHTML();
  }

  @Override
  public String getText() {
    // No special treatment here as the text will be concatenated automatically and the FontAwesome tags will be ignored.
    return super.getText();
  }
}
