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

package com.google.api.services.sqladmin.model;

/**
 * Reference to another Cloud SQL instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceReference extends com.google.api.client.json.GenericJson {

  /**
   * The name of the Cloud SQL instance being referenced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The region of the Cloud SQL instance being referenced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The name of the Cloud SQL instance being referenced.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the Cloud SQL instance being referenced.
   * @param name name or {@code null} for none
   */
  public InstanceReference setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The region of the Cloud SQL instance being referenced.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The region of the Cloud SQL instance being referenced.
   * @param region region or {@code null} for none
   */
  public InstanceReference setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  @Override
  public InstanceReference set(String fieldName, Object value) {
    return (InstanceReference) super.set(fieldName, value);
  }

  @Override
  public InstanceReference clone() {
    return (InstanceReference) super.clone();
  }

}