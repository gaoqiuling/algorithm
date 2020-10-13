package com.itisacat.algo.patternDesigner.visitor;

import java.util.Random;

public abstract class Staff {
    public  String name;
    public Integer kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(100);
    }

    public abstract void accept(Visitor visitor);
}
