package com.tth.createtype.factorymethod1;

public class YellowHumanCreator implements AbstractCreatorHuman{
    @Override
    public Human create() {
        return new YellowHuman();
    }
}
