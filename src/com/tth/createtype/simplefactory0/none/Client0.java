package com.tth.createtype.simplefactory0.none;

import com.tth.createtype.simplefactory1.Strawberry;

public class Client0 {
    public static void main(String[] args) {
        Grape grape = new Grape();
        grape.plant();
        grape.harvest();
        Strawberry sb = new Strawberry();
        sb.plant();
        grape.harvest();
    }
}
