package com.itisacat.algo.patternDesigner.Decorator;

public class Rectangle implements Sharp{
    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
