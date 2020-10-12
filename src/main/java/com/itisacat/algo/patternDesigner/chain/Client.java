package com.itisacat.algo.patternDesigner.chain;

public class Client {
    public static void main(String[] args) {
        AbstractHandler a = new AHandler();
        a.setNext(new BHandler());
        a.doHandler();
    }
}
