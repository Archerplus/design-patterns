package com.tth.createtype.factorymethod1;

public class YellowHuman implements Human{

    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话一般单音节");
    }
}
