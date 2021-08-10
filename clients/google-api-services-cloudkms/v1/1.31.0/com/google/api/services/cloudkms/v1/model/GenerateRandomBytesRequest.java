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

package com.google.api.services.cloudkms.v1.model;

/**
 * Request message for KeyManagementService.GenerateRandomBytes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateRandomBytesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The length in bytes of the amount of randomness to retrieve. Minimum 8 bytes, maximum 1024
   * bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer lengthBytes;

  /**
   * The ProtectionLevel to use when generating the random data. Defaults to SOFTWARE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protectionLevel;

  /**
   * The length in bytes of the amount of randomness to retrieve. Minimum 8 bytes, maximum 1024
   * bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLengthBytes() {
    return lengthBytes;
  }

  /**
   * The length in bytes of the amount of randomness to retrieve. Minimum 8 bytes, maximum 1024
   * bytes.
   * @param lengthBytes lengthBytes or {@code null} for none
   */
  public GenerateRandomBytesRequest setLengthBytes(java.lang.Integer lengthBytes) {
    this.lengthBytes = lengthBytes;
    return this;
  }

  /**
   * The ProtectionLevel to use when generating the random data. Defaults to SOFTWARE.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtectionLevel() {
    return protectionLevel;
  }

  /**
   * The ProtectionLevel to use when generating the random data. Defaults to SOFTWARE.
   * @param protectionLevel protectionLevel or {@code null} for none
   */
  public GenerateRandomBytesRequest setProtectionLevel(java.lang.String protectionLevel) {
    this.protectionLevel = protectionLevel;
    return this;
  }

  @Override
  public GenerateRandomBytesRequest set(String fieldName, Object value) {
    return (GenerateRandomBytesRequest) super.set(fieldName, value);
  }

  @Override
  public GenerateRandomBytesRequest clone() {
    return (GenerateRandomBytesRequest) super.clone();
  }

}