package com.dgr.proxyCglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	//动态代理目标类
	private Object target;
	
	//拦截器
	private MyInterceptor myInterceptor = new MyInterceptor();
	
	public Object getProxy(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();//创建加强器，用来创建动态代理类
		//为加强器指定代理的业务类
		enhancer.setSuperclass(this.target.getClass());
		//设置回调，对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
		enhancer.setCallback(this);
		//创建动态代理对象并返回  *容易报错：Superclass has no null constructors but no arguments were given
		return enhancer.create();//在springmvc中添加免表类的构造函数
	}
	
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		myInterceptor.before();
		proxy.invokeSuper(obj, args);
		myInterceptor.after();
		return null;
	}

}
