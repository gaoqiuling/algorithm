package com.itisacat.algo.patternDesigner.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.add(new EmployeeObserver());
        subject.add(new BossObserver());
        subject.sendAll();
    }
}
