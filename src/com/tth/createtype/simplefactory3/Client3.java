package com.tth.createtype.simplefactory3;

public class Client3 {
    public static void main(String[] args) {
        String[] strs = {"apple","grape","strawberry","orange"};
        for(String str:strs){
            try{
                IFruit fruit = FruitGarden.factory(str);
                fruit.plant();
                fruit.harvest();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
