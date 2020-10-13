package com.itisacat.algo.patternDesigner.memento;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("aa");
        IMemento memento = o.createMemento();
        o.setState("bb");
        o.restoreMemento(memento);
        System.out.println(o.getState());
    }
}
