package com.itisacat.algo.patternDesigner.chain;

public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public void setNext(AbstractHandler next) {
        this.nextHandler = next;
    }
    public AbstractHandler getNext() {
        return nextHandler;
    }
    public abstract void doHandler();
}
