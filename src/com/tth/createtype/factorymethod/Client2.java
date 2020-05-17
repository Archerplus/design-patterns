package com.tth.createtype.factorymethod;

public class Client2 {
    public static void main(String[] args) {
        String[] strs = {"ConcreteCreator1","ConcreteCreator2","ConcreteCreator3"};
        for(String str:strs){
            try {
                Creator creator = CreatorFactory.factory(str);
                creator.factory().show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
