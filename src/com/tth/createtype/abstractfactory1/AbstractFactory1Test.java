package com.tth.createtype.abstractfactory1;

public class AbstractFactory1Test {
    public static void main(String[] args) {
        HumanFactory[] hfs = {new MaleHumanFactory(),new FemaleHumanFactory()};
        for(HumanFactory hf:hfs){
            Human bhuman = hf.createBlackHuman();
            Human whuman = hf.createWhiteHuman();
            Human yhuman = hf.createYellowHuman();
            bhuman.getColor();
            bhuman.getGender();
            bhuman.talk();
            whuman.getColor();
            whuman.getGender();
            whuman.talk();
            yhuman.getColor();
            yhuman.getGender();
            yhuman.talk();
        }
    }
}
