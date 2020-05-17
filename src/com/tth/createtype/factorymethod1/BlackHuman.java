package com.tth.createtype.factorymethod1;

public class BlackHuman implements Human{

    @Override
    public String getColor() {
        return "black";
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话一般听不懂");
    }
}
