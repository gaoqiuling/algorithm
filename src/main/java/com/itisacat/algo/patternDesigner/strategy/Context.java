package com.itisacat.algo.patternDesigner.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void takeStrategy() {
        strategy.algorithm();
    }
}
