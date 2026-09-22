package com.example.java26.oop2;

public class VehicleDemo {
    static void main() {

        Vehicle vehicle = new Vehicle("Generic");
        Bicycle bicycle = new Bicycle("Crescent");
        Car car = new Car("Volvo");
        Boat boat = new Boat("Yamarin");
        Motorboat motorboat = new Motorboat("Nimbus");
        Sailboat sailboat = new Sailboat("Hallberg-Rassy");

        vehicle.goTo("Göteborg");
        bicycle.goTo("Malmö");
        car.goTo("Stockholm");
        boat.goTo("Oslo");
        motorboat.goTo("Köpenhamn");
        sailboat.goTo("Helsingfors");

        IO.println(car.getManufacturer());
        IO.println(motorboat.getManufacturer());


    }

}
