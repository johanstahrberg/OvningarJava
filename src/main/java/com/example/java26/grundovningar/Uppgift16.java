package com.example.java26.grundovningar;

public class Uppgift16 {
    static void main() {
        boolean result = equalSlices(6, 4, 2);
        IO.println(result);

    }

    static boolean equalSlices(int totalSlices, int recipients, int slicesEach) {
        return recipients * slicesEach <= totalSlices;
    }




}
