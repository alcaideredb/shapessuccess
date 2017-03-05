package org.orangeandbronze.domain;

public class ShapeEditor {
	public static void drawAllShapes(Shape[] shapes) {
		for (Shape shape : shapes) {
			shape.draw();
			System.out.println();
		}
	}
}
