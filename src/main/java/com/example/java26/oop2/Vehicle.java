package com.example.java26.oop2;

public class Vehicle {

    private final String manufacturer;

    public Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void goTo(String destination) {
        IO.println("Färdas till " + destination);
    }




}
