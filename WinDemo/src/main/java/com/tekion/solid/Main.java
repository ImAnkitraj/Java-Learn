package com.tekion.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new PermanentEmployee(24, "Ankit"));
        employees.add(new TemporaryEmployee(18, "Deepshikha"));
//        employees.add(new ContractEmployee(1, "Cherry"));

        for (Employee e: employees) {
            System.out.println(e.calculateBonus(2000) + " " + e.getMinSalary());
        }

        List<IEmployee> emps = new ArrayList<>();
        emps.add(new PermanentEmployee(24, "Ankit"));
        emps.add(new TemporaryEmployee(18, "Deepshikha"));
        emps.add(new ContractEmployee(1, "Cherry"));

        for (IEmployee e: emps) {
            System.out.println( " " + e.getMinSalary());
        }
    }
}
