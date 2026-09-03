package com.example.java26.ovningar;

public class Uppgift3 {
    static void main() {
        int age = 17;

if (age >= 18){
    IO.println("Du är gammal nog att ta körkort");
}
else {
   int sum = 18 - age;
   IO.println("Du behöver vänta " + sum + " år till.");

}
    }
}
