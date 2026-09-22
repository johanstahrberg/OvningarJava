package com.example.java26.oop2;

public class Bicycle extends Vehicle {


    public Bicycle(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTo(String destination) {
        IO.println("Färdas med cykel (" + getManufacturer() + ") till " + destination);
    }


}
