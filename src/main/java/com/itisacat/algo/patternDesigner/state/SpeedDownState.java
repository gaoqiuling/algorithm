package com.itisacat.algo.patternDesigner.state;

public class SpeedDownState implements RunState {
    @Override
    public void run(Context context) {
        System.out.println("減速");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("减速结束");
        context.setState(Context.common);
    }
}
