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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * An External Reference allows a Package to reference an external source of additional information,
 * metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the
 * Package
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternalRef extends com.google.api.client.json.GenericJson {

  /**
   * An External Reference allows a Package to reference an external source of additional
   * information, metadata, enumerations, asset identifiers, or downloadable content believed to be
   * relevant to the Package
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * Human-readable information about the purpose and target of the reference
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * The unique string with no spaces necessary to access the package-specific information,
   * metadata, or content within the target location
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locator;

  /**
   * Type of category (e.g. 'npm' for the PACKAGE_MANAGER category)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * An External Reference allows a Package to reference an external source of additional
   * information, metadata, enumerations, asset identifiers, or downloadable content believed to be
   * relevant to the Package
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * An External Reference allows a Package to reference an external source of additional
   * information, metadata, enumerations, asset identifiers, or downloadable content believed to be
   * relevant to the Package
   * @param category category or {@code null} for none
   */
  public ExternalRef setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * Human-readable information about the purpose and target of the reference
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * Human-readable information about the purpose and target of the reference
   * @param comment comment or {@code null} for none
   */
  public ExternalRef setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * The unique string with no spaces necessary to access the package-specific information,
   * metadata, or content within the target location
   * @return value or {@code null} for none
   */
  public java.lang.String getLocator() {
    return locator;
  }

  /**
   * The unique string with no spaces necessary to access the package-specific information,
   * metadata, or content within the target location
   * @param locator locator or {@code null} for none
   */
  public ExternalRef setLocator(java.lang.String locator) {
    this.locator = locator;
    return this;
  }

  /**
   * Type of category (e.g. 'npm' for the PACKAGE_MANAGER category)
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of category (e.g. 'npm' for the PACKAGE_MANAGER category)
   * @param type type or {@code null} for none
   */
  public ExternalRef setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ExternalRef set(String fieldName, Object value) {
    return (ExternalRef) super.set(fieldName, value);
  }

  @Override
  public ExternalRef clone() {
    return (ExternalRef) super.clone();
  }

}