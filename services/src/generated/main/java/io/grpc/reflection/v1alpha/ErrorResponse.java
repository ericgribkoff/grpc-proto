// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/reflection/v1alpha/reflection.proto

package io.grpc.reflection.v1alpha;

/**
 * <pre>
 * The error code and error message sent by the server when an error occurs.
 * </pre>
 *
 * Protobuf type {@code grpc.reflection.v1alpha.ErrorResponse}
 */
public  final class ErrorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.reflection.v1alpha.ErrorResponse)
    ErrorResponseOrBuilder {
  // Use ErrorResponse.newBuilder() to construct.
  private ErrorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorResponse() {
    errorCode_ = 0;
    errorMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ErrorResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            errorCode_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ErrorResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ErrorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.reflection.v1alpha.ErrorResponse.class, io.grpc.reflection.v1alpha.ErrorResponse.Builder.class);
  }

  public static final int ERROR_CODE_FIELD_NUMBER = 1;
  private int errorCode_;
  /**
   * <pre>
   * This field uses the error codes defined in grpc::StatusCode.
   * </pre>
   *
   * <code>int32 error_code = 1;</code>
   */
  public int getErrorCode() {
    return errorCode_;
  }

  public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>string error_message = 2;</code>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string error_message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (errorCode_ != 0) {
      output.writeInt32(1, errorCode_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorMessage_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, errorCode_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorMessage_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.reflection.v1alpha.ErrorResponse)) {
      return super.equals(obj);
    }
    io.grpc.reflection.v1alpha.ErrorResponse other = (io.grpc.reflection.v1alpha.ErrorResponse) obj;

    boolean result = true;
    result = result && (getErrorCode()
        == other.getErrorCode());
    result = result && getErrorMessage()
        .equals(other.getErrorMessage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ERROR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorCode();
    hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.reflection.v1alpha.ErrorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ErrorResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.reflection.v1alpha.ErrorResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The error code and error message sent by the server when an error occurs.
   * </pre>
   *
   * Protobuf type {@code grpc.reflection.v1alpha.ErrorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.reflection.v1alpha.ErrorResponse)
      io.grpc.reflection.v1alpha.ErrorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ErrorResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ErrorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.reflection.v1alpha.ErrorResponse.class, io.grpc.reflection.v1alpha.ErrorResponse.Builder.class);
    }

    // Construct using io.grpc.reflection.v1alpha.ErrorResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      errorCode_ = 0;

      errorMessage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ErrorResponse_descriptor;
    }

    public io.grpc.reflection.v1alpha.ErrorResponse getDefaultInstanceForType() {
      return io.grpc.reflection.v1alpha.ErrorResponse.getDefaultInstance();
    }

    public io.grpc.reflection.v1alpha.ErrorResponse build() {
      io.grpc.reflection.v1alpha.ErrorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.reflection.v1alpha.ErrorResponse buildPartial() {
      io.grpc.reflection.v1alpha.ErrorResponse result = new io.grpc.reflection.v1alpha.ErrorResponse(this);
      result.errorCode_ = errorCode_;
      result.errorMessage_ = errorMessage_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.reflection.v1alpha.ErrorResponse) {
        return mergeFrom((io.grpc.reflection.v1alpha.ErrorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.reflection.v1alpha.ErrorResponse other) {
      if (other == io.grpc.reflection.v1alpha.ErrorResponse.getDefaultInstance()) return this;
      if (other.getErrorCode() != 0) {
        setErrorCode(other.getErrorCode());
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.reflection.v1alpha.ErrorResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.reflection.v1alpha.ErrorResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int errorCode_ ;
    /**
     * <pre>
     * This field uses the error codes defined in grpc::StatusCode.
     * </pre>
     *
     * <code>int32 error_code = 1;</code>
     */
    public int getErrorCode() {
      return errorCode_;
    }
    /**
     * <pre>
     * This field uses the error codes defined in grpc::StatusCode.
     * </pre>
     *
     * <code>int32 error_code = 1;</code>
     */
    public Builder setErrorCode(int value) {
      
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field uses the error codes defined in grpc::StatusCode.
     * </pre>
     *
     * <code>int32 error_code = 1;</code>
     */
    public Builder clearErrorCode() {
      
      errorCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>string error_message = 2;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error_message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error_message = 2;</code>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error_message = 2;</code>
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string error_message = 2;</code>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.reflection.v1alpha.ErrorResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.reflection.v1alpha.ErrorResponse)
  private static final io.grpc.reflection.v1alpha.ErrorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.reflection.v1alpha.ErrorResponse();
  }

  public static io.grpc.reflection.v1alpha.ErrorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorResponse>
      PARSER = new com.google.protobuf.AbstractParser<ErrorResponse>() {
    public ErrorResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.reflection.v1alpha.ErrorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

