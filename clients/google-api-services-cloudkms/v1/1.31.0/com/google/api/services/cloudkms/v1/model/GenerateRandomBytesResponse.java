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
 * Response message for KeyManagementService.GenerateRandomBytes.
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
public final class GenerateRandomBytesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The generated data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * GenerateRandomBytesResponse.data. An integrity check of GenerateRandomBytesResponse.data can be
   * performed by computing the CRC32C checksum of GenerateRandomBytesResponse.data and comparing
   * your results to this field. Discard the response in case of non-matching checksum values, and
   * perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dataCrc32c;

  /**
   * The generated data.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * The generated data.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * The generated data.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public GenerateRandomBytesResponse setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * The generated data.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GenerateRandomBytesResponse encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * GenerateRandomBytesResponse.data. An integrity check of GenerateRandomBytesResponse.data can be
   * performed by computing the CRC32C checksum of GenerateRandomBytesResponse.data and comparing
   * your results to this field. Discard the response in case of non-matching checksum values, and
   * perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDataCrc32c() {
    return dataCrc32c;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * GenerateRandomBytesResponse.data. An integrity check of GenerateRandomBytesResponse.data can be
   * performed by computing the CRC32C checksum of GenerateRandomBytesResponse.data and comparing
   * your results to this field. Discard the response in case of non-matching checksum values, and
   * perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   * @param dataCrc32c dataCrc32c or {@code null} for none
   */
  public GenerateRandomBytesResponse setDataCrc32c(java.lang.Long dataCrc32c) {
    this.dataCrc32c = dataCrc32c;
    return this;
  }

  @Override
  public GenerateRandomBytesResponse set(String fieldName, Object value) {
    return (GenerateRandomBytesResponse) super.set(fieldName, value);
  }

  @Override
  public GenerateRandomBytesResponse clone() {
    return (GenerateRandomBytesResponse) super.clone();
  }

}