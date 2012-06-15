//       Licensed to the Apache Software Foundation (ASF) under one
//       or more contributor license agreements.  See the NOTICE file
//       distributed with this work for additional information
//       regarding copyright ownership.  The ASF licenses this file
//       to you under the Apache License, Version 2.0 (the
//       "License"); you may not use this file except in compliance
//       with the License.  You may obtain a copy of the License at
//
//         http://www.apache.org/licenses/LICENSE-2.0
//
//       Unless required by applicable law or agreed to in writing,
//       software distributed under the License is distributed on an
//       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
//       KIND, either express or implied.  See the License for the
//       specific language governing permissions and limitations
//       under the License.

package com.cloud.network.as;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cloud.api.Identity;
import com.cloud.utils.db.GenericDao;

/**
 * @author Deepak Garg
 */

@Entity
@Table(name="conditions")
public class ConditionVO implements Condition, Identity {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

	@Column(name="name")
	private String name;

	@Column(name="counter_id")
	private long counterid;

	@Column(name="threshold")
	private long threshold;

	@Column(name="relational_operator")
    @Enumerated(value=EnumType.STRING)
	private Operator relationalOperator;

	@Column(name="aggr_operator")
    @Enumerated(value=EnumType.STRING)
	private Operator aggrOperator;

	@Column(name="aggr_function")
    @Enumerated(value=EnumType.STRING)
	private String aggrFunction;

	@Column(name="aggr_value")
	private long aggrValue;

    @Column(name="domain_id")
    protected long domainId;

    @Column(name="account_id")
    protected long accountId;

    @Column(name="uuid")
    private String uuid;

    @Column(name=GenericDao.REMOVED_COLUMN)
    Date removed;

    @Column(name=GenericDao.CREATED_COLUMN)
    Date created;

    public ConditionVO() {
    	this.uuid = UUID.randomUUID().toString();
    }

    public ConditionVO(long id) {
        this.id = id;
    	this.uuid = UUID.randomUUID().toString();
    }

	public ConditionVO(String name, long counterid, long threshold, long accountId, long domainId, Operator relationalOperator, Operator aggrOperator,
			String aggrFunction, long aggrValue) {
		super();
		this.name = name;
		this.counterid = counterid;
		this.threshold = threshold;
		this.relationalOperator = relationalOperator;
		this.aggrOperator = aggrOperator;
		this.aggrFunction = aggrFunction;
		this.aggrValue = aggrValue;
        this.accountId = accountId;
        this.domainId = domainId;
    	this.uuid = UUID.randomUUID().toString();

	}

	@Override
	public String getName() {
		return name;
	}

	public Date getCreated() {
		return created;
	}

	@Override
	public long getId() {
		return id;
	}

	public void setUuid(String uuid) {
    	this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public long getCounterid() {
		return counterid;
	}

	@Override
	public long getThreshold() {
		return threshold;
	}

	@Override
	public Operator getRelationalOperator() {
		return relationalOperator;
	}

	@Override
	public Operator getAggrOperator() {
		return aggrOperator;
	}

	@Override
	public String getAggrFunction() {
		return aggrFunction;
	}

	@Override
	public long getAggrValue() {
		return aggrValue;
	}

	@Override
	public long getAccountId() {
		return accountId;
	}

	@Override
	public long getDomainId() {
		return domainId;
	}

	@Override
	public String getUuid() {
    	return this.uuid;
    }

    public Date getRemoved() {
        return removed;
    }

}