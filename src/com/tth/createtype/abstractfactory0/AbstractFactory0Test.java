package com.tth.createtype.abstractfactory0;

public class AbstractFactory0Test {
    public static void main(String[] args) {
        AbstractFactory[] afs = {new ConcreteFactory1(),new ConcreteFactory2()};
        for(AbstractFactory af:afs){
            af.createProductA().show();
            af.createProductB().show();
        }
    }
}
