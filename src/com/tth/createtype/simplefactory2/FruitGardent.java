package com.tth.createtype.simplefactory2;


public class FruitGardent {
    public static IFruit factory(String which){
        IFruit fruit = null;
        if(which.equalsIgnoreCase("grape")){
            fruit = new Grape();
        }
        if(which.equalsIgnoreCase("strawberry")){
            fruit = new Strawberry();
        }
        if(which.equalsIgnoreCase("apple")){
            fruit = new Apple();
        }
        return fruit;
    }
}
