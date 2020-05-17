package com.tth.createtype.abstractfactory2;

public class Producefactory {
    public static AbstractFactory getFactory(String which){
        AbstractFactory af = null;
        String pn = Producefactory.class.getPackage().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(pn);
        sb.append(".");
        sb.append(Character.toUpperCase(which.charAt(0)));
        sb.append(which.substring(1).toLowerCase());
        System.out.println("sb: " + sb.toString());
        try {
            af = (AbstractFactory)Class.forName(sb.toString()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return af;
    }
}
