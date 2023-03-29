package com.tekion.strategy;

public class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    IDisplayBehavior displayBehavior;
    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior, IDisplayBehavior displayBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
    }

    public void fly() {
        this.flyBehavior.fly();
    }

}
