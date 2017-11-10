// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

/**
 * Protobuf type {@code etcdserverpb.AlarmRequest}
 */
public  final class AlarmRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AlarmRequest)
    AlarmRequestOrBuilder {
  public static final int ACTION_FIELD_NUMBER = 1;
  public static final int MEMBERID_FIELD_NUMBER = 2;
  public static final int ALARM_FIELD_NUMBER = 3;
private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:etcdserverpb.AlarmRequest)
  private static final AlarmRequest DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<AlarmRequest>
      PARSER = new com.google.protobuf.AbstractParser<AlarmRequest>() {
    public AlarmRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AlarmRequest(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new AlarmRequest();
  }

  private int action_;
  private long memberID_;
  private int alarm_;
  private byte memoizedIsInitialized = -1;
  // Use AlarmRequest.newBuilder() to construct.
  private AlarmRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AlarmRequest() {
    action_ = 0;
    memberID_ = 0L;
    alarm_ = 0;
  }
  private AlarmRequest(
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
            int rawValue = input.readEnum();

            action_ = rawValue;
            break;
          }
          case 16: {

            memberID_ = input.readUInt64();
            break;
          }
          case 24: {
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
    return EtcdProto.internal_static_etcdserverpb_AlarmRequest_descriptor;
  }

  public static AlarmRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AlarmRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AlarmRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AlarmRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AlarmRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static AlarmRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static AlarmRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static AlarmRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static AlarmRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static AlarmRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static AlarmRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

  public static AlarmRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(AlarmRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static AlarmRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<AlarmRequest> parser() {
    return PARSER;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EtcdProto.internal_static_etcdserverpb_AlarmRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AlarmRequest.class, AlarmRequest.Builder.class);
  }

  /**
   * <pre>
   * action is the kind of alarm request to issue. The action
   * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
   * raised alarm.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
   */
  public int getActionValue() {
    return action_;
  }

  /**
   * <pre>
   * action is the kind of alarm request to issue. The action
   * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
   * raised alarm.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
   */
  public AlarmRequest.AlarmAction getAction() {
    AlarmRequest.AlarmAction result = AlarmRequest.AlarmAction.valueOf(action_);
    return result == null ? AlarmRequest.AlarmAction.UNRECOGNIZED : result;
  }

  /**
   * <pre>
   * memberID is the ID of the member associated with the alarm. If memberID is 0, the
   * alarm request covers all members.
   * </pre>
   *
   * <code>uint64 memberID = 2;</code>
   */
  public long getMemberID() {
    return memberID_;
  }

  /**
   * <pre>
   * alarm is the type of alarm to consider for this request.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmType alarm = 3;</code>
   */
  public int getAlarmValue() {
    return alarm_;
  }

  /**
   * <pre>
   * alarm is the type of alarm to consider for this request.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmType alarm = 3;</code>
   */
  public AlarmType getAlarm() {
    AlarmType result = AlarmType.valueOf(alarm_);
    return result == null ? AlarmType.UNRECOGNIZED : result;
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
    if (action_ != AlarmRequest.AlarmAction.GET.getNumber()) {
      output.writeEnum(1, action_);
    }
    if (memberID_ != 0L) {
      output.writeUInt64(2, memberID_);
    }
    if (alarm_ != AlarmType.NONE.getNumber()) {
      output.writeEnum(3, alarm_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != AlarmRequest.AlarmAction.GET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, action_);
    }
    if (memberID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, memberID_);
    }
    if (alarm_ != AlarmType.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, alarm_);
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
    if (!(obj instanceof AlarmRequest)) {
      return super.equals(obj);
    }
    AlarmRequest other = (AlarmRequest) obj;

    boolean result = true;
    result = result && action_ == other.action_;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + MEMBERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemberID());
    hash = (37 * hash) + ALARM_FIELD_NUMBER;
    hash = (53 * hash) + alarm_;
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
  public com.google.protobuf.Parser<AlarmRequest> getParserForType() {
    return PARSER;
  }

  public AlarmRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf enum {@code etcdserverpb.AlarmRequest.AlarmAction}
   */
  public enum AlarmAction
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GET = 0;</code>
     */
    GET(0),
    /**
     * <code>ACTIVATE = 1;</code>
     */
    ACTIVATE(1),
    /**
     * <code>DEACTIVATE = 2;</code>
     */
    DEACTIVATE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GET = 0;</code>
     */
    public static final int GET_VALUE = 0;
    /**
     * <code>ACTIVATE = 1;</code>
     */
    public static final int ACTIVATE_VALUE = 1;
    /**
     * <code>DEACTIVATE = 2;</code>
     */
    public static final int DEACTIVATE_VALUE = 2;
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AlarmAction> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AlarmAction>() {
            public AlarmAction findValueByNumber(int number) {
              return AlarmAction.forNumber(number);
            }
          };
    private static final AlarmAction[] VALUES = values();
    private final int value;

    AlarmAction(int value) {
      this.value = value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static AlarmAction valueOf(int value) {
      return forNumber(value);
    }

    public static AlarmAction forNumber(int value) {
      switch (value) {
        case 0: return GET;
        case 1: return ACTIVATE;
        case 2: return DEACTIVATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AlarmAction>
        internalGetValueMap() {
      return internalValueMap;
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return AlarmRequest.getDescriptor().getEnumTypes().get(0);
    }

    public static AlarmAction valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    // @@protoc_insertion_point(enum_scope:etcdserverpb.AlarmRequest.AlarmAction)
  }

  /**
   * Protobuf type {@code etcdserverpb.AlarmRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AlarmRequest)
      AlarmRequestOrBuilder {
    private int action_ = 0;
    private long memberID_ ;
    private int alarm_ = 0;

    // Construct using io.shardingjdbc.orchestration.reg.etcd.internal.stub.AlarmRequest.newBuilder()
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
      return EtcdProto.internal_static_etcdserverpb_AlarmRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EtcdProto.internal_static_etcdserverpb_AlarmRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AlarmRequest.class, AlarmRequest.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    public Builder clear() {
      super.clear();
      action_ = 0;

      memberID_ = 0L;

      alarm_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EtcdProto.internal_static_etcdserverpb_AlarmRequest_descriptor;
    }

    public AlarmRequest getDefaultInstanceForType() {
      return AlarmRequest.getDefaultInstance();
    }

    public AlarmRequest build() {
      AlarmRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AlarmRequest buildPartial() {
      AlarmRequest result = new AlarmRequest(this);
      result.action_ = action_;
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
      if (other instanceof AlarmRequest) {
        return mergeFrom((AlarmRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AlarmRequest other) {
      if (other == AlarmRequest.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
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
      AlarmRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AlarmRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public int getActionValue() {
      return action_;
    }

    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public Builder setActionValue(int value) {
      action_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public AlarmRequest.AlarmAction getAction() {
      AlarmRequest.AlarmAction result = AlarmRequest.AlarmAction.valueOf(action_);
      return result == null ? AlarmRequest.AlarmAction.UNRECOGNIZED : result;
    }

    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public Builder setAction(AlarmRequest.AlarmAction value) {
      if (value == null) {
        throw new NullPointerException();
      }

      action_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public Builder clearAction() {

      action_ = 0;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * memberID is the ID of the member associated with the alarm. If memberID is 0, the
     * alarm request covers all members.
     * </pre>
     *
     * <code>uint64 memberID = 2;</code>
     */
    public long getMemberID() {
      return memberID_;
    }

    /**
     * <pre>
     * memberID is the ID of the member associated with the alarm. If memberID is 0, the
     * alarm request covers all members.
     * </pre>
     *
     * <code>uint64 memberID = 2;</code>
     */
    public Builder setMemberID(long value) {

      memberID_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * memberID is the ID of the member associated with the alarm. If memberID is 0, the
     * alarm request covers all members.
     * </pre>
     *
     * <code>uint64 memberID = 2;</code>
     */
    public Builder clearMemberID() {

      memberID_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
     */
    public int getAlarmValue() {
      return alarm_;
    }
    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
     */
    public Builder setAlarmValue(int value) {
      alarm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
     */
    public AlarmType getAlarm() {
      AlarmType result = AlarmType.valueOf(alarm_);
      return result == null ? AlarmType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
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
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AlarmRequest)
  }

}

