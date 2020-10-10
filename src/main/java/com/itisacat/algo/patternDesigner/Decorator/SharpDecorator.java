package com.itisacat.algo.patternDesigner.Decorator;

public abstract class SharpDecorator implements Sharp {
    private Sharp sharp;

    public SharpDecorator(Sharp sharp) {
        this.sharp = sharp;
    }

    @Override
    public void draw() {
        sharp.draw();
    }
}
