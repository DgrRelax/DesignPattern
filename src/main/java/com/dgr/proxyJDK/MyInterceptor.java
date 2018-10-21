package com.dgr.proxyJDK;

public class MyInterceptor implements Interceptor {

	public void before() {
		System.out.println("拦截器 Interceptor,在方法之前调用");
	}

	public void after() {
		System.out.println("拦截器 Interceptor,在方法之后调用");
	}
}
