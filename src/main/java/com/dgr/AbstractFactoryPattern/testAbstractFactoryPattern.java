package com.dgr.AbstractFactoryPattern;

/** 
 * @ClassName: testAbstractFactoryPattern 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author IBM 
 * @date 2018年10月22日 下午8:44:05 
 */
public class testAbstractFactoryPattern {
	public static void main(String ags[]) {
		//获取形状的工厂类
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape shape_one = shapeFactory.getShape("Circle");
		shape_one.draw();
		
		Shape shape_two = shapeFactory.getShape("RECTANGLE");
		shape_two.draw();
		
		Shape shape_three = shapeFactory.getShape("SQUARE");
		shape_three.draw();
		
		//获取颜色的工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COlOR");
		
		Color color_one = colorFactory.getColor("RED");
		color_one.fill();
		
		Color color_two = colorFactory.getColor("Green");
		color_two.fill();
		
		Color color_three = colorFactory.getColor("BLUE");
		color_three.fill();
	}
}
