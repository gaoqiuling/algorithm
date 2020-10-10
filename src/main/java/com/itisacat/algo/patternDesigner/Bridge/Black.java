package com.itisacat.algo.patternDesigner.Bridge;

public class Black implements Color {
    @Override
    public void paint(String sharp) {
        System.out.println(sharp + "着色黑色");
    }
}
