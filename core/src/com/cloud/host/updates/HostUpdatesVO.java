//Copyright 2012 Citrix Systems, Inc. Licensed under the
//Apache License, Version 2.0 (the "License"); you may not use this
//file except in compliance with the License.  Citrix Systems, Inc.
//reserves all rights not expressly granted by the License.
//You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//
//Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.host.updates;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cloud.api.Identity;

@Entity
@Table(name="host_updates")
public class HostUpdatesVO {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="uuid")
    private String uuid;

    @Column(name="label", length=40)
    private String label;

    @Column(name="description", length=999)
    private String description;

    @Column(name="after_apply_guidance", length=40)
    private String afterApplyGuidance;

    @Column(name="URL", length=999)
    private String URL;

    @Column(name="timestamp")
    private String timestamp;

    public HostUpdatesVO() {
        this.uuid = UUID.randomUUID().toString();
    }
    public HostUpdatesVO(Long id) {
        this.id = id;
        this.uuid = UUID.randomUUID().toString();
    }

    public long getId() {
        return id;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLabel() {
        return label;
    }

    public void setLable(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAfterApplyGuidance() {
        return afterApplyGuidance;
    }

    public void setAfterApplyGuidance(String afterApplyGuidance) {
        this.afterApplyGuidance = afterApplyGuidance;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String string) {
        this.timestamp = string;
    }
}
