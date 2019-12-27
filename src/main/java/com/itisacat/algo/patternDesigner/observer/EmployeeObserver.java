package com.itisacat.algo.patternDesigner.observer;

public class EmployeeObserver implements Observer {

    public void react() {
        System.out.println("通知到 Employee");
    }
}
