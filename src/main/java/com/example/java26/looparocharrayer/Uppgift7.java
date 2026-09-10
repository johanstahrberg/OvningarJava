package com.example.java26.looparocharrayer;

public class Uppgift7 {
    static void main() {
        int[] numbers = {5, 12, 8, 21, 3};
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        IO.println(min);

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        IO.println(max);

        for (int number : numbers) {
            sum = sum + number;
        }
        IO.println(sum);
    }
}
