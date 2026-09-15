package com.example.java26.oop;

public class Uppgift1_1 {
    static void main() {
        Product product1 = new Product("Mjölk", 22.0, 100);
        Product product2 = new Product("Ost", 75.0, 200);
        Product product3 = new Product("Kaffe", 99.0, 300);

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            IO.println(product.getInfo());
        }


        IO.println(product1.totalValue());
        IO.println(product2.totalValue());
        IO.println(product3.totalValue());

        double totalValue = product1.totalValue()
                + product2.totalValue()
                + product3.totalValue();

        IO.println("Totalt lagervärde: " + totalValue);



    }
}
