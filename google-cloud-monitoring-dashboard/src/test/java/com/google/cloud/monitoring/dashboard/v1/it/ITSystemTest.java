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
package com.google.cloud.monitoring.dashboard.v1.it;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.google.cloud.ServiceOptions;
import com.google.cloud.monitoring.dashboard.v1.DashboardsServiceClient;
import com.google.monitoring.dashboard.v1.CreateDashboardRequest;
import com.google.monitoring.dashboard.v1.Dashboard;
import com.google.monitoring.dashboard.v1.DeleteDashboardRequest;
import com.google.monitoring.dashboard.v1.GetDashboardRequest;
import com.google.monitoring.dashboard.v1.GridLayout;
import com.google.monitoring.dashboard.v1.ListDashboardsRequest;
import com.google.monitoring.dashboard.v1.UpdateDashboardRequest;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITSystemTest {

  private static DashboardsServiceClient client;
  private static String dashboardName;
  private static String etag;

  private static final String PROJECT_ID = ServiceOptions.getDefaultProjectId();
  private static final String PARENT = "projects/" + PROJECT_ID;
  private static final String ID = UUID.randomUUID().toString().substring(0, 8);
  private static final String DASHBOARD_DISPLAY_NAME = "test-dashboard-" + ID;
  private static final GridLayout GRID_LAYOUT = GridLayout.newBuilder().setColumns(5).build();

  @BeforeClass
  public static void setUp() throws Exception {
    client = DashboardsServiceClient.create();
    Dashboard dashboard =
        Dashboard.newBuilder()
            .setGridLayout(GRID_LAYOUT)
            .setDisplayName(DASHBOARD_DISPLAY_NAME)
            .build();
    CreateDashboardRequest request =
        CreateDashboardRequest.newBuilder().setParent(PARENT).setDashboard(dashboard).build();
    Dashboard response = client.createDashboard(request);
    dashboardName = response.getName();
    etag = response.getEtag();
  }

  @AfterClass
  public static void tearDown() {
    DeleteDashboardRequest request =
        DeleteDashboardRequest.newBuilder().setName(dashboardName).build();
    client.deleteDashboard(request);
    client.close();
  }

  @Test
  public void getDashboardTest() {
    GetDashboardRequest request = GetDashboardRequest.newBuilder().setName(dashboardName).build();
    Dashboard dashboard = client.getDashboard(request);
    assertEquals(dashboardName, dashboard.getName());
    assertEquals(DASHBOARD_DISPLAY_NAME, dashboard.getDisplayName());
    assertEquals(GRID_LAYOUT, dashboard.getGridLayout());
  }

  @Test
  public void updateDashboardTest() {
    Dashboard actualDashboard =
        Dashboard.newBuilder()
            .setName(dashboardName)
            .setGridLayout(GRID_LAYOUT)
            .setDisplayName(DASHBOARD_DISPLAY_NAME)
            .setEtag(etag)
            .build();
    UpdateDashboardRequest request =
        UpdateDashboardRequest.newBuilder().setDashboard(actualDashboard).build();
    Dashboard dashboard = client.updateDashboard(request);
    assertEquals(dashboardName, dashboard.getName());
    assertEquals(etag, dashboard.getEtag());
    assertEquals(DASHBOARD_DISPLAY_NAME, dashboard.getDisplayName());
    assertEquals(GRID_LAYOUT, dashboard.getGridLayout());
  }

  @Test
  public void listDashboardsTest() {
    ListDashboardsRequest request = ListDashboardsRequest.newBuilder().setParent(PARENT).build();
    for (Dashboard actualDashboard : client.listDashboards(request).iterateAll()) {
      if (dashboardName.equals(actualDashboard.getDisplayName())) {
        assertEquals(dashboardName, actualDashboard.getName());
        assertEquals(DASHBOARD_DISPLAY_NAME, actualDashboard.getDisplayName());
        assertEquals(GRID_LAYOUT, actualDashboard.getGridLayout());
      }
    }
  }

  @Test
  public void isShutdownTest() {
    boolean isShutdown = client.isShutdown();
    assertFalse(isShutdown);
  }

  @Test
  public void isTerminatedTest() {
    boolean isTerminated = client.isShutdown();
    assertFalse(isTerminated);
  }
}
