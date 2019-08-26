package com.sda.abstractClasses;

public class Rectangle extends AShape {

    private double bigLength;
    private double smallLength;

    public Rectangle(double bigLength, double smallLength) {
        this.bigLength = bigLength;
        this.smallLength = smallLength;
    }

    double getArea() {
        return bigLength * smallLength;
    }

    double getPerimeter() {
        return 2 * (bigLength + smallLength);
    }
}