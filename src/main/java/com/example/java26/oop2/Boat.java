package com.example.java26.oop2;

public class Boat extends Vehicle {

    // Boat.java
    @Override
    public void goTo(String destination) {
        IO.println("Färdas med båt till " + destination);
    }

}