package com.tekion.decorator;

public class Caramil extends  AddOnDecorator{
    private Beverage beverage;

    public Caramil(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 2;
    }
}
