package com.tth.createtype.factorymethod2;

public class FactoryMethod2Test {
    public static void main(String[] args) {
        String[] strs = {"ccreator1","ccreator2","ccreator3","ccreator4"};
        for(String str:strs){
            CreatorFactory.factory(str).factory();
        }
    }
}
