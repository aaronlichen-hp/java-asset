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
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

public final class AssetProto {
  private AssetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_TemporalAsset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_TemporalAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_TimeWindow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_TimeWindow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_Asset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_Resource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_ResourceSearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_ResourceSearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_VersionedResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_VersionedResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_AttachedResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_AttachedResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_ConditionEvaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_ConditionEvaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Resource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Access_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Access_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Identity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Identity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Edge_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Edge_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_AccessControlList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_AccessControlList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_IdentityList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_IdentityList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/asset/v1/assets.proto\022\025go"
          + "ogle.cloud.asset.v1\032\031google/api/resource"
          + ".proto\032)google/cloud/orgpolicy/v1/orgpol"
          + "icy.proto\032\032google/iam/v1/policy.proto\032:g"
          + "oogle/identity/accesscontextmanager/v1/a"
          + "ccess_level.proto\032;google/identity/acces"
          + "scontextmanager/v1/access_policy.proto\032("
          + "google/cloud/osconfig/v1/inventory.proto"
          + "\032?google/identity/accesscontextmanager/v"
          + "1/service_perimeter.proto\032\034google/protob"
          + "uf/struct.proto\032\037google/protobuf/timesta"
          + "mp.proto\032\025google/rpc/code.proto\"\365\002\n\rTemp"
          + "oralAsset\0221\n\006window\030\001 \001(\0132!.google.cloud"
          + ".asset.v1.TimeWindow\022\017\n\007deleted\030\002 \001(\010\022+\n"
          + "\005asset\030\003 \001(\0132\034.google.cloud.asset.v1.Ass"
          + "et\022O\n\021prior_asset_state\030\004 \001(\01624.google.c"
          + "loud.asset.v1.TemporalAsset.PriorAssetSt"
          + "ate\0221\n\013prior_asset\030\005 \001(\0132\034.google.cloud."
          + "asset.v1.Asset\"o\n\017PriorAssetState\022!\n\035PRI"
          + "OR_ASSET_STATE_UNSPECIFIED\020\000\022\013\n\007PRESENT\020"
          + "\001\022\013\n\007INVALID\020\002\022\022\n\016DOES_NOT_EXIST\020\003\022\013\n\007DE"
          + "LETED\020\004\"j\n\nTimeWindow\022.\n\nstart_time\030\001 \001("
          + "\0132\032.google.protobuf.Timestamp\022,\n\010end_tim"
          + "e\030\002 \001(\0132\032.google.protobuf.Timestamp\"\365\004\n\005"
          + "Asset\022/\n\013update_time\030\013 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022\014\n\004name\030\001 \001(\t\022\022\n\nasset_ty"
          + "pe\030\002 \001(\t\0221\n\010resource\030\003 \001(\0132\037.google.clou"
          + "d.asset.v1.Resource\022)\n\niam_policy\030\004 \001(\0132"
          + "\025.google.iam.v1.Policy\0225\n\norg_policy\030\006 \003"
          + "(\0132!.google.cloud.orgpolicy.v1.Policy\022N\n"
          + "\raccess_policy\030\007 \001(\01325.google.identity.a"
          + "ccesscontextmanager.v1.AccessPolicyH\000\022L\n"
          + "\014access_level\030\010 \001(\01324.google.identity.ac"
          + "cesscontextmanager.v1.AccessLevelH\000\022V\n\021s"
          + "ervice_perimeter\030\t \001(\01329.google.identity"
          + ".accesscontextmanager.v1.ServicePerimete"
          + "rH\000\0229\n\014os_inventory\030\014 \001(\0132#.google.cloud"
          + ".osconfig.v1.Inventory\022\021\n\tancestors\030\n \003("
          + "\t:\'\352A$\n\037cloudasset.googleapis.com/Asset\022"
          + "\001*B\027\n\025access_context_policy\"\262\001\n\010Resource"
          + "\022\017\n\007version\030\001 \001(\t\022\036\n\026discovery_document_"
          + "uri\030\002 \001(\t\022\026\n\016discovery_name\030\003 \001(\t\022\024\n\014res"
          + "ource_url\030\004 \001(\t\022\016\n\006parent\030\005 \001(\t\022%\n\004data\030"
          + "\006 \001(\0132\027.google.protobuf.Struct\022\020\n\010locati"
          + "on\030\010 \001(\t\"\277\005\n\024ResourceSearchResult\022\014\n\004nam"
          + "e\030\001 \001(\t\022\022\n\nasset_type\030\002 \001(\t\022\017\n\007project\030\003"
          + " \001(\t\022\017\n\007folders\030\021 \003(\t\022\024\n\014organization\030\022 "
          + "\001(\t\022\024\n\014display_name\030\004 \001(\t\022\023\n\013description"
          + "\030\005 \001(\t\022\020\n\010location\030\006 \001(\t\022G\n\006labels\030\007 \003(\013"
          + "27.google.cloud.asset.v1.ResourceSearchR"
          + "esult.LabelsEntry\022\024\n\014network_tags\030\010 \003(\t\022"
          + "\017\n\007kms_key\030\n \001(\t\022/\n\013create_time\030\013 \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013update_time"
          + "\030\014 \001(\0132\032.google.protobuf.Timestamp\022\r\n\005st"
          + "ate\030\r \001(\t\0226\n\025additional_attributes\030\t \001(\013"
          + "2\027.google.protobuf.Struct\022!\n\031parent_full"
          + "_resource_name\030\023 \001(\t\022E\n\023versioned_resour"
          + "ces\030\020 \003(\0132(.google.cloud.asset.v1.Versio"
          + "nedResource\022C\n\022attached_resources\030\024 \003(\0132"
          + "\'.google.cloud.asset.v1.AttachedResource"
          + "\022\031\n\021parent_asset_type\030g \001(\t\032-\n\013LabelsEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"O\n\021Ve"
          + "rsionedResource\022\017\n\007version\030\001 \001(\t\022)\n\010reso"
          + "urce\030\002 \001(\0132\027.google.protobuf.Struct\"m\n\020A"
          + "ttachedResource\022\022\n\nasset_type\030\001 \001(\t\022E\n\023v"
          + "ersioned_resources\030\003 \003(\0132(.google.cloud."
          + "asset.v1.VersionedResource\"\217\004\n\025IamPolicy"
          + "SearchResult\022\020\n\010resource\030\001 \001(\t\022\022\n\nasset_"
          + "type\030\005 \001(\t\022\017\n\007project\030\002 \001(\t\022\017\n\007folders\030\006"
          + " \003(\t\022\024\n\014organization\030\007 \001(\t\022%\n\006policy\030\003 \001"
          + "(\0132\025.google.iam.v1.Policy\022M\n\013explanation"
          + "\030\004 \001(\01328.google.cloud.asset.v1.IamPolicy"
          + "SearchResult.Explanation\032\241\002\n\013Explanation"
          + "\022m\n\023matched_permissions\030\001 \003(\0132P.google.c"
          + "loud.asset.v1.IamPolicySearchResult.Expl"
          + "anation.MatchedPermissionsEntry\032\"\n\013Permi"
          + "ssions\022\023\n\013permissions\030\001 \003(\t\032\177\n\027MatchedPe"
          + "rmissionsEntry\022\013\n\003key\030\001 \001(\t\022S\n\005value\030\002 \001"
          + "(\0132D.google.cloud.asset.v1.IamPolicySear"
          + "chResult.Explanation.Permissions:\0028\001\"G\n\026"
          + "IamPolicyAnalysisState\022\036\n\004code\030\001 \001(\0162\020.g"
          + "oogle.rpc.Code\022\r\n\005cause\030\002 \001(\t\"\306\001\n\023Condit"
          + "ionEvaluation\022T\n\020evaluation_value\030\001 \001(\0162"
          + ":.google.cloud.asset.v1.ConditionEvaluat"
          + "ion.EvaluationValue\"Y\n\017EvaluationValue\022 "
          + "\n\034EVALUATION_VALUE_UNSPECIFIED\020\000\022\010\n\004TRUE"
          + "\020\001\022\t\n\005FALSE\020\002\022\017\n\013CONDITIONAL\020\003\"\253\t\n\027IamPo"
          + "licyAnalysisResult\022#\n\033attached_resource_"
          + "full_name\030\001 \001(\t\022+\n\013iam_binding\030\002 \001(\0132\026.g"
          + "oogle.iam.v1.Binding\022^\n\024access_control_l"
          + "ists\030\003 \003(\0132@.google.cloud.asset.v1.IamPo"
          + "licyAnalysisResult.AccessControlList\022R\n\r"
          + "identity_list\030\004 \001(\0132;.google.cloud.asset"
          + ".v1.IamPolicyAnalysisResult.IdentityList"
          + "\022\026\n\016fully_explored\030\005 \001(\010\032m\n\010Resource\022\032\n\022"
          + "full_resource_name\030\001 \001(\t\022E\n\016analysis_sta"
          + "te\030\002 \001(\0132-.google.cloud.asset.v1.IamPoli"
          + "cyAnalysisState\032\205\001\n\006Access\022\016\n\004role\030\001 \001(\t"
          + "H\000\022\024\n\npermission\030\002 \001(\tH\000\022E\n\016analysis_sta"
          + "te\030\003 \001(\0132-.google.cloud.asset.v1.IamPoli"
          + "cyAnalysisStateB\016\n\014oneof_access\032_\n\010Ident"
          + "ity\022\014\n\004name\030\001 \001(\t\022E\n\016analysis_state\030\002 \001("
          + "\0132-.google.cloud.asset.v1.IamPolicyAnaly"
          + "sisState\0320\n\004Edge\022\023\n\013source_node\030\001 \001(\t\022\023\n"
          + "\013target_node\030\002 \001(\t\032\277\002\n\021AccessControlList"
          + "\022J\n\tresources\030\001 \003(\01327.google.cloud.asset"
          + ".v1.IamPolicyAnalysisResult.Resource\022G\n\010"
          + "accesses\030\002 \003(\01325.google.cloud.asset.v1.I"
          + "amPolicyAnalysisResult.Access\022K\n\016resourc"
          + "e_edges\030\003 \003(\01323.google.cloud.asset.v1.Ia"
          + "mPolicyAnalysisResult.Edge\022H\n\024condition_"
          + "evaluation\030\004 \001(\0132*.google.cloud.asset.v1"
          + ".ConditionEvaluation\032\245\001\n\014IdentityList\022K\n"
          + "\nidentities\030\001 \003(\01327.google.cloud.asset.v"
          + "1.IamPolicyAnalysisResult.Identity\022H\n\013gr"
          + "oup_edges\030\002 \003(\01323.google.cloud.asset.v1."
          + "IamPolicyAnalysisResult.EdgeB\230\001\n\031com.goo"
          + "gle.cloud.asset.v1B\nAssetProtoP\001Z:google"
          + ".golang.org/genproto/googleapis/cloud/as"
          + "set/v1;asset\370\001\001\252\002\025Google.Cloud.Asset.V1\312"
          + "\002\025Google\\Cloud\\Asset\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor(),
              com.google.cloud.osconfig.v1.Inventories.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.CodeProto.getDescriptor(),
            });
    internal_static_google_cloud_asset_v1_TemporalAsset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1_TemporalAsset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_TemporalAsset_descriptor,
            new java.lang.String[] {
              "Window", "Deleted", "Asset", "PriorAssetState", "PriorAsset",
            });
    internal_static_google_cloud_asset_v1_TimeWindow_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1_TimeWindow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_TimeWindow_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_asset_v1_Asset_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1_Asset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_Asset_descriptor,
            new java.lang.String[] {
              "UpdateTime",
              "Name",
              "AssetType",
              "Resource",
              "IamPolicy",
              "OrgPolicy",
              "AccessPolicy",
              "AccessLevel",
              "ServicePerimeter",
              "OsInventory",
              "Ancestors",
              "AccessContextPolicy",
            });
    internal_static_google_cloud_asset_v1_Resource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1_Resource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_Resource_descriptor,
            new java.lang.String[] {
              "Version",
              "DiscoveryDocumentUri",
              "DiscoveryName",
              "ResourceUrl",
              "Parent",
              "Data",
              "Location",
            });
    internal_static_google_cloud_asset_v1_ResourceSearchResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_asset_v1_ResourceSearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_ResourceSearchResult_descriptor,
            new java.lang.String[] {
              "Name",
              "AssetType",
              "Project",
              "Folders",
              "Organization",
              "DisplayName",
              "Description",
              "Location",
              "Labels",
              "NetworkTags",
              "KmsKey",
              "CreateTime",
              "UpdateTime",
              "State",
              "AdditionalAttributes",
              "ParentFullResourceName",
              "VersionedResources",
              "AttachedResources",
              "ParentAssetType",
            });
    internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_descriptor =
        internal_static_google_cloud_asset_v1_ResourceSearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_asset_v1_VersionedResource_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_asset_v1_VersionedResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_VersionedResource_descriptor,
            new java.lang.String[] {
              "Version", "Resource",
            });
    internal_static_google_cloud_asset_v1_AttachedResource_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_asset_v1_AttachedResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_AttachedResource_descriptor,
            new java.lang.String[] {
              "AssetType", "VersionedResources",
            });
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicySearchResult_descriptor,
            new java.lang.String[] {
              "Resource",
              "AssetType",
              "Project",
              "Folders",
              "Organization",
              "Policy",
              "Explanation",
            });
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicySearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor,
            new java.lang.String[] {
              "MatchedPermissions",
            });
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_descriptor,
            new java.lang.String[] {
              "Permissions",
            });
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_descriptor,
            new java.lang.String[] {
              "Code", "Cause",
            });
    internal_static_google_cloud_asset_v1_ConditionEvaluation_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_asset_v1_ConditionEvaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_ConditionEvaluation_descriptor,
            new java.lang.String[] {
              "EvaluationValue",
            });
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor,
            new java.lang.String[] {
              "AttachedResourceFullName",
              "IamBinding",
              "AccessControlLists",
              "IdentityList",
              "FullyExplored",
            });
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Resource_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Resource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Resource_descriptor,
            new java.lang.String[] {
              "FullResourceName", "AnalysisState",
            });
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Access_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Access_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Access_descriptor,
            new java.lang.String[] {
              "Role", "Permission", "AnalysisState", "OneofAccess",
            });
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Identity_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Identity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Identity_descriptor,
            new java.lang.String[] {
              "Name", "AnalysisState",
            });
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Edge_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Edge_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_Edge_descriptor,
            new java.lang.String[] {
              "SourceNode", "TargetNode",
            });
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_AccessControlList_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_AccessControlList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_AccessControlList_descriptor,
            new java.lang.String[] {
              "Resources", "Accesses", "ResourceEdges", "ConditionEvaluation",
            });
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_IdentityList_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_IdentityList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicyAnalysisResult_IdentityList_descriptor,
            new java.lang.String[] {
              "Identities", "GroupEdges",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor();
    com.google.cloud.osconfig.v1.Inventories.getDescriptor();
    com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.CodeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
