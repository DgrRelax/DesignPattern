package com.dgr.proxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImplInvocationHandler implements InvocationHandler {
	//代理目标对象
	private Object target;
	
	//拦截器
	private MyInterceptor myInterceptor = new MyInterceptor();
	
	public ImplInvocationHandler(Object proxy) {
		this.target = proxy;
	}

//	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		myInterceptor.before();
		Object invoke = method.invoke(target, args);//代理目标对象target，而非是proxy
		myInterceptor.after();
		return invoke;
	}

}
