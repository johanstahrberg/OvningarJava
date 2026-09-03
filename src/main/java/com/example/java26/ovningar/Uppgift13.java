package com.example.java26.ovningar;

public class Uppgift13 {
    static void main() {
        boolean result = isDivisibleByFive(20);
        IO.println("Jämnt delbart med 5? " + result);

    }

    static boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

}
