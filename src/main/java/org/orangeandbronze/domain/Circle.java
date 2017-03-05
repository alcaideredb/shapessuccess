package org.orangeandbronze.domain;

public class Circle extends Shape {
	private int radius;

	public Circle(int r) {
		radius = r;
	}

	public void draw() {
		for (int x = -radius; x <= radius; x++) {
			for (int y = -radius; y <= radius; y++) {
				if (isPointInRadius(x, y, radius)) {
					System.out.print("* ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	} 
	
	private boolean isPointInRadius(int x, int y, int radius) {
		return (x * x + y * y) <= radius * radius;
	}

}
