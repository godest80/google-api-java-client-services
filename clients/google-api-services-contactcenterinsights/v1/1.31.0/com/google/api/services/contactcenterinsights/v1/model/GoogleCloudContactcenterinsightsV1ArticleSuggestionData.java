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
 * Agent Assist Article Suggestion data.
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
public final class GoogleCloudContactcenterinsightsV1ArticleSuggestionData extends com.google.api.client.json.GenericJson {

  /**
   * The system's confidence score that this article is a good match for this conversation, ranging
   * from 0.0 (completely uncertain) to 1.0 (completely certain).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidenceScore;

  /**
   * Map that contains metadata about the Article Suggestion and the document that it originates
   * from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Name of the query record. Format:
   * projects/{project}/locations/{location}/queryRecords/{query_record}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryRecord;

  /**
   * The knowledge document that this answer was extracted from. Format:
   * projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Article title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Article URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * The system's confidence score that this article is a good match for this conversation, ranging
   * from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidenceScore() {
    return confidenceScore;
  }

  /**
   * The system's confidence score that this article is a good match for this conversation, ranging
   * from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @param confidenceScore confidenceScore or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ArticleSuggestionData setConfidenceScore(java.lang.Float confidenceScore) {
    this.confidenceScore = confidenceScore;
    return this;
  }

  /**
   * Map that contains metadata about the Article Suggestion and the document that it originates
   * from.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Map that contains metadata about the Article Suggestion and the document that it originates
   * from.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ArticleSuggestionData setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Name of the query record. Format:
   * projects/{project}/locations/{location}/queryRecords/{query_record}
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryRecord() {
    return queryRecord;
  }

  /**
   * Name of the query record. Format:
   * projects/{project}/locations/{location}/queryRecords/{query_record}
   * @param queryRecord queryRecord or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ArticleSuggestionData setQueryRecord(java.lang.String queryRecord) {
    this.queryRecord = queryRecord;
    return this;
  }

  /**
   * The knowledge document that this answer was extracted from. Format:
   * projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * The knowledge document that this answer was extracted from. Format:
   * projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}
   * @param source source or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ArticleSuggestionData setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * Article title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Article title.
   * @param title title or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ArticleSuggestionData setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Article URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Article URI.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ArticleSuggestionData setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1ArticleSuggestionData set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1ArticleSuggestionData) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1ArticleSuggestionData clone() {
    return (GoogleCloudContactcenterinsightsV1ArticleSuggestionData) super.clone();
  }

}