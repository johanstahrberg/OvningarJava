package com.example.java26.ovningar;

public class Uppgift11 {
    static void main() {
        double result = fahrenheitToCelsius(80);
        IO.println("Celsius = " + result);


    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
