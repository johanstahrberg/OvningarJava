package com.example.java26.grundovningar;

public class Uppgift5 {
    static void main() {
        IO.println("Skriv första talet:");
        double number1 = Double.parseDouble(IO.readln());

        IO.println("Skriv andra talet:");
        double number2 = Double.parseDouble(IO.readln());

        IO.println("Skriv tredje talet:");
        double number3 = Double.parseDouble(IO.readln());

        double average = (number1 + number2 + number3) / 3;

        IO.println("Medelvärde = " + average);

        if (number1 > number2 && number1 > number3) {
            IO.println(number1);

        } else if (number2 > number1 && number2 > number3) {
            IO.println(number2);


        } else {
            IO.println(number3);
        }

    }
}
