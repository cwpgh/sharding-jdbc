// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface RequestOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.RequestOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   */
  boolean hasRequestRange();
  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   */
  RangeRequest getRequestRange();
  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   */
  RangeRequestOrBuilder getRequestRangeOrBuilder();

  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   */
  boolean hasRequestPut();
  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   */
  PutRequest getRequestPut();
  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   */
  PutRequestOrBuilder getRequestPutOrBuilder();

  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   */
  boolean hasRequestDeleteRange();
  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   */
  DeleteRangeRequest getRequestDeleteRange();
  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   */
  DeleteRangeRequestOrBuilder getRequestDeleteRangeOrBuilder();

  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   */
  boolean hasRequestTxn();
  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   */
  TxnRequest getRequestTxn();
  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   */
  TxnRequestOrBuilder getRequestTxnOrBuilder();

  RequestOp.RequestCase getRequestCase();
}
