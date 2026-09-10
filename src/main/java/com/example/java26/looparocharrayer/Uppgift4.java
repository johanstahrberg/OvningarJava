package com.example.java26.looparocharrayer;

public class Uppgift4 {
    static void main() {
        String result = "";

        while (true) {
            String input = IO.readln();

            if (input.isEmpty() || input.equals(".")) {
                break;
            }
            if (result.isEmpty()) {
                result = input;
            }
            else {
                result = result + " " + input;
            }

        }
        IO.println(result);

    }
}
