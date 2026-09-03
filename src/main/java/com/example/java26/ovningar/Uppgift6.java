package com.example.java26.ovningar;

public class Uppgift6 {
    static void main() {

        IO.println("Skriv ett tal:");
        double number = Double.parseDouble(IO.readln());

        if (number > 0) {
            IO.println("Talet är positivt");
        }

        else if (number < 0) {
            IO.println("Talet är negativt");
        }

        else {
            IO.println("Talet är noll");
        }

    }
}
