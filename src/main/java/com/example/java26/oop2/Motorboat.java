package com.example.java26.oop2;

public class Motorboat extends Boat {

    // Motorboat.java
    @Override
    public void goTo(String destination) {
        IO.println("Färdas med motorbåt till " + destination);
    }

}