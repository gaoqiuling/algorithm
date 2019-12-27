package com.itisacat.algo.patternDesigner.command;

public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();
        Command c = new LightOnCommand(light);
        Command c1 = new LightOffCommand(light);

        Broker broker = new Broker();
        broker.add(c);
        broker.add(c1);
        broker.execute();
    }
}
