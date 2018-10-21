package com.dgr.proxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyOne {
	
	public static void main(String[] args) {
		
		final UserDao userDao = new UserDao("代理开始");
		
		IUserDao iuserDao = (IUserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), new InvocationHandler() {
			
		    /*
			* proxy:是代理对象
			* method:代表的是目标方法的字节码对象
			* args:代表是调用目标方法时参数
			*/
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("开始事务2");
                //运用反射执行目标对象方法
                Object invoke = method.invoke(userDao, args);
                System.out.println("提交事务2");
				return invoke;
			}
		});
		
		iuserDao.update();
		System.out.println("");
		iuserDao.save();
	}
}
