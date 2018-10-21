package com.dgr.proxyJDK;

import java.lang.reflect.Proxy;

public class testProxyTwo {
	public static void main(String[] args) {
		UserDao userDao = new UserDao("开始");
		ImplInvocationHandler invocationHandler = new ImplInvocationHandler(userDao);
		IUserDao newProxyInstance = (IUserDao)Proxy.newProxyInstance(UserDao.class.getClassLoader(), UserDao.class.getInterfaces(), invocationHandler);
		newProxyInstance.update();
		System.out.println("");
		newProxyInstance.save();
	}
}
