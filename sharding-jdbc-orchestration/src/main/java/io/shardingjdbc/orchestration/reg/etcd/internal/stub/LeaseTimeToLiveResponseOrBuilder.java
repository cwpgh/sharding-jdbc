// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface LeaseTimeToLiveResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.LeaseTimeToLiveResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * ID is the lease ID from the keep alive request.
   * </pre>
   *
   * <code>int64 ID = 2;</code>
   */
  long getID();

  /**
   * <pre>
   * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
   * </pre>
   *
   * <code>int64 TTL = 3;</code>
   */
  long getTTL();

  /**
   * <pre>
   * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
   * </pre>
   *
   * <code>int64 grantedTTL = 4;</code>
   */
  long getGrantedTTL();

  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getKeysList();
  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   */
  int getKeysCount();
  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   */
  com.google.protobuf.ByteString getKeys(int index);
}
