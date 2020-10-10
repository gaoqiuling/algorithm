package com.itisacat.algo.patternDesigner.Decorator;

public class WhiteSharpDecorator extends SharpDecorator {
    public WhiteSharpDecorator(Sharp sharp) {
        super(sharp);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("画一个白色");
    }
}
