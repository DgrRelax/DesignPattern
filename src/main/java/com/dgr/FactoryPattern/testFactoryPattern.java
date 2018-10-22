package com.dgr.FactoryPattern;

public class testFactoryPattern {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		//Get the object of Rectangle
		Shape shape_one = factory.getShape("Rectangle");
		//Method of calling Rectangle 
		shape_one.draw();
		
		//Get the object of Square
		Shape shape_two = factory.getShape("Square");
		//Method of calling Square 
		shape_two.draw();
		
		//Get the object of Circle
		Shape shape_three = factory.getShape("Circle");
		//Method of calling Circle
		shape_three.draw();
	}
}
