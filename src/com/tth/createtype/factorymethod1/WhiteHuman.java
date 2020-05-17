package com.tth.createtype.factorymethod1;

public class WhiteHuman implements Human{

    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public void talk() {
        System.out.println("白种人说话一般多音节");
    }
}
