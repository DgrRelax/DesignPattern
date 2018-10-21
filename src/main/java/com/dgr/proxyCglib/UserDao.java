package com.dgr.proxyCglib;

/**
 * 目标对象
 * @author IBM
 *
 */
@SuppressWarnings("all")
public class UserDao implements IUserDao {
	
	private String str;
	
	//cglib中无参构造函数定义原因
	public UserDao() {}//Superclass has no null constructors but no arguments were given
	
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
