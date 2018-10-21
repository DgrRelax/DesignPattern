package com.dgr.proxyStatic;

public class proxyTwo implements IUserDao {
	/**
	 * 接收目标对象
	 */
	private UserDao userDao;
	
	/**
	 * 目标对象由构造器赋值属性
	 * @param userDao
	 */
	public proxyTwo(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void update() {
		System.out.println("事物开始。。。");
		userDao.update();//执行目标方法
		System.out.println("事物结束。。。");
	}

	public void save() {
		System.out.println("事物开始。。。");
		userDao.save();//执行目标方法
		System.out.println("事物结束。。。");
	}
}
