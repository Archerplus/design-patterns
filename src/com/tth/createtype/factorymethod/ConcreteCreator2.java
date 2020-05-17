package com.tth.createtype.factorymethod;

public class ConcreteCreator2 implements Creator{

    @Override
    public Product factory() {
        return new concreteProduct2();
    }
}
