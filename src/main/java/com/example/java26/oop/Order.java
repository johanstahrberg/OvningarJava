package com.example.java26.oop;

public class Order {

    static int nextOrderNumber = 1000;
    private int orderNumber;

    public Order() {
        orderNumber = nextOrderNumber++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public static int getNextOrderNumber() {
        return nextOrderNumber;
    }

}
