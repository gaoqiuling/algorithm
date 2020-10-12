package com.itisacat.algo.patternDesigner.mediator;

public class Mediator {
    private AbstractColleague a;
    private AbstractColleague b;

    public Mediator(AbstractColleague a, AbstractColleague b) {
        this.a = a;
        this.b = b;
    }

    public void affectB() {
        int number = a.getNum();
        b.setNum(number * 100);

    }

    public void affectA() {
        int number = b.getNum();
        a.setNum(number / 100);
    }
}
