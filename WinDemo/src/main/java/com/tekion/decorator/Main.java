package com.tekion.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Caramil(new Espresso());
        System.out.println("Cost: " + beverage.cost());
    }
}
