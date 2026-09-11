package com.example.java26.looparocharrayer;

public class Uppgift8 {
    static void main() {
        Person person1 = new Person("Johan", 35, "Göteborg");
        Person person2 = new Person("Anna", 28, "Malmö");
        Person person3 = new Person("Erik", 41, "Stockholm");

        IO.println(person1);
        IO.println(person2);
        IO.println(person3);
    }

    record Person(String name, int age, String city) {
    }
}
