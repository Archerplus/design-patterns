package com.tth.createtype.simplefactory3;

public class Orange implements IFruit{

    @Override
    public void plant() {
        System.out.println("橘子种植......");
    }

    @Override
    public void harvest() {
        System.out.println("橘子收获......");
    }
}
