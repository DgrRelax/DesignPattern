package com.dgr.proxyStatic;

public class TestProxy {
	public static void main(String[] args) {
		
		long millis1 = System.nanoTime();
		//将目标对象的创建也由代理类实现,运行效率慢
		proxyOne one = new proxyOne("开始");
		one.update();
		one.save();
		long millis2 = System.nanoTime();
		System.out.println(millis2- millis1);
		
		
		long millis3 = System.nanoTime();
		//要创建目标对象，由构造器赋值，但是效率快的
		proxyTwo two = new proxyTwo(new UserDao("开始"));
		two.update();
		one.save();
		long millis4 = System.nanoTime();
		System.out.println(millis4- millis3);
	}
}
