package com.sda.abstractClasses;

public class Main {
    public static void main(String[] args) {
        AShape circle = new Circle(3);
        AShape square = new Square(2);
        AShape rectangle = new Rectangle(4, 2);

        printObject(circle);
        printObject(square);
        printObject(rectangle);
    }

    private static void printObject(AShape shape) {
        String response = String.format("%s with perimeter: %.2f and area: %.2f",
                shape.getClass().getSimpleName(),
                shape.getPerimeter(),
                shape.getArea());
        System.out.println(response);
    }
}