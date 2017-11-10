// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface DeleteRangeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.DeleteRangeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * key is the first key to delete in the range.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <pre>
   * range_end is the key following the last key to delete for the range [key, range_end).
   * If range_end is not given, the range is defined to contain only the key argument.
   * If range_end is one bit larger than the given key, then the range is all the keys
   * with the prefix (the given key).
   * If range_end is '&#92;0', the range is all keys greater than or equal to the key argument.
   * </pre>
   *
   * <code>bytes range_end = 2;</code>
   */
  com.google.protobuf.ByteString getRangeEnd();

  /**
   * <pre>
   * If prev_kv is set, etcd gets the previous key-value pairs before deleting it.
   * The previous key-value pairs will be returned in the delete response.
   * </pre>
   *
   * <code>bool prev_kv = 3;</code>
   */
  boolean getPrevKv();
}
