package com.dgr.AbstractFactoryPattern;

/** 
 * @ClassName: FactoryProducer 
 * @Description: 创建工厂生成器类，通过传递形状或颜色来获取工厂 
 * @author IBM 
 * @date 2018年10月22日 下午8:34:10 
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
