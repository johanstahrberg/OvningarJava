package com.example.java26.ovningar;

public class Uppgift10 {
    static void main() {
        double result = celsiusToFahrenheit(20);
        IO.println("Fahrenheit = " + result);


    }
    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }


}
