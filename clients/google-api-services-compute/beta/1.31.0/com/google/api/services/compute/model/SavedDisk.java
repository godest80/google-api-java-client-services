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

package com.google.api.services.compute.model;

/**
 * An instance-attached disk resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SavedDisk extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Type of the resource. Always compute#savedDisk for attached disks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Specifies a URL of the disk attached to the source instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDisk;

  /**
   * [Output Only] Size of the individual disk snapshot used by this machine image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long storageBytes;

  /**
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as
   * a result of shared storage reallocation. This status can either be UPDATING, meaning the size
   * of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-
   * date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageBytesStatus;

  /**
   * [Output Only] Type of the resource. Always compute#savedDisk for attached disks.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#savedDisk for attached disks.
   * @param kind kind or {@code null} for none
   */
  public SavedDisk setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Specifies a URL of the disk attached to the source instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDisk() {
    return sourceDisk;
  }

  /**
   * Specifies a URL of the disk attached to the source instance.
   * @param sourceDisk sourceDisk or {@code null} for none
   */
  public SavedDisk setSourceDisk(java.lang.String sourceDisk) {
    this.sourceDisk = sourceDisk;
    return this;
  }

  /**
   * [Output Only] Size of the individual disk snapshot used by this machine image.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStorageBytes() {
    return storageBytes;
  }

  /**
   * [Output Only] Size of the individual disk snapshot used by this machine image.
   * @param storageBytes storageBytes or {@code null} for none
   */
  public SavedDisk setStorageBytes(java.lang.Long storageBytes) {
    this.storageBytes = storageBytes;
    return this;
  }

  /**
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as
   * a result of shared storage reallocation. This status can either be UPDATING, meaning the size
   * of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-
   * date.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageBytesStatus() {
    return storageBytesStatus;
  }

  /**
   * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as
   * a result of shared storage reallocation. This status can either be UPDATING, meaning the size
   * of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-
   * date.
   * @param storageBytesStatus storageBytesStatus or {@code null} for none
   */
  public SavedDisk setStorageBytesStatus(java.lang.String storageBytesStatus) {
    this.storageBytesStatus = storageBytesStatus;
    return this;
  }

  @Override
  public SavedDisk set(String fieldName, Object value) {
    return (SavedDisk) super.set(fieldName, value);
  }

  @Override
  public SavedDisk clone() {
    return (SavedDisk) super.clone();
  }

}
