package com.tekion.solid;

public class ContractEmployee implements  IEmployee{

    private int id;
    private String name;

    public ContractEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public double getMinSalary() {
        return 50000;
    }
}
