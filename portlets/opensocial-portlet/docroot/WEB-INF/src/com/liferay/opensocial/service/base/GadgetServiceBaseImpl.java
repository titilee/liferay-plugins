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

package com.liferay.opensocial.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.opensocial.model.Gadget;
import com.liferay.opensocial.service.GadgetLocalService;
import com.liferay.opensocial.service.GadgetService;
import com.liferay.opensocial.service.OAuthConsumerLocalService;
import com.liferay.opensocial.service.OAuthTokenLocalService;
import com.liferay.opensocial.service.persistence.GadgetPersistence;
import com.liferay.opensocial.service.persistence.OAuthConsumerPersistence;
import com.liferay.opensocial.service.persistence.OAuthTokenPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ClassNameLocalService;
import com.liferay.portal.service.ClassNameService;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ClassNamePersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the gadget remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.opensocial.service.impl.GadgetServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.opensocial.service.impl.GadgetServiceImpl
 * @see com.liferay.opensocial.service.GadgetServiceUtil
 * @generated
 */
public abstract class GadgetServiceBaseImpl extends BaseServiceImpl
	implements GadgetService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.opensocial.service.GadgetServiceUtil} to access the gadget remote service.
	 */

	/**
	 * Returns the gadget local service.
	 *
	 * @return the gadget local service
	 */
	public GadgetLocalService getGadgetLocalService() {
		return gadgetLocalService;
	}

	/**
	 * Sets the gadget local service.
	 *
	 * @param gadgetLocalService the gadget local service
	 */
	public void setGadgetLocalService(GadgetLocalService gadgetLocalService) {
		this.gadgetLocalService = gadgetLocalService;
	}

	/**
	 * Returns the gadget remote service.
	 *
	 * @return the gadget remote service
	 */
	public GadgetService getGadgetService() {
		return gadgetService;
	}

	/**
	 * Sets the gadget remote service.
	 *
	 * @param gadgetService the gadget remote service
	 */
	public void setGadgetService(GadgetService gadgetService) {
		this.gadgetService = gadgetService;
	}

	/**
	 * Returns the gadget persistence.
	 *
	 * @return the gadget persistence
	 */
	public GadgetPersistence getGadgetPersistence() {
		return gadgetPersistence;
	}

	/**
	 * Sets the gadget persistence.
	 *
	 * @param gadgetPersistence the gadget persistence
	 */
	public void setGadgetPersistence(GadgetPersistence gadgetPersistence) {
		this.gadgetPersistence = gadgetPersistence;
	}

	/**
	 * Returns the o auth consumer local service.
	 *
	 * @return the o auth consumer local service
	 */
	public OAuthConsumerLocalService getOAuthConsumerLocalService() {
		return oAuthConsumerLocalService;
	}

	/**
	 * Sets the o auth consumer local service.
	 *
	 * @param oAuthConsumerLocalService the o auth consumer local service
	 */
	public void setOAuthConsumerLocalService(
		OAuthConsumerLocalService oAuthConsumerLocalService) {
		this.oAuthConsumerLocalService = oAuthConsumerLocalService;
	}

	/**
	 * Returns the o auth consumer persistence.
	 *
	 * @return the o auth consumer persistence
	 */
	public OAuthConsumerPersistence getOAuthConsumerPersistence() {
		return oAuthConsumerPersistence;
	}

	/**
	 * Sets the o auth consumer persistence.
	 *
	 * @param oAuthConsumerPersistence the o auth consumer persistence
	 */
	public void setOAuthConsumerPersistence(
		OAuthConsumerPersistence oAuthConsumerPersistence) {
		this.oAuthConsumerPersistence = oAuthConsumerPersistence;
	}

	/**
	 * Returns the o auth token local service.
	 *
	 * @return the o auth token local service
	 */
	public OAuthTokenLocalService getOAuthTokenLocalService() {
		return oAuthTokenLocalService;
	}

	/**
	 * Sets the o auth token local service.
	 *
	 * @param oAuthTokenLocalService the o auth token local service
	 */
	public void setOAuthTokenLocalService(
		OAuthTokenLocalService oAuthTokenLocalService) {
		this.oAuthTokenLocalService = oAuthTokenLocalService;
	}

	/**
	 * Returns the o auth token persistence.
	 *
	 * @return the o auth token persistence
	 */
	public OAuthTokenPersistence getOAuthTokenPersistence() {
		return oAuthTokenPersistence;
	}

	/**
	 * Sets the o auth token persistence.
	 *
	 * @param oAuthTokenPersistence the o auth token persistence
	 */
	public void setOAuthTokenPersistence(
		OAuthTokenPersistence oAuthTokenPersistence) {
		this.oAuthTokenPersistence = oAuthTokenPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Gadget.class;
	}

	protected String getModelClassName() {
		return Gadget.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = gadgetPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = GadgetLocalService.class)
	protected GadgetLocalService gadgetLocalService;
	@BeanReference(type = GadgetService.class)
	protected GadgetService gadgetService;
	@BeanReference(type = GadgetPersistence.class)
	protected GadgetPersistence gadgetPersistence;
	@BeanReference(type = OAuthConsumerLocalService.class)
	protected OAuthConsumerLocalService oAuthConsumerLocalService;
	@BeanReference(type = OAuthConsumerPersistence.class)
	protected OAuthConsumerPersistence oAuthConsumerPersistence;
	@BeanReference(type = OAuthTokenLocalService.class)
	protected OAuthTokenLocalService oAuthTokenLocalService;
	@BeanReference(type = OAuthTokenPersistence.class)
	protected OAuthTokenPersistence oAuthTokenPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ClassNameLocalService.class)
	protected ClassNameLocalService classNameLocalService;
	@BeanReference(type = ClassNameService.class)
	protected ClassNameService classNameService;
	@BeanReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private GadgetServiceClpInvoker _clpInvoker = new GadgetServiceClpInvoker();
}