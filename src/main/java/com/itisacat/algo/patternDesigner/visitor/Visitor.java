package com.itisacat.algo.patternDesigner.visitor;

public interface Visitor {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
