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

package com.google.api.services.docs.v1.model;

/**
 * A link to a Google resource (e.g., a file in Drive, a YouTube video, a Calendar event, etc.).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RichLink extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The ID of this link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String richLinkId;

  /**
   * Output only. The properties of this RichLink. This field is always present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RichLinkProperties richLinkProperties;

  /**
   * IDs for suggestions that remove this link from the document. A RichLink might have multiple
   * deletion IDs if, for example, multiple users suggest to delete it. If empty, then this person
   * link isn't suggested for deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedDeletionIds;

  /**
   * IDs for suggestions that insert this link into the document. A RichLink might have multiple
   * insertion IDs if it is a nested suggested change (a suggestion within a suggestion made by a
   * different user, for example). If empty, then this person link isn't a suggested insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedInsertionIds;

  /**
   * The suggested text style changes to this RichLink, keyed by suggestion ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SuggestedTextStyle> suggestedTextStyleChanges;

  /**
   * The text style of this RichLink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextStyle textStyle;

  /**
   * Output only. The ID of this link.
   * @return value or {@code null} for none
   */
  public java.lang.String getRichLinkId() {
    return richLinkId;
  }

  /**
   * Output only. The ID of this link.
   * @param richLinkId richLinkId or {@code null} for none
   */
  public RichLink setRichLinkId(java.lang.String richLinkId) {
    this.richLinkId = richLinkId;
    return this;
  }

  /**
   * Output only. The properties of this RichLink. This field is always present.
   * @return value or {@code null} for none
   */
  public RichLinkProperties getRichLinkProperties() {
    return richLinkProperties;
  }

  /**
   * Output only. The properties of this RichLink. This field is always present.
   * @param richLinkProperties richLinkProperties or {@code null} for none
   */
  public RichLink setRichLinkProperties(RichLinkProperties richLinkProperties) {
    this.richLinkProperties = richLinkProperties;
    return this;
  }

  /**
   * IDs for suggestions that remove this link from the document. A RichLink might have multiple
   * deletion IDs if, for example, multiple users suggest to delete it. If empty, then this person
   * link isn't suggested for deletion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedDeletionIds() {
    return suggestedDeletionIds;
  }

  /**
   * IDs for suggestions that remove this link from the document. A RichLink might have multiple
   * deletion IDs if, for example, multiple users suggest to delete it. If empty, then this person
   * link isn't suggested for deletion.
   * @param suggestedDeletionIds suggestedDeletionIds or {@code null} for none
   */
  public RichLink setSuggestedDeletionIds(java.util.List<java.lang.String> suggestedDeletionIds) {
    this.suggestedDeletionIds = suggestedDeletionIds;
    return this;
  }

  /**
   * IDs for suggestions that insert this link into the document. A RichLink might have multiple
   * insertion IDs if it is a nested suggested change (a suggestion within a suggestion made by a
   * different user, for example). If empty, then this person link isn't a suggested insertion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedInsertionIds() {
    return suggestedInsertionIds;
  }

  /**
   * IDs for suggestions that insert this link into the document. A RichLink might have multiple
   * insertion IDs if it is a nested suggested change (a suggestion within a suggestion made by a
   * different user, for example). If empty, then this person link isn't a suggested insertion.
   * @param suggestedInsertionIds suggestedInsertionIds or {@code null} for none
   */
  public RichLink setSuggestedInsertionIds(java.util.List<java.lang.String> suggestedInsertionIds) {
    this.suggestedInsertionIds = suggestedInsertionIds;
    return this;
  }

  /**
   * The suggested text style changes to this RichLink, keyed by suggestion ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SuggestedTextStyle> getSuggestedTextStyleChanges() {
    return suggestedTextStyleChanges;
  }

  /**
   * The suggested text style changes to this RichLink, keyed by suggestion ID.
   * @param suggestedTextStyleChanges suggestedTextStyleChanges or {@code null} for none
   */
  public RichLink setSuggestedTextStyleChanges(java.util.Map<String, SuggestedTextStyle> suggestedTextStyleChanges) {
    this.suggestedTextStyleChanges = suggestedTextStyleChanges;
    return this;
  }

  /**
   * The text style of this RichLink.
   * @return value or {@code null} for none
   */
  public TextStyle getTextStyle() {
    return textStyle;
  }

  /**
   * The text style of this RichLink.
   * @param textStyle textStyle or {@code null} for none
   */
  public RichLink setTextStyle(TextStyle textStyle) {
    this.textStyle = textStyle;
    return this;
  }

  @Override
  public RichLink set(String fieldName, Object value) {
    return (RichLink) super.set(fieldName, value);
  }

  @Override
  public RichLink clone() {
    return (RichLink) super.clone();
  }

}