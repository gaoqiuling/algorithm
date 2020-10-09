package com.itisacat.algo.patternDesigner.clone;

public class Reward implements Cloneable {
    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String name;
    private String info;

    public Reward(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public void display() {
        System.out.println(name + info);
    }

    public Object clone() throws CloneNotSupportedException {
        return (Reward) super.clone();
    }
}
