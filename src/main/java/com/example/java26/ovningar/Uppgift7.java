package com.example.java26.ovningar;

public class Uppgift7 {
    static void main() {

        IO.println("Skriv ett tal:");
        int number = Integer.parseInt(IO.readln());

        if (number % 2 == 0) {
            IO.println("Talet är jämnt");
        }

        else {
            IO.println("Talet är udda");
        }

    }
}
