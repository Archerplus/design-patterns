package com.tth.createtype.abstractfactory1;

public abstract class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑种人的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话一般听不清");
    }

}
