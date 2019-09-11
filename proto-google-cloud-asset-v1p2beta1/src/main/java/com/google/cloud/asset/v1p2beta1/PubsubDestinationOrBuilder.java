// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

public interface PubsubDestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.PubsubDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the Cloud Pub/Sub topic to publish to.
   * For example: `projects/PROJECT_ID/topics/TOPIC_ID`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * The name of the Cloud Pub/Sub topic to publish to.
   * For example: `projects/PROJECT_ID/topics/TOPIC_ID`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   */
  com.google.protobuf.ByteString getTopicBytes();
}