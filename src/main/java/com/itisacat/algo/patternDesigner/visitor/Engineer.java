package com.itisacat.algo.patternDesigner.visitor;

public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCoding() {
        return 10000;
    }
}
