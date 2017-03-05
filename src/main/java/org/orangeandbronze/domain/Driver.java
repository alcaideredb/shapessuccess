package org.orangeandbronze.domain;

public class Driver {
	public static void main(String[] args) {
		Square s1 = new Square(5);
		Square s2 = new Square(7);
		Circle c1 = new Circle(15);
		Shape[] shapes = new Shape[3];
		shapes[0] =  s2;
		shapes[1] = c1;
		shapes[2] =s1;
		
		ShapeEditor.drawAllShapes(shapes);
	}
}
