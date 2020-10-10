package com.itisacat.algo.patternDesigner.Decorator;

public class RedSharpDecorator extends SharpDecorator {
    public RedSharpDecorator(Sharp sharp) {
        super(sharp);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("画一个红色");
    }
}
