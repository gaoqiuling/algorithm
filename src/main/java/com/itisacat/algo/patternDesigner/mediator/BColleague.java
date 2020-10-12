package com.itisacat.algo.patternDesigner.mediator;

public class BColleague extends AbstractColleague {

    public void setNum(int num, Mediator mediator) {
        this.setNum(num);
        mediator.affectA();
    }
}
