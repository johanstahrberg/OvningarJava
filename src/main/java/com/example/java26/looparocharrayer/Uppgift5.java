package com.example.java26.looparocharrayer;

public class Uppgift5 {
    static void main() {

        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;

        while (true) {
            int guess = Integer.parseInt(IO.readln());
            attempts++;

            if (guess < secretNumber) {
                IO.println("För lågt");
            }
            else if (guess > secretNumber) {
                IO.println("För högt");
            }
            else {
                IO.println("Rätt!");
                IO.println("Antal försök: " + attempts);
                break;
            }


        }


    }
}
