package com.example.java26.oop;

public class Uppgift2_4 {
    static void main() {


        Age age = new Age(70);
        IO.println(age.getYears());

        try {
            Age person2 = new Age(-5);
            IO.println("Person2: " + person2.getYears());
        } catch (IllegalArgumentException e) {
            IO.println("Person 2 kunde inte skapas: " + e.getMessage());
        }




    }

}
