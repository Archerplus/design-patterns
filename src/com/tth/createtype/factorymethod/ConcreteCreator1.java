package com.tth.createtype.factorymethod;

public class ConcreteCreator1 implements Creator{

    @Override
    public Product factory() {
        return new concreteProduct1();
    }
}
