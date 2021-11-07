package com.company;


public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return - cicrle area;
     */
    @Override
    public double calcualteSquare() {
        return Math.PI * (radius * radius);
    }
}
