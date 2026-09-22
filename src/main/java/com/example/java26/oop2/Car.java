package com.example.java26.oop2;

public class Car extends Vehicle {

    public Car(String manufacturer) {
        super(manufacturer);
    }



    @Override
    public void goTo(String destination) {
        IO.println("Färdas med bil (" + getManufacturer() + ") till " + destination);
    }

}