package com.tth.createtype.factorymethod2;

import com.tth.createtype.factorymethod.Creator;

public class CreatorFactory {
    public static ICreator factory(String which){
        ICreator creator = null;
        StringBuilder sb = new StringBuilder();
        sb.append("com.tth.createtype.factorymethod2.");
        sb.append(Character.toUpperCase(which.charAt(0)));
        sb.append(Character.toUpperCase(which.charAt(1)));
        sb.append(which.substring(2).toLowerCase());

        try {
            creator = (ICreator)Class.forName(sb.toString()).newInstance();
        }catch (ClassNotFoundException e) {
            System.out.println("给出的要创建的名称不对！");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("给出的要创建的名称不对！");
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("给出的要创建的名称不对！");
            e.printStackTrace();
        }
        return creator;
    }
}
