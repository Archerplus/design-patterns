package com.tth.createtype.abstractfactory0;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public IProduct createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public IProduct createProductB() {
        return new ConcreteProductB1();
    }
}
