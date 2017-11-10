// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * <pre>
 * CompactionRequest compacts the key-value store up to a given revision. All superseded keys
 * with a revision less than the compaction revision will be removed.
 * </pre>
 *
 * Protobuf type {@code etcdserverpb.CompactionRequest}
 */
public  final class CompactionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.CompactionRequest)
    CompactionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompactionRequest.newBuilder() to construct.
  private CompactionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompactionRequest() {
    revision_ = 0L;
    physical_ = false;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompactionRequest(
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
          case 8: {

            revision_ = input.readInt64();
            break;
          }
          case 16: {

            physical_ = input.readBool();
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
    return EtcdProto.internal_static_etcdserverpb_CompactionRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_CompactionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CompactionRequest.class, CompactionRequest.Builder.class);
  }

  public static final int REVISION_FIELD_NUMBER = 1;
  private long revision_;
  /**
   * <pre>
   * revision is the key-value store revision for the compaction operation.
   * </pre>
   *
   * <code>int64 revision = 1;</code>
   */
  public long getRevision() {
    return revision_;
  }

  public static final int PHYSICAL_FIELD_NUMBER = 2;
  private boolean physical_;
  /**
   * <pre>
   * physical is set so the RPC will wait until the compaction is physically
   * applied to the local database such that compacted entries are totally
   * removed from the backend database.
   * </pre>
   *
   * <code>bool physical = 2;</code>
   */
  public boolean getPhysical() {
    return physical_;
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
    if (revision_ != 0L) {
      output.writeInt64(1, revision_);
    }
    if (physical_ != false) {
      output.writeBool(2, physical_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (revision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, revision_);
    }
    if (physical_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, physical_);
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
    if (!(obj instanceof CompactionRequest)) {
      return super.equals(obj);
    }
    CompactionRequest other = (CompactionRequest) obj;

    boolean result = true;
    result = result && (getRevision()
        == other.getRevision());
    result = result && (getPhysical()
        == other.getPhysical());
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
    hash = (37 * hash) + REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRevision());
    hash = (37 * hash) + PHYSICAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPhysical());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CompactionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompactionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompactionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompactionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompactionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompactionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompactionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CompactionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CompactionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CompactionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CompactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CompactionRequest parseFrom(
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
  public static Builder newBuilder(CompactionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
  /**
   * <pre>
   * CompactionRequest compacts the key-value store up to a given revision. All superseded keys
   * with a revision less than the compaction revision will be removed.
   * </pre>
   *
   * Protobuf type {@code etcdserverpb.CompactionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.CompactionRequest)
      CompactionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EtcdProto.internal_static_etcdserverpb_CompactionRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_CompactionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CompactionRequest.class, CompactionRequest.Builder.class);
    }

    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.CompactionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      revision_ = 0L;

      physical_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_CompactionRequest_descriptor;
    }

    public CompactionRequest getDefaultInstanceForType() {
      return CompactionRequest.getDefaultInstance();
    }

    public CompactionRequest build() {
      CompactionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public CompactionRequest buildPartial() {
      CompactionRequest result = new CompactionRequest(this);
      result.revision_ = revision_;
      result.physical_ = physical_;
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
      if (other instanceof CompactionRequest) {
        return mergeFrom((CompactionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CompactionRequest other) {
      if (other == CompactionRequest.getDefaultInstance()) return this;
      if (other.getRevision() != 0L) {
        setRevision(other.getRevision());
      }
      if (other.getPhysical() != false) {
        setPhysical(other.getPhysical());
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
      CompactionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CompactionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long revision_ ;
    /**
     * <pre>
     * revision is the key-value store revision for the compaction operation.
     * </pre>
     *
     * <code>int64 revision = 1;</code>
     */
    public long getRevision() {
      return revision_;
    }
    /**
     * <pre>
     * revision is the key-value store revision for the compaction operation.
     * </pre>
     *
     * <code>int64 revision = 1;</code>
     */
    public Builder setRevision(long value) {

      revision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * revision is the key-value store revision for the compaction operation.
     * </pre>
     *
     * <code>int64 revision = 1;</code>
     */
    public Builder clearRevision() {

      revision_ = 0L;
      onChanged();
      return this;
    }

    private boolean physical_ ;
    /**
     * <pre>
     * physical is set so the RPC will wait until the compaction is physically
     * applied to the local database such that compacted entries are totally
     * removed from the backend database.
     * </pre>
     *
     * <code>bool physical = 2;</code>
     */
    public boolean getPhysical() {
      return physical_;
    }
    /**
     * <pre>
     * physical is set so the RPC will wait until the compaction is physically
     * applied to the local database such that compacted entries are totally
     * removed from the backend database.
     * </pre>
     *
     * <code>bool physical = 2;</code>
     */
    public Builder setPhysical(boolean value) {

      physical_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * physical is set so the RPC will wait until the compaction is physically
     * applied to the local database such that compacted entries are totally
     * removed from the backend database.
     * </pre>
     *
     * <code>bool physical = 2;</code>
     */
    public Builder clearPhysical() {

      physical_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.CompactionRequest)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.CompactionRequest)
  private static final CompactionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CompactionRequest();
  }

  public static CompactionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompactionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CompactionRequest>() {
    public CompactionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CompactionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompactionRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CompactionRequest> getParserForType() {
    return PARSER;
  }

  public CompactionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

