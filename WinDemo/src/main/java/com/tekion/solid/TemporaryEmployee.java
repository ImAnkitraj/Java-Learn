package com.tekion.solid;

public class TemporaryEmployee extends Employee{
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return 0.5*salary;
    }
    @Override
    public double getMinSalary() {
        return 50000;
    }
}
