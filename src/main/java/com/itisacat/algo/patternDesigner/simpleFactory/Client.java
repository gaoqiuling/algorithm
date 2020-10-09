package com.itisacat.algo.patternDesigner.simpleFactory;

public class Client {
    public static void main(String[] args) {
        TVFactory factory = new TVFactory();
        Television tv = factory.getTV(1);
        tv.play();
        tv = factory.getTV(2);
        tv.play();
    }
}
