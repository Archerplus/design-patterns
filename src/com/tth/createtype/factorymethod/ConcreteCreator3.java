package com.tth.createtype.factorymethod;

public class ConcreteCreator3 implements Creator{

    @Override
    public Product factory() {
        return new concreteProduct3();
    }
}
