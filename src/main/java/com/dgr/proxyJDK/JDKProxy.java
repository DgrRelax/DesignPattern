package com.dgr.proxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {
	//代理目标对象
	private Object target;
	
	//拦截器
	private MyInterceptor myInterceptor = new MyInterceptor();
	
	public Object newProxy(Object targetObject) {//将目标对象传入进行代理     
		this.target = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),    
                targetObject.getClass().getInterfaces(), this);//返回代理对象    
    }

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		myInterceptor.before();
		Object invoke = null;
		System.out.println("method :"+ method.getName()+" is invoked!");
		invoke = method.invoke(target, args);//代理目标对象target，而非是proxy
		myInterceptor.after();
		return invoke;
	}
	
}
