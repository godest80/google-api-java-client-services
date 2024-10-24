/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.chat.v1.model;

/**
 * A card is a UI element that can contain UI widgets such as text and images. For more information,
 * see Cards . For example, the following JSON creates a card that has a header with the name,
 * position, icons, and link for a contact, followed by a section with contact information like
 * email and phone number. ``` { "header": { "title": "Sasha", "subtitle": "Software Engineer",
 * "imageStyle": "ImageStyle.AVATAR", "imageUrl": "https://example.com/sasha.png", "imageAltText":
 * "Avatar for Sasha" }, "sections" : [ { "header": "Contact Info", "widgets": [ { "decorated_text":
 * { "icon": { "knownIcon": "EMAIL" }, "content": "sasha@example.com" } }, { "decoratedText": {
 * "icon": { "knownIcon": "PERSON" }, "content": "Online" } }, { "decoratedText": { "icon": {
 * "knownIcon": "PHONE" }, "content": "+1 (555) 555-1234" } }, { "buttons": [ { "textButton": {
 * "text": "Share", }, "onClick": { "openLink": { "url": "https://example.com/share" } } }, {
 * "textButton": { "text": "Edit", }, "onClick": { "action": { "function": "goToView", "parameters":
 * [ { "key": "viewType", "value": "EDIT" } ], "loadIndicator": "LoadIndicator.SPINNER" } } } ] } ],
 * "collapsible": true, "uncollapsibleWidgetsCount": 3 } ], "cardActions": [ { "actionLabel": "Send
 * Feedback", "onClick": { "openLink": { "url": "https://example.com/feedback" } } } ], "name":
 * "contact-card-K3wB6arF2H9L" } ```
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1Card extends com.google.api.client.json.GenericJson {

  /**
   * The card's actions. Actions are added to the card's generated toolbar menu. For example, the
   * following JSON constructs a card action menu with Settings and Send Feedback options: ```
   * "card_actions": [ { "actionLabel": "Settings", "onClick": { "action": { "functionName":
   * "goToView", "parameters": [ { "key": "viewType", "value": "SETTING" } ], "loadIndicator":
   * "LoadIndicator.SPINNER" } } }, { "actionLabel": "Send Feedback", "onClick": { "openLink": {
   * "url": "https://example.com/feedback" } } } ] ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsCardV1CardAction> cardActions;

  /**
   * The display style for `peekCardHeader`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayStyle;

  /**
   * The fixed footer shown at the bottom of this card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1CardFixedFooter fixedFooter;

  /**
   * The header of the card. A header usually contains a title and an image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1CardHeader header;

  /**
   * Name of the card. Used as a card identifier in card navigation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * When displaying contextual content, the peek card header acts as a placeholder so that the user
   * can navigate forward between the homepage cards and the contextual cards.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1CardHeader peekCardHeader;

  /**
   * Sections are separated by a line divider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsCardV1Section> sections;

  /**
   * The card's actions. Actions are added to the card's generated toolbar menu. For example, the
   * following JSON constructs a card action menu with Settings and Send Feedback options: ```
   * "card_actions": [ { "actionLabel": "Settings", "onClick": { "action": { "functionName":
   * "goToView", "parameters": [ { "key": "viewType", "value": "SETTING" } ], "loadIndicator":
   * "LoadIndicator.SPINNER" } } }, { "actionLabel": "Send Feedback", "onClick": { "openLink": {
   * "url": "https://example.com/feedback" } } } ] ```
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsCardV1CardAction> getCardActions() {
    return cardActions;
  }

  /**
   * The card's actions. Actions are added to the card's generated toolbar menu. For example, the
   * following JSON constructs a card action menu with Settings and Send Feedback options: ```
   * "card_actions": [ { "actionLabel": "Settings", "onClick": { "action": { "functionName":
   * "goToView", "parameters": [ { "key": "viewType", "value": "SETTING" } ], "loadIndicator":
   * "LoadIndicator.SPINNER" } } }, { "actionLabel": "Send Feedback", "onClick": { "openLink": {
   * "url": "https://example.com/feedback" } } } ] ```
   * @param cardActions cardActions or {@code null} for none
   */
  public GoogleAppsCardV1Card setCardActions(java.util.List<GoogleAppsCardV1CardAction> cardActions) {
    this.cardActions = cardActions;
    return this;
  }

  /**
   * The display style for `peekCardHeader`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayStyle() {
    return displayStyle;
  }

  /**
   * The display style for `peekCardHeader`.
   * @param displayStyle displayStyle or {@code null} for none
   */
  public GoogleAppsCardV1Card setDisplayStyle(java.lang.String displayStyle) {
    this.displayStyle = displayStyle;
    return this;
  }

  /**
   * The fixed footer shown at the bottom of this card.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1CardFixedFooter getFixedFooter() {
    return fixedFooter;
  }

  /**
   * The fixed footer shown at the bottom of this card.
   * @param fixedFooter fixedFooter or {@code null} for none
   */
  public GoogleAppsCardV1Card setFixedFooter(GoogleAppsCardV1CardFixedFooter fixedFooter) {
    this.fixedFooter = fixedFooter;
    return this;
  }

  /**
   * The header of the card. A header usually contains a title and an image.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1CardHeader getHeader() {
    return header;
  }

  /**
   * The header of the card. A header usually contains a title and an image.
   * @param header header or {@code null} for none
   */
  public GoogleAppsCardV1Card setHeader(GoogleAppsCardV1CardHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Name of the card. Used as a card identifier in card navigation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the card. Used as a card identifier in card navigation.
   * @param name name or {@code null} for none
   */
  public GoogleAppsCardV1Card setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * When displaying contextual content, the peek card header acts as a placeholder so that the user
   * can navigate forward between the homepage cards and the contextual cards.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1CardHeader getPeekCardHeader() {
    return peekCardHeader;
  }

  /**
   * When displaying contextual content, the peek card header acts as a placeholder so that the user
   * can navigate forward between the homepage cards and the contextual cards.
   * @param peekCardHeader peekCardHeader or {@code null} for none
   */
  public GoogleAppsCardV1Card setPeekCardHeader(GoogleAppsCardV1CardHeader peekCardHeader) {
    this.peekCardHeader = peekCardHeader;
    return this;
  }

  /**
   * Sections are separated by a line divider.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsCardV1Section> getSections() {
    return sections;
  }

  /**
   * Sections are separated by a line divider.
   * @param sections sections or {@code null} for none
   */
  public GoogleAppsCardV1Card setSections(java.util.List<GoogleAppsCardV1Section> sections) {
    this.sections = sections;
    return this;
  }

  @Override
  public GoogleAppsCardV1Card set(String fieldName, Object value) {
    return (GoogleAppsCardV1Card) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1Card clone() {
    return (GoogleAppsCardV1Card) super.clone();
  }

}
