package com.example.java26.ovningar;

public class Uppgift12 {
    static void main() {

        boolean result = isEqual(5, 7);
        IO.println("Är talen lika? " + result);
    }
    static boolean isEqual(int number1, int number2) {
        return number1 == number2;
    }
}
