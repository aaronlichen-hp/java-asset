/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * The request message for performing resource move analysis.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.AnalyzeMoveRequest}
 */
public final class AnalyzeMoveRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.AnalyzeMoveRequest)
    AnalyzeMoveRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnalyzeMoveRequest.newBuilder() to construct.
  private AnalyzeMoveRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnalyzeMoveRequest() {
    resource_ = "";
    destinationParent_ = "";
    view_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AnalyzeMoveRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AnalyzeMoveRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              resource_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              destinationParent_ = s;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              view_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_AnalyzeMoveRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_AnalyzeMoveRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.AnalyzeMoveRequest.class,
            com.google.cloud.asset.v1.AnalyzeMoveRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * View enum for supporting partial analysis responses.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView}
   */
  public enum AnalysisView implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The default/unset value.
     * The API will default to the FULL view.
     * </pre>
     *
     * <code>ANALYSIS_VIEW_UNSPECIFIED = 0;</code>
     */
    ANALYSIS_VIEW_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Full analysis including all level of impacts of the specified resource
     * move.
     * </pre>
     *
     * <code>FULL = 1;</code>
     */
    FULL(1),
    /**
     *
     *
     * <pre>
     * Basic analysis only including blockers which will prevent the specified
     * resource move at runtime.
     * </pre>
     *
     * <code>BASIC = 2;</code>
     */
    BASIC(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The default/unset value.
     * The API will default to the FULL view.
     * </pre>
     *
     * <code>ANALYSIS_VIEW_UNSPECIFIED = 0;</code>
     */
    public static final int ANALYSIS_VIEW_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Full analysis including all level of impacts of the specified resource
     * move.
     * </pre>
     *
     * <code>FULL = 1;</code>
     */
    public static final int FULL_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Basic analysis only including blockers which will prevent the specified
     * resource move at runtime.
     * </pre>
     *
     * <code>BASIC = 2;</code>
     */
    public static final int BASIC_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AnalysisView valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AnalysisView forNumber(int value) {
      switch (value) {
        case 0:
          return ANALYSIS_VIEW_UNSPECIFIED;
        case 1:
          return FULL;
        case 2:
          return BASIC;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AnalysisView> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AnalysisView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AnalysisView>() {
          public AnalysisView findValueByNumber(int number) {
            return AnalysisView.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.asset.v1.AnalyzeMoveRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final AnalysisView[] VALUES = values();

    public static AnalysisView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AnalysisView(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView)
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object resource_;
  /**
   *
   *
   * <pre>
   * Required. Name of the resource to perform the analysis against.
   * Only GCP Project are supported as of today. Hence, this can only be Project
   * ID (such as "projects/my-project-id") or a Project Number (such as
   * "projects/12345").
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the resource to perform the analysis against.
   * Only GCP Project are supported as of today. Hence, this can only be Project
   * ID (such as "projects/my-project-id") or a Project Number (such as
   * "projects/12345").
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_PARENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object destinationParent_;
  /**
   *
   *
   * <pre>
   * Required. Name of the GCP Folder or Organization to reparent the target
   * resource. The analysis will be performed against hypothetically moving the
   * resource to this specified desitination parent. This can only be a Folder
   * number (such as "folders/123") or an Organization number (such as
   * "organizations/123").
   * </pre>
   *
   * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The destinationParent.
   */
  @java.lang.Override
  public java.lang.String getDestinationParent() {
    java.lang.Object ref = destinationParent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationParent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the GCP Folder or Organization to reparent the target
   * resource. The analysis will be performed against hypothetically moving the
   * resource to this specified desitination parent. This can only be a Folder
   * number (such as "folders/123") or an Organization number (such as
   * "organizations/123").
   * </pre>
   *
   * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for destinationParent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationParentBytes() {
    java.lang.Object ref = destinationParent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destinationParent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 3;
  private int view_;
  /**
   *
   *
   * <pre>
   * Analysis view indicating what information should be included in the
   * analysis response. If unspecified, the default view is FULL.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override
  public int getViewValue() {
    return view_;
  }
  /**
   *
   *
   * <pre>
   * Analysis view indicating what information should be included in the
   * analysis response. If unspecified, the default view is FULL.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
   *
   * @return The view.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView getView() {
    @SuppressWarnings("deprecation")
    com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView result =
        com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView.valueOf(view_);
    return result == null
        ? com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resource_);
    }
    if (!getDestinationParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationParent_);
    }
    if (view_
        != com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView.ANALYSIS_VIEW_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, view_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resource_);
    }
    if (!getDestinationParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destinationParent_);
    }
    if (view_
        != com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView.ANALYSIS_VIEW_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, view_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.asset.v1.AnalyzeMoveRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.AnalyzeMoveRequest other =
        (com.google.cloud.asset.v1.AnalyzeMoveRequest) obj;

    if (!getResource().equals(other.getResource())) return false;
    if (!getDestinationParent().equals(other.getDestinationParent())) return false;
    if (view_ != other.view_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (37 * hash) + DESTINATION_PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationParent().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.asset.v1.AnalyzeMoveRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request message for performing resource move analysis.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.AnalyzeMoveRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.AnalyzeMoveRequest)
      com.google.cloud.asset.v1.AnalyzeMoveRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_AnalyzeMoveRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_AnalyzeMoveRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.AnalyzeMoveRequest.class,
              com.google.cloud.asset.v1.AnalyzeMoveRequest.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.AnalyzeMoveRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      resource_ = "";

      destinationParent_ = "";

      view_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_AnalyzeMoveRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.AnalyzeMoveRequest getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.AnalyzeMoveRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.AnalyzeMoveRequest build() {
      com.google.cloud.asset.v1.AnalyzeMoveRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.AnalyzeMoveRequest buildPartial() {
      com.google.cloud.asset.v1.AnalyzeMoveRequest result =
          new com.google.cloud.asset.v1.AnalyzeMoveRequest(this);
      result.resource_ = resource_;
      result.destinationParent_ = destinationParent_;
      result.view_ = view_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.asset.v1.AnalyzeMoveRequest) {
        return mergeFrom((com.google.cloud.asset.v1.AnalyzeMoveRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.AnalyzeMoveRequest other) {
      if (other == com.google.cloud.asset.v1.AnalyzeMoveRequest.getDefaultInstance()) return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (!other.getDestinationParent().isEmpty()) {
        destinationParent_ = other.destinationParent_;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.asset.v1.AnalyzeMoveRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1.AnalyzeMoveRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the resource to perform the analysis against.
     * Only GCP Project are supported as of today. Hence, this can only be Project
     * ID (such as "projects/my-project-id") or a Project Number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the resource to perform the analysis against.
     * Only GCP Project are supported as of today. Hence, this can only be Project
     * ID (such as "projects/my-project-id") or a Project Number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the resource to perform the analysis against.
     * Only GCP Project are supported as of today. Hence, this can only be Project
     * ID (such as "projects/my-project-id") or a Project Number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the resource to perform the analysis against.
     * Only GCP Project are supported as of today. Hence, this can only be Project
     * ID (such as "projects/my-project-id") or a Project Number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {

      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the resource to perform the analysis against.
     * Only GCP Project are supported as of today. Hence, this can only be Project
     * ID (such as "projects/my-project-id") or a Project Number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resource_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object destinationParent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the GCP Folder or Organization to reparent the target
     * resource. The analysis will be performed against hypothetically moving the
     * resource to this specified desitination parent. This can only be a Folder
     * number (such as "folders/123") or an Organization number (such as
     * "organizations/123").
     * </pre>
     *
     * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The destinationParent.
     */
    public java.lang.String getDestinationParent() {
      java.lang.Object ref = destinationParent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationParent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the GCP Folder or Organization to reparent the target
     * resource. The analysis will be performed against hypothetically moving the
     * resource to this specified desitination parent. This can only be a Folder
     * number (such as "folders/123") or an Organization number (such as
     * "organizations/123").
     * </pre>
     *
     * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for destinationParent.
     */
    public com.google.protobuf.ByteString getDestinationParentBytes() {
      java.lang.Object ref = destinationParent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destinationParent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the GCP Folder or Organization to reparent the target
     * resource. The analysis will be performed against hypothetically moving the
     * resource to this specified desitination parent. This can only be a Folder
     * number (such as "folders/123") or an Organization number (such as
     * "organizations/123").
     * </pre>
     *
     * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The destinationParent to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      destinationParent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the GCP Folder or Organization to reparent the target
     * resource. The analysis will be performed against hypothetically moving the
     * resource to this specified desitination parent. This can only be a Folder
     * number (such as "folders/123") or an Organization number (such as
     * "organizations/123").
     * </pre>
     *
     * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestinationParent() {

      destinationParent_ = getDefaultInstance().getDestinationParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the GCP Folder or Organization to reparent the target
     * resource. The analysis will be performed against hypothetically moving the
     * resource to this specified desitination parent. This can only be a Folder
     * number (such as "folders/123") or an Organization number (such as
     * "organizations/123").
     * </pre>
     *
     * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for destinationParent to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      destinationParent_ = value;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     *
     *
     * <pre>
     * Analysis view indicating what information should be included in the
     * analysis response. If unspecified, the default view is FULL.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
     *
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override
    public int getViewValue() {
      return view_;
    }
    /**
     *
     *
     * <pre>
     * Analysis view indicating what information should be included in the
     * analysis response. If unspecified, the default view is FULL.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
     *
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {

      view_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Analysis view indicating what information should be included in the
     * analysis response. If unspecified, the default view is FULL.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
     *
     * @return The view.
     */
    @java.lang.Override
    public com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView getView() {
      @SuppressWarnings("deprecation")
      com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView result =
          com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView.valueOf(view_);
      return result == null
          ? com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Analysis view indicating what information should be included in the
     * analysis response. If unspecified, the default view is FULL.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
     *
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView value) {
      if (value == null) {
        throw new NullPointerException();
      }

      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Analysis view indicating what information should be included in the
     * analysis response. If unspecified, the default view is FULL.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.AnalyzeMoveRequest.AnalysisView view = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearView() {

      view_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.AnalyzeMoveRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.AnalyzeMoveRequest)
  private static final com.google.cloud.asset.v1.AnalyzeMoveRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.AnalyzeMoveRequest();
  }

  public static com.google.cloud.asset.v1.AnalyzeMoveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyzeMoveRequest> PARSER =
      new com.google.protobuf.AbstractParser<AnalyzeMoveRequest>() {
        @java.lang.Override
        public AnalyzeMoveRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AnalyzeMoveRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AnalyzeMoveRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyzeMoveRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.AnalyzeMoveRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
