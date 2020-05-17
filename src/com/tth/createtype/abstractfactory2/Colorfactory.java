package com.tth.createtype.abstractfactory2;

public class Colorfactory implements AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        Color co = null;
        String pn = Colorfactory.class.getPackage().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(pn);
        sb.append(".");
        sb.append(Character.toUpperCase(color.charAt(0)));
        sb.append(color.substring(1).toLowerCase());
        System.out.println("colorFactory: " + sb.toString());
        try {
            co = (Color)Class.forName(sb.toString()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return co;
    }
}
