package com.example.java26.looparocharrayer;

public class Calc {

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total = total + number;
        }

        return total;
    }

    static int sum(String digits) {
        int total = 0;

        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);

            if (Character.isDigit(digit)) {
                int numericValue = Character.getNumericValue(digit);
                total = total + numericValue;
            }
        }
        return total;
    }



}
