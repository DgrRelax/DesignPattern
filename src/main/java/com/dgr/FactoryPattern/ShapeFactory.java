package com.dgr.FactoryPattern;


/**
 * @Description 处理接口实例化对象的选择问题
 * @author IBM
 * @date 2018年10月22日下午3:19:25
 */
public class ShapeFactory {
	//使用 getShape 方法获得形状类型的对象
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {//equalsIgnoreCase()equals方法比较，忽略大小写
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}
}
