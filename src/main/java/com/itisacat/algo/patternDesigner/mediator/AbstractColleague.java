package com.itisacat.algo.patternDesigner.mediator;

public abstract class AbstractColleague {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public abstract void setNum(int num, Mediator col);
}
