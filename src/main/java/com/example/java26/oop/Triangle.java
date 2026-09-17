package com.example.java26.oop;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public boolean isValidTriangle() {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }


    public String triangleType() {

        if (sideA == sideB && sideB == sideC){
            return "Liksidig";
        }

        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Likbent";
        }

        return "Oliksidig";
    }



}
