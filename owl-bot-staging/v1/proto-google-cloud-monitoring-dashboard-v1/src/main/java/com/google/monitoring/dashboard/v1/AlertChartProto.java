// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/alertchart.proto

package com.google.monitoring.dashboard.v1;

public final class AlertChartProto {
  private AlertChartProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_AlertChart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_AlertChart_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/monitoring/dashboard/v1/alertch" +
      "art.proto\022\036google.monitoring.dashboard.v" +
      "1\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\"|\n\nAlertChart\022\021\n\004n" +
      "ame\030\001 \001(\tB\003\340A\002:[\352AX\n%monitoring.googleap" +
      "is.com/AlertPolicy\022/projects/{project}/a" +
      "lertPolicies/{alert_policy}B\371\001\n\"com.goog" +
      "le.monitoring.dashboard.v1B\017AlertChartPr" +
      "otoP\001ZGgoogle.golang.org/genproto/google" +
      "apis/monitoring/dashboard/v1;dashboard\252\002" +
      "$Google.Cloud.Monitoring.Dashboard.V1\312\002$" +
      "Google\\Cloud\\Monitoring\\Dashboard\\V1\352\002(G" +
      "oogle::Cloud::Monitoring::Dashboard::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_monitoring_dashboard_v1_AlertChart_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_AlertChart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_AlertChart_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
