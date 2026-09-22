package com.example.java26.oop2;

public class Uppgift1 {
    static void main() {

        Vehicle vehicle = new Vehicle();
        vehicle.goTo("Göteborg");

        Bicycle bicycle = new Bicycle();
        bicycle.goTo("Malmö");

        Car car = new Car();
        car.goTo("Stockholm");

        Boat boat = new Boat();
        boat.goTo("Oslo");

        Motorboat motorboat = new Motorboat();
        motorboat.goTo("Köpenhamn");

        Sailboat sailboat = new Sailboat();
        sailboat.goTo("Helsingfors");


    }

}
