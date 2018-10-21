package com.dgr.proxyStatic;

@SuppressWarnings("all")
public class proxyOne implements IUserDao {
	/**
	 * 接收保存的目标对象
	 */
	private UserDao userDao;
	
	private String str;
	
	public proxyOne(String str) {
		this.str = str;
	}
	
	public void update() {
		judge();
		System.out.println("事物开始。。。");
		userDao.update();
		System.out.println("事物结束。。。");
	}

	public void save() {
		judge();
		System.out.println("事物开始。。。");
		userDao.save();
		System.out.println("事物结束。。。");
	}

	private void judge() {
		if(userDao == null) {//目标对象的创建交给代理类
			userDao = new UserDao(str);
		}
	}
}
