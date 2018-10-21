package com.dgr.proxyCglib;

public class testCglibProxy {
	public static void main(String[] args) {
		UserDao userDao = new UserDao("开始");
		CglibProxy cglibProxy = new CglibProxy();
		IUserDao proxy = (IUserDao)cglibProxy.getProxy(userDao);
		proxy.update();
		System.out.println("");
		proxy.save();
	}
}
