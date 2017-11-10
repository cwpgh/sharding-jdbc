// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.shardingjdbc.orchestration.reg.etcd.internal.stub;

public interface AuthRoleGrantPermissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AuthRoleGrantPermissionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is the name of the role which will be granted the permission.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  String getName();
  /**
   * <pre>
   * name is the name of the role which will be granted the permission.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * perm is the permission to grant to the role.
   * </pre>
   *
   * <code>.authpb.Permission perm = 2;</code>
   */
  boolean hasPerm();
  /**
   * <pre>
   * perm is the permission to grant to the role.
   * </pre>
   *
   * <code>.authpb.Permission perm = 2;</code>
   */
  Permission getPerm();
  /**
   * <pre>
   * perm is the permission to grant to the role.
   * </pre>
   *
   * <code>.authpb.Permission perm = 2;</code>
   */
  PermissionOrBuilder getPermOrBuilder();
}
