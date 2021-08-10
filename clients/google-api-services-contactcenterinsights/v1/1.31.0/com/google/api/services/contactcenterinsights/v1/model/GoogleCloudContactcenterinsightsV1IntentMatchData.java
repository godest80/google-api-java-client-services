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
 * The data for an intent match. Represents an intent match for a text segment in the conversation.
 * A text segment can be part of a sentence, a complete sentence, or an utterance with multiple
 * sentences.
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
public final class GoogleCloudContactcenterinsightsV1IntentMatchData extends com.google.api.client.json.GenericJson {

  /**
   * The id of the matched intent. Can be used to retrieve the corresponding intent information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intentUniqueId;

  /**
   * The id of the matched intent. Can be used to retrieve the corresponding intent information.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntentUniqueId() {
    return intentUniqueId;
  }

  /**
   * The id of the matched intent. Can be used to retrieve the corresponding intent information.
   * @param intentUniqueId intentUniqueId or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IntentMatchData setIntentUniqueId(java.lang.String intentUniqueId) {
    this.intentUniqueId = intentUniqueId;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1IntentMatchData set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1IntentMatchData) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1IntentMatchData clone() {
    return (GoogleCloudContactcenterinsightsV1IntentMatchData) super.clone();
  }

}