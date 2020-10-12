package com.itisacat.algo.patternDesigner.chain;

public class AHandler extends AbstractHandler {
    public void doHandler() {
        System.out.println("a handler do this");
        if (getNext() != null) {
            getNext().doHandler();
            ;
        }
    }
}
