package com.itisacat.algo.patternDesigner.chain;

public class BHandler extends AbstractHandler {
    public void doHandler() {
        System.out.println("b handler do this");
        if (getNext() != null) {
            getNext().doHandler();
            ;
        }
    }
}
