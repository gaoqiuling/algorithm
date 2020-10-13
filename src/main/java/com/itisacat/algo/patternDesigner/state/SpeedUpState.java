package com.itisacat.algo.patternDesigner.state;

public class SpeedUpState implements RunState {
    @Override
    public void run(StateContext context) {
        System.out.println("加速度");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("加速度結束");
        context.setState(StateContext.common);
    }
}
