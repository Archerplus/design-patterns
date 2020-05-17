package com.tth.createtype.abstractfactory2;

public class Shapefactory implements AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        Shape sh = null;
        String pn = Shapefactory.class.getPackage().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(pn);
        sb.append(".");
        sb.append(Character.toUpperCase(shape.charAt(0)));
        sb.append(shape.substring(1).toLowerCase());
        try {
            sh = (Shape)Class.forName(sb.toString()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return sh;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
