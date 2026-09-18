package com.example.java26.oop;

public class Age {

    private int years;

    public Age(int years) {
        if (years < 0 || years > 150)
            throw new IllegalArgumentException("The age cannot be negative or above 150");

        this.years = years;
    }

    public int getYears() {
        return years;
    }











}
