package com.itisacat.algo.patternDesigner.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        new Context(new AddStrategy()).takeStartegy();
        new Context(new DeleteStrategy()).takeStartegy();
    }
}
