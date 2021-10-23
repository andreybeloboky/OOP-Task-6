package com.company;


public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        return  Math.PI * (radius * radius);
    }
}