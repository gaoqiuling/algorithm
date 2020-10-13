package com.itisacat.algo.patternDesigner.state;

public class CommonState implements RunState {
    @Override
    public void run(StateContext context) {
        System.out.println("正常速度跑");
    }
}
