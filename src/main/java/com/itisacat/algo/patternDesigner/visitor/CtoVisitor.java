package com.itisacat.algo.patternDesigner.visitor;

public class CtoVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.name + "代码量:" + engineer.getCoding());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.name + "产品数:" + manager.getCoding());
    }
}
