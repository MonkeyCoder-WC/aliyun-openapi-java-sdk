/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ocs.transform.v20141001;

import com.aliyuncs.ocs.model.v20141001.CreateInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext context) {
		
		createInstanceResponse.setRequestId(context.stringValue("CreateInstanceResponse.RequestId"));
		createInstanceResponse.setInstanceId(context.stringValue("CreateInstanceResponse.InstanceId"));
		createInstanceResponse.setInstanceName(context.stringValue("CreateInstanceResponse.InstanceName"));
		createInstanceResponse.setConnectionDomain(context.stringValue("CreateInstanceResponse.ConnectionDomain"));
		createInstanceResponse.setPort(context.longValue("CreateInstanceResponse.Port"));
		createInstanceResponse.setUserName(context.stringValue("CreateInstanceResponse.UserName"));
		createInstanceResponse.setInstanceStatus(context.stringValue("CreateInstanceResponse.InstanceStatus"));
		createInstanceResponse.setRegionId(context.stringValue("CreateInstanceResponse.RegionId"));
		createInstanceResponse.setCapacity(context.longValue("CreateInstanceResponse.Capacity"));
		createInstanceResponse.setQPS(context.longValue("CreateInstanceResponse.QPS"));
		createInstanceResponse.setBandwidth(context.longValue("CreateInstanceResponse.Bandwidth"));
		createInstanceResponse.setConnections(context.longValue("CreateInstanceResponse.Connections"));
		createInstanceResponse.setZoneId(context.stringValue("CreateInstanceResponse.ZoneId"));
	 
	 	return createInstanceResponse;
	}
}