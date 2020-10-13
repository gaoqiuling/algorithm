package com.itisacat.algo.patternDesigner.state;

public class StateContext {
    public static final RunState common = new CommonState();
    public static final RunState speedUp = new SpeedUpState();
    public static final RunState speedDown = new SpeedDownState();
    private RunState state = common;
    private static boolean stop = false;

    public void setState(RunState state) {
        this.state = state;
    }

    public void startRun() {
        Thread t = new Thread(() -> {
            state.run(this);
        });

        t.start();
    }

    public void setStop() {
        stop = true;
    }
}
