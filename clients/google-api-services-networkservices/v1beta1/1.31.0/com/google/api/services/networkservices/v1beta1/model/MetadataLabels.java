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

package com.google.api.services.networkservices.v1beta1.model;

/**
 * Defines a name-pair value for a single label.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetadataLabels extends com.google.api.client.json.GenericJson {

  /**
   * Required. Label name presented as key in xDS Node Metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelName;

  /**
   * Required. Label value presented as value corresponding to the above key, in xDS Node Metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelValue;

  /**
   * Required. Label name presented as key in xDS Node Metadata.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelName() {
    return labelName;
  }

  /**
   * Required. Label name presented as key in xDS Node Metadata.
   * @param labelName labelName or {@code null} for none
   */
  public MetadataLabels setLabelName(java.lang.String labelName) {
    this.labelName = labelName;
    return this;
  }

  /**
   * Required. Label value presented as value corresponding to the above key, in xDS Node Metadata.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelValue() {
    return labelValue;
  }

  /**
   * Required. Label value presented as value corresponding to the above key, in xDS Node Metadata.
   * @param labelValue labelValue or {@code null} for none
   */
  public MetadataLabels setLabelValue(java.lang.String labelValue) {
    this.labelValue = labelValue;
    return this;
  }

  @Override
  public MetadataLabels set(String fieldName, Object value) {
    return (MetadataLabels) super.set(fieldName, value);
  }

  @Override
  public MetadataLabels clone() {
    return (MetadataLabels) super.clone();
  }

}