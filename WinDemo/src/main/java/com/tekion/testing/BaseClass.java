package com.tekion.testing;

public class BaseClass extends AbstractBaseClass implements BaseInterface {
    public void run(){
        System.out.println("From base class Run");
    }

    public int a;

    public BaseClass(){}
    public BaseClass(int a) {
        this.a = a;
    }

    public void run(int a) {
        System.out.println("From run(int)");
    }
    public void runChild(){
        System.out.println("hello from base class Child run");
    }
}
