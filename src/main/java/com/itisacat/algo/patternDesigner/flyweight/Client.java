package com.itisacat.algo.patternDesigner.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSite("aa");
        webSite.use(new User("lili"));
        webSite = factory.getWebSite("bb");
        webSite.use(new User("lili2"));
        webSite = factory.getWebSite("bb");
        webSite.use(new User("lili3"));
    }
}
