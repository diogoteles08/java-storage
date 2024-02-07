/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

// Protobuf Java Version: 3.25.2
package com.google.storage.v2;

/**
 *
 *
 * <pre>
 * Request object to update an HMAC key state.
 * HmacKeyMetadata.state is required and the only writable field in
 * UpdateHmacKey operation. Specifying fields other than state will result in an
 * error.
 * </pre>
 *
 * Protobuf type {@code google.storage.v2.UpdateHmacKeyRequest}
 */
public final class UpdateHmacKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v2.UpdateHmacKeyRequest)
    UpdateHmacKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateHmacKeyRequest.newBuilder() to construct.
  private UpdateHmacKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateHmacKeyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateHmacKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_UpdateHmacKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_UpdateHmacKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v2.UpdateHmacKeyRequest.class,
            com.google.storage.v2.UpdateHmacKeyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int HMAC_KEY_FIELD_NUMBER = 1;
  private com.google.storage.v2.HmacKeyMetadata hmacKey_;
  /**
   *
   *
   * <pre>
   * Required. The HMAC key to update.
   * If present, the hmac_key's `id` field will be used to identify the key.
   * Otherwise, the hmac_key's access_id and project fields will be used to
   * identify the key.
   * </pre>
   *
   * <code>
   * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the hmacKey field is set.
   */
  @java.lang.Override
  public boolean hasHmacKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The HMAC key to update.
   * If present, the hmac_key's `id` field will be used to identify the key.
   * Otherwise, the hmac_key's access_id and project fields will be used to
   * identify the key.
   * </pre>
   *
   * <code>
   * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The hmacKey.
   */
  @java.lang.Override
  public com.google.storage.v2.HmacKeyMetadata getHmacKey() {
    return hmacKey_ == null ? com.google.storage.v2.HmacKeyMetadata.getDefaultInstance() : hmacKey_;
  }
  /**
   *
   *
   * <pre>
   * Required. The HMAC key to update.
   * If present, the hmac_key's `id` field will be used to identify the key.
   * Otherwise, the hmac_key's access_id and project fields will be used to
   * identify the key.
   * </pre>
   *
   * <code>
   * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.storage.v2.HmacKeyMetadataOrBuilder getHmacKeyOrBuilder() {
    return hmacKey_ == null ? com.google.storage.v2.HmacKeyMetadata.getDefaultInstance() : hmacKey_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Update mask for hmac_key.
   * Not specifying any fields will mean only the `state` field is updated to
   * the value specified in `hmac_key`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Update mask for hmac_key.
   * Not specifying any fields will mean only the `state` field is updated to
   * the value specified in `hmac_key`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Update mask for hmac_key.
   * Not specifying any fields will mean only the `state` field is updated to
   * the value specified in `hmac_key`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getHmacKey());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getHmacKey());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.storage.v2.UpdateHmacKeyRequest)) {
      return super.equals(obj);
    }
    com.google.storage.v2.UpdateHmacKeyRequest other =
        (com.google.storage.v2.UpdateHmacKeyRequest) obj;

    if (hasHmacKey() != other.hasHmacKey()) return false;
    if (hasHmacKey()) {
      if (!getHmacKey().equals(other.getHmacKey())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHmacKey()) {
      hash = (37 * hash) + HMAC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getHmacKey().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.storage.v2.UpdateHmacKeyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request object to update an HMAC key state.
   * HmacKeyMetadata.state is required and the only writable field in
   * UpdateHmacKey operation. Specifying fields other than state will result in an
   * error.
   * </pre>
   *
   * Protobuf type {@code google.storage.v2.UpdateHmacKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v2.UpdateHmacKeyRequest)
      com.google.storage.v2.UpdateHmacKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_UpdateHmacKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_UpdateHmacKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v2.UpdateHmacKeyRequest.class,
              com.google.storage.v2.UpdateHmacKeyRequest.Builder.class);
    }

    // Construct using com.google.storage.v2.UpdateHmacKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getHmacKeyFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hmacKey_ = null;
      if (hmacKeyBuilder_ != null) {
        hmacKeyBuilder_.dispose();
        hmacKeyBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_UpdateHmacKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v2.UpdateHmacKeyRequest getDefaultInstanceForType() {
      return com.google.storage.v2.UpdateHmacKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v2.UpdateHmacKeyRequest build() {
      com.google.storage.v2.UpdateHmacKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v2.UpdateHmacKeyRequest buildPartial() {
      com.google.storage.v2.UpdateHmacKeyRequest result =
          new com.google.storage.v2.UpdateHmacKeyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storage.v2.UpdateHmacKeyRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hmacKey_ = hmacKeyBuilder_ == null ? hmacKey_ : hmacKeyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.storage.v2.UpdateHmacKeyRequest) {
        return mergeFrom((com.google.storage.v2.UpdateHmacKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v2.UpdateHmacKeyRequest other) {
      if (other == com.google.storage.v2.UpdateHmacKeyRequest.getDefaultInstance()) return this;
      if (other.hasHmacKey()) {
        mergeHmacKey(other.getHmacKey());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getHmacKeyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.storage.v2.HmacKeyMetadata hmacKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.HmacKeyMetadata,
            com.google.storage.v2.HmacKeyMetadata.Builder,
            com.google.storage.v2.HmacKeyMetadataOrBuilder>
        hmacKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the hmacKey field is set.
     */
    public boolean hasHmacKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The hmacKey.
     */
    public com.google.storage.v2.HmacKeyMetadata getHmacKey() {
      if (hmacKeyBuilder_ == null) {
        return hmacKey_ == null
            ? com.google.storage.v2.HmacKeyMetadata.getDefaultInstance()
            : hmacKey_;
      } else {
        return hmacKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setHmacKey(com.google.storage.v2.HmacKeyMetadata value) {
      if (hmacKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hmacKey_ = value;
      } else {
        hmacKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setHmacKey(com.google.storage.v2.HmacKeyMetadata.Builder builderForValue) {
      if (hmacKeyBuilder_ == null) {
        hmacKey_ = builderForValue.build();
      } else {
        hmacKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeHmacKey(com.google.storage.v2.HmacKeyMetadata value) {
      if (hmacKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && hmacKey_ != null
            && hmacKey_ != com.google.storage.v2.HmacKeyMetadata.getDefaultInstance()) {
          getHmacKeyBuilder().mergeFrom(value);
        } else {
          hmacKey_ = value;
        }
      } else {
        hmacKeyBuilder_.mergeFrom(value);
      }
      if (hmacKey_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearHmacKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hmacKey_ = null;
      if (hmacKeyBuilder_ != null) {
        hmacKeyBuilder_.dispose();
        hmacKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.storage.v2.HmacKeyMetadata.Builder getHmacKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHmacKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.storage.v2.HmacKeyMetadataOrBuilder getHmacKeyOrBuilder() {
      if (hmacKeyBuilder_ != null) {
        return hmacKeyBuilder_.getMessageOrBuilder();
      } else {
        return hmacKey_ == null
            ? com.google.storage.v2.HmacKeyMetadata.getDefaultInstance()
            : hmacKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The HMAC key to update.
     * If present, the hmac_key's `id` field will be used to identify the key.
     * Otherwise, the hmac_key's access_id and project fields will be used to
     * identify the key.
     * </pre>
     *
     * <code>
     * .google.storage.v2.HmacKeyMetadata hmac_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.HmacKeyMetadata,
            com.google.storage.v2.HmacKeyMetadata.Builder,
            com.google.storage.v2.HmacKeyMetadataOrBuilder>
        getHmacKeyFieldBuilder() {
      if (hmacKeyBuilder_ == null) {
        hmacKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.storage.v2.HmacKeyMetadata,
                com.google.storage.v2.HmacKeyMetadata.Builder,
                com.google.storage.v2.HmacKeyMetadataOrBuilder>(
                getHmacKey(), getParentForChildren(), isClean());
        hmacKey_ = null;
      }
      return hmacKeyBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Update mask for hmac_key.
     * Not specifying any fields will mean only the `state` field is updated to
     * the value specified in `hmac_key`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.storage.v2.UpdateHmacKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v2.UpdateHmacKeyRequest)
  private static final com.google.storage.v2.UpdateHmacKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v2.UpdateHmacKeyRequest();
  }

  public static com.google.storage.v2.UpdateHmacKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateHmacKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateHmacKeyRequest>() {
        @java.lang.Override
        public UpdateHmacKeyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateHmacKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateHmacKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v2.UpdateHmacKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
