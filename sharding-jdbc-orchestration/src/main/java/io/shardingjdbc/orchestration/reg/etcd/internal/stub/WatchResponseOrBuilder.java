// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface WatchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.WatchResponse)
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
   * watch_id is the ID of the watcher that corresponds to the response.
   * </pre>
   *
   * <code>int64 watch_id = 2;</code>
   */
  long getWatchId();

  /**
   * <pre>
   * created is set to true if the response is for a create watch request.
   * The client should record the watch_id and expect to receive events for
   * the created watcher from the same stream.
   * All events sent to the created watcher will attach with the same watch_id.
   * </pre>
   *
   * <code>bool created = 3;</code>
   */
  boolean getCreated();

  /**
   * <pre>
   * canceled is set to true if the response is for a cancel watch request.
   * No further events will be sent to the canceled watcher.
   * </pre>
   *
   * <code>bool canceled = 4;</code>
   */
  boolean getCanceled();

  /**
   * <pre>
   * compact_revision is set to the minimum index if a watcher tries to watch
   * at a compacted index.
   * This happens when creating a watcher at a compacted revision or the watcher cannot
   * catch up with the progress of the key-value store.
   * The client should treat the watcher as canceled and should not try to create any
   * watcher with the same start_revision again.
   * </pre>
   *
   * <code>int64 compact_revision = 5;</code>
   */
  long getCompactRevision();

  /**
   * <pre>
   * cancel_reason indicates the reason for canceling the watcher.
   * </pre>
   *
   * <code>string cancel_reason = 6;</code>
   */
  String getCancelReason();
  /**
   * <pre>
   * cancel_reason indicates the reason for canceling the watcher.
   * </pre>
   *
   * <code>string cancel_reason = 6;</code>
   */
  com.google.protobuf.ByteString
      getCancelReasonBytes();

  /**
   * <code>repeated .mvccpb.Event events = 11;</code>
   */
  java.util.List<Event>
      getEventsList();
  /**
   * <code>repeated .mvccpb.Event events = 11;</code>
   */
  Event getEvents(int index);
  /**
   * <code>repeated .mvccpb.Event events = 11;</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .mvccpb.Event events = 11;</code>
   */
  java.util.List<? extends EventOrBuilder>
      getEventsOrBuilderList();
  /**
   * <code>repeated .mvccpb.Event events = 11;</code>
   */
  EventOrBuilder getEventsOrBuilder(
          int index);
}
