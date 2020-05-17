package com.tth.createtype.abstractfactory2;

public interface AbstractFactory {
    public Shape getShape(String shape);
    public Color getColor(String color);
}
