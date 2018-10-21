package com.dgr.proxyJDK;

public class testJDKProxy {
	public static void main(String[] args) {
		
		UserDao userDao = new UserDao("开始");
		
		JDKProxy jdkProxy = new JDKProxy();
		
		IUserDao iuserDao = (IUserDao)jdkProxy.newProxy(userDao);
		
		iuserDao.update();
		System.out.println("");
		iuserDao.save();
	}
}
