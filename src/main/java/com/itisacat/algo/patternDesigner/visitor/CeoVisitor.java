package com.itisacat.algo.patternDesigner.visitor;

public class CeoVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.name + " kpi:" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.name + " kpi:" + manager.kpi);
    }
}
