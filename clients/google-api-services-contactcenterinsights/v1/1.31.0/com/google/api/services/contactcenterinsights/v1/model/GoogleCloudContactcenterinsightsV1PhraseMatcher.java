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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * The phrase matcher resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1PhraseMatcher extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The most recent time at which the activation status was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String activationUpdateTime;

  /**
   * Applies the phrase matcher only when it is active.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean active;

  /**
   * The human-readable name of the phrase matcher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource name of the phrase matcher. Format:
   * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A list of phase match rule groups that are included in this matcher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup> phraseMatchRuleGroups;

  static {
    // hack to force ProGuard to consider GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup.class);
  }

  /**
   * Output only. The timestamp of when the revision was created. It is also the create time when a
   * new matcher is added.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String revisionCreateTime;

  /**
   * Output only. Immutable. The revision ID of the phrase matcher. A new revision is committed
   * whenever the matcher is changed, except when it is activated or deactivated. A server generated
   * random ID will be used. Example: locations/global/phraseMatchers/my-first-matcher@1234567
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * The role whose utterances the phrase matcher should be matched against. If the role is
   * ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roleMatch;

  /**
   * Required. The type of this phrase matcher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The customized version tag to use for the phrase matcher. If not specified, it will default to
   * `revision_id`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionTag;

  /**
   * Output only. The most recent time at which the activation status was updated.
   * @return value or {@code null} for none
   */
  public String getActivationUpdateTime() {
    return activationUpdateTime;
  }

  /**
   * Output only. The most recent time at which the activation status was updated.
   * @param activationUpdateTime activationUpdateTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setActivationUpdateTime(String activationUpdateTime) {
    this.activationUpdateTime = activationUpdateTime;
    return this;
  }

  /**
   * Applies the phrase matcher only when it is active.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * Applies the phrase matcher only when it is active.
   * @param active active or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setActive(java.lang.Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * The human-readable name of the phrase matcher.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The human-readable name of the phrase matcher.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource name of the phrase matcher. Format:
   * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the phrase matcher. Format:
   * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
   * @param name name or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A list of phase match rule groups that are included in this matcher.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup> getPhraseMatchRuleGroups() {
    return phraseMatchRuleGroups;
  }

  /**
   * A list of phase match rule groups that are included in this matcher.
   * @param phraseMatchRuleGroups phraseMatchRuleGroups or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setPhraseMatchRuleGroups(java.util.List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup> phraseMatchRuleGroups) {
    this.phraseMatchRuleGroups = phraseMatchRuleGroups;
    return this;
  }

  /**
   * Output only. The timestamp of when the revision was created. It is also the create time when a
   * new matcher is added.
   * @return value or {@code null} for none
   */
  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  /**
   * Output only. The timestamp of when the revision was created. It is also the create time when a
   * new matcher is added.
   * @param revisionCreateTime revisionCreateTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  /**
   * Output only. Immutable. The revision ID of the phrase matcher. A new revision is committed
   * whenever the matcher is changed, except when it is activated or deactivated. A server generated
   * random ID will be used. Example: locations/global/phraseMatchers/my-first-matcher@1234567
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Output only. Immutable. The revision ID of the phrase matcher. A new revision is committed
   * whenever the matcher is changed, except when it is activated or deactivated. A server generated
   * random ID will be used. Example: locations/global/phraseMatchers/my-first-matcher@1234567
   * @param revisionId revisionId or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * The role whose utterances the phrase matcher should be matched against. If the role is
   * ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoleMatch() {
    return roleMatch;
  }

  /**
   * The role whose utterances the phrase matcher should be matched against. If the role is
   * ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
   * @param roleMatch roleMatch or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setRoleMatch(java.lang.String roleMatch) {
    this.roleMatch = roleMatch;
    return this;
  }

  /**
   * Required. The type of this phrase matcher.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of this phrase matcher.
   * @param type type or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The customized version tag to use for the phrase matcher. If not specified, it will default to
   * `revision_id`.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionTag() {
    return versionTag;
  }

  /**
   * The customized version tag to use for the phrase matcher. If not specified, it will default to
   * `revision_id`.
   * @param versionTag versionTag or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatcher setVersionTag(java.lang.String versionTag) {
    this.versionTag = versionTag;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1PhraseMatcher set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1PhraseMatcher) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1PhraseMatcher clone() {
    return (GoogleCloudContactcenterinsightsV1PhraseMatcher) super.clone();
  }

}