package com.example.java26.oop2;

public class Motorboat extends Boat {

    public Motorboat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTo(String destination) {
        IO.println("Färdas med motorbåt (" + getManufacturer() + ") till " + destination);
    }

}