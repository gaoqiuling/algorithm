package com.itisacat.algo.patternDesigner.Bridge;

public abstract class Sharp {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
