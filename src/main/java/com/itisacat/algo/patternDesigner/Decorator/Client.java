package com.itisacat.algo.patternDesigner.Decorator;

public class Client {
    public static void main(String[] args) {
        Sharp s = new WhiteSharpDecorator(new RedSharpDecorator(new Square()));
        s.draw();
    }
}
