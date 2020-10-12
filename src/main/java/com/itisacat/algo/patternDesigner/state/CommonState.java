package com.itisacat.algo.patternDesigner.state;

public class CommonState implements RunState {
    @Override
    public void run(Context context) {
        System.out.println("正常速度跑");
    }
}
