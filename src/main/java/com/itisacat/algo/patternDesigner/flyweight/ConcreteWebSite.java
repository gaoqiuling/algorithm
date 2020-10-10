package com.itisacat.algo.patternDesigner.flyweight;

public class ConcreteWebSite extends WebSite {
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println(name + "网站" + user.getName());
    }
}
