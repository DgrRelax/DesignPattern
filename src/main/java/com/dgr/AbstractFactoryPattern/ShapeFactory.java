package com.dgr.AbstractFactoryPattern;

/**
 * @ClassName: ShapeFactory
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author IBM
 * @date 2018年10月22日 下午8:08:53
 */
public class ShapeFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.dgr.AbstractFactoryPattern.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.dgr.AbstractFactoryPattern.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
