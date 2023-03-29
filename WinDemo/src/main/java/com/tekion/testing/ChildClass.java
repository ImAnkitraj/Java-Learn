package com.tekion.testing;

public class ChildClass extends BaseClass {

    public ChildClass(int a) {
        this.a = a;
    }

    public void run() {
        System.out.println(super.a + " Base , " + a + " :child");
        System.out.println("Hello from child class run");
    }

    public static void main(String[] args) {
        ChildClass c = new ChildClass(10);
        c.run();

    }
}
