package com.itisacat.algo.patternDesigner.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        new Context(new AddStrategy()).takeStrategy();
        new Context(new DeleteStrategy()).takeStrategy();
    }
}
