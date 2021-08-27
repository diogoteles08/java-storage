/*
 * Copyright 2020 Google LLC
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

package com.google.storage.v2;

/**
 *
 *
 * <pre>
 * Message used to convey content being read or written, along with an optional
 * checksum.
 * </pre>
 *
 * Protobuf type {@code google.storage.v2.ChecksummedData}
 */
public final class ChecksummedData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v2.ChecksummedData)
    ChecksummedDataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ChecksummedData.newBuilder() to construct.
  private ChecksummedData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ChecksummedData() {
    content_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ChecksummedData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ChecksummedData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              content_ = input.readBytes();
              break;
            }
          case 21:
            {
              bitField0_ |= 0x00000001;
              crc32C_ = input.readFixed32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_ChecksummedData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_ChecksummedData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v2.ChecksummedData.class,
            com.google.storage.v2.ChecksummedData.Builder.class);
  }

  private int bitField0_;
  public static final int CONTENT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString content_;
  /**
   *
   *
   * <pre>
   * The data.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContent() {
    return content_;
  }

  public static final int CRC32C_FIELD_NUMBER = 2;
  private int crc32C_;
  /**
   *
   *
   * <pre>
   * If set, the CRC32C digest of the content field.
   * </pre>
   *
   * <code>fixed32 crc32c = 2;</code>
   *
   * @return Whether the crc32c field is set.
   */
  @java.lang.Override
  public boolean hasCrc32C() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * If set, the CRC32C digest of the content field.
   * </pre>
   *
   * <code>fixed32 crc32c = 2;</code>
   *
   * @return The crc32c.
   */
  @java.lang.Override
  public int getCrc32C() {
    return crc32C_;
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
    if (!content_.isEmpty()) {
      output.writeBytes(1, content_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeFixed32(2, crc32C_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!content_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, content_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFixed32Size(2, crc32C_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.storage.v2.ChecksummedData)) {
      return super.equals(obj);
    }
    com.google.storage.v2.ChecksummedData other = (com.google.storage.v2.ChecksummedData) obj;

    if (!getContent().equals(other.getContent())) return false;
    if (hasCrc32C() != other.hasCrc32C()) return false;
    if (hasCrc32C()) {
      if (getCrc32C() != other.getCrc32C()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    if (hasCrc32C()) {
      hash = (37 * hash) + CRC32C_FIELD_NUMBER;
      hash = (53 * hash) + getCrc32C();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.ChecksummedData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.ChecksummedData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.ChecksummedData parseFrom(
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

  public static Builder newBuilder(com.google.storage.v2.ChecksummedData prototype) {
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
   * Message used to convey content being read or written, along with an optional
   * checksum.
   * </pre>
   *
   * Protobuf type {@code google.storage.v2.ChecksummedData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v2.ChecksummedData)
      com.google.storage.v2.ChecksummedDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_ChecksummedData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_ChecksummedData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v2.ChecksummedData.class,
              com.google.storage.v2.ChecksummedData.Builder.class);
    }

    // Construct using com.google.storage.v2.ChecksummedData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      content_ = com.google.protobuf.ByteString.EMPTY;

      crc32C_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_ChecksummedData_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v2.ChecksummedData getDefaultInstanceForType() {
      return com.google.storage.v2.ChecksummedData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v2.ChecksummedData build() {
      com.google.storage.v2.ChecksummedData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v2.ChecksummedData buildPartial() {
      com.google.storage.v2.ChecksummedData result =
          new com.google.storage.v2.ChecksummedData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.content_ = content_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.crc32C_ = crc32C_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.storage.v2.ChecksummedData) {
        return mergeFrom((com.google.storage.v2.ChecksummedData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v2.ChecksummedData other) {
      if (other == com.google.storage.v2.ChecksummedData.getDefaultInstance()) return this;
      if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
        setContent(other.getContent());
      }
      if (other.hasCrc32C()) {
        setCrc32C(other.getCrc32C());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.storage.v2.ChecksummedData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.storage.v2.ChecksummedData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The data.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @return The content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }
    /**
     *
     *
     * <pre>
     * The data.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      content_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The data.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {

      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }

    private int crc32C_;
    /**
     *
     *
     * <pre>
     * If set, the CRC32C digest of the content field.
     * </pre>
     *
     * <code>fixed32 crc32c = 2;</code>
     *
     * @return Whether the crc32c field is set.
     */
    @java.lang.Override
    public boolean hasCrc32C() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * If set, the CRC32C digest of the content field.
     * </pre>
     *
     * <code>fixed32 crc32c = 2;</code>
     *
     * @return The crc32c.
     */
    @java.lang.Override
    public int getCrc32C() {
      return crc32C_;
    }
    /**
     *
     *
     * <pre>
     * If set, the CRC32C digest of the content field.
     * </pre>
     *
     * <code>fixed32 crc32c = 2;</code>
     *
     * @param value The crc32c to set.
     * @return This builder for chaining.
     */
    public Builder setCrc32C(int value) {
      bitField0_ |= 0x00000001;
      crc32C_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, the CRC32C digest of the content field.
     * </pre>
     *
     * <code>fixed32 crc32c = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCrc32C() {
      bitField0_ = (bitField0_ & ~0x00000001);
      crc32C_ = 0;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.storage.v2.ChecksummedData)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v2.ChecksummedData)
  private static final com.google.storage.v2.ChecksummedData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v2.ChecksummedData();
  }

  public static com.google.storage.v2.ChecksummedData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChecksummedData> PARSER =
      new com.google.protobuf.AbstractParser<ChecksummedData>() {
        @java.lang.Override
        public ChecksummedData parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ChecksummedData(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ChecksummedData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChecksummedData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v2.ChecksummedData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}