package com.tth.createtype.factorymethod1;

public class WhiteHumanCreator implements AbstractCreatorHuman{
    @Override
    public Human create() {
        return new WhiteHuman();
    }
}
