package com.itisacat.algo.patternDesigner.mediator;

public class Client {
    public static void main(String[] args) {
        AbstractColleague collA = new AColleague();
        AbstractColleague collB = new BColleague();

        Mediator am = new Mediator(collA, collB);

        System.out.println("==========通过设置A影响B==========");
        collA.setNum(1000, am);
        System.out.println("collA的number值为：" + collA.getNum());
        System.out.println("collB的number值为A的10倍：" + collB.getNum());

        System.out.println("==========通过设置B影响A==========");
        collB.setNum(1000, am);
        System.out.println("collB的number值为：" + collB.getNum());
        System.out.println("collA的number值为B的0.01倍：" + collA.getNum());


    }
}
