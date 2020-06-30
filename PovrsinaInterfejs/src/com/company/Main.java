package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape[] complexShape = new Shape[3];
        complexShape[0] = new Rectangle(1, 2);
        complexShape[1] = new Rectangle(3, 5);
        complexShape[2] = new Circle(2);
        double totalArea = 0;
        for (int i = 0; i < complexShape.length; i++) {
            totalArea += complexShape[i].area();
        }
        System.out.println(totalArea);
    }

    
}
