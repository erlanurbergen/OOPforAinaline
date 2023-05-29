package com.company.classAndObject;

public class Main {
    public static void main(String[] args) {
        // Абстрактные классы

        Circle circle = new Circle("Circle", 10);
        System.out.println(circle.getArea());
    }
}

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getArea();
    abstract double getPeremeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * 3.14;
    }

    @Override
    double getPeremeter() {
        return radius * radius;
    }
}
