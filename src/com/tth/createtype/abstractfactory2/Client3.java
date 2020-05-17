package com.tth.createtype.abstractfactory2;

public class Client3 {
    public static void main(String[] args) {
        String[] shapes = {"angle","circle","rectangle","line"};
        String[] colors = {"red","green","blue"};
        String[] facs = {"shapefactory","colorfactory"};
        for(String fac:facs){
            AbstractFactory af = Producefactory.getFactory(fac);
            for(String shape:shapes){
                if(af.getShape(shape) != null){
                    af.getShape(shape).draw();
                }
            }
            for(String color:colors){
                if(af.getColor(color)!=null){
                    af.getColor(color).fill();
                }
            }
        }
    }
}
