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

import com.google.cloud.monitoring.dashboard.v1.DashboardsServiceClient;
import com.google.cloud.resourcemanager.ResourceManager;
import com.google.cloud.resourcemanager.ResourceManagerOptions;
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
  private static String etag;

  private static final ResourceManager RESOURCE_MANAGER =
      ResourceManagerOptions.getDefaultInstance().getService();
  private static final String PROJECT_ID = RESOURCE_MANAGER.getOptions().getProjectId();
  private static final Long PROJECT_NUMBER = RESOURCE_MANAGER.get(PROJECT_ID).getProjectNumber();
  private static final String ID = UUID.randomUUID().toString();
  private static final String PARENT = "projects/" + PROJECT_NUMBER;
  private static final String DASHBOARD_NAME = String.format("%s/dashboards/%s", PARENT, ID);
  private static final String DASHBOARD_DISPLAY_NAME = "test-dashboard-" + ID;
  private static final GridLayout GRID_LAYOUT = GridLayout.newBuilder().setColumns(5).build();

  @BeforeClass
  public static void setUp() throws Exception {
    client = DashboardsServiceClient.create();
    Dashboard dashboard =
        Dashboard.newBuilder()
            .setName(DASHBOARD_NAME)
            .setGridLayout(GRID_LAYOUT)
            .setDisplayName(DASHBOARD_DISPLAY_NAME)
            .build();
    CreateDashboardRequest request =
        CreateDashboardRequest.newBuilder().setParent(PARENT).setDashboard(dashboard).build();
    Dashboard response = client.createDashboard(request);
    etag = response.getEtag();
  }

  @AfterClass
  public static void tearDown() {
    DeleteDashboardRequest request =
        DeleteDashboardRequest.newBuilder().setName(DASHBOARD_NAME).build();
    client.deleteDashboard(request);
    client.close();
  }

  @Test
  public void getDashboardTest() {
    GetDashboardRequest request = GetDashboardRequest.newBuilder().setName(DASHBOARD_NAME).build();
    Dashboard dashboard = client.getDashboard(request);
    assertEquals(DASHBOARD_NAME, dashboard.getName());
    assertEquals(DASHBOARD_DISPLAY_NAME, dashboard.getDisplayName());
    assertEquals(GRID_LAYOUT, dashboard.getGridLayout());
  }

  @Test
  public void updateDashboardTest() {
    Dashboard actualDashboard =
        Dashboard.newBuilder()
            .setName(DASHBOARD_NAME)
            .setGridLayout(GRID_LAYOUT)
            .setDisplayName(DASHBOARD_DISPLAY_NAME)
            .setEtag(etag)
            .build();
    UpdateDashboardRequest request =
        UpdateDashboardRequest.newBuilder().setDashboard(actualDashboard).build();
    Dashboard dashboard = client.updateDashboard(request);
    assertEquals(DASHBOARD_NAME, dashboard.getName());
    assertEquals(etag, dashboard.getEtag());
    assertEquals(DASHBOARD_DISPLAY_NAME, dashboard.getDisplayName());
    assertEquals(GRID_LAYOUT, dashboard.getGridLayout());
  }

  @Test
  public void listDashboardsTest() {
    ListDashboardsRequest request = ListDashboardsRequest.newBuilder().setParent(PARENT).build();
    for (Dashboard actualDashboard : client.listDashboards(request).iterateAll()) {
      if (DASHBOARD_NAME.equals(actualDashboard.getDisplayName())) {
        assertEquals(DASHBOARD_NAME, actualDashboard.getName());
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
