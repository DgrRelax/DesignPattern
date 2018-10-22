package com.dgr.AbstractFactoryPattern;

/** 
* @ClassName: AbstractFactory 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author IBM 
* @date 2018年10月22日 下午8:05:00 
*/
public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
}
