package com.itisacat.algo.patternDesigner.clone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Reward r = new Reward("lili", "获得了2等奖");
        r.display();
        Reward o = (Reward) r.clone();
        o.setName("mike");
        o.display();
    }
}
