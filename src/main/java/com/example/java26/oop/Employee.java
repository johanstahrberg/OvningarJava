package com.example.java26.oop;

public class Employee {

    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = "Ej tilldelad";
    }

    public Employee(Employee existing) {
        this.name = existing.name;
        this.salary = existing.salary;
        this.department = existing.department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getInfo() {
        return "Name: " + name + ", Salary: " + salary + ", Department: " + department;
    }

}
