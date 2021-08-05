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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * A note describing an attestation
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
public final class DSSEAttestationNote extends com.google.api.client.json.GenericJson {

  /**
   * DSSEHint hints at the purpose of the attestation authority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DSSEHint hint;

  /**
   * DSSEHint hints at the purpose of the attestation authority.
   * @return value or {@code null} for none
   */
  public DSSEHint getHint() {
    return hint;
  }

  /**
   * DSSEHint hints at the purpose of the attestation authority.
   * @param hint hint or {@code null} for none
   */
  public DSSEAttestationNote setHint(DSSEHint hint) {
    this.hint = hint;
    return this;
  }

  @Override
  public DSSEAttestationNote set(String fieldName, Object value) {
    return (DSSEAttestationNote) super.set(fieldName, value);
  }

  @Override
  public DSSEAttestationNote clone() {
    return (DSSEAttestationNote) super.clone();
  }

}