package com.example.java26.oop;

public class Uppgift2_2 {
    static void main() {

        Triangle triangle5 = new Triangle(10);
        Triangle triangle6 = new Triangle(triangle5);
        Triangle triangle7 = Triangle.copyOf(triangle6);

        triangle7.setSideA(11);

        IO.println("triangle6 sideA: " + triangle6.getSideA());
        IO.println("triangle7 sideA: " + triangle7.getSideA());






















    }
}
