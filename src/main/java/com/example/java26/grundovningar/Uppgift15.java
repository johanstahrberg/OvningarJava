package com.example.java26.grundovningar;

public class Uppgift15 {
    static void main() {

        boolean result = makesTen(3, 4);
        IO.println(result);
    }

    static boolean makesTen(int number1, int number2) {
        return number1 == 10 || number2 == 10 || number1 + number2 == 10;
    }



}
