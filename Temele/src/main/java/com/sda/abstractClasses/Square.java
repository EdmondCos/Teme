package com.sda.abstractClasses;

public class Square extends AShape {

    private double side;

    public Square(int side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }

    double getPerimeter() {
        return 4 * side;
    }
}
