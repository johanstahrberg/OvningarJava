package com.example.java26.oop2;

public class Car extends Vehicle {

    @Override
    public void goTo(String destination) {
        IO.println("Färdas med bil till " + destination);
    }

}