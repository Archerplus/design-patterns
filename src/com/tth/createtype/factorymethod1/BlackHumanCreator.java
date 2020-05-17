package com.tth.createtype.factorymethod1;

public class BlackHumanCreator implements AbstractCreatorHuman{
    @Override
    public Human create() {
        return new BlackHuman();
    }
}
