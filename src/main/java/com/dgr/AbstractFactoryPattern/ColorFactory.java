package com.dgr.AbstractFactoryPattern;

/**
 * @ClassName: ColorFactory
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author IBM
 * @date 2018年10月22日 下午8:15:57
 */
public class ColorFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.dgr.AbstractFactoryPattern.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.dgr.AbstractFactoryPattern.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (colorType.equalsIgnoreCase("BLUe")) {
			return new Blue();
		}
		return null;
	}
}
