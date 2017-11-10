// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface MemberUpdateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.MemberUpdateResponse)
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
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  java.util.List<Member>
      getMembersList();
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  Member getMembers(int index);
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  java.util.List<? extends MemberOrBuilder>
      getMembersOrBuilderList();
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  MemberOrBuilder getMembersOrBuilder(
          int index);
}
