// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/dashboards_service.proto

package com.google.monitoring.dashboard.v1;

public final class DashboardsServiceProto {
  private DashboardsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/monitoring/dashboard/v1/dashboa" +
      "rds_service.proto\022\036google.monitoring.das" +
      "hboard.v1\032\034google/api/annotations.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032.google/monitoring/d" +
      "ashboard/v1/dashboard.proto\032\033google/prot" +
      "obuf/empty.proto\032 google/protobuf/field_" +
      "mask.proto\032\027google/api/client.proto\"\207\001\n\026" +
      "CreateDashboardRequest\022\023\n\006parent\030\001 \001(\tB\003" +
      "\340A\002\022A\n\tdashboard\030\002 \001(\0132).google.monitori" +
      "ng.dashboard.v1.DashboardB\003\340A\002\022\025\n\rvalida" +
      "te_only\030\003 \001(\010\"\203\001\n\025ListDashboardsRequest\022" +
      "C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloudresourcema" +
      "nager.googleapis.com/Project\022\021\n\tpage_siz" +
      "e\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"p\n\026ListDashb" +
      "oardsResponse\022=\n\ndashboards\030\001 \003(\0132).goog" +
      "le.monitoring.dashboard.v1.Dashboard\022\027\n\017" +
      "next_page_token\030\002 \001(\t\"P\n\023GetDashboardReq" +
      "uest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#monitoring.g" +
      "oogleapis.com/Dashboard\"S\n\026DeleteDashboa" +
      "rdRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#monitor" +
      "ing.googleapis.com/Dashboard\"r\n\026UpdateDa" +
      "shboardRequest\022A\n\tdashboard\030\001 \001(\0132).goog" +
      "le.monitoring.dashboard.v1.DashboardB\003\340A" +
      "\002\022\025\n\rvalidate_only\030\003 \001(\0102\261\010\n\021DashboardsS" +
      "ervice\022\253\001\n\017CreateDashboard\0226.google.moni" +
      "toring.dashboard.v1.CreateDashboardReque" +
      "st\032).google.monitoring.dashboard.v1.Dash" +
      "board\"5\202\323\344\223\002/\"\"/v1/{parent=projects/*}/d" +
      "ashboards:\tdashboard\022\253\001\n\016ListDashboards\022" +
      "5.google.monitoring.dashboard.v1.ListDas" +
      "hboardsRequest\0326.google.monitoring.dashb" +
      "oard.v1.ListDashboardsResponse\"*\202\323\344\223\002$\022\"" +
      "/v1/{parent=projects/*}/dashboards\022\232\001\n\014G" +
      "etDashboard\0223.google.monitoring.dashboar" +
      "d.v1.GetDashboardRequest\032).google.monito" +
      "ring.dashboard.v1.Dashboard\"*\202\323\344\223\002$\022\"/v1" +
      "/{name=projects/*/dashboards/*}\022\215\001\n\017Dele" +
      "teDashboard\0226.google.monitoring.dashboar" +
      "d.v1.DeleteDashboardRequest\032\026.google.pro" +
      "tobuf.Empty\"*\202\323\344\223\002$*\"/v1/{name=projects/" +
      "*/dashboards/*}\022\265\001\n\017UpdateDashboard\0226.go" +
      "ogle.monitoring.dashboard.v1.UpdateDashb" +
      "oardRequest\032).google.monitoring.dashboar" +
      "d.v1.Dashboard\"?\202\323\344\223\00292,/v1/{dashboard.n" +
      "ame=projects/*/dashboards/*}:\tdashboard\032" +
      "\332\001\312A\031monitoring.googleapis.com\322A\272\001https:" +
      "//www.googleapis.com/auth/cloud-platform" +
      ",https://www.googleapis.com/auth/monitor" +
      "ing,https://www.googleapis.com/auth/moni" +
      "toring.read,https://www.googleapis.com/a" +
      "uth/monitoring.writeB\331\001\n\"com.google.moni" +
      "toring.dashboard.v1B\026DashboardsServicePr" +
      "otoP\001ZGgoogle.golang.org/genproto/google" +
      "apis/monitoring/dashboard/v1;dashboard\312\002" +
      "$Google\\Cloud\\Monitoring\\Dashboard\\V1\352\002(" +
      "Google::Cloud::Monitoring::Dashboard::V1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.monitoring.dashboard.v1.DashboardsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_CreateDashboardRequest_descriptor,
        new java.lang.String[] { "Parent", "Dashboard", "ValidateOnly", });
    internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_ListDashboardsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_ListDashboardsResponse_descriptor,
        new java.lang.String[] { "Dashboards", "NextPageToken", });
    internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_GetDashboardRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_DeleteDashboardRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor,
        new java.lang.String[] { "Dashboard", "ValidateOnly", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.dashboard.v1.DashboardsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
