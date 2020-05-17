package com.tth.createtype.factorymethod;

public class Client1 {
    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreator1(),new ConcreteCreator2(),new ConcreteCreator3()};

        for(Creator creator:creators){
            Product product = creator.factory();
            product.show();
        }
    }
}
