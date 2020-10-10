package com.itisacat.algo.patternDesigner.flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSite(String name) {
        if (!pool.containsKey(name)) {
            pool.put(name, new ConcreteWebSite(name));
        }
        return pool.get(name);
    }
}
