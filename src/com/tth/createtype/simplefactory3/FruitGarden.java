package com.tth.createtype.simplefactory3;

public class FruitGarden {
    public static IFruit factory(String which) throws Exception{
        IFruit fruit = null;
        String pn = FruitGarden.class.getPackage().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(pn);
        sb.append(".");
        sb.append(Character.toUpperCase(which.charAt(0)));
        sb.append(which.substring(1).toLowerCase());
        fruit = (IFruit) Class.forName(sb.toString()).newInstance();
        return fruit;
    }
}
