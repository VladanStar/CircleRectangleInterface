package com.company;

public class Circle implements Shape{
    int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*Math.PI;
    }
}
