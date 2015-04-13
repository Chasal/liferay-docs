/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.tour.portlet.tasks.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.tour.portlet.tasks.model.Task;
import com.tour.portlet.tasks.model.TaskModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Task service. Represents a row in the &quot;Task_Task&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.tour.portlet.tasks.model.TaskModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TaskImpl}.
 * </p>
 *
 * @author nickgaskill
 * @see TaskImpl
 * @see com.tour.portlet.tasks.model.Task
 * @see com.tour.portlet.tasks.model.TaskModel
 * @generated
 */
public class TaskModelImpl extends BaseModelImpl<Task> implements TaskModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a task model instance should use the {@link com.tour.portlet.tasks.model.Task} interface instead.
	 */
	public static final String TABLE_NAME = "Task_Task";
	public static final Object[][] TABLE_COLUMNS = {
			{ "taskId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "roadieResponse", Types.VARCHAR },
			{ "inventoryResponse", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Task_Task (taskId LONG not null primary key,name VARCHAR(75) null,description VARCHAR(75) null,status VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,roadieResponse VARCHAR(75) null,inventoryResponse VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Task_Task";
	public static final String ORDER_BY_JPQL = " ORDER BY task.taskId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Task_Task.taskId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.tour.portlet.tasks.model.Task"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.tour.portlet.tasks.model.Task"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.tour.portlet.tasks.model.Task"));

	public TaskModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _taskId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTaskId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _taskId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Task.class;
	}

	@Override
	public String getModelClassName() {
		return Task.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taskId", getTaskId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("roadieResponse", getRoadieResponse());
		attributes.put("inventoryResponse", getInventoryResponse());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String roadieResponse = (String)attributes.get("roadieResponse");

		if (roadieResponse != null) {
			setRoadieResponse(roadieResponse);
		}

		String inventoryResponse = (String)attributes.get("inventoryResponse");

		if (inventoryResponse != null) {
			setInventoryResponse(inventoryResponse);
		}
	}

	@Override
	public long getTaskId() {
		return _taskId;
	}

	@Override
	public void setTaskId(long taskId) {
		_taskId = taskId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_status = status;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getRoadieResponse() {
		if (_roadieResponse == null) {
			return StringPool.BLANK;
		}
		else {
			return _roadieResponse;
		}
	}

	@Override
	public void setRoadieResponse(String roadieResponse) {
		_roadieResponse = roadieResponse;
	}

	@Override
	public String getInventoryResponse() {
		if (_inventoryResponse == null) {
			return StringPool.BLANK;
		}
		else {
			return _inventoryResponse;
		}
	}

	@Override
	public void setInventoryResponse(String inventoryResponse) {
		_inventoryResponse = inventoryResponse;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Task.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Task toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Task)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TaskImpl taskImpl = new TaskImpl();

		taskImpl.setTaskId(getTaskId());
		taskImpl.setName(getName());
		taskImpl.setDescription(getDescription());
		taskImpl.setStatus(getStatus());
		taskImpl.setGroupId(getGroupId());
		taskImpl.setCompanyId(getCompanyId());
		taskImpl.setUserId(getUserId());
		taskImpl.setRoadieResponse(getRoadieResponse());
		taskImpl.setInventoryResponse(getInventoryResponse());

		taskImpl.resetOriginalValues();

		return taskImpl;
	}

	@Override
	public int compareTo(Task task) {
		long primaryKey = task.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Task)) {
			return false;
		}

		Task task = (Task)obj;

		long primaryKey = task.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Task> toCacheModel() {
		TaskCacheModel taskCacheModel = new TaskCacheModel();

		taskCacheModel.taskId = getTaskId();

		taskCacheModel.name = getName();

		String name = taskCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			taskCacheModel.name = null;
		}

		taskCacheModel.description = getDescription();

		String description = taskCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			taskCacheModel.description = null;
		}

		taskCacheModel.status = getStatus();

		String status = taskCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			taskCacheModel.status = null;
		}

		taskCacheModel.groupId = getGroupId();

		taskCacheModel.companyId = getCompanyId();

		taskCacheModel.userId = getUserId();

		taskCacheModel.roadieResponse = getRoadieResponse();

		String roadieResponse = taskCacheModel.roadieResponse;

		if ((roadieResponse != null) && (roadieResponse.length() == 0)) {
			taskCacheModel.roadieResponse = null;
		}

		taskCacheModel.inventoryResponse = getInventoryResponse();

		String inventoryResponse = taskCacheModel.inventoryResponse;

		if ((inventoryResponse != null) && (inventoryResponse.length() == 0)) {
			taskCacheModel.inventoryResponse = null;
		}

		return taskCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{taskId=");
		sb.append(getTaskId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", roadieResponse=");
		sb.append(getRoadieResponse());
		sb.append(", inventoryResponse=");
		sb.append(getInventoryResponse());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.tour.portlet.tasks.model.Task");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>taskId</column-name><column-value><![CDATA[");
		sb.append(getTaskId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roadieResponse</column-name><column-value><![CDATA[");
		sb.append(getRoadieResponse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inventoryResponse</column-name><column-value><![CDATA[");
		sb.append(getInventoryResponse());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Task.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Task.class };
	private long _taskId;
	private String _name;
	private String _description;
	private String _status;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _roadieResponse;
	private String _inventoryResponse;
	private Task _escapedModel;
}