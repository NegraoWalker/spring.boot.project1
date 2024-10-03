package com.walker.spring.boot.project1.entity;


public class Employee { //Employee=Empregado;
    private String name;
    private double grossSalary;  //grossSalary=salarioBruto

    public Employee() {
    }

    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
