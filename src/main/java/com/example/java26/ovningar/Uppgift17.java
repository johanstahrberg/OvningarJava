package com.example.java26.ovningar;

public class Uppgift17 {
    static void main() {

        String result = operation(15, 9);
        IO.println(result);
    }

    static String operation(int number1, int number2) {

        if (number1 + number2 == 24) {
            return "added";
        }

        else if (number1 - number2 == 24) {
            return "subtracted";
        }

        else if (number1 * number2 == 24) {
            return "multiplied";
        }

        else if (number1 / number2 == 24) {
            return "divided";
        }

        else {
            return "none";
        }

    }


}
