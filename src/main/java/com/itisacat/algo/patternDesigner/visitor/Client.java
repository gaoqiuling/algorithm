package com.itisacat.algo.patternDesigner.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Staff> list = new ArrayList<>();
        list.add(new Engineer("工程师-a"));
        list.add(new Engineer("工程师-b"));
        list.add(new Engineer("经理-c"));

        Visitor ceo = new CeoVisitor();
        Visitor cto = new CtoVisitor();
        list.forEach(t -> {
            t.accept(ceo);
        });
        list.forEach(t -> {
            t.accept(cto);
        });
    }
}
