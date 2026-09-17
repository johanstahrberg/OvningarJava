package com.example.java26.oop;

public class Uppgift1_2 {
    static void main() {

        Triangle triangle1 = new Triangle(5, 5, 5);
        Triangle triangle2 = new Triangle(5, 5, 8);
        Triangle triangle3 = new Triangle(3, 4, 5);
        Triangle triangle4 = new Triangle(2, 3, 6);

        IO.println(triangle1.perimeter());
        IO.println(triangle1.isValidTriangle());
        IO.println(triangle1.triangleType());

        IO.println(triangle2.perimeter());
        IO.println(triangle2.isValidTriangle());
        IO.println(triangle2.triangleType());

        IO.println(triangle3.perimeter());
        IO.println(triangle3.isValidTriangle());
        IO.println(triangle3.triangleType());

        IO.println(triangle4.perimeter());
        IO.println(triangle4.isValidTriangle());
        IO.println(triangle4.triangleType());

    }
}
