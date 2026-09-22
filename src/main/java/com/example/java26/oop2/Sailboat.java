package com.example.java26.oop2;

public class Sailboat extends Boat {

    public Sailboat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTo(String destination) {
        IO.println("Färdas med segelbåt (" + getManufacturer() + ") till " + destination);
    }

}
