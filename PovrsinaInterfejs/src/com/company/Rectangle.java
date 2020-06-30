package com.company;

public class Rectangle implements Shape{

    int a;
    int b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }
}
