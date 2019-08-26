package com.sda.abstractClasses;

public class Circle extends AShape {

    private static final double PI = 3.14;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * PI * radius;
    }
}