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
// source: google/monitoring/dashboard/v1/drilldowns.proto

package com.google.monitoring.dashboard.v1;

public final class DrilldownsProto {
  private DrilldownsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/monitoring/dashboard/v1/drilldo"
          + "wns.proto\022\036google.monitoring.dashboard.v"
          + "1\032+google/monitoring/dashboard/v1/common"
          + ".protoB\371\001\n\"com.google.monitoring.dashboa"
          + "rd.v1B\017DrilldownsProtoP\001ZGgoogle.golang."
          + "org/genproto/googleapis/monitoring/dashb"
          + "oard/v1;dashboard\252\002$Google.Cloud.Monitor"
          + "ing.Dashboard.V1\312\002$Google\\Cloud\\Monitori"
          + "ng\\Dashboard\\V1\352\002(Google::Cloud::Monitor"
          + "ing::Dashboard::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.monitoring.dashboard.v1.CommonProto.getDescriptor(),
            });
    com.google.monitoring.dashboard.v1.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
