// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.ResponseOp}
 */
public  final class ResponseOp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.ResponseOp)
    ResponseOpOrBuilder {
  public static final int RESPONSE_RANGE_FIELD_NUMBER = 1;
  public static final int RESPONSE_PUT_FIELD_NUMBER = 2;
  public static final int RESPONSE_DELETE_RANGE_FIELD_NUMBER = 3;
  public static final int RESPONSE_TXN_FIELD_NUMBER = 4;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.ResponseOp)
  private static final ResponseOp DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<ResponseOp>
      PARSER = new com.google.protobuf.AbstractParser<ResponseOp>() {
    public ResponseOp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseOp(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new ResponseOp();
  }

  private int responseCase_ = 0;
  private Object response_;
  private byte memoizedIsInitialized = -1;

  // Use ResponseOp.newBuilder() to construct.
  private ResponseOp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseOp() {
  }
  private ResponseOp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            RangeResponse.Builder subBuilder = null;
            if (responseCase_ == 1) {
              subBuilder = ((RangeResponse) response_).toBuilder();
            }
            response_ =
                input.readMessage(RangeResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((RangeResponse) response_);
              response_ = subBuilder.buildPartial();
            }
            responseCase_ = 1;
            break;
          }
          case 18: {
            PutResponse.Builder subBuilder = null;
            if (responseCase_ == 2) {
              subBuilder = ((PutResponse) response_).toBuilder();
            }
            response_ =
                input.readMessage(PutResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((PutResponse) response_);
              response_ = subBuilder.buildPartial();
            }
            responseCase_ = 2;
            break;
          }
          case 26: {
            DeleteRangeResponse.Builder subBuilder = null;
            if (responseCase_ == 3) {
              subBuilder = ((DeleteRangeResponse) response_).toBuilder();
            }
            response_ =
                input.readMessage(DeleteRangeResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((DeleteRangeResponse) response_);
              response_ = subBuilder.buildPartial();
            }
            responseCase_ = 3;
            break;
          }
          case 34: {
            TxnResponse.Builder subBuilder = null;
            if (responseCase_ == 4) {
              subBuilder = ((TxnResponse) response_).toBuilder();
            }
            response_ =
                input.readMessage(TxnResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((TxnResponse) response_);
              response_ = subBuilder.buildPartial();
            }
            responseCase_ = 4;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EtcdProto.internal_static_etcdserverpb_ResponseOp_descriptor;
  }

  public static ResponseOp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static ResponseOp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static ResponseOp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static ResponseOp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static ResponseOp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static ResponseOp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static ResponseOp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static ResponseOp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ResponseOp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ResponseOp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static ResponseOp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static ResponseOp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ResponseOp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static ResponseOp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<ResponseOp> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_ResponseOp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ResponseOp.class, ResponseOp.Builder.class);
  }

    public ResponseCase
  getResponseCase() {
    return ResponseCase.forNumber(
        responseCase_);
  }

  /**
   * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
   */
  public boolean hasResponseRange() {
    return responseCase_ == 1;
  }

  /**
   * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
   */
  public RangeResponse getResponseRange() {
    if (responseCase_ == 1) {
       return (RangeResponse) response_;
    }
    return RangeResponse.getDefaultInstance();
  }

  /**
   * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
   */
  public RangeResponseOrBuilder getResponseRangeOrBuilder() {
    if (responseCase_ == 1) {
       return (RangeResponse) response_;
    }
    return RangeResponse.getDefaultInstance();
  }

  /**
   * <code>.etcdserverpb.PutResponse response_put = 2;</code>
   */
  public boolean hasResponsePut() {
    return responseCase_ == 2;
  }

  /**
   * <code>.etcdserverpb.PutResponse response_put = 2;</code>
   */
  public PutResponse getResponsePut() {
    if (responseCase_ == 2) {
       return (PutResponse) response_;
    }
    return PutResponse.getDefaultInstance();
  }

  /**
   * <code>.etcdserverpb.PutResponse response_put = 2;</code>
   */
  public PutResponseOrBuilder getResponsePutOrBuilder() {
    if (responseCase_ == 2) {
       return (PutResponse) response_;
    }
    return PutResponse.getDefaultInstance();
  }

  /**
   * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
   */
  public boolean hasResponseDeleteRange() {
    return responseCase_ == 3;
  }

  /**
   * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
   */
  public DeleteRangeResponse getResponseDeleteRange() {
    if (responseCase_ == 3) {
       return (DeleteRangeResponse) response_;
    }
    return DeleteRangeResponse.getDefaultInstance();
  }

  /**
   * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
   */
  public DeleteRangeResponseOrBuilder getResponseDeleteRangeOrBuilder() {
    if (responseCase_ == 3) {
       return (DeleteRangeResponse) response_;
    }
    return DeleteRangeResponse.getDefaultInstance();
  }

  /**
   * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
   */
  public boolean hasResponseTxn() {
    return responseCase_ == 4;
  }

  /**
   * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
   */
  public TxnResponse getResponseTxn() {
    if (responseCase_ == 4) {
       return (TxnResponse) response_;
    }
    return TxnResponse.getDefaultInstance();
  }

  /**
   * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
   */
  public TxnResponseOrBuilder getResponseTxnOrBuilder() {
    if (responseCase_ == 4) {
       return (TxnResponse) response_;
    }
    return TxnResponse.getDefaultInstance();
  }

  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (responseCase_ == 1) {
      output.writeMessage(1, (RangeResponse) response_);
    }
    if (responseCase_ == 2) {
      output.writeMessage(2, (PutResponse) response_);
    }
    if (responseCase_ == 3) {
      output.writeMessage(3, (DeleteRangeResponse) response_);
    }
    if (responseCase_ == 4) {
      output.writeMessage(4, (TxnResponse) response_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (RangeResponse) response_);
    }
    if (responseCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (PutResponse) response_);
    }
    if (responseCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (DeleteRangeResponse) response_);
    }
    if (responseCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (TxnResponse) response_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ResponseOp)) {
      return super.equals(obj);
    }
    ResponseOp other = (ResponseOp) obj;

    boolean result = true;
    result = result && getResponseCase().equals(
        other.getResponseCase());
    if (!result) return false;
    switch (responseCase_) {
      case 1:
        result = result && getResponseRange()
            .equals(other.getResponseRange());
        break;
      case 2:
        result = result && getResponsePut()
            .equals(other.getResponsePut());
        break;
      case 3:
        result = result && getResponseDeleteRange()
            .equals(other.getResponseDeleteRange());
        break;
      case 4:
        result = result && getResponseTxn()
            .equals(other.getResponseTxn());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (responseCase_) {
      case 1:
        hash = (37 * hash) + RESPONSE_RANGE_FIELD_NUMBER;
        hash = (53 * hash) + getResponseRange().hashCode();
        break;
      case 2:
        hash = (37 * hash) + RESPONSE_PUT_FIELD_NUMBER;
        hash = (53 * hash) + getResponsePut().hashCode();
        break;
      case 3:
        hash = (37 * hash) + RESPONSE_DELETE_RANGE_FIELD_NUMBER;
        hash = (53 * hash) + getResponseDeleteRange().hashCode();
        break;
      case 4:
        hash = (37 * hash) + RESPONSE_TXN_FIELD_NUMBER;
        hash = (53 * hash) + getResponseTxn().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public Builder newBuilderForType() { return newBuilder(); }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  @Override
  public com.google.protobuf.Parser<ResponseOp> getParserForType() {
    return PARSER;
  }

  public ResponseOp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  public enum ResponseCase
      implements com.google.protobuf.Internal.EnumLite {
    RESPONSE_RANGE(1),
    RESPONSE_PUT(2),
    RESPONSE_DELETE_RANGE(3),
    RESPONSE_TXN(4),
    RESPONSE_NOT_SET(0);
    private final int value;
    ResponseCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static ResponseCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResponseCase forNumber(int value) {
      switch (value) {
        case 1: return RESPONSE_RANGE;
        case 2: return RESPONSE_PUT;
        case 3: return RESPONSE_DELETE_RANGE;
        case 4: return RESPONSE_TXN;
        case 0: return RESPONSE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  }

  /**
   * Protobuf type {@code etcdserverpb.ResponseOp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.ResponseOp)
      ResponseOpOrBuilder {
    private int responseCase_ = 0;
    private Object response_;
    private com.google.protobuf.SingleFieldBuilderV3<
        RangeResponse, RangeResponse.Builder, RangeResponseOrBuilder> responseRangeBuilder_;
    private com.google.protobuf.SingleFieldBuilderV3<
        PutResponse, PutResponse.Builder, PutResponseOrBuilder> responsePutBuilder_;
    private com.google.protobuf.SingleFieldBuilderV3<
        DeleteRangeResponse, DeleteRangeResponse.Builder, DeleteRangeResponseOrBuilder> responseDeleteRangeBuilder_;
    private com.google.protobuf.SingleFieldBuilderV3<
        TxnResponse, TxnResponse.Builder, TxnResponseOrBuilder> responseTxnBuilder_;

    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.ResponseOp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EtcdProto.internal_static_etcdserverpb_ResponseOp_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_ResponseOp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseOp.class, ResponseOp.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      responseCase_ = 0;
      response_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_ResponseOp_descriptor;
    }

    public ResponseOp getDefaultInstanceForType() {
      return ResponseOp.getDefaultInstance();
    }

    public ResponseOp build() {
      ResponseOp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ResponseOp buildPartial() {
      ResponseOp result = new ResponseOp(this);
      if (responseCase_ == 1) {
        if (responseRangeBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseRangeBuilder_.build();
        }
      }
      if (responseCase_ == 2) {
        if (responsePutBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responsePutBuilder_.build();
        }
      }
      if (responseCase_ == 3) {
        if (responseDeleteRangeBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseDeleteRangeBuilder_.build();
        }
      }
      if (responseCase_ == 4) {
        if (responseTxnBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseTxnBuilder_.build();
        }
      }
      result.responseCase_ = responseCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return super.clone();
    }

    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }

    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }

    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ResponseOp) {
        return mergeFrom((ResponseOp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ResponseOp other) {
      if (other == ResponseOp.getDefaultInstance()) return this;
      switch (other.getResponseCase()) {
        case RESPONSE_RANGE: {
          mergeResponseRange(other.getResponseRange());
          break;
        }
        case RESPONSE_PUT: {
          mergeResponsePut(other.getResponsePut());
          break;
        }
        case RESPONSE_DELETE_RANGE: {
          mergeResponseDeleteRange(other.getResponseDeleteRange());
          break;
        }
        case RESPONSE_TXN: {
          mergeResponseTxn(other.getResponseTxn());
          break;
        }
        case RESPONSE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      ResponseOp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ResponseOp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    public ResponseCase
        getResponseCase() {
      return ResponseCase.forNumber(
          responseCase_);
    }

    public Builder clearResponse() {
      responseCase_ = 0;
      response_ = null;
      onChanged();
      return this;
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    public boolean hasResponseRange() {
      return responseCase_ == 1;
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    public RangeResponse getResponseRange() {
      if (responseRangeBuilder_ == null) {
        if (responseCase_ == 1) {
          return (RangeResponse) response_;
        }
        return RangeResponse.getDefaultInstance();
      } else {
        if (responseCase_ == 1) {
          return responseRangeBuilder_.getMessage();
        }
        return RangeResponse.getDefaultInstance();
      }
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    public Builder setResponseRange(
        RangeResponse.Builder builderForValue) {
      if (responseRangeBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responseRangeBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 1;
      return this;
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    public Builder setResponseRange(RangeResponse value) {
      if (responseRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responseRangeBuilder_.setMessage(value);
      }
      responseCase_ = 1;
      return this;
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    public Builder mergeResponseRange(RangeResponse value) {
      if (responseRangeBuilder_ == null) {
        if (responseCase_ == 1 &&
            response_ != RangeResponse.getDefaultInstance()) {
          response_ = RangeResponse.newBuilder((RangeResponse) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 1) {
          responseRangeBuilder_.mergeFrom(value);
        }
        responseRangeBuilder_.setMessage(value);
      }
      responseCase_ = 1;
      return this;
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    public Builder clearResponseRange() {
      if (responseRangeBuilder_ == null) {
        if (responseCase_ == 1) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 1) {
          responseCase_ = 0;
          response_ = null;
        }
        responseRangeBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    public RangeResponse.Builder getResponseRangeBuilder() {
      return getResponseRangeFieldBuilder().getBuilder();
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    public RangeResponseOrBuilder getResponseRangeOrBuilder() {
      if ((responseCase_ == 1) && (responseRangeBuilder_ != null)) {
        return responseRangeBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 1) {
          return (RangeResponse) response_;
        }
        return RangeResponse.getDefaultInstance();
      }
    }

    /**
     * <code>.etcdserverpb.RangeResponse response_range = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        RangeResponse, RangeResponse.Builder, RangeResponseOrBuilder>
        getResponseRangeFieldBuilder() {
      if (responseRangeBuilder_ == null) {
        if (!(responseCase_ == 1)) {
          response_ = RangeResponse.getDefaultInstance();
        }
        responseRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            RangeResponse, RangeResponse.Builder, RangeResponseOrBuilder>(
                (RangeResponse) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 1;
      onChanged();
        return responseRangeBuilder_;
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    public boolean hasResponsePut() {
      return responseCase_ == 2;
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    public PutResponse getResponsePut() {
      if (responsePutBuilder_ == null) {
        if (responseCase_ == 2) {
          return (PutResponse) response_;
        }
        return PutResponse.getDefaultInstance();
      } else {
        if (responseCase_ == 2) {
          return responsePutBuilder_.getMessage();
        }
        return PutResponse.getDefaultInstance();
      }
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    public Builder setResponsePut(
        PutResponse.Builder builderForValue) {
      if (responsePutBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responsePutBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 2;
      return this;
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    public Builder setResponsePut(PutResponse value) {
      if (responsePutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responsePutBuilder_.setMessage(value);
      }
      responseCase_ = 2;
      return this;
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    public Builder mergeResponsePut(PutResponse value) {
      if (responsePutBuilder_ == null) {
        if (responseCase_ == 2 &&
            response_ != PutResponse.getDefaultInstance()) {
          response_ = PutResponse.newBuilder((PutResponse) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 2) {
          responsePutBuilder_.mergeFrom(value);
        }
        responsePutBuilder_.setMessage(value);
      }
      responseCase_ = 2;
      return this;
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    public Builder clearResponsePut() {
      if (responsePutBuilder_ == null) {
        if (responseCase_ == 2) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 2) {
          responseCase_ = 0;
          response_ = null;
        }
        responsePutBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    public PutResponse.Builder getResponsePutBuilder() {
      return getResponsePutFieldBuilder().getBuilder();
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    public PutResponseOrBuilder getResponsePutOrBuilder() {
      if ((responseCase_ == 2) && (responsePutBuilder_ != null)) {
        return responsePutBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 2) {
          return (PutResponse) response_;
        }
        return PutResponse.getDefaultInstance();
      }
    }

    /**
     * <code>.etcdserverpb.PutResponse response_put = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        PutResponse, PutResponse.Builder, PutResponseOrBuilder>
        getResponsePutFieldBuilder() {
      if (responsePutBuilder_ == null) {
        if (!(responseCase_ == 2)) {
          response_ = PutResponse.getDefaultInstance();
        }
        responsePutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            PutResponse, PutResponse.Builder, PutResponseOrBuilder>(
                (PutResponse) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 2;
      onChanged();
        return responsePutBuilder_;
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public boolean hasResponseDeleteRange() {
      return responseCase_ == 3;
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public DeleteRangeResponse getResponseDeleteRange() {
      if (responseDeleteRangeBuilder_ == null) {
        if (responseCase_ == 3) {
          return (DeleteRangeResponse) response_;
        }
        return DeleteRangeResponse.getDefaultInstance();
      } else {
        if (responseCase_ == 3) {
          return responseDeleteRangeBuilder_.getMessage();
        }
        return DeleteRangeResponse.getDefaultInstance();
      }
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public Builder setResponseDeleteRange(
        DeleteRangeResponse.Builder builderForValue) {
      if (responseDeleteRangeBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responseDeleteRangeBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 3;
      return this;
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public Builder setResponseDeleteRange(DeleteRangeResponse value) {
      if (responseDeleteRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responseDeleteRangeBuilder_.setMessage(value);
      }
      responseCase_ = 3;
      return this;
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public Builder mergeResponseDeleteRange(DeleteRangeResponse value) {
      if (responseDeleteRangeBuilder_ == null) {
        if (responseCase_ == 3 &&
            response_ != DeleteRangeResponse.getDefaultInstance()) {
          response_ = DeleteRangeResponse.newBuilder((DeleteRangeResponse) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 3) {
          responseDeleteRangeBuilder_.mergeFrom(value);
        }
        responseDeleteRangeBuilder_.setMessage(value);
      }
      responseCase_ = 3;
      return this;
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public Builder clearResponseDeleteRange() {
      if (responseDeleteRangeBuilder_ == null) {
        if (responseCase_ == 3) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 3) {
          responseCase_ = 0;
          response_ = null;
        }
        responseDeleteRangeBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public DeleteRangeResponse.Builder getResponseDeleteRangeBuilder() {
      return getResponseDeleteRangeFieldBuilder().getBuilder();
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public DeleteRangeResponseOrBuilder getResponseDeleteRangeOrBuilder() {
      if ((responseCase_ == 3) && (responseDeleteRangeBuilder_ != null)) {
        return responseDeleteRangeBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 3) {
          return (DeleteRangeResponse) response_;
        }
        return DeleteRangeResponse.getDefaultInstance();
      }
    }

    /**
     * <code>.etcdserverpb.DeleteRangeResponse response_delete_range = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        DeleteRangeResponse, DeleteRangeResponse.Builder, DeleteRangeResponseOrBuilder>
        getResponseDeleteRangeFieldBuilder() {
      if (responseDeleteRangeBuilder_ == null) {
        if (!(responseCase_ == 3)) {
          response_ = DeleteRangeResponse.getDefaultInstance();
        }
        responseDeleteRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            DeleteRangeResponse, DeleteRangeResponse.Builder, DeleteRangeResponseOrBuilder>(
                (DeleteRangeResponse) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 3;
      onChanged();
        return responseDeleteRangeBuilder_;
    }

    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    public boolean hasResponseTxn() {
      return responseCase_ == 4;
    }
    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    public TxnResponse getResponseTxn() {
      if (responseTxnBuilder_ == null) {
        if (responseCase_ == 4) {
          return (TxnResponse) response_;
        }
        return TxnResponse.getDefaultInstance();
      } else {
        if (responseCase_ == 4) {
          return responseTxnBuilder_.getMessage();
        }
        return TxnResponse.getDefaultInstance();
      }
    }

    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    public Builder setResponseTxn(
        TxnResponse.Builder builderForValue) {
      if (responseTxnBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responseTxnBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 4;
      return this;
    }

    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    public Builder setResponseTxn(TxnResponse value) {
      if (responseTxnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responseTxnBuilder_.setMessage(value);
      }
      responseCase_ = 4;
      return this;
    }

    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    public Builder mergeResponseTxn(TxnResponse value) {
      if (responseTxnBuilder_ == null) {
        if (responseCase_ == 4 &&
            response_ != TxnResponse.getDefaultInstance()) {
          response_ = TxnResponse.newBuilder((TxnResponse) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 4) {
          responseTxnBuilder_.mergeFrom(value);
        }
        responseTxnBuilder_.setMessage(value);
      }
      responseCase_ = 4;
      return this;
    }
    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    public Builder clearResponseTxn() {
      if (responseTxnBuilder_ == null) {
        if (responseCase_ == 4) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 4) {
          responseCase_ = 0;
          response_ = null;
        }
        responseTxnBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    public TxnResponse.Builder getResponseTxnBuilder() {
      return getResponseTxnFieldBuilder().getBuilder();
    }
    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    public TxnResponseOrBuilder getResponseTxnOrBuilder() {
      if ((responseCase_ == 4) && (responseTxnBuilder_ != null)) {
        return responseTxnBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 4) {
          return (TxnResponse) response_;
        }
        return TxnResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.etcdserverpb.TxnResponse response_txn = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        TxnResponse, TxnResponse.Builder, TxnResponseOrBuilder>
        getResponseTxnFieldBuilder() {
      if (responseTxnBuilder_ == null) {
        if (!(responseCase_ == 4)) {
          response_ = TxnResponse.getDefaultInstance();
        }
        responseTxnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            TxnResponse, TxnResponse.Builder, TxnResponseOrBuilder>(
                (TxnResponse) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 4;
      onChanged();
        return responseTxnBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.ResponseOp)
  }

}

