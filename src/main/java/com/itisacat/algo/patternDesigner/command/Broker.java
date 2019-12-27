package com.itisacat.algo.patternDesigner.command;

import com.google.common.collect.Lists;

import java.util.List;

public class Broker {
    private List<Command> list = Lists.newArrayList();

    public void add(Command command) {
        list.add(command);
    }

    public void execute() {
        list.forEach(t -> t.execute());
        list.clear();
    }
}
