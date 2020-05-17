package com.tth.createtype.simplefactory1;

public class Client1 {
    public static void main(String[] args) {
        IFruit[] fruits = {new Grape(),new Strawberry()};
        for(IFruit fruit:fruits){
            fruit.plant();
            fruit.harvest();
        }
    }
}
