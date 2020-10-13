package com.itisacat.algo.patternDesigner.interpreter;

public class InterpreterContext {
    private String[] cities = {"韶关", "广州"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private Expression cityPerson;

    public InterpreterContext() {
        Expression city = new TerminalExpression(cities);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String info) {
        boolean b = cityPerson.interpret(info);
        System.out.println(info + b);
    }

}
