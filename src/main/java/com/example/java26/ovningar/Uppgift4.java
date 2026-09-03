package com.example.java26.ovningar;

public class Uppgift4 {
    static void main() {
        IO.println("Skriv första talet:");
        double number1 = Double.parseDouble(IO.readln());

        IO.println("Skriv andra talet:");
        double number2 = Double.parseDouble(IO.readln());

        double average = (number1 + number2) / 2;

        IO.println("Medelvärde = " + average);

        if (number1 > number2) {
            IO.println(number1);

        }
        else {
            IO.println(number2);
        }

    }
}
