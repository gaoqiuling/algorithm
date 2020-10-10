package com.itisacat.algo.patternDesigner.Bridge;

public class Client {
    public static void main(String[] args) {
        Sharp sharp = new Rectangle();
        sharp.setColor(new White());
        sharp.draw();
    }
}
