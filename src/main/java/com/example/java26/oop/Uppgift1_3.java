package com.example.java26.oop;

public class Uppgift1_3 {

    static void main() {

        Character character = new Character(100, 100);

        IO.println(character.getHealth());
        IO.println(character.isAlive());


        character.takeDamage(150);

        IO.println(character.getHealth());
        IO.println(character.isAlive());


        character.heal(150);

        IO.println(character.getHealth());
        IO.println(character.isAlive());












    }
}