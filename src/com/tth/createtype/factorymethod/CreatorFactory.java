package com.tth.createtype.factorymethod;

public class CreatorFactory {
    public static Creator factory(String which) throws Exception{
        Creator creator = null;
        /*
         * 创建类的实例，采用反射技术具体实例化方法
         */
        StringBuilder sb = new StringBuilder();
        sb.append(CreatorFactory.class.getPackage().getName());
        sb.append(".");
        creator = (Creator) Class.forName(sb.append(which).toString()).newInstance();
        return creator;
    }
}
