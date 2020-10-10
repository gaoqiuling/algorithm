package com.itisacat.algo.patternDesigner.Bridge;

public class White implements Color {
    @Override
    public void paint(String sharp) {
        System.out.println(sharp + "着色白色");
    }
}
