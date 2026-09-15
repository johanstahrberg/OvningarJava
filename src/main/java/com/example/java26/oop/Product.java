package com.example.java26.oop;

public class Product {
    private String name;
    private double price = 0;
    private int stockQuantity = 0;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }


public double totalValue(){
    return price * stockQuantity;
    }

    public String getInfo() {
        return name
                + ", pris: " + price + "kr"
                + ", antal i lager: " + stockQuantity
                + ", lagervärde: " + totalValue() + "kr";
    }




}


