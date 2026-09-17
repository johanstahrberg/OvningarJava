package com.example.java26.oop;

public class Uppgift2_1 {
    static void main() {


        Employee employee1 = new Employee("Anna", 35000, "IT");
        Employee employee2 = new Employee("Erik", 32000);
        Employee employee3 = new Employee(employee1);

        IO.println(employee1.getInfo());
        IO.println(employee2.getInfo());
        IO.println(employee3.getInfo());

        employee1.setSalary(40000);

        IO.println(employee1.getInfo());
        IO.println(employee3.getInfo());


    }
}