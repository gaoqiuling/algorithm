package com.itisacat.algo.patternDesigner.proxy;

public class Proxy {
    private Consumer consumer = new Consumer();

    public void display() {
        System.out.println("begin");
        consumer.display();
        System.out.println("end");
    }
}
