package com.itisacat.algo.patternDesigner.simpleFactory;

public class TVFactory {
    public Television getTV(Integer type) {
        if (type == 1) {
            return new HaierTV();
        } else {
            return new TclTV();
        }
    }
}
