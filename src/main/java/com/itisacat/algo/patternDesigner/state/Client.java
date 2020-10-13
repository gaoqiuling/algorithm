package com.itisacat.algo.patternDesigner.state;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        StateContext context = new StateContext();
        context.startRun();
        Thread.sleep(2000);
        context.setState(StateContext.speedUp);
        context.startRun();
        Thread.sleep(2000);
        context.startRun();
        Thread.sleep(2000);
        context.setState(context.speedDown);
        context.startRun();
        Thread.sleep(2000);
        context.startRun();
        Thread.sleep(2000);
    }
}

