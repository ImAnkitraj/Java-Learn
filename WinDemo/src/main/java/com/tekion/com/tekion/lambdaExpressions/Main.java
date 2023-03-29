package com.tekion.com.tekion.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        new Thread(new CodeToRun()).start();
        new Thread(() -> {
            System.out.println("Printing from lambda ");
            System.out.println("Line 2");
            System.out.println("Line 3");
        }).start();

        Employee kakarot = new Employee("Kakarot", 34);
        Employee vegeta = new Employee("Vegeta", 44);
        Employee gohan = new Employee("Gohan", 20);
        Employee trunks = new Employee("Trunks", 15);

        List<Employee> employees = new ArrayList<>();
        employees.add(kakarot);
        employees.add(vegeta);
        employees.add(gohan);
        employees.add(trunks);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(employees, ( o1,  o2) -> o1.getName().compareTo(o2.getName()));
        for (Employee e: employees) {
            System.out.println(e.getName());
        }

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());
        String sillyString = doStringStuff(uc , employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);
    }
    public static final String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class  Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
//class CodeToRun implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Printing from run");
//    }
//}


interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}