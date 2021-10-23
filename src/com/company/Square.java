package com.company;


public class Square extends Figure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double figureArea() {
        return side * side;
    }
}
