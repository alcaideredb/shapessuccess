package org.orangeandbronze.domain;

 
public class Square extends Shape{
	private int length;
	
	public Square(int n) {
		length = n;
	}
	
	public void draw() {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
         	   System.out.print("*");
            }
            System.out.println();
         }
	} 
}
