package com.example.java26.oop2;

public class Sailboat extends Boat {

    // Sailboat.java
    @Override
    public void goTo(String destination) {
        IO.println("Färdas med segelbåt till " + destination);
    }

}
