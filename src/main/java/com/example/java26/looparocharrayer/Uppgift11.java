package com.example.java26.looparocharrayer;

public class Uppgift11 {
    static void main() {

        Bok bok1 = new Bok("1984", "George Orwell", 1949);
        IO.println(beskrivning(bok1));
    }

    record Bok(String titel, String författare, int år) {
    }

    static String beskrivning(Bok b) {
        return b.titel() + " av " + b.författare() + " (" + b.år() + ")";
    }

}
