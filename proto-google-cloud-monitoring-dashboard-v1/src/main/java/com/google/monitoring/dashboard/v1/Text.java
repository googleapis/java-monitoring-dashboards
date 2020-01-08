/*
 * Copyright 2019 Google LLC
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
// source: google/monitoring/dashboard/v1/text.proto

package com.google.monitoring.dashboard.v1;

/**
 *
 *
 * <pre>
 * A widget that displays textual content.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.Text}
 */
public final class Text extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.Text)
    TextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Text.newBuilder() to construct.
  private Text(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Text() {
    content_ = "";
    format_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Text();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Text(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              format_ = rawValue;
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
    return com.google.monitoring.dashboard.v1.TextProto
        .internal_static_google_monitoring_dashboard_v1_Text_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.TextProto
        .internal_static_google_monitoring_dashboard_v1_Text_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.Text.class,
            com.google.monitoring.dashboard.v1.Text.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The format type of the text content.
   * </pre>
   *
   * Protobuf enum {@code google.monitoring.dashboard.v1.Text.Format}
   */
  public enum Format implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Format is unspecified. Defaults to MARKDOWN.
     * </pre>
     *
     * <code>FORMAT_UNSPECIFIED = 0;</code>
     */
    FORMAT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The text contains Markdown formatting.
     * </pre>
     *
     * <code>MARKDOWN = 1;</code>
     */
    MARKDOWN(1),
    /**
     *
     *
     * <pre>
     * The text contains no special formatting.
     * </pre>
     *
     * <code>RAW = 2;</code>
     */
    RAW(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Format is unspecified. Defaults to MARKDOWN.
     * </pre>
     *
     * <code>FORMAT_UNSPECIFIED = 0;</code>
     */
    public static final int FORMAT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The text contains Markdown formatting.
     * </pre>
     *
     * <code>MARKDOWN = 1;</code>
     */
    public static final int MARKDOWN_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The text contains no special formatting.
     * </pre>
     *
     * <code>RAW = 2;</code>
     */
    public static final int RAW_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Format valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Format forNumber(int value) {
      switch (value) {
        case 0:
          return FORMAT_UNSPECIFIED;
        case 1:
          return MARKDOWN;
        case 2:
          return RAW;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Format> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Format> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Format>() {
          public Format findValueByNumber(int number) {
            return Format.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.Text.getDescriptor().getEnumTypes().get(0);
    }

    private static final Format[] VALUES = values();

    public static Format valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Format(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.monitoring.dashboard.v1.Text.Format)
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object content_;
  /**
   *
   *
   * <pre>
   * The text content to be displayed.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The content.
   */
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The text content to be displayed.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The bytes for content.
   */
  public com.google.protobuf.ByteString getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORMAT_FIELD_NUMBER = 2;
  private int format_;
  /**
   *
   *
   * <pre>
   * How the text content is formatted.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
   *
   * @return The enum numeric value on the wire for format.
   */
  public int getFormatValue() {
    return format_;
  }
  /**
   *
   *
   * <pre>
   * How the text content is formatted.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
   *
   * @return The format.
   */
  public com.google.monitoring.dashboard.v1.Text.Format getFormat() {
    @SuppressWarnings("deprecation")
    com.google.monitoring.dashboard.v1.Text.Format result =
        com.google.monitoring.dashboard.v1.Text.Format.valueOf(format_);
    return result == null ? com.google.monitoring.dashboard.v1.Text.Format.UNRECOGNIZED : result;
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
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
    }
    if (format_ != com.google.monitoring.dashboard.v1.Text.Format.FORMAT_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, format_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
    }
    if (format_ != com.google.monitoring.dashboard.v1.Text.Format.FORMAT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, format_);
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.Text)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.Text other = (com.google.monitoring.dashboard.v1.Text) obj;

    if (!getContent().equals(other.getContent())) return false;
    if (format_ != other.format_) return false;
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
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + format_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.Text parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.Text parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.Text parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.dashboard.v1.Text prototype) {
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
   * A widget that displays textual content.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.Text}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.Text)
      com.google.monitoring.dashboard.v1.TextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.TextProto
          .internal_static_google_monitoring_dashboard_v1_Text_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.TextProto
          .internal_static_google_monitoring_dashboard_v1_Text_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.Text.class,
              com.google.monitoring.dashboard.v1.Text.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.Text.newBuilder()
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
      content_ = "";

      format_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.TextProto
          .internal_static_google_monitoring_dashboard_v1_Text_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.Text getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.Text.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.Text build() {
      com.google.monitoring.dashboard.v1.Text result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.Text buildPartial() {
      com.google.monitoring.dashboard.v1.Text result =
          new com.google.monitoring.dashboard.v1.Text(this);
      result.content_ = content_;
      result.format_ = format_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.Text) {
        return mergeFrom((com.google.monitoring.dashboard.v1.Text) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.Text other) {
      if (other == com.google.monitoring.dashboard.v1.Text.getDefaultInstance()) return this;
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (other.format_ != 0) {
        setFormatValue(other.getFormatValue());
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
      com.google.monitoring.dashboard.v1.Text parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.dashboard.v1.Text) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     *
     *
     * <pre>
     * The text content to be displayed.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The text content to be displayed.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The text content to be displayed.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(java.lang.String value) {
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
     * The text content to be displayed.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {

      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The text content to be displayed.
     * </pre>
     *
     * <code>string content = 1;</code>
     *
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      content_ = value;
      onChanged();
      return this;
    }

    private int format_ = 0;
    /**
     *
     *
     * <pre>
     * How the text content is formatted.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
     *
     * @return The enum numeric value on the wire for format.
     */
    public int getFormatValue() {
      return format_;
    }
    /**
     *
     *
     * <pre>
     * How the text content is formatted.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
     *
     * @param value The enum numeric value on the wire for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatValue(int value) {
      format_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How the text content is formatted.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
     *
     * @return The format.
     */
    public com.google.monitoring.dashboard.v1.Text.Format getFormat() {
      @SuppressWarnings("deprecation")
      com.google.monitoring.dashboard.v1.Text.Format result =
          com.google.monitoring.dashboard.v1.Text.Format.valueOf(format_);
      return result == null ? com.google.monitoring.dashboard.v1.Text.Format.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * How the text content is formatted.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
     *
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(com.google.monitoring.dashboard.v1.Text.Format value) {
      if (value == null) {
        throw new NullPointerException();
      }

      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How the text content is formatted.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFormat() {

      format_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.Text)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.Text)
  private static final com.google.monitoring.dashboard.v1.Text DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.Text();
  }

  public static com.google.monitoring.dashboard.v1.Text getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Text> PARSER =
      new com.google.protobuf.AbstractParser<Text>() {
        @java.lang.Override
        public Text parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Text(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Text> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Text> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.Text getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
