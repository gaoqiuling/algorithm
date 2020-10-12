package com.itisacat.algo.patternDesigner.mediator;

public class AColleague extends AbstractColleague {

    public void setNum(int num, Mediator mediator) {
        this.setNum(num);
        mediator.affectB();
    }
}
