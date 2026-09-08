package com.example.java26.looparocharrayer;

public class Uppgift3 {
    static void main() {

        boolean[] values = {true, false, false, true, false};
        IO.println(countTrue(values));

    }

    static int countTrue(boolean[] values) {
        int count = 0;

        for (boolean value : values) {
            if (value) {
                count++;
            }

        }

        return count;
    }

}
