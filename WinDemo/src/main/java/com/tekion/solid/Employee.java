package com.tekion.solid;

public abstract class Employee implements IEmployee, IEMployeeBonus{
    public int id;
    public String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateBonus(double salary);
}

