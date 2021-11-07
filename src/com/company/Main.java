package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which of the figure is the area? \n" + "The first (1) - circle, the second (2) - square, another number - the end program");
        int i = scanner.nextInt();
        switch (i) {
            case 1 -> {
                double radius = scanner.nextInt();
                Circle circle = new Circle(radius);
                System.out.println(circle.calcualteSquare());
            }
            case 2 -> {
                double side = scanner.nextInt();
                Square square = new Square(side);
                System.out.println(square.calcualteSquare());
            }
            default -> System.out.println("The end");
        }
    }
}
