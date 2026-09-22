package com.example.java26.oop2;

public class Boat extends Vehicle {


    public Boat(String manufacturer) {
        super(manufacturer);
    }


    @Override
    public void goTo(String destination) {
        IO.println("Färdas med båt (" + getManufacturer() + ") till " + destination);
    }

}