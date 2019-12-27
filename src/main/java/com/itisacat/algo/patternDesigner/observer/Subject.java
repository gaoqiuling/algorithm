package com.itisacat.algo.patternDesigner.observer;

import com.google.common.collect.Lists;

import java.util.List;

public class Subject {
    private List<Observer> list = Lists.newArrayList();

    public void add(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void sendAll() {
        list.forEach(t -> t.react());
    }
}
