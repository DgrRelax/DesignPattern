package com.dgr.proxyStatic;

/**
 * 目标对象
 * @author IBM
 *
 */
@SuppressWarnings("all")
public class UserDao implements IUserDao {
	
	private String str;
	
	public UserDao(String str) {
		this.str = str;
		loadStart(str);
	}
	
	public void update() {
		System.out.println("----已经更新数据----");
	}

	public void save() {
		System.out.println("----已经保存数据----");
	}
	
	private void loadStart(String str) {
		System.out.println("初始化开始：" + str);
	}
	
}
