package com.tth.createtype.abstractfactory0;

public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public IProduct createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public IProduct createProductB() {
        return new ConcreteProductB2();
    }
}
