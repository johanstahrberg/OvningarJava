package com.example.java26.oop2;

public class Bicycle extends Vehicle {

    @Override
    public void goTo(String destination) {
        IO.println("Färdas med cykel till " + destination);
    }


}
