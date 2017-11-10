// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.AlarmMember}
 */
public  final class AlarmMember extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AlarmMember)
    AlarmMemberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlarmMember.newBuilder() to construct.
  private AlarmMember(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmMember() {
    memberID_ = 0L;
    alarm_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlarmMember(
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

            memberID_ = input.readUInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            alarm_ = rawValue;
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
    return EtcdProto.internal_static_etcdserverpb_AlarmMember_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_AlarmMember_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AlarmMember.class, AlarmMember.Builder.class);
  }

  public static final int MEMBERID_FIELD_NUMBER = 1;
  private long memberID_;
  /**
   * <pre>
   * memberID is the ID of the member associated with the raised alarm.
   * </pre>
   *
   * <code>uint64 memberID = 1;</code>
   */
  public long getMemberID() {
    return memberID_;
  }

  public static final int ALARM_FIELD_NUMBER = 2;
  private int alarm_;
  /**
   * <pre>
   * alarm is the type of alarm which has been raised.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmType alarm = 2;</code>
   */
  public int getAlarmValue() {
    return alarm_;
  }
  /**
   * <pre>
   * alarm is the type of alarm which has been raised.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmType alarm = 2;</code>
   */
  public AlarmType getAlarm() {
    AlarmType result = AlarmType.valueOf(alarm_);
    return result == null ? AlarmType.UNRECOGNIZED : result;
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
    if (memberID_ != 0L) {
      output.writeUInt64(1, memberID_);
    }
    if (alarm_ != AlarmType.NONE.getNumber()) {
      output.writeEnum(2, alarm_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (memberID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, memberID_);
    }
    if (alarm_ != AlarmType.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, alarm_);
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
    if (!(obj instanceof AlarmMember)) {
      return super.equals(obj);
    }
    AlarmMember other = (AlarmMember) obj;

    boolean result = true;
    result = result && (getMemberID()
        == other.getMemberID());
    result = result && alarm_ == other.alarm_;
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
    hash = (37 * hash) + MEMBERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemberID());
    hash = (37 * hash) + ALARM_FIELD_NUMBER;
    hash = (53 * hash) + alarm_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AlarmMember parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmMember parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmMember parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmMember parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmMember parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmMember parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmMember parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmMember parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmMember parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AlarmMember parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmMember parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmMember parseFrom(
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
  public static Builder newBuilder(AlarmMember prototype) {
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
   * Protobuf type {@code etcdserverpb.AlarmMember}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AlarmMember)
      AlarmMemberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EtcdProto.internal_static_etcdserverpb_AlarmMember_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_AlarmMember_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AlarmMember.class, AlarmMember.Builder.class);
    }

    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.AlarmMember.newBuilder()
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
      memberID_ = 0L;

      alarm_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_AlarmMember_descriptor;
    }

    public AlarmMember getDefaultInstanceForType() {
      return AlarmMember.getDefaultInstance();
    }

    public AlarmMember build() {
      AlarmMember result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AlarmMember buildPartial() {
      AlarmMember result = new AlarmMember(this);
      result.memberID_ = memberID_;
      result.alarm_ = alarm_;
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
      if (other instanceof AlarmMember) {
        return mergeFrom((AlarmMember)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AlarmMember other) {
      if (other == AlarmMember.getDefaultInstance()) return this;
      if (other.getMemberID() != 0L) {
        setMemberID(other.getMemberID());
      }
      if (other.alarm_ != 0) {
        setAlarmValue(other.getAlarmValue());
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
      AlarmMember parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AlarmMember) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long memberID_ ;
    /**
     * <pre>
     * memberID is the ID of the member associated with the raised alarm.
     * </pre>
     *
     * <code>uint64 memberID = 1;</code>
     */
    public long getMemberID() {
      return memberID_;
    }
    /**
     * <pre>
     * memberID is the ID of the member associated with the raised alarm.
     * </pre>
     *
     * <code>uint64 memberID = 1;</code>
     */
    public Builder setMemberID(long value) {

      memberID_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * memberID is the ID of the member associated with the raised alarm.
     * </pre>
     *
     * <code>uint64 memberID = 1;</code>
     */
    public Builder clearMemberID() {

      memberID_ = 0L;
      onChanged();
      return this;
    }

    private int alarm_ = 0;
    /**
     * <pre>
     * alarm is the type of alarm which has been raised.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 2;</code>
     */
    public int getAlarmValue() {
      return alarm_;
    }
    /**
     * <pre>
     * alarm is the type of alarm which has been raised.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 2;</code>
     */
    public Builder setAlarmValue(int value) {
      alarm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * alarm is the type of alarm which has been raised.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 2;</code>
     */
    public AlarmType getAlarm() {
      AlarmType result = AlarmType.valueOf(alarm_);
      return result == null ? AlarmType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * alarm is the type of alarm which has been raised.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 2;</code>
     */
    public Builder setAlarm(AlarmType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      alarm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * alarm is the type of alarm which has been raised.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 2;</code>
     */
    public Builder clearAlarm() {

      alarm_ = 0;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AlarmMember)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.AlarmMember)
  private static final AlarmMember DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AlarmMember();
  }

  public static AlarmMember getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmMember>
      PARSER = new com.google.protobuf.AbstractParser<AlarmMember>() {
    public AlarmMember parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AlarmMember(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlarmMember> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AlarmMember> getParserForType() {
    return PARSER;
  }

  public AlarmMember getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

