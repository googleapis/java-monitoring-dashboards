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
// source: google/monitoring/dashboard/v1/dashboard_filter.proto

package com.google.monitoring.dashboard.v1;

public final class DashboardFilterProto {
  private DashboardFilterProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_DashboardFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_DashboardFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/monitoring/dashboard/v1/dashboa"
          + "rd_filter.proto\022\036google.monitoring.dashb"
          + "oard.v1\032\037google/api/field_behavior.proto"
          + "\"\317\002\n\017DashboardFilter\022\026\n\tlabel_key\030\001 \001(\tB"
          + "\003\340A\002\022\031\n\021template_variable\030\003 \001(\t\022\026\n\014strin"
          + "g_value\030\004 \001(\tH\000\022O\n\013filter_type\030\005 \001(\0162:.g"
          + "oogle.monitoring.dashboard.v1.DashboardF"
          + "ilter.FilterType\"\216\001\n\nFilterType\022\033\n\027FILTE"
          + "R_TYPE_UNSPECIFIED\020\000\022\022\n\016RESOURCE_LABEL\020\001"
          + "\022\020\n\014METRIC_LABEL\020\002\022\027\n\023USER_METADATA_LABE"
          + "L\020\003\022\031\n\025SYSTEM_METADATA_LABEL\020\004\022\t\n\005GROUP\020"
          + "\005B\017\n\rdefault_valueB\376\001\n\"com.google.monito"
          + "ring.dashboard.v1B\024DashboardFilterProtoP"
          + "\001ZGgoogle.golang.org/genproto/googleapis"
          + "/monitoring/dashboard/v1;dashboard\252\002$Goo"
          + "gle.Cloud.Monitoring.Dashboard.V1\312\002$Goog"
          + "le\\Cloud\\Monitoring\\Dashboard\\V1\352\002(Googl"
          + "e::Cloud::Monitoring::Dashboard::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_DashboardFilter_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_DashboardFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_DashboardFilter_descriptor,
            new java.lang.String[] {
              "LabelKey", "TemplateVariable", "StringValue", "FilterType", "DefaultValue",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
