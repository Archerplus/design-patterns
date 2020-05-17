package com.tth.createtype.simplefactory2;

import sun.text.normalizer.CharTrie;

public class Client2 {
    public static void main(String[] args) {
        String[] strs = {"grape","strawberry","Apple"};
        for(String str:strs){
            IFruit fruit = FruitGardent.factory(str);
            fruit.plant();
            fruit.harvest();
        }
    }
}
