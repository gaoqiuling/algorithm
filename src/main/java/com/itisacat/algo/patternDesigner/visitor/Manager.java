package com.itisacat.algo.patternDesigner.visitor;

public class Manager extends Staff {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCoding() {
        return 223;
    }
}
