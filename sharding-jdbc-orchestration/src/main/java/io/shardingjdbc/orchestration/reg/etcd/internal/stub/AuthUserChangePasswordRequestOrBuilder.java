// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface AuthUserChangePasswordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AuthUserChangePasswordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is the name of the user whose password is being changed.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  String getName();
  /**
   * <pre>
   * name is the name of the user whose password is being changed.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * password is the new password for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   */
  String getPassword();
  /**
   * <pre>
   * password is the new password for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
