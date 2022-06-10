// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/table.proto

package com.google.monitoring.dashboard.v1;

public interface TimeSeriesTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.TimeSeriesTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet> 
      getDataSetsList();
  /**
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet getDataSets(int index);
  /**
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getDataSetsCount();
  /**
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSetOrBuilder> 
      getDataSetsOrBuilderList();
  /**
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSetOrBuilder getDataSetsOrBuilder(
      int index);
}
