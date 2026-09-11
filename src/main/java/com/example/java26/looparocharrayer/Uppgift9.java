package com.example.java26.looparocharrayer;

public class Uppgift9 {
    static void main() {

        String input = IO.readln();

        IO.println(input.length());
        IO.println(input.toUpperCase());

        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        IO.println(reversed);

        IO.println(input.contains("Java"));




    }
}
