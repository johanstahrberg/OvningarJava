package com.example.java26.oop;

public class Uppgift2_5 {
    static void main() {


        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        IO.println(order1.getOrderNumber());
        IO.println(order2.getOrderNumber());
        IO.println(order3.getOrderNumber());
        IO.println(order4.getOrderNumber());


        IO.println("Nästa ordernummer: " + Order.getNextOrderNumber());



    }
}
