// Copyright 2012 Citrix Systems, Inc. Licensed under the
// Apache License, Version 2.0 (the "License"); you may not use this
// file except in compliance with the License.  Citrix Systems, Inc.
// reserves all rights not expressly granted by the License.
// You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// 
// Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.api.response;

import java.util.List;

import com.cloud.api.ApiConstants;
import com.cloud.api.Parameter;
import com.cloud.api.BaseCmd.CommandType;
import com.cloud.utils.IdentityProxy;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class NetscalerLoadBalancerResponse extends BaseResponse {

    @SerializedName(ApiConstants.LOAD_BALANCER_DEVICE_ID) @Param(description="device id of the netscaler load balancer")
    private IdentityProxy id = new IdentityProxy("external_load_balancer_devices");

    @SerializedName(ApiConstants.PHYSICAL_NETWORK_ID) @Param(description="the physical network to which this netscaler device belongs to")
    private IdentityProxy physicalNetworkId = new IdentityProxy("physical_network");

    @SerializedName(ApiConstants.PROVIDER) @Param(description="name of the provider")
    private String providerName;
    
    @SerializedName(ApiConstants.LOAD_BALANCER_DEVICE_NAME) @Param(description="device name")
    private String deviceName; 
    
    @SerializedName(ApiConstants.LOAD_BALANCER_DEVICE_STATE) @Param(description="device state")
    private String deviceState;

    @SerializedName(ApiConstants.LOAD_BALANCER_DEVICE_CAPACITY) @Param(description="device capacity")
    private Long deviceCapacity;

    @SerializedName(ApiConstants.LOAD_BALANCER_DEVICE_DEDICATED) @Param(description="true if device is dedicated for an account")
    private Boolean dedicatedLoadBalancer;

    @SerializedName(ApiConstants.INLINE) @Param(description="true if device is inline with firewall device")
    private Boolean inlineLoadBalancer;

    @SerializedName(ApiConstants.PUBLIC_INTERFACE) @Param(description="the public interface of the load balancer")
    private String publicInterface;
    
    @SerializedName(ApiConstants.PRIVATE_INTERFACE) @Param(description="the private interface of the load balancer")
    private String privateInterface;

    @SerializedName(ApiConstants.IP_ADDRESS) @Param(description="the management IP address of the external load balancer")
    private String ipAddress;

    @SerializedName(ApiConstants.POD_IDS) @Param(description="Used when NetScaler device is provider of EIP service." +
            " This parameter represents the list of pod's, for which there exists a policy based route on datacenter L3 router to " +
            "route pod's subnet IP to a NetScaler device.")
    private List<Long> podIds;
    
    public void setId(long lbDeviceId) {
        this.id.setValue(lbDeviceId);
    }

    public void setPhysicalNetworkId(long physicalNetworkId) {
        this.physicalNetworkId.setValue(physicalNetworkId);
    }

    public void setProvider(String provider) {
        this.providerName = provider;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDeviceCapacity(long deviceCapacity) {
        this.deviceCapacity = deviceCapacity;
    }

    public void setDedicatedLoadBalancer(boolean isDedicated) {
        this.dedicatedLoadBalancer = isDedicated;
    }

    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }

    public void setInlineMode(boolean inline) {
        this.inlineLoadBalancer = inline;
    }

    public void setPublicInterface(String publicInterface) {
        this.publicInterface = publicInterface;
    }

    public void setPrivateInterface(String privateInterface) {
        this.privateInterface = privateInterface;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setAssociatedPods(List<Long> pods) {
        this.podIds = pods;
    }
}
